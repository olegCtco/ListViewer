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

public class FindIOTest {
    @Test
    public void testDoOperationIO() {
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(name).thenReturn(surname).thenReturn(university).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new FindIO().doOperationIO(), new String[]{name, surname, university}));
    }

    @Test
    public void testGetMnemonics() {
        assertEquals(new FindIO().getMnemonics(), Operation.FIND.name());
    }
}