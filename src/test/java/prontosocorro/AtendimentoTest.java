package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    // Factory Method + Singleton

    @Test
    void deveGerarProntuarioPelaCentral() {
        IAtendimento atendimento1 = AtendimentoFactory.obterAtendimento("SUS");
        IAtendimento atendimento2 = AtendimentoFactory.obterAtendimento("Convenio");
        assertEquals(atendimento1.getProntuario() + 1, atendimento2.getProntuario());
    }

    @Test
    void deveUsarMedicoPlantonistaDaCentral() {
        CentralAtendimento.getInstance().setMedicoPlantonista("Dra. Ana");
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        assertEquals("Dra. Ana", atendimento.getMedicoResponsavel());
    }

    @Test
    void deveTrocarMedicoResponsavel() {
        CentralAtendimento.getInstance().setMedicoPlantonista("Dra. Ana");
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        atendimento.setMedicoResponsavel("Dr. Carlos");
        assertEquals("Dr. Carlos", atendimento.getMedicoResponsavel());
    }

    // Factory Method + Abstract Factory

    @Test
    void deveSolicitarExameCardiologia() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Convenio");
        atendimento.setEspecialidade(new FabricaCardiologia());
        assertEquals("Eletrocardiograma", atendimento.solicitarExame());
    }

    @Test
    void deveEmitirPrescricaoPediatria() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("SUS");
        atendimento.setEspecialidade(new FabricaPediatria());
        assertEquals("Prescrição pediátrica: Paracetamol gotas", atendimento.emitirPrescricao());
    }

    // Factory Method + Decorator

    @Test
    void deveRetornarCustoBaseSUS() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("SUS");
        assertEquals(0.0f, atendimento.getCusto());
    }

    @Test
    void deveRetornarCustoBaseConvenio() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Convenio");
        assertEquals(150.0f, atendimento.getCusto());
    }

    @Test
    void deveRetornarCustoBaseEmergencia() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        assertEquals(300.0f, atendimento.getCusto());
    }

    @Test
    void deveSomarProcedimentosAoCusto() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        atendimento.setTratamento(new RaioX(atendimento.getTratamento()));
        atendimento.setTratamento(new Sutura(atendimento.getTratamento()));
        assertEquals(570.0f, atendimento.getCusto());
    }

    @Test
    void deveRetornarDescricaoProcedimentos() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        atendimento.setTratamento(new RaioX(atendimento.getTratamento()));
        atendimento.setTratamento(new Sutura(atendimento.getTratamento()));
        assertEquals("Avaliação médica/Raio-X/Sutura", atendimento.getTratamento().getDescricao());
    }

    // Todos juntos

    @Test
    void deveRealizarAtendimentoCompleto() {
        CentralAtendimento.getInstance().setMedicoPlantonista("Dra. Beatriz");

        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        atendimento.setPaciente("Pedro Alves");
        atendimento.setEspecialidade(new FabricaOrtopedia());
        atendimento.setTratamento(new MedicacaoIntravenosa(atendimento.getTratamento()));
        atendimento.setTratamento(new RaioX(atendimento.getTratamento()));

        assertEquals("Atendimento de emergência iniciado para Pedro Alves com Dra. Beatriz", atendimento.iniciar());
        assertEquals("Raio-X", atendimento.solicitarExame());
        assertEquals("Prescrição ortopédica: Ibuprofeno 600mg", atendimento.emitirPrescricao());
        assertEquals("Avaliação médica/Medicação intravenosa/Raio-X", atendimento.getTratamento().getDescricao());
        assertEquals(530.0f, atendimento.getCusto());
    }

}
