import  java.util.*;
public class Application {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String:");
        String str=sc.nextLine();
        StringFunctions obj=new StringFunctions();
        int str_len=obj.string_length(str);
        String str_reverse=obj.string_reverse(str);
        System.out.println(str_len);
        System.out.println(str_reverse);
    }

}
