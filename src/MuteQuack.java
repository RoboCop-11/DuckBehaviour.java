class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("... (silent quack)");
    }
}