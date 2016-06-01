public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i < 100; i++) {
            try {
                System.out.println(fizzBuzz.getNumber(i));
            } catch (NumberNotAllowedException e) {
                e.printStackTrace();
            }
        }
    }
}
