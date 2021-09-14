public abstract class Beverage {
    String description = "Unknown Beverage";
    int size = 1;

    public static final int VENTI = 1;
    public static final int GRANDE = 2;
    public static final int TALL = 3;

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return this.size;
    }

    public String getSizeName() {
        if(getSize() == VENTI)
            return "VENTI";
        if(getSize() == GRANDE)
            return "GRANDE";
        return "TALL";
    }

    public abstract double cost();
}