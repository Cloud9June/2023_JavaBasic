package codingTest;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];

        // 각 행/열에 대해 경비원 있는지 확인
        for (int i = 0; i < N; i++)
            map[i] = sc.next().toCharArray();

        boolean[] rowExist = new boolean[N];
        boolean[] colExist = new boolean[M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (map[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }


        // 보호 받지 못하는 행/열의 개수
        int rowNeedCount = N;
        int colNeedCount = M;

        for (int i = 0; i < N; i++)
            if (rowExist[i]) rowNeedCount--;

        for (int i = 0; i < M; i++)
            if (colExist[i]) colNeedCount--;

        // 둘 중 큰 값을 출력
        System.out.println(Math.max(rowNeedCount, colNeedCount));
    }
}
