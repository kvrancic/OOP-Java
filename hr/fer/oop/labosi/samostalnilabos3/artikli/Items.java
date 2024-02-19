package hr.fer.oop.labosi.samostalnilabos3.artikli;

public class Items<T> extends Artikl<T>{
    private double quantity = 0;

    public Items(T tag, double pricing, Type type) {
        super(tag, pricing, type);
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        if(getType() == Type.valueOf("ITEM"))
        {
            if(quantity != Math.round(quantity))
                throw new IllegalArgumentException("For pricing per item, the quantity cannot have decimals");
        }
        if(quantity < 0)
            throw new IllegalArgumentException("Negative values forbidden");
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        if(getType() == Type.valueOf("ITEM"))
            return getPricing() * quantity;
        return getPricing() * (quantity/1000);
    }
}
