package postcodes;

public class Person {

	private String 	FirstName;
    private String LastName;
    private String postalCode;

    public Person(String first, String last, String code) {
        FirstName = first;
        LastName = last;
        postalCode = code;
    }

    public String toString() {
        return FirstName + " " + LastName + "\t" + postalCode;
    
	}

}
