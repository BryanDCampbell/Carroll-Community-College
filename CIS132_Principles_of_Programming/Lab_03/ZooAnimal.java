package cis132;
/**
 *  Write a class, in a separate file, named ZooAnimal that has the following fields:
 *  1. species - the species field is a String object that holds the zoo animal's species (ex. "Bear")
 *  2. name - the name field is a String object that holds the zoo animal's name (ex. "Ballew")
 *  3. idNumber - the idNumber is an int variable that holds the zoo animal's ID number. (ex. 123654)
 *  4. gender - the gender is a char variable that holds the zoo animal's gender (ex. 'M')
 *  5. location - the location is a String object that holds the zoo animal's zoo location (ex. "Bear Land Exhibit")
 *
 *  Write the appropriate mutator (setter) methods that store values in these fields
 *  Write the appropriate accessor (getter) methods that return the values in these fields
 *
 *  @author BRYAN CAMPBELL
 *
 */
public class ZooAnimal {
    //Attributes
    private String species;
    private String name;
    private int idNumber;
    private char gender;
    private String location;

    //Mutators (Setters)
    public void setSpecies(String species){
        this.species = species;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIdNumber(int newIdNumber){
        idNumber = newIdNumber;
    }
    public void setGender(char newGender){
        gender = newGender;
    }
    public void setLocation(String location){
        this.location = location;
    }

    //Accessors (Getters)
    public String getSpecies() {
        return species;
    }
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public char getGender() {
        return gender;
    }
    public String getLocation() {
        return location;
    }
}