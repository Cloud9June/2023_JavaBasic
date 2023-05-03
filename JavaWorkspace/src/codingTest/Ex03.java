package codingTest;

public class Ex03 {

    public static void main(String[] args) {

        int sum = 0;
        int s = 1;
        int num = 0;

        for (int i=1; true; i++) {
            num = s*i;
            s = -s;
            sum += num;
            if (sum >= 100) {
                break;
            }
        }

        System.out.println(num);
        System.out.println(sum);


    }
}
