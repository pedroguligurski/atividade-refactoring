public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    Enumeration rentals = _rentals.elements();
    String result = "Rental Record for " + getName() + "\n";

    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();

        double thisAmount = amountFor(each);
        
        frequentRenterPoints++;
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            each.getDaysRented() > 1) frequentRenterPoints++;

        result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
        totalAmount += thisAmount;
    }

    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points";
    return result;
}

private double amountFor(Rental aRental) {
    double thisAmount = 0;

    switch (aRental.getMovie().getPriceCode()) {
        case Movie.REGULAR:
            thisAmount += 2;
            if (aRental.getDaysRented() > 2)
                thisAmount += (aRental.getDaysRented() - 2) * 1.5;
            break;
        case Movie.NEW_RELEASE:
            thisAmount += aRental.getDaysRented() * 3;
            break;
        case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (aRental.getDaysRented() > 3)
                thisAmount += (aRental.getDaysRented() - 3) * 1.5;
            break;
    }
    return thisAmount;
}
