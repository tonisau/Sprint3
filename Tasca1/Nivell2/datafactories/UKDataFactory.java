package Tasca1.Nivell2.datafactories;

import Tasca1.Nivell2.addresses.Address;
import Tasca1.Nivell2.addresses.UKAddress;
import Tasca1.Nivell2.phones.Phone;
import Tasca1.Nivell2.phones.UKPhone;

public class UKDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new UKPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new UKAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
