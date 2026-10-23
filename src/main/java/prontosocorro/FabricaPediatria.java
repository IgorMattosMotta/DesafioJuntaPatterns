package prontosocorro;

public class FabricaPediatria implements FabricaEspecialidade {

    @Override
    public Exame createExame() {
        return new ExamePediatria();
    }

    @Override
    public Prescricao createPrescricao() {
        return new PrescricaoPediatria();
    }
}
