package TH_DesignPattern.TH_FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("felinennn");
        System.out.println("animal 1 sound : " + animal1.makeSound());
        Animal animal2 = factoryAnimal.getAnimal("canie");
        System.out.println("animal 2 sound : " + animal2.makeSound());
    }
}
