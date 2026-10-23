package prontosocorro;

public class AtendimentoConvenio implements IAtendimento {

    public String iniciar() {
        return "Atendimento por convênio iniciado";
    }

    public String encerrar() {
        return "Atendimento por convênio encerrado";
    }
}
