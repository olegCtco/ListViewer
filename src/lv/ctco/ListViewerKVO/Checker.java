package lv.ctco.ListViewerKVO;

import java.util.List;

public class Checker implements ListOfOperations {

    public boolean checkOperation(String operation){
//        System.out.println(listOfOperations.get(0)+" " + listOfOperations.size());
        for(int i=0; i<listOfOperations.size();i++){
            if(listOfOperations.get(i).getOperation().equals(operation))
                return true;
        }
        return false;
    }

    public boolean checkIfEmptyString(String value){
        if(value.equals("")||value.equals(null))
            return true;
        return false;
    }
}
