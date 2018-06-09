package com.denis.bsu.lab10.airline.aircraft;

import com.denis.bsu.lab10.airline.utils.Utils;

import java.io.Serializable;
import java.util.Objects;

public class Carcas implements Serializable {
    private static final long serialVersionUID = 146522059781657552L;

    private Double wingSpan; // размах крыла (м)
    private Double fullLength; // полная длина (м)
    private Double tailHeight; // высота хвостовой части (м)
    private Double internalWidthSalon; // внутренняя ширина салона (м)

    public Carcas() {
        wingSpan = 20.0 + Utils.getRand().nextDouble() * 20;
        fullLength = 20.0 + Utils.getRand().nextDouble() * 20;
        tailHeight = 20.0 + Utils.getRand().nextDouble() * 20;
        internalWidthSalon = 20.0 + Utils.getRand().nextDouble() * 20;
    }

    public Carcas(Double wingSpan, Double fullLength, Double tailHeight, Double internalWidthSalon) {
        this.wingSpan = wingSpan;
        this.fullLength = fullLength;
        this.tailHeight = tailHeight;
        this.internalWidthSalon = internalWidthSalon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Carcas carcas = (Carcas) o;
        return Objects.equals(wingSpan, carcas.wingSpan)
                && Objects.equals(fullLength, carcas.fullLength)
                && Objects.equals(tailHeight, carcas.tailHeight)
                && Objects.equals(internalWidthSalon, carcas.internalWidthSalon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingSpan, fullLength, tailHeight, internalWidthSalon);
    }

    @Override
    public String toString() {
        return "Carcas{" +
                "wingSpan=" + wingSpan +
                ", fullLength=" + fullLength +
                ", tailHeight=" + tailHeight +
                ", internalWidthSalon=" + internalWidthSalon +
                '}';
    }
}
