package prontosocorro;

public abstract class Atendimento implements IAtendimento {

    private int prontuario;
    private String paciente;
    private String medicoResponsavel;
    private String medicamentoPrescrito;
    private Consulta consulta;
    private Tratamento tratamento;

    public Atendimento() {
        this.prontuario = CentralAtendimento.getInstance().gerarProntuario();
        this.medicoResponsavel = CentralAtendimento.getInstance().getMedicoPlantonista();
        this.tratamento = new TratamentoBase(this.getCustoBase());
    }

    public abstract float getCustoBase();

    public int getProntuario() {
        return prontuario;
    }

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

    public void setEspecialidade(FabricaEspecialidade fabrica) {
        this.consulta = new Consulta(fabrica);
    }

    public String solicitarExame() {
        return this.consulta.solicitarExame();
    }

    public String emitirPrescricao() {
        return this.consulta.emitirPrescricao();
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public float getCusto() {
        return this.tratamento.getCusto();
    }
}
