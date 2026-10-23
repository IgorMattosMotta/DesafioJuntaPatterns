package prontosocorro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoSUSTest {

    IAtendimento atendimento;

    @BeforeEach
    void setUp() {
        atendimento = AtendimentoFactory.obterAtendimento("SUS");
        atendimento.setPaciente("Maria Souza");
        atendimento.setMedicoResponsavel("Dra. Ana");
        atendimento.setMedicamentoPrescrito("Dipirona 500mg");
    }

    @Test
    void deveIniciarAtendimentoSUS() {
        assertEquals("Atendimento SUS iniciado para Maria Souza com Dra. Ana", atendimento.iniciar());
    }

    @Test
    void deveEncerrarAtendimentoSUS() {
        assertEquals("Atendimento SUS encerrado. Medicamento prescrito: Dipirona 500mg", atendimento.encerrar());
    }

    @Test
    void deveRetornarPaciente() {
        assertEquals("Maria Souza", atendimento.getPaciente());
    }

    @Test
    void deveRetornarMedicoResponsavel() {
        assertEquals("Dra. Ana", atendimento.getMedicoResponsavel());
    }

    @Test
    void deveRetornarMedicamentoPrescrito() {
        assertEquals("Dipirona 500mg", atendimento.getMedicamentoPrescrito());
    }

}
