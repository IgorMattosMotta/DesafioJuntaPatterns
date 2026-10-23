package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoEmergenciaTest {

    @Test
    void deveIniciarAtendimentoEmergencia() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        assertEquals("Atendimento de emergência iniciado", atendimento.iniciar());
    }

    @Test
    void deveEncerrarAtendimentoEmergencia() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Emergencia");
        assertEquals("Atendimento de emergência encerrado", atendimento.encerrar());
    }

}
