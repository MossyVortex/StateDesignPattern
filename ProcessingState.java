public class ProcessingState implements MethodsInterface{

    private Gate gateReference;

    public ProcessingState(Gate gateReference){

        this.gateReference = gateReference;
    }

    @Override
    public void payFail() {
        System.out.println("Change the light to Red");
        System.out.println("Display a message telling the user that his payment failed");
        System.out.println("Leave the gate closed. basically there is not gate logic here");
        // has to change the state even though the gate did not change. for further methods to work properly
        this.gateReference.changeState(new ClosedState(this.gateReference));
    }

    @Override
    public void payOk() {
        System.out.println("Change the light to Green");
        System.out.println("Display a message telling the user that his payment succeeded");
        System.out.println("Open the gate.");
        this.gateReference.changeState(new OpenState(this.gateReference));
    }

    @Override
    public void enter() {
        System.out.println("Leave the light as Yellow (it already was)");
        System.out.println("Display a message telling the user to wait for processing");
        System.out.println("Leave the gate closed. basically there is not gate logic here");
    }

    @Override
    public void pay() {
        System.out.println("Leave the light as Yellow (it already was)");
        System.out.println("Display a message telling the user to wait for processing");
        System.out.println("Leave the gate closed. basically there is not gate logic here");
    }
    
}
