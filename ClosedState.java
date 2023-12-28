public class ClosedState implements MethodsInterface{

    private Gate gateReference;

    public ClosedState(Gate gateReference){

        this.gateReference = gateReference;
    }

    @Override
    public void payFail() {
        System.out.println("Leave the light as Red (it already was)"); // the user is a hacker
        System.out.println("Display a message telling the user that his payment failed");
        System.out.println("Leave the gate closed. basically there is not gate logic here");
    }

    @Override
    public void payOk() {
        System.out.println("Leave the light as Red (it already was)"); // the user is a hacker
        System.out.println("Display a message telling the user that he has to pay first");
        System.out.println("Leave the gate closed. basically there is not gate logic here");
    }

    @Override
    public void enter() {
        System.out.println("Leave the light as Red (it already was)");
        System.out.println("Display a message telling the user that he has to pay first"); // the user is not patient
        System.out.println("Leave the gate closed. basically there is not gate logic here");
    }

    @Override
    public void pay() {
        System.out.println("Change the light to yellow");
        System.out.println("Display a message telling the user to wait for processing");
        System.out.println("Leave the gate closed. but change the state to processing");
        this.gateReference.changeState(new ProcessingState(this.gateReference));
    }
    
}
