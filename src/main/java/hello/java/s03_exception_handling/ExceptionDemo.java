package hello.java.s03_exception_handling;

import java.io.*;

public class ExceptionDemo {

    public static void main(String[] args) {
        var res = testFinally();
        System.out.println(res);
    }

    private static int testFinally() {
        var f = new File("hello.java");
        FileInputStream s = null;
        try {
            s = new FileInputStream(f);
            var a = 1 / 0;
            return 0;
        } catch (IOException | ArithmeticException e) {
            System.out.println("catch IOException or ArithmeticException");
            return 1;
        } catch (NullPointerException e) {
            System.out.println("catch NullPointerException");
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e);
            return 2;
        } finally {
        //     System.out.println("finally");
        //     return 3;
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static int tryWithResource()  {
        var f = new File("hello.java");
        try (
                var s = new FileInputStream(f);
        ) {
            System.out.println("tryWithResource");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

}

// unchecked exception: run-time; extends RuntimeException
class UncheckedException extends RuntimeException {}

// checked exception: compile-time; extend Exception
class CheckedException extends Exception {}
