package lv.ctco.ListViewerKVO.StudentsComparators;

import lv.ctco.ListViewerKVO.Student;

import java.util.Comparator;

public class ComparatorBySurname implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student) && !(o2 instanceof Student)) return -1;
        String o1StudentSurname = ((Student) o1).getSurname();
        String o2StudentSurname = ((Student) o2).getSurname();
        return o1StudentSurname.compareTo(o2StudentSurname);
    }
}