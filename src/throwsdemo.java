import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwsdemo {
    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        m2();
    }
    public static void m2()
    {
        // lets here we handle this exception using try and catch
        try 
        {
            m3();
        } 
        catch (Exception e) 
        {
            e.printStackTrace(); // this will print exeption
        }

    }
    public static void m3() throws FileNotFoundException
    {
        m4();
    }
    public static void m4() throws FileNotFoundException
    {
        // lets here we got file exception
        // if exception occur at comiple time then it is checked exception and if it is come at runtime then it is unchecked like rember cccc
        File file = new File("demo.txt"); // this file is missing 
        Scanner sc = new Scanner(file); // here object is created.
        // object is created by 'new'
        // checked exception is coming on comiple time so we got error on comiple time like unchecked exception are like arthematic exceotion wi ll o ncomiple time
        // error are those that we can not handle by code like stack out of bondtack overflowout of memry verify error.
        // now we will use htorws that will transfer eception to or delight exception to colar method pr baove method
    }
    
}
