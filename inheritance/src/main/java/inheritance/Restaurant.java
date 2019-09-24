package inheritance;

import java.util.LinkedList;

public class Restaurant {

    //Each restaurant should have..
    //name
    //number of stars, 0 - 5
    //price category (i.e. number of $)

    String restaurantName;
    int restaurantRating;
    int restaurantPrice;

    Node head;

    class Node {
        Review data;
        Node next;
        //Constructor with only one argument
        Node(Review d){
            this.data = d;
            next = null;
        }
        //Constructor with two arguments
        Node(Review data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //This adds a new node to the beginning.
    public void addReview(Review data) {
        this.head = new Node(data, this.head);
    }

    public void getRestaurantRating() {
        int stars = 0;
        int count = 0;

        if (head == null) {
            System.out.println("No reviews exist for this restaurant.");
        } else {
            Node current = this.head;

            while (current != null) {
                stars += current.data.restaurantRating;
                count++;
                current = current.next;
            }
            this.restaurantRating = stars/count;
        }
    }

    public void addReviewedHead(String name, String body, int stars) {
    addReview(new Review(name, body, stars));
    getRestaurantRating();
    }

    public Restaurant(String restaurantName, int restaurantRating, int restaurantPrice) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantPrice = restaurantPrice;
    }

    public String toString() {
        return String.format("This restaurant's name is %s, they have a rating of %d and a price rating of %d", this.restaurantName, this.restaurantRating, this.restaurantPrice);
    }

}
