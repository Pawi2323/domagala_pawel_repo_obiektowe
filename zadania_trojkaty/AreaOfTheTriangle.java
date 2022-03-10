package pl.local.home.zadanie_marzec_3.zadania_trojkaty;

import java.math.BigDecimal;
import java.math.MathContext;

class AreaOfTheTriangle{
    public BigDecimal triangle(BigDecimal a, BigDecimal h){
        return (a.multiply(h.divide(BigDecimal.valueOf(2))));
    }
    public BigDecimal triangle(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal R){
        return ((a.multiply(b.multiply(c))).divide(R.multiply(BigDecimal.valueOf(4))));
    }
    public BigDecimal triangle(BigDecimal r, BigDecimal p, boolean x){
        return (r.multiply(p));
    }
    public BigDecimal triangle(BigDecimal a, BigDecimal b, BigDecimal c, MathContext mc){
        BigDecimal p = (a.add(b).add(c)).divide(BigDecimal.valueOf(2));
        return p.multiply(p.subtract(a)).multiply(p.subtract(b)).multiply(p.subtract(c)).sqrt(mc);
    }
}