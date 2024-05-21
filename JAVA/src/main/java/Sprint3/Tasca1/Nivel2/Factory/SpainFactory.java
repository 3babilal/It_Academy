package Sprint3.Tasca1.Nivel2.Factory;

import Sprint3.Tasca1.Nivel2.Address.Address;
import Sprint3.Tasca1.Nivel2.Address.SpainAddress;
import Sprint3.Tasca1.Nivel2.Phone.Phone;
import Sprint3.Tasca1.Nivel2.Phone.SpainPhone;

public class SpainFactory implements AbstractFactory{
    @Override
    public Phone newPhone(String number) {
        return new SpainPhone(number);
    }

    @Override
    public Address newAddress(String address) {
        return new SpainAddress(address);
    }
}

