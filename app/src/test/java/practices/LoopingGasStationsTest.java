package practices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopingGasStationsTest {

    @Test
    void testStation1to2() {
        LoopingGasStations classUnderTest = new LoopingGasStations();
        assertEquals(2,classUnderTest.getNextStation(1,5));
    }
    @Test
    void testStationLastto0() {
        LoopingGasStations classUnderTest = new LoopingGasStations();
        assertEquals(0,classUnderTest.getNextStation(4,5));
    }
}
