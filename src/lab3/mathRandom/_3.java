package lab3.mathRandom;

public class _3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean check = false;
        array[0] = 10 + (int) (Math.random() * 90);
        for(int i = 1; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
            if(array[i-1] == array[i])
                i--;
            if(array[i-1] >= array[i])
                check = true;
        }
        for (int j : array) {
            System.out.println(j);
        }
        if(!check)
            System.out.println("Последовательность строго возрастает!");
    }
}
