package Masala_N1;

import java.util.Scanner;

public class Javop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] sum = new int[7][7];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j]=in.nextInt();
            }
        }
        System.out.println();
        System.out.println(resultOfSum(sum));

    }

    private static int resultOfSum(int[][] sum) {
        if(sum==null) return 0;
        else if(sum.length==0) return 0;
        else if(sum[0].length==0) return 0;
        else if(sum[sum.length/2][sum[0].length/2]==1) return 0;//check

        int iLocation = 0,result = 0;
        int jLocation = 0;
        int centrLocation =  sum.length/2;
        toxta:
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                if(sum[i][j]==1)
                {  iLocation=i;
                    jLocation=j;
                    break toxta;
                }
            }
        }
        while (true)
        {

            if (iLocation>centrLocation) {
                iLocation--;
                result++;
            }
            else if(iLocation<centrLocation){
                iLocation++; result++;
            }
            if(jLocation>centrLocation) {
                jLocation--;
                result++;
            }
            else if (jLocation<centrLocation){
                jLocation++;
                result++;
            }
            if(iLocation==centrLocation && jLocation==centrLocation) break;
        }

        return result;
    }
}
/**
  0 0 0 0 0 0 0
  0 0 0 0 0 0 0
  0 0 0 0 0 0 0
  0 0 0 0 0 0 0
  1 0 0 0 0 0 0
  0 0 0 0 0 0 0
  0 0 0 0 0 0 0*/