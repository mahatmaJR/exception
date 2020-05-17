public class Example {

    int divide() {
        int i = 0;
        int j = 0;
        try {
            i = 1;
            j = 0;
            return i / j;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        return i / j;
    }

}
