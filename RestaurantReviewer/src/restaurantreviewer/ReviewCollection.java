/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

import java.util.ArrayList;

/**
 *
 * @author Neele
 */
public class ReviewCollection {
    
    public ReviewCollection(){};
    
    ArrayList<Restaurants> restaurants = new ArrayList<Restaurants>();
    
    public void addRestaurant(Restaurants r){
        restaurants.add(0,r);
    }
    public int size(){
       return restaurants.size();
    }
}
