package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Operation;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExitIOTest {
    @Test
    public void testDoOperationIOYes() {
        String yesOrAny = "Y";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(yesOrAny).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new ExitIO(Operation.EXIT.name()).doOperationIO(), new String[]{Operation.EXIT.name()}));
    }

    @Test
    public void testDoOperationIONo() {
        String yesOrAny = "N";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(yesOrAny).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new ExitIO(Operation.EXIT.name()).doOperationIO(), null));
    }
}