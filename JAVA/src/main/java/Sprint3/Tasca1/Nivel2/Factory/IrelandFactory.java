package Sprint3.Tasca1.Nivel2.Factory;

import Sprint3.Tasca1.Nivel2.Address.Address;
import Sprint3.Tasca1.Nivel2.Address.IrelandAddress;
import Sprint3.Tasca1.Nivel2.Phone.IrelandPhone;
import Sprint3.Tasca1.Nivel2.Phone.Phone;

public class IrelandFactory implements AbstractFactory{
    @Override
    public Phone newPhone(String number) {
        return new IrelandPhone(number);
    }

    @Override
    public Address newAddress(String address) {
        return new IrelandAddress(address);
    }
}
