package lv.ctco.ListViewerKVO.StudentsComparators;

import lv.ctco.ListViewerKVO.Student;

import java.util.Comparator;

public class ComparatorByUniversity implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student) && !(o2 instanceof Student)) return -1;
        String o1StudentUniversity = ((Student) o1).getUniversity();
        String o2StudentUniversity = ((Student) o2).getUniversity();
        return o1StudentUniversity.compareTo(o2StudentUniversity);
    }
}
