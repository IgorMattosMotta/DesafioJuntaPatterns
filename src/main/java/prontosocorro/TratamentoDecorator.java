package prontosocorro;

public abstract class TratamentoDecorator implements Tratamento {

    private Tratamento tratamento;

    public TratamentoDecorator(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public abstract float getCustoProcedimento();

    public float getCusto() {
        return this.tratamento.getCusto() + this.getCustoProcedimento();
    }

    public abstract String getNomeProcedimento();

    public String getDescricao() {
        return this.tratamento.getDescricao() + "/" + this.getNomeProcedimento();
    }
}
