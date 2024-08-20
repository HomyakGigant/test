public class Motorbike {
    private int year;
    private int cost;
    private String model;
    private String color;

    public Motorbike(int year,int cost, String model, String color) {
        this.year = year;
        this.cost = cost;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public int getCost() {
        return cost;
    }
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(2020,900000, "Honda", "Black");
        System.out.println(motorbike.getModel() + "\n" +
                motorbike.getYear() + "\n" +
                motorbike.getColor() + "\n" + motorbike.getCost());
    }
}
