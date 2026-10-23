package prontosocorro;

public interface IAtendimento {
    String iniciar();
    String encerrar();

    String getPaciente();
    void setPaciente(String paciente);

    String getMedicoResponsavel();
    void setMedicoResponsavel(String medicoResponsavel);

    String getMedicamentoPrescrito();
    void setMedicamentoPrescrito(String medicamentoPrescrito);
}
