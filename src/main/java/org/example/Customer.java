package org.example;

import java.util.List;

public class Customer  extends Person{
    private String customerID;
    private List<Book> purchaseHistory;
    private List<Book> wishlist;
    private List<Review> reviews;

    public Customer(String firstName, String lastName, int contactNumber, String email, String customerID, List<Book> purchaseHistory, List<Book> wishlist, List<Review> reviews) {
        super(firstName, lastName, contactNumber, email);
        this.customerID = customerID;
        this.purchaseHistory = purchaseHistory;
        this.wishlist = wishlist;
        this.reviews = reviews;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public List<Book> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<Book> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public List<Book> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<Book> wishlist) {
        this.wishlist = wishlist;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", purchaseHistory=" + purchaseHistory +
                ", wishlist=" + wishlist +
                ", reviews=" + reviews +
                "} " + super.toString();
    }
}
