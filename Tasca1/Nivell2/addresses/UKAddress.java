package Tasca1.Nivell2.addresses;

public class UKAddress extends Address{
    public UKAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        super(street, houseNumber, floorAndDoor, postalCode, city);
        country = "UK";
    }
}
