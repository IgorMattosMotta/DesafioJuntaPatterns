package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoSUSTest {

    @Test
    void deveIniciarAtendimentoSUS() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("SUS");
        assertEquals("Atendimento SUS iniciado", atendimento.iniciar());
    }

    @Test
    void deveEncerrarAtendimentoSUS() {
        IAtendimento atendimento = AtendimentoFactory.obterAtendimento("SUS");
        assertEquals("Atendimento SUS encerrado", atendimento.encerrar());
    }

}
