package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoConvenioTest {

    @Test
    void deveIniciarAtendimentoConvenio() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Convenio");
        assertEquals("Atendimento por convênio iniciado", atendimento.iniciar());
    }

    @Test
    void deveEncerrarAtendimentoConvenio() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Convenio");
        assertEquals("Atendimento por convênio encerrado", atendimento.encerrar());
    }

}
