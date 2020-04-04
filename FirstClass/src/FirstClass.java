/* 
 * This class belongs to the default package
 */
public class FirstClass {
    /*
     * constructor
     */
    FirstClass() {
        System.out.println("Ctor of BasicClass called");
        myName = new String("Default Name");
    }

    FirstClass(String myName) {
        System.out.println("Ctor2 of BasicClass called");
        this.myName = myName;
    }
    String getMyName() {
        return myName;
    }
    private String myName;

    public static void main(String[] args) {
        /*
         * Create a new instance of the BasicClass
         */
        FirstClass bc = new FirstClass(); /* this should call the ctor */
        FirstClass bc2 = new FirstClass("Sidd"); /* this should call the ctor */
        System.out.println(bc2.getMyName());
        System.out.println(bc.getMyName());
        System.out.println("Exiting Main");
        

    }
}
