public class Main extends Object{
    public static void main(String[] Args){
        Worker worker = new Worker("Tiaan", "16/12/1992");

        SalariedEmployee jim = new SalariedEmployee("Jim", "20/04/1990", "20/04/2000", 100000);
        System.out.println("R" + jim.collectPay());
        jim.terminate("01/01/2000");
        jim.retire();
        System.out.println("R" + jim.collectPay());
    }
}
