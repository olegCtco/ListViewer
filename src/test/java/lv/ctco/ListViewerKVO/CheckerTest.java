package lv.ctco.ListViewerKVO;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckerTest {
    private static Checker checker;

    @Before
    public void setUp() {
        checker = new Checker();
    }

    @Test
    public void testCheckOperationIfTrue() {
        String operation = Operation.ADD.name();
        assertTrue(checker.checkOperation(operation));
    }

    @Test
    public void testCheckOperationIfFalse() {
        String operation = "asd";
        assertFalse(checker.checkOperation(operation));
    }

    @Test
    public void testCheckOperationIfNull() {
        String operation = null;
        assertFalse(checker.checkOperation(operation));
    }

    @Test
    public void testCheckIfEmptyStringEmpty() {
        assertTrue(new Checker().checkIfEmptyString(""));
    }

    @Test
    public void testCheckIfEmptyStringNull() {
        assertTrue(new Checker().checkIfEmptyString(null));
    }

    @Test
    public void testCheckIfEmptyString() {
        assertFalse(new Checker().checkIfEmptyString("test"));
    }

    @Test
    public void testNotAnIntegerTrue() {
        assertTrue(new Checker().notAnInteger("a"));
    }

    @Test
    public void testNotAnIntegerFalse() {
        assertFalse(new Checker().notAnInteger("1"));
    }

    @Test
    public void testOutOfBoundTrueBeforeRange() {
        StudentsList.getStudentList().clear();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<Student> studentList = StudentsList.getStudentList();
        studentList.add(new Student(name, surname, university));
        assertTrue(new Checker().outOfBound(studentList, -1));
    }

    @Test
    public void testOutOfBoundFalseInRange() {
        StudentsList.getStudentList().clear();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<Student> studentList = StudentsList.getStudentList();
        studentList.add(new Student(name, surname, university));
        assertFalse(new Checker().outOfBound(studentList, 0));
    }

    @Test
    public void testOutOfBoundTrueInRange() {
        StudentsList.getStudentList().clear();
        String name = "Janis";
        String surname = "Berzins";
        String university = "RTU";
        List<Student> studentList = StudentsList.getStudentList();
        studentList.add(new Student(name, surname, university));
        assertTrue(new Checker().outOfBound(studentList, 1));
    }
}