public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others ={0, 5, 10, -50, 5};

        for(Integer i: others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d compateTo %d%n",five,
                    (val == 0? "==": (val > 0? ">":"<")), i, val);
        }
    }
}