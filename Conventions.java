//
// FRC Team 9449 coding conventions for the Java programming language
//

public class Conventions { // classes use UpperCamelCase

	public static final double THIS_IS_A_CONSTANT = 3.14; // constants use SCREAMING_SNAKE_CASE and are always public static final

	private double thisIsAField = 2.71828; // all fields are lowerCamelCase

	private double mVariable = 22; //all member variables have mCamelCase

	// when reading variables, use "get" and "set" as prefixes

	public int getYellowjacketsTeamNumber() { // method names are lowerCamelCase, and should describe exactly what the method does
	  return 9449;
	}

	public void setExampleFieldVariable(double thisIsAField) { // method names are lowerCamelCase, and should describe exactly what the method does
	  this.thisIsAField = thisIsAField;
	}

	//command based structure should have runCamelCase
	//example below 

	//public Command runIntakeBumpCommand() {
    //  return run(() -> {
    //    setTargetArmPosition(ArmConstants.PIVOT_BUMP);
    //  });
    // }

	//indentations are 2 spaces which is 1 tab after you double space the first line 
	public enum EVENT { // enums use SCREAMING_SNAKE_CASE
  	  CANPAC,
	  IDAHO, 
	  WORLD_CHAMPIONSHIPS
	}
}
