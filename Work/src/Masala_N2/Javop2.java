package Masala_N2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(tubSon(n));
    }

    private static int tubSon(int n) {
//        if(n<1) return 0;
//        else if(n==1) return 1;
        int sum =1;
        for (int i = 2; i <= n; i++) {
            boolean bil = true;
            for(int  j=2;j<=Math.sqrt(i);j++)
            {
                if (i % j ==0)
                {
                    bil = false;
                    break;
                }
            }
            if (bil)
            {
                sum*=i;
            }
        }
        int result = 0;
        while (sum!=0)
        {
            if(sum%10==0)
            {
                result++;
                sum= sum%10;
            }
            else break;
        }
        return result;

    }
}
