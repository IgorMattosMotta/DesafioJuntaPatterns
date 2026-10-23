package prontosocorro;

public interface IAtendimento {
    String iniciar();
    String encerrar();

    int getProntuario();

    String getPaciente();
    void setPaciente(String paciente);

    String getMedicoResponsavel();
    void setMedicoResponsavel(String medicoResponsavel);

    String getMedicamentoPrescrito();
    void setMedicamentoPrescrito(String medicamentoPrescrito);

    void setEspecialidade(FabricaEspecialidade fabrica);
    String solicitarExame();
    String emitirPrescricao();

    Tratamento getTratamento();
    void setTratamento(Tratamento tratamento);
    float getCusto();
}
