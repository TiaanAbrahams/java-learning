class Main{
    public static void main(String[] args){
        Firearm gun1 = new Rifle("Springfield", "556", 35000);
        Firearm gun2 = new Pistol("Glock 17", "9mm", 15000);

        gun1.shoot();
        gun2.shoot();

        System.out.println("R " + gun1.getPrice());

        ShootingRange.testFire(gun1);
    }
}