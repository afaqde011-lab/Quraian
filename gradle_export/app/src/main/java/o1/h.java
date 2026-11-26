package o1;

import com.google.android.gms.internal.measurement.y3;
import h00.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l1.n1;
import l1.t0;
import u.d0;
import u.i0;
import u.q0;
import u.w;

public final class h implements a2.d, Iterable, v00.a {
    public int B;
    public int D;
    public int E;
    public boolean G;
    public int H;
    public HashMap J;
    public w K;
    public int[] A = new int[0];
    public Object[] C = new Object[0];
    public final Object F = new Object();
    public ArrayList I = new ArrayList();

    public static final void h(k kVar, int i10) {
        while (kVar.f11509v >= 0 && kVar.f11508u <= i10) {
            kVar.O();
            kVar.j();
        }
    }

    public final int a(b bVar) {
        if (this.G) {
            l1.l.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.a()) {
            n1.a("Anchor refers to a group that was removed");
        }
        return bVar.f11470a;
    }

    public final void c() {
        this.J = new HashMap();
    }

    public final i0 e(l1.a aVar, d0 d0Var) {
        int i10;
        Object[] objArr = d0Var.f14837a;
        int i11 = d0Var.f14838b;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        for (int i16 = 0; i16 < i11; i16++) {
            if (!l(y3.q(((t0) objArr[i16]).f9934e))) {
                d0 d0Var2 = new d0();
                Object[] objArr2 = d0Var.f14837a;
                int i17 = d0Var.f14838b;
                for (int i18 = i12; i18 < i17; i18++) {
                    Object obj = objArr2[i18];
                    if (l(y3.q(((t0) obj).f9934e))) {
                        d0Var2.a(obj);
                    }
                }
                d0Var = d0Var2;
                break;
            }
        }
        h00.a aVar2 = new h00.a(this, 23);
        char c10 = 1;
        int i19 = 1;
        int i20 = 1;
        boolean z11 = true;
        if (d0Var.f14838b > 1) {
            Comparable comparable = (Comparable) aVar2.invoke(d0Var.f(i14));
            int i21 = d0Var.f14838b;
            int i22 = i20;
            while (i22 < i21) {
                Comparable comparable2 = (Comparable) aVar2.invoke(d0Var.f(i22));
                if (comparable.compareTo(comparable2) > 0) {
                    d0 d0Var3 = new d0(d0Var.f14838b);
                    Object[] objArr3 = d0Var.f14837a;
                    int i23 = d0Var.f14838b;
                    for (int i24 = i13; i24 < i23; i24++) {
                        d0Var3.a(objArr3[i24]);
                    }
                    m1.b bVar = d0Var3.f14839c;
                    if (bVar == null) {
                        bVar = new m1.b(d0Var3, c10 == true ? 1 : 0);
                        d0Var3.f14839c = bVar;
                    }
                    if (((d0) bVar.B).f14838b > i19) {
                        u.t0(bVar, new ay.b(aVar2, 6));
                    }
                    d0Var = d0Var3;
                    break;
                }
                i22++;
                comparable = comparable2;
            }
        }
        if (d0Var.h()) {
            i0 i0Var = q0.f14886b;
            kotlin.jvm.internal.m.c(i0Var, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
            return i0Var;
        }
        long[] jArr = q0.f14885a;
        i0 i0Var2 = new i0();
        k kVarK = k();
        try {
            Object[] objArr4 = d0Var.f14837a;
            int i25 = d0Var.f14838b;
            for (int i26 = i15; i26 < i25; i26++) {
                t0 t0Var = (t0) objArr4[i26];
                int iC = kVarK.c(y3.q(t0Var.f9934e));
                int iG = kVarK.G(kVarK.f11491b, iC);
                h(kVarK, iG);
                h(kVarK, iG);
                while (true) {
                    i10 = kVarK.f11507t;
                    if (i10 == iG || i10 == kVarK.f11508u) {
                        break;
                        break;
                    }
                    if (iG < kVarK.u(i10) + i10) {
                        kVarK.R();
                    } else {
                        kVarK.N();
                    }
                }
                if (i10 != iG) {
                    l1.l.a("Unexpected slot table structure");
                }
                kVarK.R();
                kVarK.a(iC - kVarK.f11507t);
                i0Var2.m(t0Var, l1.l.c(t0Var.f9932c, t0Var, kVarK, aVar));
            }
            h(kVarK, Integer.MAX_VALUE);
            return i0Var2;
        } finally {
            kVarK.e(z10);
        }
    }

    public final g i() {
        if (this.G) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.E++;
        return new g(this);
    }

    @Override
    public final Iterator iterator() {
        return new d(this, 0, this.B);
    }

    public final k k() {
        if (this.G) {
            l1.l.a("Cannot start a writer when another writer is pending");
        }
        if (this.E > 0) {
            l1.l.a("Cannot start a writer when a reader is pending");
        }
        this.G = true;
        this.H++;
        return new k(this);
    }

    public final boolean l(b bVar) {
        int iE;
        return bVar.a() && (iE = j.e(this.I, bVar.f11470a, this.B)) >= 0 && kotlin.jvm.internal.m.a(this.I.get(iE), bVar);
    }

    public final c m(int i10) {
        int i11;
        ArrayList arrayList;
        int iE;
        HashMap map = this.J;
        if (map != null) {
            if (this.G) {
                l1.l.a("use active SlotWriter to crate an anchor for location instead");
            }
            b bVar = (i10 < 0 || i10 >= (i11 = this.B) || (iE = j.e((arrayList = this.I), i10, i11)) < 0) ? null : (b) arrayList.get(iE);
            if (bVar != null) {
                return (c) map.get(bVar);
            }
        }
        return null;
    }
}
