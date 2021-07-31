/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

/**
 *
 * @author Dubai
 */
public class Countries {
    
    private String country;
    private String city;
    
    public Countries(){}
    public Countries(String country, String city){
        this.country = country;
        this.city = city;
    }
    
    public void set_Country(String country){
        this.country = country;
    }
    
    public String get_Country(){
        return country;
    }
    
    public void set_City(String city){
        this.city = city;
    }
    
    public String get_City(){
        return city;
    }
    
}
