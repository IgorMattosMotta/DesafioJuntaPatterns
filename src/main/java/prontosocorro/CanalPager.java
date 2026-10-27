package prontosocorro;

public class CanalPager implements CanalEnvio {

    public String enviar(String mensagem) {
        return "Pager: " + mensagem;
    }
}
