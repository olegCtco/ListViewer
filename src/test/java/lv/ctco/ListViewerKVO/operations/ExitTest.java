package lv.ctco.ListViewerKVO.operations;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ExitTest {
    @Test
    public void testDoOperation() {
        assertEquals(null, new Exit().doOperation(Arrays.asList("1")));
    }

    @Test
    public void testDoOperationException() {
        assertEquals(null, new Exit().doOperation(Arrays.asList("")));
    }
}