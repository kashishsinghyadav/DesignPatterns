import java.util.ArrayList;
import java.util.List;

public class HeadDepartment {
    List<DepartmentComponent>lst = new ArrayList<>();
    public void addDepartmentComponent(DepartmentComponent departmentComponent) {
        lst.add(departmentComponent);


    }
    public void removeDepartment(DepartmentComponent departmentComponent){
       lst.remove(departmentComponent);

    }
    public void printdepartment(){
        for(DepartmentComponent departmentComponent:lst){
            departmentComponent.printdepartment();
    }
}
}
