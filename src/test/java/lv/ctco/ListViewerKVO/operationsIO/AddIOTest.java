package lv.ctco.ListViewerKVO.operationsIO;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AddIOTest {

    @Test
    public void testDoOperationIO() {
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        AddIO addIO = new AddIO("Add");
        addIO.localBf = mock(BufferedReader.class);
        try {
            when(addIO.localBf.readLine()).thenReturn(name).thenReturn(surname).thenReturn(university);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new String[]{name, surname, university, null}, addIO.doOperationIO()));
    }
}