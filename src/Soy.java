public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        if(getSize() == Beverage.TALL)
            return beverage.cost() + 2.45;
        if(getSize() == Beverage.GRANDE)
            return beverage.cost() + 1.45;
        return beverage.cost() + .45;
    }
}