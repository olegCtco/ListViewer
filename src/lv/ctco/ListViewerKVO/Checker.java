package lv.ctco.ListViewerKVO;

import java.util.List;

public class Checker implements ListOfOperations {

    public boolean checkOperation(String operation) {
//        System.out.println(listOfOperations.get(0)+" " + listOfOperations.size());
        for (int i = 0; i < listOfOperations.size(); i++) {
            if (listOfOperations.get(i).getOperation().equals(operation))
                return true;
        }
        return false;
    }

    public boolean checkIfEmptyString(String value) {
        if (value.equals("") || value.equals(null))
            return true;
        return false;
    }

    public boolean operationSuccess(String value) {
        if (value.equals("true"))
            return true;
        else
            return false;
    }
    public boolean notANumber(String index){
        try{
            Integer.parseInt(index);
            return false;
        }catch(NumberFormatException e){
            return true;
        }

    }
    public boolean outOfBound(List<Student> studentList, int indexOfDelete){

        if(indexOfDelete>-1&&indexOfDelete<studentList.size()){
            return false;
        }
        return false;
    }
}
