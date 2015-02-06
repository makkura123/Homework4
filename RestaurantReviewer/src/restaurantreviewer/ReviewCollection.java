/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

import java.io.*;
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
    //PT -- where do you load the file? -5
    public void saveFile(Restaurants r){
        try {
            File f = new File("C:\\Users\\Neele\\Documents\\GitHub\\Homework4\\restaurants.txt");
            String _all = r.getName() + " " + r.getAddress() + " " + r.getReview();
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
                wrtr.append(_all);
                wrtr.append(System.getProperty("line.separator"));
                wrtr.close();
            }
         catch (Exception ex) {
            System.out.println("I was hoping that we wouldn't get here.");
        }
    }
    
}
