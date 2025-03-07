package company.com;

class cd{
    cd(){
        System.out.println("Hello");
    }
}
/*// this is default constructor cannot be access
from outside the package only access from inside the  same package
that are in created.
 */
public class cons {
    public static void main(String[] args) {
        cd obj = new cd();

        cd obj1 = new cd();
    }
}
