public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;
        //float dzielnik = 0;

        if(dzielnik !=0) {
            System.out.println("the result of division is: " + dzielna/dzielnik);
        }
        System.out.println(dzielna/dzielnik);

       //System.out.println("Please provide another number");

       /* aby sprawdzić czy działa zabezpieczenie przed dzieleniem przez 0 - odkomentuj 5 i 12 linijke. I zakomentuj 4 linjke.
        to see if the protection against dividing by 0 works - uncomment the 5th and 12th lines. And comment out the 4th line.*/

    }
}
