package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOperationTest {

    @Test
    public void testExecute() {
        Operation op = new AddOperation();
        assertEquals(5.0, op.execute(2.0, 3.0));
    }

    @Test
    public void testSymbol() {
        Operation op = new AddOperation();
        assertEquals("+", op.symbol());
    }
}