package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindTest {
    @Test
    public void testGetOperation() {
        assertEquals(new Find().getOperation(), Operation.FIND.name());
    }

    @Test
    public void testDoOperationNullNullNull() {
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i <= 3; i++) stringList.add("");
        studentList.add(new Student("", "", ""));
        assertEquals(new Find().doOperation(stringList), studentList);
    }
}