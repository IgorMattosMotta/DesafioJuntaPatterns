package prontosocorro;

public class TratamentoBase implements Tratamento {

    private float custo;

    public TratamentoBase() {
    }

    public TratamentoBase(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public String getDescricao() {
        return "Avaliação médica";
    }

}
