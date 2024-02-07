public class Arithmetic {
    public int value1 = 0;
    public int value2 = 0;

    // TODO: 07.02.2024 do task 2 
    public static void main(String[] args) {
        System.out.println(addition(10,5));
        System.out.println(multiplication(10,5));
        System.out.println(maxOf2Num(10,5));
        System.out.println(minOf2Num(10,5));
    }

    public static int addition(int first, int second) {
        int add = first + second;
        return add;
    }

    public static int multiplication(int first, int second) {
        int multi = first * second;
        return multi;
    }

    public static int maxOf2Num(int first, int second) {
        int max = Math.max(first, second);
        return max;
    }

    public static int minOf2Num(int first, int second) {
        int min = Math.min(first,second);
        return min;
    }
}
