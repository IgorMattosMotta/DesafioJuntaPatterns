package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsultaTest {

    @Test
    void deveSolicitarExameCardiologia() {
        FabricaEspecialidade fabrica = new FabricaCardiologia();
        Consulta consulta = new Consulta(fabrica);
        assertEquals("Eletrocardiograma", consulta.solicitarExame());
    }

    @Test
    void deveSolicitarExamePediatria() {
        FabricaEspecialidade fabrica = new FabricaPediatria();
        Consulta consulta = new Consulta(fabrica);
        assertEquals("Hemograma infantil", consulta.solicitarExame());
    }

    @Test
    void deveSolicitarExameOrtopedia() {
        FabricaEspecialidade fabrica = new FabricaOrtopedia();
        Consulta consulta = new Consulta(fabrica);
        assertEquals("Raio-X", consulta.solicitarExame());
    }

    @Test
    void deveEmitirPrescricaoCardiologia() {
        FabricaEspecialidade fabrica = new FabricaCardiologia();
        Consulta consulta = new Consulta(fabrica);
        assertEquals("Prescrição cardiológica: AAS 100mg", consulta.emitirPrescricao());
    }

    @Test
    void deveEmitirPrescricaoPediatria() {
        FabricaEspecialidade fabrica = new FabricaPediatria();
        Consulta consulta = new Consulta(fabrica);
        assertEquals("Prescrição pediátrica: Paracetamol gotas", consulta.emitirPrescricao());
    }

    @Test
    void deveEmitirPrescricaoOrtopedia() {
        FabricaEspecialidade fabrica = new FabricaOrtopedia();
        Consulta consulta = new Consulta(fabrica);
        assertEquals("Prescrição ortopédica: Ibuprofeno 600mg", consulta.emitirPrescricao());
    }

}
