public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;

        /*Operatory porównania można używać.
        You can use comparison operators.
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;*/


        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy gdy wyrażenia składowe są równe true.
        // && -> true when the component expressions are equal to true.

        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false


        // Lub -> true gdy jedno wyrażenie składowe jest równe true.
        // Or -> true when one component expression is equal to true.
        System.out.println(firstValue || secondValue); // true
        System.out.println(firstValue || fourthValue); // true
        System.out.println(secondValue || thirdValue); // false


        // ! negacja -> zwraca wartość przeciwną do wyrażenia przed którą się znajduje.
        // ! negation -> returns the value opposite to the expression before it.
        System.out.println(!firstValue); // false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue&&secondValue)); //true

    }
}
