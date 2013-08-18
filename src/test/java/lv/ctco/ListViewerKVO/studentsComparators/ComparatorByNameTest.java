package lv.ctco.ListViewerKVO.studentsComparators;

import lv.ctco.ListViewerKVO.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComparatorByNameTest {
    @Test
    public void testCompareNotStudent() {
        Student student = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByName().compare(new Object(), student), -1);
    }

    @Test
    public void testCompareNotStudents() {
        assertEquals(new ComparatorByName().compare(new Object(), new Object()), -1);
    }

    @Test
    public void testCompareSortByNameRequired() {
        Student student1 = new Student("Juris", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorByName().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortByNameEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByName().compare(student1, student2), 0);
    }

    @Test
    public void testCompareSortByNameNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Juris", "Berzins", "RTU");
        assertTrue(new ComparatorByName().compare(student1, student2) < 0);
    }

    @Test
    public void testCompareSortByNameNotRequiredBySurnameRequired() {
        Student student1 = new Student("Janis", "Kalnins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorByName().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortByNameNotRequiredBySurnameEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByName().compare(student1, student2), 0);
    }

    @Test
    public void testCompareSortByNameNotRequiredBySurnameNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Kalnins", "RTU");
        assertTrue(new ComparatorByName().compare(student1, student2) < 0);
    }

    @Test
    public void testCompareSortByNameNotRequiredBySurnameNotRequiredByUniversityRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "LU");
        assertTrue(new ComparatorByName().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortByNameNotRequiredBySurnameNotRequiredByUniversityEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByName().compare(student1, student2), 0);
    }

    @Test
    public void testCompareSortByNameNotRequiredBySurnameByNotRequiredUniversityNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "LU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorByName().compare(student1, student2) < 0);
    }
}