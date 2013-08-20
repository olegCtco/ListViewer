package lv.ctco.listViewerKVO.operationsIO;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RemoveIOTest {
    @Test
    public void testDoOperationIO() {
        String index = "1";
        RemoveIO removeIO = new RemoveIO("Remove");
        removeIO.localBf = mock(BufferedReader.class);
        try {
            when(removeIO.localBf.readLine()).thenReturn(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new String[]{index}, removeIO.doOperationIO()));
    }
}