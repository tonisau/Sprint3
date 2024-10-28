package Tasca1.Nivell2.datafactories;

import Tasca1.Nivell2.addresses.Address;
import Tasca1.Nivell2.addresses.SpainAddress;
import Tasca1.Nivell2.phones.Phone;
import Tasca1.Nivell2.phones.SpainPhone;

public class SpainDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new SpainPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new SpainAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
