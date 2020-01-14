package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2){
            return 8.40 * 2;
        }
        else {
            return defaultPrice();
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 12 && visitor.getHeight() >1.45){
            return true;
        }else {
            return false;
        }
    }
}
