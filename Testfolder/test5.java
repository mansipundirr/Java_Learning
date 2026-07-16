import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        System.out.println("Enter the month:");
        int month = sc.nextInt();
        int day;

        if(month >= 1 && month <= 12)
        {
            if(month == 4 || month == 6 || month == 9 || month == 11 ) {
                day = 31;
                if(day % 2 == 0){
                    System.out.println(day);

                }


        }
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
                day = 30;
                 if(day % 2 == 0){
                    System.out.println(day);

                }
               
            }
        }
        else{
            System.out.println("Invalid month");
        }
         if(month == 2){
             if(year % 400 == 0|| year % 100 != 0 && year % 4 == 0){
                day = 29;
             }


            }
       
            else{
                day = 28;
            }

            }
    
        

        



    }
    import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        System.out.println("Enter the month:");
        int month = sc.nextInt();

        System.out.println("Enter the date:"); // 1 to 31
        int date = sc.nextInt();

        if (month >= 1 && month <= 12) {

            // Months having 30 days
            if (month == 4 || month == 6 || month == 9 || month == 11) {

                if (date >= 1 && date <= 30) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date");
                }

            }

            // Months having 31 days
            else if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {

                if (date >= 1 && date <= 31) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date");
                }

            }

            // February
            else {

                // Leap year
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {

                    if (date >= 1 && date <= 29) {
                        System.out.println("Valid date");
                    } else {
                        System.out.println("Invalid date");
                    }

                }

                // Non-leap year
                else {

                    if (date >= 1 && date <= 28) {
                        System.out.println("Valid date");
                    } else {
                        System.out.println("Invalid date");
                    }

                }
            }

        } else {
            System.out.println("Invalid month");
        }

        sc.close();
    }
}
    




