import java.util.Scanner;
public class palindromeornot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        int n = sc.nextInt();
        String rev  = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("palindrome");
        }
        System.out.println("not a palindrome");
        }
        }
    