package lv.ctco.ListViewerKVO;

import java.util.List;

public class Checker implements ListOfOperations {
    public boolean checkOperation(String operation) {
        for (int i = 0; i < listOfOperations.size(); i++)
            if (listOfOperations.get(i).getOperation().equalsIgnoreCase(operation)) return true;
        return false;
    }

    public boolean checkIfEmptyString(String value) {
        if (value.equals("") || value.equals(null)) return true;
        return false;
    }

    public boolean notANumber(String index) {
        try {
            Integer.parseInt(index);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public boolean outOfBound(List<Student> studentList, int indexOfDelete) {
        if (indexOfDelete >= 0 && indexOfDelete < studentList.size()) return false;
        return true;
    }
}