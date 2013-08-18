package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Operations;
import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentsList;
import lv.ctco.ListViewerKVO.operationsIO.ViewIO;
import lv.ctco.ListViewerKVO.studentsComparators.ComparatorByName;
import lv.ctco.ListViewerKVO.studentsComparators.ComparatorBySurname;
import lv.ctco.ListViewerKVO.studentsComparators.ComparatorByUniversity;

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
            new ViewIO().doOperationIO(result);
            return result;
        }
        if (name.equalsIgnoreCase("Y")) {
            Collections.sort(result, new ComparatorByName());
            new ViewIO().doOperationIO(result);
            return result;
        }
        if (surname.equalsIgnoreCase("Y")) {
            Collections.sort(result, new ComparatorBySurname());
            new ViewIO().doOperationIO(result);
            return result;
        }
        if (university.equalsIgnoreCase("Y")) {
            Collections.sort(result, new ComparatorByUniversity());
            new ViewIO().doOperationIO(result);
            return result;
        }
        return null;
    }
}