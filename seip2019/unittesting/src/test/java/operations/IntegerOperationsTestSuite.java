package operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The purpose of this class is to create a test suite for the IntegerOperations
 * class
 * 
 * @author Konstantinos Babetas
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ IntegerOperationsTest.class, IntegerOperations_PowerOfTwo_ParameterizedTest.class })
public class IntegerOperationsTestSuite {

}