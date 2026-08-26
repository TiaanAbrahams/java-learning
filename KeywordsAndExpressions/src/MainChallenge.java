public class MainChallenge {
    public static void main(String[] args) {
        int number = 1000;
        int total = 0;

        for(int i = 1; i <= number; i++){
            System.out.println("->" +i + " " + (isPrime(i) ? "Prime Number " : "Not Prime "));

            if(isPrime(i)){
                total+=1;
            }

            if(total ==  3){
                break;
            }
        }

        System.out.println("Total prime numbers found: " + total);
    }

    public static boolean isPrime(int num){
        if(num <= 2){
            return num == 2;
        }

        for(int divisor = 2; divisor <= num/2; divisor++ ){
            if(num % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}