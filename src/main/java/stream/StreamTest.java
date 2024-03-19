package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // tworzenie strumienia
        // creation of a stream

        List<String> names = Arrays.asList("Tom", "John", "Kate", "Anna", "Tosia");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);

        // przetwarzanie danych
        // filter - filtrowanie danych
        // map - zmiana elementu na coś innego.
        // limit - zwraca nam określoną liczbę elementów.
        // peek - pozwala przeprowadzić operacje na każdym elemencie.

        // OPERACJE POZWALAJACE ZAKONCZYC STRUMIEN

        // forEach - wykonanie akcji dla każdego z elementów strumienia
        // count - zwróci ilośc elementów w strumieniu
        // allMatch - sprawdza czy elementy spełniają jakiś warunek
        // collect - zwraca nowy typ na podstawie strumienia

        /* za pomocą lambdy podajemy warinek, który ma spełnić element w strumieniu jeśli ten element spełni warunek
         to zostaje w strumieniu. Jeśli element nie spełni warunku to w dalszych operacjach jest ignrowany.*/

        /*Using a lambda, we specify the condition to be met by an element in the stream if that element meets the
        condition
        then it stays in the stream. If the element does not meet the condition then it is ignored in
        further operations.*/

       List<String> modifiedNames =
               streamNames.filter(el -> el.startsWith("T"))  // wyrazy zaczynające się literą "T"
               .map(el -> el.toUpperCase())     //zmienia tekst na duże litery.
               //.forEach(el -> System.out.println(el));
               .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());

       long count = intStream.filter(el -> el>20)
               .map(el -> el*2)
               // .limit(10)   // listuje tylko 10 elementów.
               //.forEach(el -> System.out.println(el));
               .count();
        System.out.println(count);
    }

}
