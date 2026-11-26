package c30;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class g extends q20.k {
    public final int c;
    public final AbstractCollection d;

    public g(AbstractCollection abstractCollection, int i) {
        this.c = i;
        this.d = abstractCollection;
    }

    public static void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override
    public final void b(j10.c fakeOverride) {
        switch (this.c) {
            case 0:
                kotlin.jvm.internal.m.e(fakeOverride, "fakeOverride");
                q20.j.r(fakeOverride, null);
                ((ArrayList) this.d).add(fakeOverride);
                return;
            default:
                if (fakeOverride == null) {
                    a(0);
                    throw null;
                }
                q20.j.r(fakeOverride, null);
                ((LinkedHashSet) this.d).add(fakeOverride);
                return;
        }
    }

    @Override
    public final void d(j10.c cVar, j10.c fromCurrent) {
        switch (this.c) {
            case 0:
                kotlin.jvm.internal.m.e(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof m10.t) {
                    ((m10.t) fromCurrent).f1(j10.q.a, cVar);
                    return;
                }
                return;
            default:
                if (fromCurrent != null) {
                    return;
                }
                a(2);
                throw null;
        }
    }
}
