public abstract class RegistrationProcess {

    public final void  registerStudent(){
        submitApplication();
        verifyDocuments();
        evaluateCandidate();
        sendDecision();

    }
    public  void submitApplication(){
        System.out.println("Application submitted");
    }
    public  void verifyDocuments(){
        System.out.println("Documents verified");
    }
    public  abstract void evaluateCandidate();
    public void sendDecision(){
        System.out.println("Decision submitted");
    }
}
