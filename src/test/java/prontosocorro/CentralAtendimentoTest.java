package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralAtendimentoTest {

    @Test
    void deveRetornarMesmaInstancia() {
        assertSame(CentralAtendimento.getInstance(), CentralAtendimento.getInstance());
    }

    @Test
    void deveRetornarNomeHospital() {
        CentralAtendimento.getInstance().setNomeHospital("Hospital Municipal");
        assertEquals("Hospital Municipal", CentralAtendimento.getInstance().getNomeHospital());
    }

    @Test
    void deveRetornarMedicoPlantonista() {
        CentralAtendimento.getInstance().setMedicoPlantonista("Dra. Ana");
        assertEquals("Dra. Ana", CentralAtendimento.getInstance().getMedicoPlantonista());
    }

    @Test
    void deveGerarProntuariosSequenciais() {
        int primeiro = CentralAtendimento.getInstance().gerarProntuario();
        int segundo = CentralAtendimento.getInstance().gerarProntuario();
        assertEquals(primeiro + 1, segundo);
    }

}
