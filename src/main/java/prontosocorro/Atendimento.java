package prontosocorro;

public abstract class Atendimento implements IAtendimento {

    private String paciente;
    private String medicoResponsavel;
    private String medicamentoPrescrito;

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getMedicamentoPrescrito() {
        return medicamentoPrescrito;
    }

    public void setMedicamentoPrescrito(String medicamentoPrescrito) {
        this.medicamentoPrescrito = medicamentoPrescrito;
    }
}
