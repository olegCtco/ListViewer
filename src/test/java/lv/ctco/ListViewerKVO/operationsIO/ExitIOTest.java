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
        ExitIO exitIO=new ExitIO("exit");
        exitIO.localBf = mock(BufferedReader.class);
        try {
            when(exitIO.localBf.readLine()).thenReturn(yesOrAny);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(exitIO.doOperationIO(), new String[]{Operation.EXIT.name()}));
    }

    @Test
    public void testDoOperationIONo() {
        String yesOrAny = "N";
        ExitIO exitIO=new ExitIO("exit");
        exitIO.localBf = mock(BufferedReader.class);
        try {
            when(exitIO.localBf.readLine()).thenReturn(yesOrAny);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(exitIO.doOperationIO(), null));
    }
}