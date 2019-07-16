import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void setup(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void successfulPrintReducesSheets(){
        printer.print(5, 2);
        assertEquals(90, printer.getSheets());
    }

    @Test
    public void successfulPrintReducesToner(){
        printer.print(5, 2);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void unsuccessfulPrintDoesNotReducePaper(){
        printer.print(100, 100);
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void unsuccessfulPrintDoesNotReduceToner() {
        printer.print(100, 100);
        assertEquals(100, printer.getToner());
    }

    @Test
    public void lowPaperStopsPrint(){
        Printer lowPaperPrinter = new Printer(5, 100);
        lowPaperPrinter.print(50, 1);
        assertEquals(5, lowPaperPrinter.getSheets());
    }

    @Test
    public void lowTonerStopsPrint(){
        Printer lowTonerPrinter = new Printer(100, 5);
        lowTonerPrinter.print(50, 1);
        assertEquals(100, lowTonerPrinter.getSheets());
    }

}