package evenodd;
public class evenodd {

    public String checkEvenOdd(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        evenodd obj = new evenodd();

        System.out.println("10 is " + obj.checkEvenOdd(10));
        System.out.println("7 is " + obj.checkEvenOdd(7));
    }
}