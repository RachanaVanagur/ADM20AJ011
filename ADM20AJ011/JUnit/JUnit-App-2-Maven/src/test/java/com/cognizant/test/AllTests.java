package com.cognizant.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArithmeticTest.class, BasicAnnotationsTest.class, LogicsTest.class })
public class AllTests { 
}
