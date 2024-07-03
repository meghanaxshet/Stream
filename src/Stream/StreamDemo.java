package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {

        //iterative way
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i) * list.get(i);
            }
        }
        System.out.println("Sum with Iterative " + sum);

        // Declarative way
        int output = list.stream().filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {

                return integer % 2 == 0;
            }

        }).map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {

                return integer * integer;
            }
        }).reduce(0, new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer i, Integer j) {
                // TODO Auto-generated method stub
                return i + j;
            }

        });
        System.out.println("Sum with Declarative way : " + output);

        // Lambda
        int output1 = list.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * integer).reduce(0,
                (i, j) -> i + j);

        System.out.println("Sum with Lambda " + output1);


    }
}
