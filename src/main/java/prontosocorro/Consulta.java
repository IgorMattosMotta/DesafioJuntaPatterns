package prontosocorro;

public class Consulta {

    private Exame exame;
    private Prescricao prescricao;

    public Consulta(FabricaEspecialidade fabrica) {
        this.exame = fabrica.createExame();
        this.prescricao = fabrica.createPrescricao();
    }

    public String solicitarExame() {
        return this.exame.solicitar();
    }

    public String emitirPrescricao() {
        return this.prescricao.emitir();
    }
}
