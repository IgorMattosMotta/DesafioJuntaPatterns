package prontosocorro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlertaCriticoTest {

    @Test
    void deveEnviarAlertaCriticoPorSMS() {
        CanalEnvio canal = new CanalSMS();
        AlertaCritico alerta = new AlertaCritico("Paciente Pedro em parada cardíaca");
        alerta.setCanal(canal);
        assertEquals("SMS: [CRÍTICO] PACIENTE PEDRO EM PARADA CARDÍACA", alerta.enviar());
    }

    @Test
    void deveEnviarAlertaCriticoPorEmail() {
        CanalEnvio canal = new CanalEmail();
        AlertaCritico alerta = new AlertaCritico("Paciente Pedro em parada cardíaca");
        alerta.setCanal(canal);
        assertEquals("E-mail: [CRÍTICO] PACIENTE PEDRO EM PARADA CARDÍACA", alerta.enviar());
    }

    @Test
    void deveEnviarAlertaCriticoPorPager() {
        CanalEnvio canal = new CanalPager();
        AlertaCritico alerta = new AlertaCritico("Paciente Pedro em parada cardíaca");
        alerta.setCanal(canal);
        assertEquals("Pager: [CRÍTICO] PACIENTE PEDRO EM PARADA CARDÍACA", alerta.enviar());
    }

}
