public class TextStatement extends Statement {
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String rentalDetails(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle() + "\t" + aRental.getCharge() + "\n";
    }

    protected String footer(Customer aCustomer) {
        return "Amount owed is " + aCustomer.getTotalCharge() + "\n" +
               "You earned " + aCustomer.getTotalFrequentRenterPoints() + " frequent renter points";
    }
}
