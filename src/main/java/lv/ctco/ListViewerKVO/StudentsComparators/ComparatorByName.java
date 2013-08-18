package lv.ctco.ListViewerKVO.StudentsComparators;

import lv.ctco.ListViewerKVO.Student;

import java.util.Comparator;

public class ComparatorByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student) && !(o2 instanceof Student)) return -1;
        String o1StudentName = ((Student) o1).getName();
        String o2StudentName = ((Student) o2).getName();
        return o1StudentName.compareTo(o2StudentName);
    }
}