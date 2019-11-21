package cis132;

/**
 * Question 2
 * ZooAnimal Class (15 points)
 *
 * Write a class, in a separate file, named ZooAnimal that has the following fields:
 * 1. species - the species field is a String object that holds the zoo animal's species (ex. "Bear")
 * 2. name - the name field is a String object that holds the zoo animal's name (ex. "Ballew")
 * 3. idNumber - the idNumber is an int variable that holds the zoo animal's ID number. (ex. 123654)
 * 4. gender - the gender is a char variable that holds the zoo animal's gender (ex. 'M')
 * 5. location - the location is a String object that holds the zoo animal's zoo location (ex. "Bear Land Exhibit")
 *
 * Write the appropriate mutator (setter) methods that store values in these fields
 * Write the appropriate accessor (getter) methods that return the values in these fields
 *
 * Once you have written the class, write a program in the Question2 main method that creates three ZooAnimal objects
 * to hold the following data:
 *
 * Species  Name        ID Number   Gender  Location
 * ----------------------------------------------------------
 * Bear     Ballew      123654      M       Bear Land Exhibit
 * Tiger    Shere Khan  999876      F       Tiger Safari
 * Elephant Horton      876100      M       Bird Nest
 *
 * Use setters to store the data in the objects (You can use literals in your program, do not need user input.)
 * Use getters to get the data and print a nicely formatted table with the data (it should look like table above)
 * For formatting, use escape sequences for tabs(print, println, printf) or field width format specifiers (printf)
 *
 * Comments (document your methods) & Style worth up to 2 points
 *
 * @author BRYAN CAMPBELL
 */

public class Question2 {
    public static void main(String[] args) {
        //TODO: DEMONSTRATE YOUR CLASS HERE

        //Create the first ZooAnimal object
        ZooAnimal zooAnimalOne = new ZooAnimal();

        //Set the attributes for zooAnimalOne
        zooAnimalOne.setSpecies("Bear");
        zooAnimalOne.setName("Ballew");
        zooAnimalOne.setIdNumber(123654);
        zooAnimalOne.setGender('M');
        zooAnimalOne.setLocation("Bear Land Exhibit");

        //Get the attributes for zooAnimalOne
        String s1 = zooAnimalOne.getSpecies();
        String n1 = zooAnimalOne.getName();
        int id1 = zooAnimalOne.getIdNumber();
        char g1 = zooAnimalOne.getGender();
        String l1 = zooAnimalOne.getLocation();

        //Create the second ZooAnimal object
        ZooAnimal zooAnimalTwo = new ZooAnimal();

        //Set the attributes for zooAnimalTwo
        zooAnimalTwo.setSpecies("Tiger");
        zooAnimalTwo.setName("Shere Khan");
        zooAnimalTwo.setIdNumber(999876);
        zooAnimalTwo.setGender('F');
        zooAnimalTwo.setLocation("Tiger Safari");

        //Get the attributes for zooAnimalTwo
        String s2 = zooAnimalTwo.getSpecies();
        String n2 = zooAnimalTwo.getName();
        int id2 = zooAnimalTwo.getIdNumber();
        char g2 = zooAnimalTwo.getGender();
        String l2 = zooAnimalTwo.getLocation();

        //Create the third ZooAnimal object
        ZooAnimal zooAnimalThree = new ZooAnimal();

        //Set the attributes for zooAnimalThree
        zooAnimalThree.setSpecies("Elephant");
        zooAnimalThree.setName("Horton");
        zooAnimalThree.setIdNumber(876100);
        zooAnimalThree.setGender('M');
        zooAnimalThree.setLocation("Bird Nest");

        //Get the attributes for zooAnimalThree
        String s3 = zooAnimalThree.getSpecies();
        String n3 = zooAnimalThree.getName();
        int id3 = zooAnimalThree.getIdNumber();
        char g3 = zooAnimalThree.getGender();
        String l3 = zooAnimalThree.getLocation();


        //Print a nicely formatted table with the data above
        System.out.println ("Species\t\tName\t\tID Number\tGender\t\tLocation");
        System.out.println ("-----------------------------------------------------------------");
        System.out.println (s1 + "\t\t" + n1 + "\t\t" + id1 + "\t\t" + g1 + "\t\t\t" + l1);
        System.out.println (s2 + "\t\t" + n2 + "\t" + id2 + "\t\t" + g2 + "\t\t\t" + l2);
        System.out.println (s3 + "\t" + n3 + "\t\t" + id3 + "\t\t" + g3 + "\t\t\t" + l3);
    }
}


