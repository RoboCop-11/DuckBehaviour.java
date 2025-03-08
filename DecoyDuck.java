class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        swimBehavior = new Float();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}