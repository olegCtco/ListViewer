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
    public void testDoOperationNameEmptySurnameEmptyUniversityEmpty() {
        StudentsList.getStudentList().clear();
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
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityExist() {
        StudentsList.getStudentList().clear();
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
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityExistFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name2, surname, university));
        studentList.add(new Student(name3, surname, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityExist() {
        StudentsList.getStudentList().clear();
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
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityExistFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname2, university));
        studentList.add(new Student(name, surname3, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityEmpty() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityEmptyFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname, university2));
        studentList.add(new Student(name, surname, university3));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameEmptySurnameEmptyUniversityExist() {
        StudentsList.getStudentList().clear();
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
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameEmptySurnameEmptyUniversityExistFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name1, surname1, university));
        studentList.add(new Student(name2, surname2, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityEmpty() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameEmptyUniversityEmptyFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname1, university2));
        studentList.add(new Student(name, surname2, university3));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityEmpty() {
        StudentsList.getStudentList().clear();
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
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameEmptySurnameExistUniversityEmptyFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name2, surname, university2));
        studentList.add(new Student(name3, surname, university3));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityExist() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }

    @Test
    public void testDoOperationNameExistSurnameExistUniversityExistFindTwo() {
        StudentsList.getStudentList().clear();
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
        studentList.add(new Student(name, surname, university));
        studentList.add(new Student(name, surname, university));
        assertEquals(studentList, new Find().doOperation(stringList));
    }
}