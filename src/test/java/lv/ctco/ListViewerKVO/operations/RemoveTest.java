package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentsList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveTest {
    @Test
    public void testDoOperationBeforeRange() {
        StudentsList.getStudentList().clear();
        String operation = Operation.REMOVE.name();
        String index = "0";
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(index);
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Remove().doOperation(stringList));
    }

    @Test
    public void testDoOperationInRange() {
        StudentsList.getStudentList().clear();
        String operation = Operation.REMOVE.name();
        String index = "1";
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(index);
        studentList.add(new Student(name, surname, university));
        assertEquals(new ArrayList<Student>(), new Remove().doOperation(stringList));
    }

    @Test
    public void testDoOperationAfterRange() {
        StudentsList.getStudentList().clear();
        String operation = Operation.REMOVE.name();
        String index = "2";
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(index);
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Remove().doOperation(stringList));
    }
}