public class Main {
    public static void main(String[] Args){
        ISaveable monster = new Monster("Tiaan", 50, 100);
        ISaveable danger = new Monster("Danger", 50, 100);

        System.out.println(monster.write());
    }
}
