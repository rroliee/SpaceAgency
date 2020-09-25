package hu.kincstar.javasetraining.spaceagency;

import java.math.BigDecimal;

public class CelestialCoordinates {
    private final BigDecimal x, y, z;   // BigDecimal, mert az űrben kis tévedés is nagy lehet :)

    public CelestialCoordinates(BigDecimal x, BigDecimal y, BigDecimal z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public BigDecimal getX() {
        return x;
    }

    public BigDecimal getY() {
        return y;
    }

    public BigDecimal getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "CelestialCoordinates{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
