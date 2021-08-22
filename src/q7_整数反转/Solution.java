package q7_整数反转;

public class Solution {

    public static int reverse(int x) {
        long sum = 0;
        while (x != 0) {
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        return (int) sum == sum ? (int) sum : 0;
    }


    public static void main(String[] args) {
        int reverse = reverse(-123);
        System.out.println(reverse);
    }

}
