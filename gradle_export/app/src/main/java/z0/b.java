package z0;

import g00.k;
import java.util.List;
import kotlin.jvm.internal.m;
import m3.h0;
import m3.q0;
import r30.r;

public final class b implements CharSequence {
    public final List A;
    public final List B;
    public final CharSequence C;
    public final long D;
    public final q0 E;
    public final k F;

    public b(CharSequence charSequence, long j9, q0 q0Var, k kVar, List list, List list2, int i10) {
        q0Var = (i10 & 4) != 0 ? null : q0Var;
        kVar = (i10 & 8) != 0 ? null : kVar;
        list = (i10 & 16) != 0 ? null : list;
        list2 = (i10 & 32) != 0 ? null : list2;
        this.A = list;
        this.B = list2;
        this.C = charSequence instanceof b ? ((b) charSequence).C : charSequence;
        this.D = h0.c(charSequence.length(), j9);
        this.E = q0Var != null ? new q0(h0.c(charSequence.length(), q0Var.f10520a)) : null;
        this.F = kVar != null ? new k(kVar.A, new q0(h0.c(charSequence.length(), ((q0) kVar.B).f10520a))) : null;
    }

    @Override
    public final char charAt(int i10) {
        return this.C.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (q0.c(this.D, bVar.D) && m.a(this.E, bVar.E) && m.a(this.F, bVar.F) && m.a(this.A, bVar.A)) {
            return r.n0(this.C, bVar.C);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.C.hashCode() * 31;
        int i10 = q0.f10519c;
        int iF = w.c.f(iHashCode, this.D, 31);
        q0 q0Var = this.E;
        int iHashCode2 = (iF + (q0Var != null ? Long.hashCode(q0Var.f10520a) : 0)) * 31;
        k kVar = this.F;
        int iHashCode3 = (iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        List list = this.A;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override
    public final int length() {
        return this.C.length();
    }

    @Override
    public final CharSequence subSequence(int i10, int i11) {
        return this.C.subSequence(i10, i11);
    }

    @Override
    public final String toString() {
        return this.C.toString();
    }
}
