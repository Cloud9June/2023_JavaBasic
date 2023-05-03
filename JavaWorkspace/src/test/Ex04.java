package test;

public class Ex04 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        // 코드 작성
        int temp;
        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

        /*
        결과예시
        x=2
        y=3
        z=1
        */
    }
}
