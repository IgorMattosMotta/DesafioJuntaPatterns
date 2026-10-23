package prontosocorro;

public class RaioX extends TratamentoDecorator {

    public RaioX(Tratamento tratamento) {
        super(tratamento);
    }

    public float getCustoProcedimento() {
        return 150.0f;
    }

    public String getNomeProcedimento() {
        return "Raio-X";
    }
}
