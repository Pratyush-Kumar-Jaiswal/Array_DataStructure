class Flower{
    String name;
    int nofpetals;
    int price;

    public Flower() {
        this.name = "";
        this.nofpetals = 0;
        this.price =0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNofpetals() {
        return nofpetals;
    }

    public void setNofpetals(int nofpetals) {
        this.nofpetals = nofpetals;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Array8 {
    public static void main(String[] args) {
        Flower obj[]=new Flower[5];
        for (int i = 0; i < 5; i++) {
            obj[i]=new Flower();
        }
        for (int i = 0; i < 5; i++) {
            obj[i].setName("Sunflower");
            obj[i].setNofpetals(50);
            obj[i].setPrice(40);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(obj[i].getName()+obj[i].getNofpetals()+obj[i].getPrice());
        }
    }
}
