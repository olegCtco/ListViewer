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
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityExistFindTwo() {
        String operation = Operation.FIND.name();
        String name1 = "";
        String name2 = "Janis";
        String name3 = "Juris";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name1);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name2, surname, university));
        studentList.add(new Student(name3, surname, university));
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
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityExistFindTwo() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname1 = "";
        String surname2 = "Berzins";
        String surname3 = "Kalnins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname1);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name, surname2, university));
        studentList.add(new Student(name, surname3, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityEmpty() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "Berzins";
        String university = "";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityEmptyFindTwo() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "Berzins";
        String university1 = "";
        String university2 = "RTU";
        String university3 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university1);
        studentList.clear();
        studentList.add(new Student(name, surname, university2));
        studentList.add(new Student(name, surname, university3));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameEmptySurnameEmptyUniversityExist() {
        String operation = Operation.FIND.name();
        String name = "";
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

    @Test
    public void testDoOperationNameEmptySurnameEmptyUniversityExistFindTwo() {
        String operation = Operation.FIND.name();
        String name = "";
        String name1 = "Janis";
        String name2 = "Juris";
        String surname = "";
        String surname1 = "Berzins";
        String surname2 = "Kalnins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name1, surname1, university));
        studentList.add(new Student(name2, surname2, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityEmpty() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "";
        String university = "";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityEmptyFindTwo() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "";
        String surname1 = "Berzins";
        String surname2 = "Kalnins";
        String university1 = "";
        String university2 = "RTU";
        String university3 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university1);
        studentList.clear();
        studentList.add(new Student(name, surname1, university2));
        studentList.add(new Student(name, surname2, university3));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityEmpty() {
        String operation = Operation.FIND.name();
        String name = "";
        String surname = "Berzins";
        String university = "";
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
    public void testDoOperationNameEmptySurnameExistUniversityEmptyFindTwo() {
        String operation = Operation.FIND.name();
        String name1 = "";
        String name2 = "Janis";
        String name3 = "Juris";
        String surname = "Berzins";
        String university1 = "";
        String university2 = "RTU";
        String university3 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name1);
        stringList.add(surname);
        stringList.add(university1);
        studentList.clear();
        studentList.add(new Student(name2, surname, university2));
        studentList.add(new Student(name3, surname, university3));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityExist() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityExistFindTwo() {
        String operation = Operation.FIND.name();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.clear();
        studentList.add(new Student(name, surname, university));
        studentList.add(new Student(name, surname, university));
        assertEquals(new Find().doOperation(stringList), studentList);
    }
}