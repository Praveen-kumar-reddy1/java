import javax.lang.model.util.ElementScanner14;

public class leap
{
    
        public static void main(String[] args) {
            int year = 2024;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
    }
    

