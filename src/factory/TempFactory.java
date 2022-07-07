package factory;

import temptypes.TempType;

public interface TempFactory {
    double convert(TempType type, double gradStart);
}
