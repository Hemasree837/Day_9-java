import java.util.*;
public class RevStr2Pointer {
    public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     String a=sc.nextLine();
     char b[]=a.toCharArray();
     int n=b.length;
     int l=0;
     int h=n-1;
     while(l<=h)
     {
        char temp=b[l];
        b[l]=b[h];
        b[h]=temp;
        l++;
        h--;
     }
     System.out.println(Arrays.toString(b));
     String res=new String(b);
     System.out.println(res);
}
}
