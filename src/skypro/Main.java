package skypro;

public class Main {
    public static void main(String[] args) {
        int[] whole = new int[]{1, 2, 3};//              задача 1
        double[] fractional = {1.57, 7.654, 9.986};
        byte[] symbols = {5, 6, 7};
        System.out.println(whole[0] + "," + whole[1] + "," + whole[2]);//         задача 2
        System.out.println(fractional[0] + "," + fractional[1] + "," + fractional[2]);
        System.out.println(symbols[0] + "," + symbols[1] + "," + symbols[2]);
        System.out.println(whole[2] + "," + whole[1] + "," + whole[0]);//         задача 3
        System.out.println(fractional[2] + "," + fractional[1] + "," + fractional[0]);
        System.out.println(symbols[2] + "," + symbols[1] + "," + symbols[0]);
        for (int i = 0; i < whole.length; i++) {
            System.out.println(whole[i] + 1);
        }
    }
}
