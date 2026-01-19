public class throwdemo {
    public static void main(String[] args) {
        // throw- used to explicity the throw thre excpetion
        div(2,0);
    }

    // making div method
    public static int div(int div, int divisor)
    {
        // div/divisor
        // now we are creating exception uwing throw
        if(divisor==0)
            throw new ArithmeticException("Cannot divide by zero");
        return div/divisor;
        // throws will always be used in checked exception
    }
}
