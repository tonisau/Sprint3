package Tasca1.Nivell2.datafactories;

import Tasca1.Nivell2.addresses.Address;
import Tasca1.Nivell2.addresses.PolandAddress;
import Tasca1.Nivell2.phones.PolandPhone;
import Tasca1.Nivell2.phones.Phone;

public class PolandDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new PolandPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new PolandAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
