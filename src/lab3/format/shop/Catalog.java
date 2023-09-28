package lab3.format.shop;

public class Catalog {
    private final String name;
    private final double price;

    private final int numberInList;

    public Catalog(int i,String name, double price){
        this.name = name;
        this.price = price;
        this.numberInList = i + 1;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getNumberInList(){
        return numberInList;
    }
}
