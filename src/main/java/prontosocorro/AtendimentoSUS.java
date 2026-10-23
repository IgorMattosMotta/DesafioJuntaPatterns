package prontosocorro;

public class AtendimentoSUS extends Atendimento {

    public String iniciar() {
        return "Atendimento SUS iniciado para " + getPaciente() + " com " + getMedicoResponsavel();
    }

    public String encerrar() {
        return "Atendimento SUS encerrado. Medicamento prescrito: " + getMedicamentoPrescrito();
    }
}
