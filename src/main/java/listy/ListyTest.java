package listy;

import docs.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tosia");
        names.add("Kuba");
        names.add("Kamela");
        names.add("Tosia");

        System.out.println(names.get(0));

        System.out.println(names.indexOf("Tosia"));
        System.out.println(names.lastIndexOf("Tosia"));

        System.out.println(names.contains("Cezarek")); // brak na liście dostaje odp. False

        System.out.println(names.size());  // wielkośc ilisty (ile elementów).
        System.out.println(names.isEmpty()); // False - bo nie jest to pusta lista.

        //DRUGA LISTA

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(names.get(1));

        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(3));

        System.out.println(numbers.contains(2));

        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        // TRZECIA LISTA

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        System.out.println(diffNames);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        System.out.println(pdfDocuments);


        //zapis kolekcji
       for(int i=0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // drugi sposob zapisu kolekcji

        for(String name : names) {
            System.out.println(names);
        }
    }
}
