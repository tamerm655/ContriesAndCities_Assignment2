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
public class Cities {
    
    private String city;
    private String country;
    private String continent;
    private String capital;
    private int pop;
    private boolean isCapital;
    public Cities(){}
    public Cities(String city, String country, String continent, String capital, int pop, boolean isCapital){
        this.city = city;
        this.country = country;
        this.continent = continent;
        this.capital = capital;
        this.pop = pop;
        this.isCapital = isCapital;
    }
    
    public void set_City(String city){
        this.city = city;
    }
    
    public String get_City(){
        return this.city;
    }
    
    public void set_Country(String country){
        this.country = country;
    }
    
    public String get_Country(){
        return this.country;
    }
    
    public void set_Continent(String continent){
        this.continent = continent;
    }
    
    public String get_Continent(){
        return this.continent;
    }
    
    public void set_Capital(String capital){
        
        this.capital = capital;
        
    }
    
    public String get_Capital(){
        return this.capital;
    }
    
    public void set_isCapital(boolean isCapital){
        if(capital.equals("primary")){
            this.isCapital = true;
        }
    }
    
    public boolean get_isCapital(){
        if(capital.equals("primary")){
            this.isCapital = true;
        }else{
            this.isCapital = true;
        }
        return this.isCapital;
    }
    
    public void set_Population(int pop){
        this.pop = pop;
    }
    
    public int get_Population(){
        return this.pop;
    }

    @Override
    public String toString() {
        return "Cities{" + "city=" + this.city + ", pop=" + this.pop + '}';
    }
    
    
}
