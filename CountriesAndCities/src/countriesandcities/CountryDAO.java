/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dubai
 */
public class CountryDAO {
    private List<Countries> countryInfo;
    
    public List<Countries> readCountryInfo(String fileName){
        this.countryInfo = new ArrayList<>();
        
        File file = new File(fileName);
        
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(file.toPath());
        }catch(Exception e){
            System.out.println("Error during reading file:"+e);
        }
        
        for(int index = 0; index < lines.size(); index++){
            String line = lines.get(index);
            String[] fields = line.split(",");
            
            for(int field = 0; field < fields.length; field++){
                fields[field] = fields[field].trim();
            }
            createCountry(fields);
        }
        return countryInfo;
    }
    
    public void createCountry(String[] data){
        Countries country = new Countries();
        
        try{
            country.set_Country(data[0]);
        }catch(Exception e){
            country.set_Country("null");
        }
        
        try{
            country.set_City(data[1]);
        }catch(Exception e){
            country.set_City("null");
        }
        
        countryInfo.add(country);
    }
}
