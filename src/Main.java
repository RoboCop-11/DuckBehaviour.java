// Main class to test the duck behaviors
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        testDuck(mallard);

        Duck redhead = new RedheadDuck();
        testDuck(redhead);

        Duck rubber = new RubberDuck();
        testDuck(rubber);

        Duck decoy = new DecoyDuck();
        testDuck(decoy);
    }

    private static void testDuck(Duck duck) {
        System.out.println("----------------------------");
        duck.display();
        duck.performQuack();
        duck.performSwim();
        duck.performFly();
    }
}
