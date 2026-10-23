package prontosocorro;

public class FabricaCardiologia implements FabricaEspecialidade {

    @Override
    public Exame createExame() {
        return new ExameCardiologia();
    }

    @Override
    public Prescricao createPrescricao() {
        return new PrescricaoCardiologia();
    }
}
