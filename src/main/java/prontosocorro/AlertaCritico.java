package prontosocorro;

public class AlertaCritico extends Alerta {

    public AlertaCritico(String mensagem) {
        super(mensagem);
    }

    public String enviar() {
        return this.canal.enviar("[CRÍTICO] " + this.mensagem.toUpperCase());
    }
}
