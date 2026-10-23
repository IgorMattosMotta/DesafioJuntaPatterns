package prontosocorro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoConvenioTest {

    IAtendimento atendimento;

    @BeforeEach
    void setUp() {
        atendimento = AtendimentoFactory.obterAtendimento("Convenio");
        atendimento.setPaciente("João Lima");
        atendimento.setMedicoResponsavel("Dr. Carlos");
        atendimento.setMedicamentoPrescrito("Amoxicilina 500mg");
    }

    @Test
    void deveIniciarAtendimentoConvenio() {
        assertEquals("Atendimento por convênio iniciado para João Lima com Dr. Carlos", atendimento.iniciar());
    }

    @Test
    void deveEncerrarAtendimentoConvenio() {
        assertEquals("Atendimento por convênio encerrado. Medicamento prescrito: Amoxicilina 500mg", atendimento.encerrar());
    }

    @Test
    void deveRetornarPaciente() {
        assertEquals("João Lima", atendimento.getPaciente());
    }

    @Test
    void deveRetornarMedicoResponsavel() {
        assertEquals("Dr. Carlos", atendimento.getMedicoResponsavel());
    }

    @Test
    void deveRetornarMedicamentoPrescrito() {
        assertEquals("Amoxicilina 500mg", atendimento.getMedicamentoPrescrito());
    }

}
