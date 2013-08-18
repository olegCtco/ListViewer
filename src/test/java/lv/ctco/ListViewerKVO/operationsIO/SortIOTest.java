package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Operation;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SortIOTest {
    @Test
    public void testDoOperationIOIgnoreAllSort() {
        String byName = "";
        String bySurname = "";
        String byUniversity = "";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new SortIO(Operation.SORT.name()).doOperationIO(), new String[]{byName, bySurname, byUniversity}));
    }

    @Test
    public void testDoOperationIOByName() {
        String byName = "Y";
        String bySurname = "";
        String byUniversity = "";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new SortIO(Operation.SORT.name()).doOperationIO(), new String[]{byName, bySurname, byUniversity}));
    }

    @Test
    public void testDoOperationIOBySurname() {
        String byName = "";
        String bySurname = "Y";
        String byUniversity = "";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new SortIO(Operation.SORT.name()).doOperationIO(), new String[]{byName, bySurname, byUniversity}));
    }

    @Test
    public void testDoOperationIOByUniversity() {
        String byName = "";
        String bySurname = "";
        String byUniversity = "Y";
        try {
            when(mock(BufferedReader.class).readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity).getMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new SortIO(Operation.SORT.name()).doOperationIO(), new String[]{byName, bySurname, byUniversity}));
    }
}