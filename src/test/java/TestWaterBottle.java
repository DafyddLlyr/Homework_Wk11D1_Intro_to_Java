import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterbottle;

    @Before
    public void setup(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void sipTakes10(){
        waterbottle.sip();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void multipleSipsWork(){
        waterbottle.sip();
        waterbottle.sip();
        waterbottle.sip();
        assertEquals(70, waterbottle.getVolume());
    }

    @Test
    public void emptyTakesVolumeTo0(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void cannotSipEmptyBottle(){
        waterbottle.empty();
        waterbottle.sip();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillRefillsBottleTo100(){
        waterbottle.sip();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}
