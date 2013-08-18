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
    public void testGetOperation() {
        assertEquals(new Remove().getOperation(), Operation.REMOVE.name());
    }

    @Test
    public void testDoOperationBeforeRange() {
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
        assertEquals(new Remove().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationInRange() {
        String operation = Operation.REMOVE.name();
        String index = "1";
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(index);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Remove().doOperation(stringList), new ArrayList<Student>());
    }

    @Test
    public void testDoOperationAfterRange() {
        String operation = Operation.REMOVE.name();
        String index = "2";
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(index);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Remove().doOperation(stringList), studentList);
    }
}