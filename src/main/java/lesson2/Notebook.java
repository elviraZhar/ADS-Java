package lesson2;

public class Notebook {
    String name;
    int memory;
    int price;

    public Notebook (String name,int memory, int price) {
        this.name = name;
        this.memory = memory;
        this.price = price;
    }

    public String getName() {

        return name;
    }
    public int getMemory() {

        return memory;
    }
    public int getPrice() {

        return price;
    }
    public String toString() {

        return getName() + "-" + getMemory() + "-" + getPrice();
    }

}

