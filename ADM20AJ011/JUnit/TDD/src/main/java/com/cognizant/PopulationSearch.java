package com.cognizant;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	public long getPopulationBasedOnCity(String inputCity) {		
		Map<String,Long> populationMap = getPopulationStatistics();
		
		if(inputCity.length()<=0)
			throw new IllegalArgumentException("City Name should not be empty");
		
		if(!populationMap.containsKey(inputCity))
			throw new NullPointerException("City Name is not present in the Data source");
				
		long populationCount = populationMap.get(inputCity);
		System.out.println(populationCount);
		return populationCount;
	}

	private Map<String,Long> getPopulationStatistics(){
		Map<String,Long> populationMap = new HashMap<>();
		
		populationMap.put("Hyderabad",25000L);
		populationMap.put("Bangalore",30000L);
		populationMap.put("Pune",35000L);
		populationMap.put("Delhi",40000L);
		
		return populationMap;
	}

}
