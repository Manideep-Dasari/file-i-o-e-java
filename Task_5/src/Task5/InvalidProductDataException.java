package Task5;

public class InvalidProductDataException extends Exception{
	public InvalidProductDataException(String message) {
		super(message);
	}
}

//This is a custom exception that handles invalid product data
//Custom Exception --> Exception Defined by the user
