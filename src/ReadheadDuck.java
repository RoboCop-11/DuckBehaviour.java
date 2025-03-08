class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        swimBehavior = new Swim();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck!");
    }
}