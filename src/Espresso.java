public class Espresso extends Beverage {
    public Espresso(int size) {
        this.size = size;
        description = "Espresso - size " + getSizeName();
    }

    @Override
    public double cost() {
        if(getSize() == Beverage.GRANDE)
            return 2.99;
        if(getSize() == Beverage.TALL)
            return 3.99;
        return 1.99;
    }
}