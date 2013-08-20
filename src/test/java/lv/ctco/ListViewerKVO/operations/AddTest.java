package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.Operation;
import lv.ctco.listViewerKVO.Student;
import lv.ctco.listViewerKVO.StudentsList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AddTest {
    @Test
    public void testDoOperationEquals() {
        StudentsList.getStudentList().clear();
        String operation = Operation.ADD.name();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Add().doOperation(stringList));
    }

    @Test
    public void testDoOperationFalse() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname, university2));
        List<Student> studentList1 = (List<Student>) new Add().doOperation(stringList);
        assertFalse(studentList1.equals(studentList));
    }
}