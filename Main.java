package translationNumberSystem;


/**
 * Created by d1mys1klapo4ka on 19.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(myTransfer.decimalToBinary(20));
        System.out.println(myTransfer.binaryToDecimal(myTransfer.decimalToBinary(20)));
        System.out.println(myTransfer.decimalToOctal(145));
        System.out.println(myTransfer.octalToDecimal(myTransfer.decimalToOctal(145)));
        System.out.println(myTransfer.decimalToHex(98));
        System.out.println(myTransfer.hexToDecimal(myTransfer.decimalToHex(98)));
    }
}
