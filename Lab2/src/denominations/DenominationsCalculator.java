package denominations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DenominationsCalculator {

    Integer[] denominations;
    Integer paymentAmount;
    Scanner input;

    public DenominationsCalculator() {

        input = new Scanner(System.in);
    }

    void collectNotes(){

        //System.out.println("Denominations : ");

        System.out.println("Enter the Size of Notes ");

        Integer denominationsSize = input.nextInt();

        denominations = new Integer[denominationsSize];

        for (int i = 0; i < denominationsSize; i ++) {


            System.out.printf("Note Value : %d / %d",
                    (i + 1), denominationsSize);
            System.out.println();

            denominations[i] = input.nextInt();
        }
    }

      public void amount() {

        System.out.println("Payment Amount : ");

        paymentAmount = input.nextInt();
    }


    public void calculate() {
        Arrays.sort(denominations, Collections.reverseOrder());
        int denominationIndex = 0;
        int tPaymentAmount = paymentAmount;
        boolean exactDenominationsSupplied = false;
        Integer balanceAmount = 0;

        while (denominationIndex < denominations.length) {

            Integer denomination = denominations[denominationIndex];

            Integer noOfTimesDenominations =  tPaymentAmount / denomination;

            balanceAmount =tPaymentAmount % denomination;

            if (noOfTimesDenominations != 0) {

                System.out.printf("Note : %d, no of note : %d",
                        denomination, noOfTimesDenominations);
                System.out.println();
            }


            if (balanceAmount == 0) {
                exactDenominationsSupplied = true;
            }

            tPaymentAmount = balanceAmount;

            denominationIndex ++;
        }
    }
}
