public class CSdepartment implements  DepartmentComponent{
    @Override
    public void printdepartment() {
        System.out.println(getClass().getName());
    }
}
