package lv.ctco.ListViewerKVO.operationsIO;

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
        SortIO sortIO = new SortIO("Sort");
        sortIO.localBf = mock(BufferedReader.class);
        try {
            when(sortIO.localBf.readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new String[]{byName, bySurname, byUniversity, null}, sortIO.doOperationIO()));
    }

    @Test
    public void testDoOperationIOByName() {
        String byName = "Y";
        String bySurname = "";
        String byUniversity = "";
        SortIO sortIO = new SortIO("Sort");
        sortIO.localBf = mock(BufferedReader.class);
        try {
            when(sortIO.localBf.readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new String[]{byName, bySurname, byUniversity, null}, sortIO.doOperationIO()));
    }

    @Test
    public void testDoOperationIOBySurname() {
        String byName = "";
        String bySurname = "Y";
        String byUniversity = "";
        SortIO sortIO = new SortIO("Sort");
        sortIO.localBf = mock(BufferedReader.class);
        try {
            when(sortIO.localBf.readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new String[]{byName, bySurname, byUniversity, null}, sortIO.doOperationIO()));
    }

    @Test
    public void testDoOperationIOByUniversity() {
        String byName = "";
        String bySurname = "";
        String byUniversity = "Y";
        SortIO sortIO = new SortIO("Sort");
        sortIO.localBf = mock(BufferedReader.class);
        try {
            when(sortIO.localBf.readLine()).thenReturn(byName).thenReturn(bySurname).thenReturn(byUniversity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(Arrays.equals(new String[]{byName, bySurname, byUniversity, null}, sortIO.doOperationIO()));
    }
}