package week4;

public class StringPlay {
    public static void main(String[] args) {
        // Declare and initialize strings
        String college = "Leeds Beckett University";
        String town = "Anytown, UK";

        // Find the length of the college string
        int stringLength = college.length();
        System.out.println(college + " contains " + stringLength + " characters.");

        // Convert the string to uppercase
        String upperCaseCollege = college.toUpperCase();
        System.out.println("Uppercase: " + upperCaseCollege);

        // Replace all lowercase 'e' with '*'
        String replacedString = college.replace('e', '*');
        System.out.println("Replaced 'e' with '*': " + replacedString);

        // Concatenate college and town
        String finalString = college.concat(town);
        System.out.println("The final string is " + finalString);
    }
}
