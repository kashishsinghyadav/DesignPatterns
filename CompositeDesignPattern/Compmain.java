public class Compmain {
    public static void main(String[] args) {
        CSdepartment cs = new CSdepartment();
        AIMLdepartment aiml = new AIMLdepartment();
        HeadDepartment head = new HeadDepartment();
        head.addDepartmentComponent(cs);
        head.addDepartmentComponent(aiml);
        head.printdepartment();
        head.removeDepartment(aiml);
        head.printdepartment();

    }
}
