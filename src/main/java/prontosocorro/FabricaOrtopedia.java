package prontosocorro;

public class FabricaOrtopedia implements FabricaEspecialidade {

    @Override
    public Exame createExame() {
        return new ExameOrtopedia();
    }

    @Override
    public Prescricao createPrescricao() {
        return new PrescricaoOrtopedia();
    }
}
