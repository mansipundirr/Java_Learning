import java.util.*;

public class string6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Email = sc.next();
        String userName = "";
        for(int i = 0; i < Email.length(); i++)
        {
            if(Email.charAt(i) == '@'){
                break;
            }
            else{
                userName = userName + Email.charAt(i);
            }
        }
        System.out.println(userName);

    }
    
}
