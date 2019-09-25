package inheritance;

public class Review{

    //Each review should have
    //body
    //author
    //number of stars, 0 - 5
    String restaurantReview;
    String author;
    int restaurantRating;
    Restaurant restaurant;

    public Review(String author, String restaurantReview, int restaurantRating) {
        if (restaurantRating > 5) {
            throw new IllegalArgumentException("Rating must be less than or equal to 5!!!!!!!!!!!!!!!!!!!!");
        }
        this.author = author;
        this.restaurantReview = restaurantReview;
        this.restaurantRating = restaurantRating;
    }

    public String toString() {
        return String.format("The review was by %s, the review contents were ... %s ... and their rating was %d", this.author, this.restaurantReview, this.restaurantRating);
    }

}
