package day02;

public class Movie {
    private String title;
    private int yearOfProduction;
    private String nameOfDirector;

    public Movie(String title, int yearOfProduction, String nameOfDirector) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.nameOfDirector = nameOfDirector;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }
}
