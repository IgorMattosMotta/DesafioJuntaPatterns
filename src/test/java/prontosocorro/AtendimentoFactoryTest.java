package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaAtendimentoInexistente() {
        try {
            IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Odontologico");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Atendimento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAtendimentoInvalido() {
        try {
            IAtendimento atendimento = AtendimentoFactory.obterAtendimento("Veterinario");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Atendimento inválido", e.getMessage());
        }
    }
}
