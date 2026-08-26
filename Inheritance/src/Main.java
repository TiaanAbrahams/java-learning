//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 400, "Huge");

        doAnimalStuff(animal,"Really slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");

        Dog yorkie = new Dog("Yorkie ", 15.0);
        doAnimalStuff(yorkie, "Fast");

        Dog retriever = new Dog("Retriever ", 65.0, "Floppy","Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40.0);
        doAnimalStuff(wolf,"Slow");

        Fish goldie = new Fish("Goldfish ", 0.25, 2, 3);
        doAnimalStuff(goldie,"Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______________");
    }
}