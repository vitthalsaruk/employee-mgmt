package com.employee.pract;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

public class FactoOfNumber {
     static public void main(String... args) throws NullPointerException {
         FactoOfNumber obj = new FactoOfNumber();
         CityDetails c1 = new CityDetails("Mumbai","MH");
         CityDetails c2 = new CityDetails("Hyderabad","TS");
         CityDetails c3 = new CityDetails("Pune","MH");
         List<CityDetails> cityDetailsList = new ArrayList<>();
         cityDetailsList.add(c1);
         cityDetailsList.add(c2);
         cityDetailsList.add(c3);

         obj.m1(cityDetailsList);
     }

    private void m1(List<CityDetails> cityDetailsList) {
        Map<String,CityDetails> map = new HashMap<>();
        cityDetailsList.stream().sorted(Comparator.comparing(CityDetails::getCityName)).forEach(System.out::println);

    }

}

@Getter
@Setter
@AllArgsConstructor
@ToString
class CityDetails {
    private String cityName;
    private String state;
}