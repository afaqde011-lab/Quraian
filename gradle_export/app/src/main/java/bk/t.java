package bk;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class t extends q {
    public final Serializable A;

    public t(Boolean bool) {
        Objects.requireNonNull(bool);
        this.A = bool;
    }

    public t(Number number) {
        Objects.requireNonNull(number);
        this.A = number;
    }

    public t(String str) {
        Objects.requireNonNull(str);
        this.A = str;
    }

    public static boolean k(t tVar) {
        Serializable serializable = tVar.A;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override
    public final int a() {
        return this.A instanceof Number ? i().intValue() : Integer.parseInt(e());
    }

    @Override
    public final String e() {
        Serializable serializable = this.A;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return i().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        Serializable serializable = tVar.A;
        Serializable serializable2 = this.A;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (k(this) && k(tVar)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return h().equals(tVar.h());
            }
            return i().longValue() == tVar.i().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : dk.h.i(e())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : dk.h.i(tVar.e())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? i().doubleValue() : Double.parseDouble(e());
        double dDoubleValue2 = serializable instanceof Number ? tVar.i().doubleValue() : Double.parseDouble(tVar.e());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final BigInteger h() {
        Serializable serializable = this.A;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (k(this)) {
            return BigInteger.valueOf(i().longValue());
        }
        String strE = e();
        dk.h.d(strE);
        return new BigInteger(strE);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.A;
        if (serializable == null) {
            return 31;
        }
        if (k(this)) {
            jDoubleToLongBits = i().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number i() {
        Serializable serializable = this.A;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new dk.j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }
}
