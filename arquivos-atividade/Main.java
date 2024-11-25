public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("John Wick 4", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 5); 
        Rental rental2 = new Rental(movie2, 3); 
        Rental rental3 = new Rental(movie3, 2); 

        Customer customer = new Customer("John Doe");

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println("Relatório em Texto:");
        System.out.println(customer.statement());

        System.out.println("\nRelatório em HTML:");
        System.out.println(customer.htmlStatement());
    }
}
