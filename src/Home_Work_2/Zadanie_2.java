package Home_Work_2;

public class Zadanie_2 {
    public void Execute(){
        Dog spot = new Dog();
        Dog scruffy = new Dog("Wurf!", "scruffy");
        spot.setName("spot");
        spot.setSays("Ruff!");
        System.out.println("Name: "+spot.getName()+" "+"Says: "+spot.getSays());
        System.out.println("Name: "+scruffy.getName()+ " "+"Says: "+scruffy.getSays());
    }
}
class Dog {
    private String says = "";
    private String name = "";

    public Dog(String says, String name) {
        this.says = says;
        this.name = name;
    }
    public Dog(){}

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
