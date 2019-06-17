import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String n=scn.nextLine();
        for(int i=n.length()-1;i>=0;i--){
            System.out.print(n.charAt(i));
        }
        System.out.println();
    }
}
