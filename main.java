import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
          int a,m;
        Scanner s = new Scanner(System.in);
        m= s.nextInt();
         a= s.nextInt();
        int [] p = new int[m];
         for(int i=0;i<p.length;i++){
             p[i]= s.nextInt();
         }
         System.out.println(count(p,a));
    }
    public static int count(int [] a, int b){
     b=0;
          for(int i=0;i<a.length;i++){
         if(a[i]>b)
             b++;
    }
          return b;
}
}
