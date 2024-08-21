public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

    //Конструктор по умолчанию
    public Cat() {
        this(3000, "Barsik", 1,"Grey");
    }

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //кошки не молодеют!
        if (age > this.age)
            this.age = age;
    }

    public String getColor() {
        return color;
    }
    //метод только для садистов
    public void setColor(String color) {
        this.color = color;
        //и так жалобно
        meow(); meow(); meow();
    }
    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
        //сами вызываем свою функцию, если надо
        if (50 / weight > .01)
            pee();
    }

    public static void main(String[] args) {
        Cat anfisa = new Cat(5900 , "Anfisa",3,"Grey");
        Cat kefirich = new Cat(4000 , "Kefirich",3,"White");
        anfisa.eat();
        anfisa.meow();
        anfisa.eat();
        kefirich.eat();
        kefirich.meow();
        kefirich.eat();
        System.out.println(anfisa.name);
        System.out.println(kefirich.name);
    }
}