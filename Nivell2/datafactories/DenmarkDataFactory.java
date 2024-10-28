package Tasca1.Nivell2.datafactories;

import Tasca1.Nivell2.addresses.DenmarkAddress;
import Tasca1.Nivell2.addresses.Address;
import Tasca1.Nivell2.phones.DenmarkPhone;
import Tasca1.Nivell2.phones.Phone;

public class DenmarkDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new DenmarkPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new DenmarkAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
