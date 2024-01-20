package denominations;

public class Main {
    public static void main(String[] args) {

        DenominationsCalculator calculator
                = new DenominationsCalculator();

        calculator.collectNotes();
        calculator.amount();
        calculator.calculate();
    }
}
