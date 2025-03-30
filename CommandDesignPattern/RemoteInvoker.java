public class RemoteInvoker {
    private  Command command;

    public RemoteInvoker(Command command) {
        this.command = command;
    }
    public void startCommand(){
        command.execute();
    }
    
}
