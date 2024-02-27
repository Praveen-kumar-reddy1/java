import javax.lang.model.util.ElementScanner14;

public class greatest {
    public static void main(String args[])
    {
        int x=25;
        int y=96;
        int z=54;
        int p=56;
        if(x>y&&x>z&&x>p){
            System.out.println(x);
        }
        else if(y>z&&y>p){
            System.out.println(y);
        }
        else if(z>p){
            System.out.println(z);
        }
        else
        {
            System.out.println(p);

        }


        }
    }

