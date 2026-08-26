

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(116612));
    }

    public static boolean isPalindrome(int x) {
        int num = x;
        int reversed = 0;
        if(x < 0){
            return false;
        }
        for(int i = 1; x > 0; i++){
            int last = x % 10;
            reversed = reversed * 10 + last;
            x /= 10;
        }
        return reversed == num;
    }
}