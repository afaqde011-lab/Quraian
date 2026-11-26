package fs;

import a10.h0;
import g00.s;
import kotlin.NoWhenBranchMatchedException;
import ss.q;
import ss.r;
import ss.t;
import ss.u;
import ss.y;

public final class f extends h0 {
    public static ss.d X(gs.e from) {
        Object next;
        kotlin.jvm.internal.m.e(from, "from");
        ss.e eVar = new ss.e(from.b, from.c, from.d, from.f, from.g, from.h, from.i, from.j, from.k, from.l, from.m, from.n, from.o);
        n00.b bVar = ss.f.I;
        bVar.getClass();
        s sVar = new s(bVar, 4);
        do {
            if (!sVar.hasNext()) {
                next = null;
                break;
            }
            next = sVar.next();
        } while (!((ss.f) next).A.equals(from.e));
        ss.f fVar = (ss.f) next;
        if (fVar == null) {
            fVar = ss.f.PROGRESS;
        }
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return new r(eVar);
        }
        if (iOrdinal == 1) {
            return new q(eVar);
        }
        if (iOrdinal == 2) {
            return new u(eVar);
        }
        if (iOrdinal == 3) {
            return new t(eVar);
        }
        if (iOrdinal == 4) {
            return new y(eVar);
        }
        if (iOrdinal == 5) {
            return new ss.a(eVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
