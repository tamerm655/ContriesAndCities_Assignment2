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
public class CityDAO {
     private List<Cities> cityInfo;
    
    public List<Cities> readCityInfo(String fileName){
        this.cityInfo = new ArrayList<>();
        
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
            createCity(fields);
        }
        return cityInfo;
    }
    
    public void createCity(String[] data){
        Cities city = new Cities();
        
        try{
            city.set_City(data[0]);
        }catch(Exception e){
            city.set_City("null");
        }
        
        try{
            city.set_Country(data[4]);
        }catch(Exception e){
            city.set_Country("null");
        }
        
        try{
            city.set_Capital(data[8]);
        }catch(Exception e){
            city.set_Capital("null");
        }
       
        try{
            city.set_Continent(data[6]);
        }catch(Exception e){
            city.set_Continent("null");
        }
        
        try{
            city.set_Population(Integer.parseInt(data[9]));
        }catch(Exception e){
            city.set_Population(0);
        }
        
        cityInfo.add(city);
    }
}
