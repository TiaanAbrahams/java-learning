import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf","Large", 100);
        dog.makeNoise();

        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German shepard", "Large", 150));
        animals.add(new Fish("GoldFish", "small", 1));
        animals.add(new Fish("Barrcuda", "big",75));
        animals.add(new Horse("Clydesdale", "large", 1000));

        for (Animal a: animals){
            doAnimalStuff(a);
            if(a instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }

    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");
    }
}