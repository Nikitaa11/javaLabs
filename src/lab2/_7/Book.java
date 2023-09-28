package lab2._7;

public class Book {
    private final String name;
    private final String title;
    private final int year;

    public Book(String name, String title, int year){
        this.name = name;
        this.title = title;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public String getConfig(){
        return(name + "\n" + title + "\n" + year);
    }
}
