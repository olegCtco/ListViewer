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
    public void testDoOperationNameEmptySurnameEmptyUniversityEmpty() {
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList.add(Operation.FIND.name());
        stringList.add("");
        stringList.add("");
        stringList.add("");
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityExist() {
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList.add(Operation.FIND.name());
        stringList.add("");
        stringList.add("Berzins");
        stringList.add("RTU");
        studentList.add(new Student("Janis", "Berzins", "RTU"));
        assertEquals(new Find().doOperation(stringList), studentList);
    }
}