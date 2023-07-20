
import java.util.*;
public class divisiblityby_3 {
    public static int Divi(int ar[],int n) {
        int count=0;
        for(int i=0;i<n;i++) {
            if(ar[i]!=0)
                if(ar[i]%3==0) {
                    count++;
                }
        }System.out.println(count);
        return count;


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Divi(ar, n);
    }}


