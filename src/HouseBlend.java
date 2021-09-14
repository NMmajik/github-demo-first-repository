public class HouseBlend extends Beverage {
    public HouseBlend(int size) {
        this.size = size;
        description = "House Blend Coffee - size " + getSizeName();
    }

    @Override
    public double cost() {
        if(getSize() == Beverage.SIZE_M)
            return 2.89;
        if(getSize() == Beverage.SIZE_L)
            return 3.89;
        return 1.89;
    }
}