// Concrete Duck classes
class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        swimBehavior = new Swim();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}