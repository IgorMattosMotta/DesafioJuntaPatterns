package prontosocorro;

public class Sutura extends TratamentoDecorator {

    public Sutura(Tratamento tratamento) {
        super(tratamento);
    }

    public float getCustoProcedimento() {
        return 120.0f;
    }

    public String getNomeProcedimento() {
        return "Sutura";
    }
}
