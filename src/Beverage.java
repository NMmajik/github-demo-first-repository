public abstract class Beverage {
    String description = "Unknown Beverage";
    int size = 1;

    public static final int SIZE_S = 1;
    public static final int SIZE_M = 2;
    public static final int SIZE_L = 3;

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return this.size;
    }

    public String getSizeName() {
        if(getSize() == SIZE_S)
            return "S";
        if(getSize() == SIZE_M)
            return "M";
        return "L";
    }

    public abstract double cost();
}