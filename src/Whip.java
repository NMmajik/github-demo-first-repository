public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        if(getSize() == Beverage.TALL)
            return beverage.cost() + 2.35;
        if(getSize() == Beverage.GRANDE)
            return beverage.cost() + 1.35;
        return beverage.cost() + .35;
    }
}