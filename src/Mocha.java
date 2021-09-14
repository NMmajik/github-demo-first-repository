public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        if(getSize() == Beverage.SIZE_L)
            return beverage.cost() + 2.25;
        if(getSize() == Beverage.SIZE_M)
            return beverage.cost() + 1.25;
        return beverage.cost() + 0.25;
    }
}