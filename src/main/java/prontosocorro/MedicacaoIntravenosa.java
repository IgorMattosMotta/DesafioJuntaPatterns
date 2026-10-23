package prontosocorro;

public class MedicacaoIntravenosa extends TratamentoDecorator {

    public MedicacaoIntravenosa(Tratamento tratamento) {
        super(tratamento);
    }

    public float getCustoProcedimento() {
        return 80.0f;
    }

    public String getNomeProcedimento() {
        return "Medicação intravenosa";
    }
}
