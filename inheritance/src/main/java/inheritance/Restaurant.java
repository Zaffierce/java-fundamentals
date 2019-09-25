package inheritance;

import java.util.LinkedList;

public class Restaurant implements Reviewed {

    //Each restaurant should have..
    //name
    //number of stars, 0 - 5
    //price category (i.e. number of $)

    String restaurantName;
    int restaurantRating;
    int restaurantPrice;

    LinkedList<Review> reviews;

    public Restaurant() {
        this.reviews = new LinkedList<>();
    }

    //This adds a new node to the beginning.
    public void addReview(Review review) {
        this.reviews.add(review);
        review.restaurant = this;
    }

    public void getRestaurantRating() {
        int stars = 0;

        for (Review r : this.reviews) {
            stars += r.restaurantRating;
        }
        this.restaurantRating = stars / this.reviews.size();
    }

    public void addReviewedHead(String name, String body, int stars) {
    addReview(new Review(name, body, stars));
    getRestaurantRating();
    }

    public Restaurant(String restaurantName, int restaurantRating, int restaurantPrice) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantPrice = restaurantPrice;
        this.reviews = new LinkedList<>();
    }

    public String toString() {
        return String.format("This restaurant's name is %s, they have a rating of %d and a price rating of %d", this.restaurantName, this.restaurantRating, this.restaurantPrice);
    }

    public String reviewToString() {
        return String.format("%s recently reviewed this place and had this to say: '%s'.  They rated the place as '%d' out of 5 for the price.", this.getName(), this.getReview(), this.getRating());
    }

    @Override
    public String getName() {
        return "Bill Gates";
    }

    @Override
    public String getReview() {
        return "I had better food in a 3rd world country.";
    }

    @Override
    public int getRating() {
        return 1;
    }
}
