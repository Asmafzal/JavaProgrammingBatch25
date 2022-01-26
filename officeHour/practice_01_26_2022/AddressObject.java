package practice_01_26_2022;

public class AddressObject {

    public static void main(String[] args) {

        Address home = new Address();
        home.setStreet("22925 Arbor Cove Lane");
        home.setCity("Houston");
        home.setState("TX");
        home.setZipCode("77469");
        System.out.println("Home Adress: "+home);

        home.setZipCode("578762");
        home.setStreet("");
        System.out.println("Home Adress: "+home);

        Address work = new Address("4607 Russett Lane","Sugar Land", "TX", "77409" );
        System.out.println("Work Address: "+work);




    }
}
