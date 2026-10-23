package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TratamentoTest {

    @Test
    void deveRetornarCustoTratamento() {
        Tratamento tratamento = new TratamentoBase(100.0f);

        assertEquals(100.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComMedicacaoIntravenosa() {
        Tratamento tratamento = new MedicacaoIntravenosa(new TratamentoBase(100.0f));

        assertEquals(180.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComRaioX() {
        Tratamento tratamento = new RaioX(new TratamentoBase(100.0f));

        assertEquals(250.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComSutura() {
        Tratamento tratamento = new Sutura(new TratamentoBase(100.0f));

        assertEquals(220.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComMedicacaoIntravenosaMaisRaioX() {
        Tratamento tratamento = new RaioX(new MedicacaoIntravenosa(new TratamentoBase(100.0f)));

        assertEquals(330.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComRaioXMaisSutura() {
        Tratamento tratamento = new Sutura(new RaioX(new TratamentoBase(100.0f)));

        assertEquals(370.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComMedicacaoIntravenosaMaisSutura() {
        Tratamento tratamento = new Sutura(new MedicacaoIntravenosa(new TratamentoBase(100.0f)));

        assertEquals(300.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarCustoTratamentoComMedicacaoIntravenosaMaisRaioXMaisSutura() {
        Tratamento tratamento = new Sutura(new RaioX(new MedicacaoIntravenosa(new TratamentoBase(100.0f))));

        assertEquals(450.0f, tratamento.getCusto());
    }

    @Test
    void deveRetornarDescricaoTratamento() {
        Tratamento tratamento = new TratamentoBase();

        assertEquals("Avaliação médica", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComMedicacaoIntravenosa() {
        Tratamento tratamento = new MedicacaoIntravenosa(new TratamentoBase());

        assertEquals("Avaliação médica/Medicação intravenosa", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComRaioX() {
        Tratamento tratamento = new RaioX(new TratamentoBase());

        assertEquals("Avaliação médica/Raio-X", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComSutura() {
        Tratamento tratamento = new Sutura(new TratamentoBase());

        assertEquals("Avaliação médica/Sutura", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComMedicacaoIntravenosaMaisRaioX() {
        Tratamento tratamento = new RaioX(new MedicacaoIntravenosa(new TratamentoBase()));

        assertEquals("Avaliação médica/Medicação intravenosa/Raio-X", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComRaioXMaisSutura() {
        Tratamento tratamento = new Sutura(new RaioX(new TratamentoBase()));

        assertEquals("Avaliação médica/Raio-X/Sutura", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComMedicacaoIntravenosaMaisSutura() {
        Tratamento tratamento = new Sutura(new MedicacaoIntravenosa(new TratamentoBase()));

        assertEquals("Avaliação médica/Medicação intravenosa/Sutura", tratamento.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTratamentoComMedicacaoIntravenosaMaisRaioXMaisSutura() {
        Tratamento tratamento = new Sutura(new RaioX(new MedicacaoIntravenosa(new TratamentoBase())));

        assertEquals("Avaliação médica/Medicação intravenosa/Raio-X/Sutura", tratamento.getDescricao());
    }

}
