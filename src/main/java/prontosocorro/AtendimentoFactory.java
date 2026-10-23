package prontosocorro;

public class AtendimentoFactory {

    public static IAtendimento obterAtendimento(String atendimento) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("prontosocorro.Atendimento" + atendimento);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Atendimento inexistente");
        }
        if (!(objeto instanceof IAtendimento)) {
            throw new IllegalArgumentException("Atendimento inválido");
        }
        return (IAtendimento) objeto;
    }
}
