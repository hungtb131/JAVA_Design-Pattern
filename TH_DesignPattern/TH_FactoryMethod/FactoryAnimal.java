package TH_DesignPattern.TH_FactoryMethod;

public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("canie".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
