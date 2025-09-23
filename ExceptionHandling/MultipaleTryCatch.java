package JAVA_DSA_Learning.ExceptionHandling;

public class MultipaleTryCatch {
    public static void main(String[] args) {
        int[] a = {3, 0, 5, 4, 6, 9};
        int r;
        // Checked a one error at a time a executed only related catch block of that error next catch block not executed
        // ----- first  way of using try and catch block
        System.out.println("Checked a one error at a time a executed only related catch block of that error   ");
        try {
            r = a[0] / a[1];
            System.out.println(r);
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // ------- second way of using multiple try and catch block
        // for checking both a error and handled them together we use this way
        System.out.println();
        System.out.println("Both error checked together ");
        try {
            try {
                r = a[0] / a[1];
                System.out.println(r);
            } catch (ArithmeticException e)
            // this catch block must be contained subclass of its own super class like In this case Exception is super class and inside RuntimeException class having a ArithmeticException
                    // so ArithmeticException use
            {
                System.out.println(e);
            }
            System.out.println(a[10]);
        }
        // in this block we can use super class as catch block exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // --- third way of using try block with catch and finally block
        // syntax ---------------
//        try{
//            -------
//            --------
//        }
//        catch (-----){
//            ---------------
//            --------------
//        }
//        catch(-----------){
//            ------------------
//            ------------------
//        }
//        finally{
//            -----------
//            -----------
//        }
    }
}
