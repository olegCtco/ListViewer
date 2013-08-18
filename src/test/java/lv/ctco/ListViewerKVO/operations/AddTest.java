package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AddTest {
    @Test
    public void testGetOperation() {
        assertEquals(new Add().getOperation(), Operation.ADD);
    }

    @Test
    public void testDoOperationEquals() {
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i <= 3; i++) stringList.add("" + i);
        studentList.add(new Student("1", "2", "3"));
        assertEquals((List<Student>) new Add().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationFalse() {
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i <= 3; i++) stringList.add("" + i);
        studentList.add(new Student("1", "2", "0"));
        List<Student> studentList1 = (List<Student>) new Add().doOperation(stringList);
        assertFalse(studentList1.equals(studentList));
    }
}