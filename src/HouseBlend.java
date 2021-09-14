public class HouseBlend extends Beverage {
    public HouseBlend(int size) {
        this.size = size;
        description = "House Blend Coffee - size " + getSizeName();
    }

    public double cost() {
        return .89;
    }
}