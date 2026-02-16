package opgave3;

public class FixedDiscount extends Discount {

    private double fixedDiscount;
    private double discountLimit;

    public FixedDiscount(double fixedDiscount, double discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price) {
        if (price > discountLimit) {
            return fixedDiscount;
        }
        return 0;
    }
}
