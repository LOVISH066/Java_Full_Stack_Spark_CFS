public class paymentdemo {
    public static void main(String[] args) {

        payment(100);

    }

    // making method or function
    public static void payment(int price)
    {
         System.out.println("Transaction initating");
         System.out.println("SElect bank");
         System.out.println(" making payment upi");
        // now we will handle exception
        try {
            System.out.println(10/0);
        } 
        catch (Exception e)
        {
            System.out.println("payment fail");
            e.printStackTrace(); // use only to print error.
        }
        finally {
            System.out.println("finally allways execute");
        }

        // System.out.println("payment done");
    }
}
