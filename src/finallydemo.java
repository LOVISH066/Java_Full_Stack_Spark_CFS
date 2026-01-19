public class finallydemo {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            //System.out.println(10/0);
        } 
        catch (Exception e)
        {
            System.out.println("catch block"); // catch tabhi chalega when error occurs in try block
        }
        finally {
            System.out.println("finally allways execute");
        }
    }
    
}
