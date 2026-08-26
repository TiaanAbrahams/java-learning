//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Dell","240");
        Monitor monitor = new Monitor("Acer","27inch Beast","2540*1440",27);
        Motherboard motherboard = new Motherboard("BJ-200","Asus","V2.44",6,4);

        PersonalComputer personalComputer = new PersonalComputer("2208","Dell", computerCase, monitor,motherboard);

        personalComputer.getMonitor().drawPixelAt(5,5,"White");

        personalComputer.getMotherboard().loadProgram("Windows OS");
    }
}