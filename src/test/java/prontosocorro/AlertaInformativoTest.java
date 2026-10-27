package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlertaInformativoTest {

    @Test
    void deveEnviarAlertaInformativoPorSMS() {
        CanalEnvio canal = new CanalSMS();
        AlertaInformativo alerta = new AlertaInformativo("Paciente Maria em atendimento");
        alerta.setCanal(canal);
        assertEquals("SMS: [INFO] Paciente Maria em atendimento", alerta.enviar());
    }

    @Test
    void deveEnviarAlertaInformativoPorEmail() {
        CanalEnvio canal = new CanalEmail();
        AlertaInformativo alerta = new AlertaInformativo("Paciente Maria em atendimento");
        alerta.setCanal(canal);
        assertEquals("E-mail: [INFO] Paciente Maria em atendimento", alerta.enviar());
    }

    @Test
    void deveEnviarAlertaInformativoPorPager() {
        CanalEnvio canal = new CanalPager();
        AlertaInformativo alerta = new AlertaInformativo("Paciente Maria em atendimento");
        alerta.setCanal(canal);
        assertEquals("Pager: [INFO] Paciente Maria em atendimento", alerta.enviar());
    }

}
