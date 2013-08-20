package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.Operation;
import lv.ctco.listViewerKVO.Student;
import lv.ctco.listViewerKVO.StudentsList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void testDoOperationWithoutAnyComparator() {
        StudentsList.getStudentList().clear();
        String operation = Operation.SORT.name();
        String name = "";
        String surname = "";
        String university = "";
        String name1 = "Juris";
        String name2 = "Janis";
        String surname1 = "Berzins";
        String surname2 = "Kalnins";
        String university1 = "RTU";
        String university2 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(studentList, new Sort().doOperation(stringList));
    }

    @Test
    public void testDoOperationByName() {
        StudentsList.getStudentList().clear();
        String operation = Operation.SORT.name();
        String name = "Y";
        String surname = "";
        String university = "";
        String name1 = "Juris";
        String name2 = "Janis";
        String surname1 = "Berzins";
        String surname2 = "Kalnins";
        String university1 = "RTU";
        String university2 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(name2, new Sort().doOperation(stringList).get(0).getName());
    }

    @Test
    public void testDoOperationBySurname() {
        StudentsList.getStudentList().clear();
        String operation = Operation.SORT.name();
        String name = "";
        String surname = "Y";
        String university = "";
        String name1 = "Janis";
        String name2 = "Juris";
        String surname1 = "Kalnins";
        String surname2 = "Berzins";
        String university1 = "RTU";
        String university2 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(surname2, new Sort().doOperation(stringList).get(0).getSurname());
    }

    @Test
    public void testDoOperationByUniversity() {
        StudentsList.getStudentList().clear();
        String operation = Operation.SORT.name();
        String name = "";
        String surname = "";
        String university = "Y";
        String name1 = "Janis";
        String name2 = "Juris";
        String surname1 = "Berzins";
        String surname2 = "Kalnins";
        String university1 = "RTU";
        String university2 = "LU";
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = StudentsList.getStudentList();
        stringList.add(operation);
        stringList.add(name);
        stringList.add(surname);
        stringList.add(university);
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(university2, new Sort().doOperation(stringList).get(0).getUniversity());
    }
}