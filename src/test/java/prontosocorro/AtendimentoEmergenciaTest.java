package prontosocorro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoEmergenciaTest {

    IAtendimento atendimento;

    @BeforeEach
    void setUp() {
        atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        atendimento.setPaciente("Pedro Alves");
        atendimento.setMedicoResponsavel("Dra. Beatriz");
        atendimento.setMedicamentoPrescrito("Morfina 10mg");
    }

    @Test
    void deveIniciarAtendimentoEmergencia() {
        assertEquals("Atendimento de emergência iniciado para Pedro Alves com Dra. Beatriz", atendimento.iniciar());
    }

    @Test
    void deveEncerrarAtendimentoEmergencia() {
        assertEquals("Atendimento de emergência encerrado. Medicamento prescrito: Morfina 10mg", atendimento.encerrar());
    }

    @Test
    void deveRetornarPaciente() {
        assertEquals("Pedro Alves", atendimento.getPaciente());
    }

    @Test
    void deveRetornarMedicoResponsavel() {
        assertEquals("Dra. Beatriz", atendimento.getMedicoResponsavel());
    }

    @Test
    void deveRetornarMedicamentoPrescrito() {
        assertEquals("Morfina 10mg", atendimento.getMedicamentoPrescrito());
    }

}
