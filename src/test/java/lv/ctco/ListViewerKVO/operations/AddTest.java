package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentsList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AddTest {
    @Test
    public void testGetOperation() {
        assertEquals(new Add().getOperation(), Operation.ADD.name());
    }

    @Test
    public void testDoOperationEquals() {
        String operation = Operation.ADD.name();
        StudentsList.getStudentList().clear();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList,new Add().doOperation(stringList));
    }

    @Test
    public void testDoOperationFalse() {
        String operation = Operation.ADD.name();
        String name = "Janis";
        String surname = "Berzins";
        String university1 = "RTU";
        String university2 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university1);
        studentList.clear();
        studentList.add(new Student(name, surname, university2));
        List<Student> studentList1 = (List<Student>) new Add().doOperation(stringList);
        assertFalse(studentList1.equals(studentList));
    }
}