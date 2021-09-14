public class Milk extends CondimentDecorator{
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        if(getSize() == Beverage.SIZE_L)
            return beverage.cost() + 2.65;
        if(getSize() == Beverage.SIZE_M)
            return beverage.cost() + 1.65;
        return beverage.cost() + 0.65;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,milk";
    }
}
