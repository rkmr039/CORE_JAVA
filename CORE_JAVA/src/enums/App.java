package enums;
/*
 * User defined datatype such as class and interface
 * Primitive datatype
 * enum in java is a data type that contains fixed set of constants.
 * can be use for declaring set of named constants
 * enum improves type safety
 * enum can be easily used in switch
 * enum can be traversed
 * enum can have fields, constructors and methods
 * enum may implement many interfaces but cannot extend any class because it internally extends Enum class
 */

public class App {
	
	public enum Days {MON,TUE,WED,THU,FRI,SAT,SUN}

	public static void main(String[] args) {
		
		for(Days d: Days.values()) {
			System.out.println(d);
		}

	}

}
