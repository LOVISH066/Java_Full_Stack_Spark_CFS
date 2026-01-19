public class finallydemo2 {
    public static void main(String[] args) {

        int res = m1();
        System.out.println(res);
        
    }

    public static int m1()
    {
        try 
        {
            System.out.println("try block");
            return 10; 
        } 
        catch (ArithmeticException e) { 
            System.out.println("catch block");
            return 20;
        }
        finally
        {
            System.out.println("finally bclok");
            return 99;
        }
        // finally >> try & catch// so here99 or finally will give return
    }
}
