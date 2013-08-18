package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ExitTest {
    @Test
    public void testGetOperation() {
        assertEquals(new Exit().getOperation(), Operation.EXIT);
    }

    @Test
    public void testDoOperation() {
        assertEquals(new Exit().doOperation(Arrays.asList("1")), null);
    }

    @Test
    public void testDoOperationException() {
        assertEquals(new Exit().doOperation(Arrays.asList("")), null);
    }
}