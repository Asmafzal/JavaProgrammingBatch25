package practice_01_26_2022;

public class Address {

    /*
   AdressTask

            Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments
     */

    private String street, city, state, zipCode;
    private final String country = "USA";
=======

     /*
            AdressTask

	        Create a class named Address

			Private variables:
					street, city, state, zipCode,country

			encapsulate all the fields

			add a constructor that can set all the instances
				and constructor with no arg constructor

			- if the street name isEmpty or street length is bigger than 50
			 otherwise
				 ERROR : Invalid Street

		    - ZipCode length should be equal 5 otherwise
		    	 ERROR :Invalid ZipCode

			DO NOT duplicate any code fragments
        */

    private String street, city, state, zipCode;
    private final static String country="USA";
>>>>>>> 8d2db02187acdb36ca25e9a5e7b8c2bfdf27fc04

    public Address(){

    }

    public Address(String street, String city, String state, String zipCode) {
<<<<<<< HEAD
        setStreet(street);
        this.city = city;
        this.state = state;
        setZipCode(zipCode);
=======
        this.street=street;
        this.city = city;
        this.state = state;
        this.zipCode=zipCode;
>>>>>>> 8d2db02187acdb36ca25e9a5e7b8c2bfdf27fc04
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
<<<<<<< HEAD
            System.out.println("ERROR: Invalid Street");
        } else{
            this.street = street;
    }
    }

=======
            System.out.println("ERROR: Invalid street");
        } else {
            this.street = street;
        }
    }
>>>>>>> 8d2db02187acdb36ca25e9a5e7b8c2bfdf27fc04
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
<<<<<<< HEAD
        if (zipCode.length()!=5) {
            System.err.println("Error:  Invalid ZipCode");
            return;//exit statement
=======
        if (zipCode.length() != 5) {
            System.out.println("ERROR :Invalid ZipCode");
            return; //exit statement
>>>>>>> 8d2db02187acdb36ca25e9a5e7b8c2bfdf27fc04
        }
            this.zipCode = zipCode;
        }

<<<<<<< HEAD
        public String getCountry() {
        return country;
    }

=======
    public String getCountry() {
        return country;
    }

    @Override
>>>>>>> 8d2db02187acdb36ca25e9a5e7b8c2bfdf27fc04
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
