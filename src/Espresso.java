public class Espresso extends Beverage {
    public Espresso(int size) {
        this.size = size;
        description = "Espresso - size " + getSizeName();
    }

    @Override
    public double cost() {
        if(getSize() == Beverage.SIZE_M)
            return 2.99;
        if(getSize() == Beverage.SIZE_L)
            return 3.99;
        return 1.99;
    }
}