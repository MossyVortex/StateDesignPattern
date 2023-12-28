public class OpenState implements MethodsInterface {

    private Gate gateReference;

    public OpenState(Gate gateReference){

        this.gateReference = gateReference;
    }

    @Override
    public void payFail() {
        System.out.println("Leave the light as Green (it already was)"); // the user is a hacker
        System.out.println("Display a message telling the user that the gate is already open and do not accept payment");
        System.out.println("Leave the gate Open. basically there is not gate logic here");
    }

    @Override
    public void payOk() {
        System.out.println("Leave the light as Green (it already was)"); // the user is a hacker
        System.out.println("Display a message telling the user that the gate is already open and do not accept payment");
        System.out.println("Leave the gate Open. basically there is not gate logic here");
    }

    @Override
    public void enter() {
        System.out.println("give the user enogh time to go throgh the gate then change the light to Red");
        System.out.println("Close the gate");
        this.gateReference.changeState(new ClosedState(this.gateReference));
        
    }

    @Override
    public void pay() {
        System.out.println("Leave the light as Green (it already was)"); // the user is double paying (not allowed)
        System.out.println("Display a message telling the user that the gate is already open and do not accept payment");
        System.out.println("Leave the gate Open. basically there is not gate logic here");
    }
    
}
