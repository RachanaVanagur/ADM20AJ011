package com.cognizant.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.cognizant.PopulationSearch;

class PopulationSearchTest {

	@Test
	void testFindPopulationBasedOnCity() {
		PopulationSearch popSearch = new PopulationSearch();
		//String inputCity = "Hyderabad";
		//long expPopulation = 25000L;
		
		String inputCity = "Bangalore";
		long expPopulation = 30000L;
		
		long actPopulation = popSearch.getPopulationBasedOnCity(inputCity);
		assertEquals(expPopulation, actPopulation);
	}
	
	//@Test(expected=IllegalArgumentException.class)//JUnit4
	@Test
	void testFindPopulationWithAnEmptyCityName() {
		final PopulationSearch popSearch = new PopulationSearch();
		final String inputCity = "";
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				long actPopulation = popSearch.getPopulationBasedOnCity(inputCity);
			}
		});
	}
	
	//@Test(expected=NullPointerException.class)//JUnit4
	@Test
	void testFindPopulationWithNonExistingCityName() {
		final PopulationSearch popSearch = new PopulationSearch();
		final String inputCity = "Kochi";
		//assertNotNull(popSearch.getPopulationBasedOnCity(inputCity));
		assertThrows(NullPointerException.class, ()->{
			popSearch.getPopulationBasedOnCity(inputCity);
		});
	}	
}
