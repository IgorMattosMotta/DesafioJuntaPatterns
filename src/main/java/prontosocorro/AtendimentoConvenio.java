package prontosocorro;

public class AtendimentoConvenio extends Atendimento {

    public float getCustoBase() {
        return 150.0f;
    }

    public String iniciar() {
        return "Atendimento por convênio iniciado para " + getPaciente() + " com " + getMedicoResponsavel();
    }

    public String encerrar() {
        return "Atendimento por convênio encerrado. Medicamento prescrito: " + getMedicamentoPrescrito();
    }
}
