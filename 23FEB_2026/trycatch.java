
class InvalidArnav extends Exception
{
    public InvalidArnav(String message)
    {
        super(message);
    }
}

public class trycatch
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10 / 0; 
        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try
        {
            int[] arr = new int[5];
            System.out.println(arr[10]); 
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        try
        {
            String str = null;
            System.out.println(str.length()); 
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try
        {
            throw new InvalidArnav("This is a custom exception.");
        }
        catch (InvalidArnav e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

