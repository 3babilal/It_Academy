package Sprint3.Tasca1.Nivel2.Factory;

import Sprint3.Tasca1.Nivel2.Address.Address;
import Sprint3.Tasca1.Nivel2.Phone.Phone;

public interface AbstractFactory {
    Phone newPhone(String number);
    Address newAddress(String address);
}
