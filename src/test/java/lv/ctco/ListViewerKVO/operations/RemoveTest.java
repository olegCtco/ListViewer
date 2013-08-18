package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveTest {
    @Test
    public void testGetOperation() {
        assertEquals(new Remove().getOperation(), Operation.REMOVE.name());
    }

    @Test
    public void testDoOperation() {

    }
}