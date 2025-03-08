class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        swimBehavior = new Float();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}