package prontosocorro;

public class CentralAtendimento {

    private CentralAtendimento() {};
    private static CentralAtendimento instance = new CentralAtendimento();
    public static CentralAtendimento getInstance() {
        return instance;
    }

    private String nomeHospital;
    private String medicoPlantonista;
    private int ultimoProntuario;

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getMedicoPlantonista() {
        return medicoPlantonista;
    }

    public void setMedicoPlantonista(String medicoPlantonista) {
        this.medicoPlantonista = medicoPlantonista;
    }

    public int gerarProntuario() {
        return ++this.ultimoProntuario;
    }
}
