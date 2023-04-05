package IO;

public class ExceptionHandling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        }

        String numericString = "abc";
        int numericValue;

        try {
            numericValue = Integer.parseInt(numericString);
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        }

        String text = "hello";
        int index = 10;

        try {
            char character = text.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }

        int[] numbers = new int[5];

        try {
            numbers[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        try {
            throw new MyException("pallabi");
        } catch (MyException e) {
            System.out.println("My Exception[" + e.getPallabi() + "]");
        }

        try {
            throw new Exception("generic exception");
        } catch (Exception e) {
            if (e instanceof ArithmeticException ||
                e instanceof NumberFormatException ||
                e instanceof StringIndexOutOfBoundsException ||
                e instanceof ArrayIndexOutOfBoundsException ||
                e instanceof MyException) {
                // already handled, do nothing
            } else {
                System.out.println("Exception encountered");
            }
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}

class MyException extends Exception {
    private final String pallabi;

    public MyException(String pallabi) {
        this.pallabi = pallabi;
    }

    public String getPallabi() {
        return pallabi;
    }
}

