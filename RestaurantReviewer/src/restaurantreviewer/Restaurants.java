/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

/**
 *
 * @author Neele
 */
public class Restaurants extends ReviewCollection {
    private String _name, _address, _review;
    private int _rating;
    
    public Restaurants(){};
    
    public void setName(String name){
        _name = name;
    }
    
    public String getName(){
        return _name;
    }
    
    public void setAddress(String address){
        _address = address;
    }
    
    public String getAddress(){
        return _address;
    }
    
    public void setReview(String review){
        _review = review;
    }
    
    public String getReview(){
        return _review;
    }
    
    public void setRating(int rating){
        _rating = rating;
    }
    
    public int getRating(){
        return _rating;
    }
    
    
}
