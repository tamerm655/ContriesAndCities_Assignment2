package countriesandcities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountriesAndCities {

    public static void main(String[] args) {
       Cities city = new Cities();
       CountryDAO countryDAO = new CountryDAO();
       List<Countries> countries = countryDAO.readCountryInfo("src/main/resources/Countries.csv");
        
       CityDAO cityDAO = new CityDAO();
       List<Cities> cities = cityDAO.readCityInfo("src/main/resources/Cities.csv");
       Map<String,Cities> map = new HashMap();
       
       System.out.println("Hieghst city in population for each country");
       highestCityInCountry(cities);
       System.out.println("---------------------------------------------");
       
       System.out.println("Hieghst city in population for each continent");
       highestCityInContinent(cities);
       System.out.println("---------------------------------------------");
       
       System.out.println("Hieghst Capital in population");
       highestCpital(cities);
       System.out.println("---------------------------------------------");
       
    }  
    public static void highestCityInCountry(List<Cities> cities) {
       Map<String, Optional<Cities>> streamList = cities.stream().collect(Collectors.groupingBy(Cities::get_Country,Collectors.maxBy(Comparator.comparingInt(Cities::get_Population))));
       streamList.forEach((k,v) -> 
       System.out.println(k +" "+ v)
       );
    }
    
    public static void highestCityInContinent(List<Cities> cities){
       Map<String, Optional<Cities>> streamList = cities.stream().collect(Collectors.groupingBy(Cities::get_Continent,Collectors.maxBy(Comparator.comparingInt(Cities::get_Population))));
       streamList.forEach((k,v) -> 
       System.out.println(k +" "+ v)
       );
    }
    
    public static void highestCpital(List<Cities> cities) {       
        Map<Boolean, Optional<Cities>> streamList = cities.stream().collect(Collectors.groupingBy(Cities::get_isCapital,Collectors.maxBy(Comparator.comparingInt(Cities::get_Population))));
        
        streamList.forEach((k,v) -> 
        System.out.println(k +" "+ v)
        );
    }
    
    /*public void highestCityInCountry(List<Cities> cities) {
        
        List<Cities> l1 = cities.stream().collect(Collectors.groupingBy(Cities::get_Contry,(Comparator Collectors.maxBy(Cities::get_Population).toList())));
        System.out.println(l1);
    }
    
    public void highestCityInContinent(List<Cities> cities) {
        
        List<Cities> l2 = cities.stream().collect(Collectors.groupingBy(Cities::get_Continent,(Comparator Collectors.maxBy(Cities::get_Population).toList())));
        System.out.println(l2);
    }
    
    public highestCapitalPopulation(List<Cities> cities) {
        
        List<Cities> l3 cities.stream().collect(Collectors.groupingBy(Cities::get_Capital,(Comparator Collectors.maxBy(Cities::get_Population).toList));
        System.out.println(l3);
    }*/
}
