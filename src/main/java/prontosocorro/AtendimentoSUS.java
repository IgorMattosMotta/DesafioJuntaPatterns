package prontosocorro;

public class AtendimentoSUS implements IAtendimento {

    public String iniciar() {
        return "Atendimento SUS iniciado";
    }

    public String encerrar() {
        return "Atendimento SUS encerrado";
    }
}
