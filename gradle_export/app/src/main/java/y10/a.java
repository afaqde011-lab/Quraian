package y10;

import a30.n;
import java.util.Collection;
import java.util.LinkedHashSet;
import q20.k;
import v2.b0;

public final class a extends k {
    public final n c;
    public final LinkedHashSet d;
    public final boolean e;

    public a(n nVar, LinkedHashSet linkedHashSet, boolean z) {
        this.c = nVar;
        this.d = linkedHashSet;
        this.e = z;
    }

    public static void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override
    public final void b(j10.c cVar) {
        if (cVar == null) {
            a(0);
            throw null;
        }
        q20.j.r(cVar, new b0(this, 4));
        this.d.add(cVar);
    }

    @Override
    public final void d(j10.c cVar, j10.c cVar2) {
        if (cVar2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override
    public final void p(j10.c cVar, Collection collection) {
        if (cVar == null) {
            a(3);
            throw null;
        }
        if (!this.e || cVar.getKind() == 2) {
            cVar.h0(collection);
        }
    }
}
