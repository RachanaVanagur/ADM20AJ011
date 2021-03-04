package com.cognizant.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages("com.cognizant.test")
@SelectClasses(CalculatorTestWithTag.class)
@IncludeTags("dev")
class AllTests {

}
