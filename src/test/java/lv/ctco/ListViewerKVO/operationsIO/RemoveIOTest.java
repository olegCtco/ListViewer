package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Operation;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RemoveIOTest {
    @Test
    public void testDoOperationIO() {
        String index = "1";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(index).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new ExitIO(Operation.EXIT.name()).doOperationIO(), new String[]{index}));
    }

    @Test
    public void testGetMnemonics() {
        assertEquals(new RemoveIO().getMnemonics(), Operation.REMOVE.name());
    }
}