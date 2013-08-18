package lv.ctco.ListViewerKVO.studentsComparators;

import lv.ctco.ListViewerKVO.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComparatorBySurnameTest {
    @Test
    public void testCompareNotStudent() {
        Student student = new Student("Janis", "Berzins", "RTU");
        assertEquals(-1, new ComparatorBySurname().compare(new Object(), student));
    }

    @Test
    public void testCompareNotStudents() {
        assertEquals(-1, new ComparatorBySurname().compare(new Object(), new Object()));
    }

    @Test
    public void testCompareSortBySurnameRequired() {
        Student student1 = new Student("Janis", "Kalnins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorBySurname().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortBySurnameEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(0, new ComparatorBySurname().compare(student1, student2));
    }

    @Test
    public void testCompareSortBySurnameNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "LU");
        Student student2 = new Student("Janis", "Kalnins", "RTU");
        assertTrue(new ComparatorBySurname().compare(student1, student2) < 0);
    }

    @Test
    public void testCompareSortBySurnameNotRequiredByNameRequired() {
        Student student1 = new Student("Juris", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertTrue(new ComparatorBySurname().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortBySurnameNotRequiredByNameEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(0, new ComparatorBySurname().compare(student1, student2));
    }

    @Test
    public void testCompareSortBySurnameNotRequiredByNameNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Juris", "Berzins", "RTU");
        assertTrue(new ComparatorBySurname().compare(student1, student2) < 0);
    }

    @Test
    public void testCompareSortBySurnameNotRequiredByNameNotRequiredByUniversityRequired() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "LU");
        assertTrue(new ComparatorBySurname().compare(student1, student2) > 0);
    }

    @Test
    public void testCompareSortBySurnameNotRequiredByNameNotRequiredByUniversityEqual() {
        Student student1 = new Student("Janis", "Berzins", "RTU");
        Student student2 = new Student("Janis", "Berzins", "RTU");
        assertEquals(0, new ComparatorBySurname().compare(student1, student2));
    }

    @Test
    public void testCompareSortBySurnameNotRequiredByNameNotRequiredByUniversityNotRequired() {
        Student student1 = new Student("Janis", "Berzins", "LU");
        Student student2 = new Student("Janis", "Kalnins", "RTU");
        assertTrue(new ComparatorBySurname().compare(student1, student2) < 0);
    }
}