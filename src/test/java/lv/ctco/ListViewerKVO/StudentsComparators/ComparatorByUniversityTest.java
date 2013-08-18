package lv.ctco.ListViewerKVO.studentsComparators;

import lv.ctco.ListViewerKVO.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComparatorByUniversityTest {
    @Test
    public void testCompareNotStudent() {
        Student student = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByUniversity().compare(new Object(), student), -1);
    }

    @Test
    public void testCompareNotStudents() {
        assertEquals(new ComparatorByUniversity().compare(new Object(), new Object()), -1);
    }

    @Test
    public void testCompareSortByUniversityRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "LU");
        assertTrue(new ComparatorByUniversity().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortByUniversityEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByUniversity().compare(student1, student2), 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "LU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorByUniversity().compare(student1, student2) < 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequiredByNameRequired() {
        Student student1 = new Student("Juris", "Kalnins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorByUniversity().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequiredByNameEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByUniversity().compare(student1, student2), 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequiredByNameNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Juris", "Berzins", "RTU");
        assertTrue(new ComparatorByUniversity().compare(student1, student2) < 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequiredByNameNotRequiredBySurnameRequired() {
        Student student1 = new Student("Janis", "Kalnins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorByUniversity().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequiredByNameNotRequiredBySurnameEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(new ComparatorByUniversity().compare(student1, student2), 0);
    }

    @Test
    public void testCompareSortByUniversityNotRequiredByNameNotRequiredBySurnameNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "LU");
        Student student2 = new Student("Janis", "Kalnins", "RTU");
        assertTrue(new ComparatorByUniversity().compare(student1, student2) < 0);
    }
}