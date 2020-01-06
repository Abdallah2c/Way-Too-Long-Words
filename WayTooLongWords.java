import java.util.Scanner;


public class Training {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String st1,st2;
        int x = in.nextInt();
        for(int i=0; i<x; i++)
        { 
            st1 = in.next();
            if(st1.length() > 10)
            {
                st2 = st1.substring(1,st1.length()-1);
                System.out.println(st1.charAt(0) +""+ st2.length() +""+ st1.charAt(st1.length()-1));
            }else
                System.out.println(st1);
        }
    }
}
