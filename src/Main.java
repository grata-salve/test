import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {
    Function<Function<String, Integer>, Predicate<String>> highOrderFunc =
        strToInt -> str -> strToInt.apply(str) > 0;

    Predicate<String> stringIntegerFunction = highOrderFunc.apply(Integer::parseInt);
    System.out.println(stringIntegerFunction.test("-1231"));

    System.out.println("change 1");

    System.out.println("change 2");

    System.out.println("Change 3");
  }

}
