package prontosocorro;

public class AlertaInformativo extends Alerta {

    public AlertaInformativo(String mensagem) {
        super(mensagem);
    }

    public String enviar() {
        return this.canal.enviar("[INFO] " + this.mensagem);
    }
}
