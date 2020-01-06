import java.util.Scanner;


public class Training {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String st1,st2;
        //Enter the number of test cases
        int x = in.nextInt(); 
        //A loop to enter the desired number of variables
        for(int i=0; i<x; i++) 
        { 
            st1 = in.next();
            //Check if the word has more than 10 characters
            if(st1.length() > 10) 
            {
                 //Store the substring between the 1st & last characters in a variable
                st2 = st1.substring(1,st1.length()-1);
                System.out.println(st1.charAt(0) +""+ st2.length() +""+ st1.charAt(st1.length()-1)); //display
            }else
                System.out.println(st1);
        }
    }
}
