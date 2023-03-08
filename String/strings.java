import java.util.*;
public class strings {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Your name is "+name);
        for(int i=0;i<name.length();i++){           //print each charecter one by one
            System.out.println(name.charAt(i));     //use the function charAt
        }
    }
}
