package Tasca1.Nivell2.datafactories;

import Tasca1.Nivell2.addresses.Address;
import Tasca1.Nivell2.phones.Phone;

public interface DataFactory {
    Phone createPhone(String number);
    Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city);
}
