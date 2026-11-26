package a30;

import i20.u0;
import java.util.ArrayList;

public final class j implements m, o, n {
    public static final j c = new j(0);
    public static final j d = new j(1);
    public static final j e = new j(2);
    public static final j f = new j(3);
    public static final j g = new j(4);
    public final int b;

    public j(int i) {
        this.b = i;
    }

    public static j10.y e(i20.d0 d0Var) {
        int i = d0Var == null ? -1 : y.a[d0Var.ordinal()];
        if (i == 1) {
            return j10.y.B;
        }
        if (i == 2) {
            return j10.y.D;
        }
        if (i != 3) {
            return i != 4 ? j10.y.B : j10.y.C;
        }
        return j10.y.E;
    }

    @Override
    public void a(j10.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override
    public e30.w b(u0 proto, String flexibleId, e30.a0 lowerBound, e30.a0 upperBound) {
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(flexibleId, "flexibleId");
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override
    public void c(j10.e eVar, ArrayList arrayList) {
    }

    @Override
    public Boolean d() {
        switch (this.b) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
