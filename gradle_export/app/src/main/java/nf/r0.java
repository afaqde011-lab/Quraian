package nf;

import java.util.Comparator;
import java.util.Objects;

public abstract class r0 {

    public static final Comparator f11253a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(r0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = q0.A;
        }
        f11253a = comparator;
    }
}
