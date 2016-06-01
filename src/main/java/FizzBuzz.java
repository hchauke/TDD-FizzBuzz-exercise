public class FizzBuzz {


    public String getNumber(int number) throws NumberNotAllowedException {

        if(number > 100){
            throw new NumberNotAllowedException("We are accepting only numbers from 1 to 100");


        }else if((number % 3) == 0 && (number % 5) == 0){
            return "FizzBuzz";

        }else if((number % 3) == 0) {
            return "Fizz";

        }else if((number % 5) == 0){
          return "Buzz";

        }
        return String.valueOf(number);
    }

}
