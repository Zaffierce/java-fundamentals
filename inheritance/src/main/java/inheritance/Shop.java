package inheritance;

public class Shop implements Reviewed{

/*
name
description
number of $
 */
String shopName;
String shopDescription;
int shopCost;

    public Shop(String shopName, String shopDescription, int shopCost) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.shopCost = shopCost;
    }

    public String toString() {
        return String.format("This shop's called '%s', their description is '%s' and they have a average price cost of %d", this.shopName, this.shopDescription, this.shopCost);
    }

    public String toStringReview() {
        return String.format("%s recently reviewed this place and had this to say: '%s'.  They rated the place as '%d' out of 5 for the price.", this.getName(), this.getReview(), this.getRating());
    }

    @Override
    public String getName() {
        return "Billy Bob Thorton";
    }

    @Override
    public String getReview() {
        return "This place was pretty fantastic!";
    }

    @Override
    public int getRating() {
        return 5;
    }
}
