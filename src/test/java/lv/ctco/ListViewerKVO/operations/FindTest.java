package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentsList;
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
        String operation = Operation.FIND.name();
        String name = "";
        String surname = "";
        String university = "";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityExist() {
        String operation = Operation.FIND.name();
        String name = "";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityExist() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }
}