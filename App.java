public class App {
    public static void main(String[] args) throws Exception { // only run this file
        
        Gate gate1 = new Gate();
        
        // a normal user scenario

        gate1.pay();
        Thread.sleep(3000);
        gate1.payOk();
        Thread.sleep(3000);
        gate1.enter();
        Thread.sleep(3000);

        System.out.println("---- END ----");
        Thread.sleep(5000);

        // hacker user scenario

        gate1.payOk();
        Thread.sleep(3000);
        gate1.enter();
        Thread.sleep(3000);

        System.out.println("---- END ----");
        Thread.sleep(5000);

        // user not patient scenario

        gate1.enter();
        Thread.sleep(3000);

        System.out.println("---- END ----");
        Thread.sleep(5000);

        // Gate gate2 = new Gate();
        // Gate gate3 = new Gate();

    }
}
