public class HtmlStatement extends Statement {
    protected String header(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    protected String rentalDetails(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " + aRental.getCharge() + "<BR>\n";
    }

    protected String footer(Customer aCustomer) {
        return "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n" +
               "On this rental you earned <EM>" + aCustomer.getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
    }
}
