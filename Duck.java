// Abstract Duck class
abstract class Duck {
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}