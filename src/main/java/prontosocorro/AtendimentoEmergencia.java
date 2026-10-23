package prontosocorro;

public class AtendimentoEmergencia implements IAtendimento {

    public String iniciar() {
        return "Atendimento de emergência iniciado";
    }

    public String encerrar() {
        return "Atendimento de emergência encerrado";
    }
}
