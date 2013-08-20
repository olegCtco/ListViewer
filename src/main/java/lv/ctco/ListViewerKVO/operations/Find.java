package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.Operation;
import lv.ctco.listViewerKVO.Operations;
import lv.ctco.listViewerKVO.Student;
import lv.ctco.listViewerKVO.StudentsList;

import java.util.ArrayList;
import java.util.List;

public class Find implements Operations {
    @Override
    public String getOperation() {
        return Operation.FIND.name();
    }

    @Override
    public List<Student> doOperation(List<String> values) {
        String name = values.get(0);
        String surname = values.get(1);
        String university = values.get(2);
        List<Student> result = new ArrayList<Student>();
        if ((name.equals("") && surname.equals("") && university.equals(""))) return result;
        else
            for (Student student : StudentsList.getStudentList()) {
                if (name.equals("") && student.getSurname().equals(surname) && student.getUniversity().equals(university)) {
                    result.add(student);
                    continue;
                }
                if (student.getName().equals(name) && surname.equals("") && student.getUniversity().equals(university)) {
                    result.add(student);
                    continue;
                }
                if (student.getName().equals(name) && student.getSurname().equals(surname) && university.equals("")) {
                    result.add(student);
                    continue;
                }
                if (name.equals("") && surname.equals("") && student.getUniversity().equals(university)) {
                    result.add(student);
                    continue;
                }
                if (student.getName().equals(name) && surname.equals("") && university.equals("")) {
                    result.add(student);
                    continue;
                }
                if (name.equals("") && student.getSurname().equals(surname) && university.equals("")) {
                    result.add(student);
                    continue;
                }
                if (student.getName().equals(name) && student.getSurname().equals(surname) && student.getUniversity().equals(university)) {
                    result.add(student);
                    continue;
                }
            }
        StudentsList.getTmpList().clear();
        StudentsList.getTmpList().addAll(result);
        return result;
    }
}