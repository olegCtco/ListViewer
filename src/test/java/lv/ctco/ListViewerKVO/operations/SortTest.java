package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentsList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void testGetOperation() {
        assertEquals(new Sort().getOperation(), Operation.SORT.name());
    }

    @Test
    public void testDoOperationByName() {
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
        studentList.clear();
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(new Sort().doOperation(stringList).get(0).getName(), name2);
    }

    @Test
    public void testDoOperationBySurname() {
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
        studentList.clear();
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(new Sort().doOperation(stringList).get(0).getSurname(), surname2);
    }

    @Test
    public void testDoOperationByUniversity() {
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
        studentList.clear();
        studentList.add(new Student(name1, surname1, university1));
        studentList.add(new Student(name2, surname2, university2));
        assertEquals(new Sort().doOperation(stringList).get(0).getUniversity(), university2);
    }
}