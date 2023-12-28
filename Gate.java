public class Gate { // this is called context in generic terms. It is the a class that has all the methods which allows the user to interact with the system.
    
    private MethodsInterface gateState; // we could initiate the state here but I will leave the constructor for the future
    
    public Gate(){ // maybe take an argument and do if statements to determine initial state? will be difficult after adding new states
        // for now each gate created will have to be in the clsoed state initially.

        this.gateState = new ClosedState(this);

    }

    // this method is so important for our state pattern to work properly.

    public void changeState(MethodsInterface gateState){

        this.gateState = gateState;

    }

    // all the methods here will delegate the functionality to the assigned state class

    public void pay(){

        this.gateState.pay();

    }

    public void payOk(){

        this.gateState.payOk();

    }

    public void payFail(){

        this.gateState.payFail();

    }

    public void enter(){

        this.gateState.enter();

    }

}
