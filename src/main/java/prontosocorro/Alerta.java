package prontosocorro;

public abstract class Alerta {

    protected CanalEnvio canal;

    protected String mensagem;

    public Alerta(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setCanal(CanalEnvio canal) {
        this.canal = canal;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract String enviar();
}
