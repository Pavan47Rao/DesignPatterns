package edu.neu.csye7374.decorator;

import edu.neu.csye7374.api.AutoAPI;
import edu.neu.csye7374.api.AutoDecoratorAPI;

public class ABS extends AutoDecoratorAPI{
public static final String ABS_DESCRIPTION = " +Anti Braking System";
public static double ABS_PRICE = 3000.00;

public ABS(AutoAPI autoAPI) {
super(autoAPI);
}
@Override
public double getPrice() {
return super.getPrice() + ABS_PRICE;
}
@Override
public String getDescription() {
return super.getDescription() + ABS_DESCRIPTION;
}


}