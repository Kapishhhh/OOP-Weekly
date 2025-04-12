package postcodes;

import java.util.Scanner;

public class PostCodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Enter  check till 25 
		Person[] people = new Person[25];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First name space Last name space Postal code. Type end to end program.");

        //checks where end is entered or not 
        while (scanner.hasNextLine() && count < 25) {
            String line = scanner.nextLine();
            
            if (line.equalsIgnoreCase("end")) break;

            //tab
            String[] parts = line.split("[ \t]+");
            
            // check 3 parts
            if (parts.length == 3) {
                people[count++] = new Person(parts[0], parts[1], parts[2]);
            } 
            else
            {
                System.out.println("Invalid entered input.Use tab format datas.");
            }
        }
System.out.println("");

        System.out.println("List of all datas:");
        for (int i = 0; i < count; i++) {
            System.out.println(people[i]);
        }

        scanner.close();
    }

	}


