import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TVTest{

    TV tele;
    @BeforeEach
    public void setUp() {
        tele = new TV(15);
    }

    @Test
    public void shouldTurnOn() {
        tele.on();
        assertTrue(tele.isOn());
    }

    @Test
    public void shouldTurnOff() {
        tele.off();
        assertFalse(tele.isOn());
    }

    @Test
    public void shouldChangeChannel() {
        tele.increaseChannel();
        tele.increaseChannel();
        assertEquals(17, tele.getChannel());
    }
}
