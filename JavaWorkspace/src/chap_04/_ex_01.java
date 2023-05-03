// 구구단을 짝수 단만 출력하도록 프로그램을 만드시오.
// hint : continue

package chap_04;

public class _ex_01 {

    public static void main(String[] args) {

        for (int i=2; i<=9; i++) {
            if (i%2!=0) continue;
            for (int j=1; j<=9; j++) {
                System.out.println(i + "*" + j + " = " + (i*j));
            }
        }
    }
}
