package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (isNameValid(name) && isYearOfBirthValid(yearOfBirth)){
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public boolean isNameValid(String name){
        if (name != null && name.trim().contains(" ")){  //name.indexOf(" ") > 0
            return true;
        }else{
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public boolean isYearOfBirthValid(int yearOfBirth){
        if (LocalDate.now().getYear() - yearOfBirth <= 120){
            return true;
        }else{
            throw new IllegalArgumentException("Invalid year of birth");
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}