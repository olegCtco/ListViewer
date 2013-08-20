package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.Operation;
import lv.ctco.listViewerKVO.Operations;
import lv.ctco.listViewerKVO.Student;
import lv.ctco.listViewerKVO.StudentsList;
import lv.ctco.listViewerKVO.studentsComparators.ComparatorByName;
import lv.ctco.listViewerKVO.studentsComparators.ComparatorBySurname;
import lv.ctco.listViewerKVO.studentsComparators.ComparatorByUniversity;

import java.util.Collections;
import java.util.List;

public class Sort implements Operations {
    @Override
    public String getOperation() {
        return Operation.SORT.name();
    }

    @Override
    public List<Student> doOperation(List<String> values) {
        String name = values.get(1);
        String surname = values.get(2);
        String university = values.get(3);
        List<Student> result = StudentsList.getStudentList();
        if (!name.equalsIgnoreCase("Y") && !surname.equalsIgnoreCase("Y") && !university.equalsIgnoreCase("Y")) {
            return result;
        }
        if (name.equalsIgnoreCase("Y")) {
            Collections.sort(result, new ComparatorByName());
            return result;
        }
        if (surname.equalsIgnoreCase("Y")) {
            Collections.sort(result, new ComparatorBySurname());
            return result;
        }
        if (university.equalsIgnoreCase("Y")) {
            Collections.sort(result, new ComparatorByUniversity());
            return result;
        }
        return null;
    }
}