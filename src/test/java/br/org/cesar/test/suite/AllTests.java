package br.org.cesar.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.org.cesar.test.SimpleFormValidation;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
		SimpleFormValidation.class,
//		TestSystemAbaExcecution.class
	})
public class AllTests {

}
