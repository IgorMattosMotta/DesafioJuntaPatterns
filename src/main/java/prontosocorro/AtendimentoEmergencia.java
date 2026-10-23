package prontosocorro;

public class AtendimentoEmergencia extends Atendimento {

    public float getCustoBase() {
        return 300.0f;
    }

    public String iniciar() {
        return "Atendimento de emergência iniciado para " + getPaciente() + " com " + getMedicoResponsavel();
    }

    public String encerrar() {
        return "Atendimento de emergência encerrado. Medicamento prescrito: " + getMedicamentoPrescrito();
    }
}
