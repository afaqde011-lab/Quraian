package s1;

import com.google.android.gms.internal.measurement.y3;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d0;

public class f extends d {
    public final e E;
    public Object F;
    public boolean G;
    public int H;

    public f(e eVar, l[] lVarArr) {
        super(eVar.C, lVarArr);
        this.E = eVar;
        this.H = eVar.E;
    }

    public final void h(int i10, k kVar, Object obj, int i11) {
        l[] lVarArr = (l[]) this.D;
        int i12 = i11 * 5;
        if (i12 <= 30) {
            int iM = 1 << y3.M(i10, i12);
            if (kVar.h(iM)) {
                lVarArr[i11].a(kVar.f13624d, Integer.bitCount(kVar.f13621a) * 2, kVar.f(iM));
                this.B = i11;
                return;
            } else {
                int iT = kVar.t(iM);
                k kVarS = kVar.s(iT);
                lVarArr[i11].a(kVar.f13624d, Integer.bitCount(kVar.f13621a) * 2, iT);
                h(i10, kVarS, obj, i11 + 1);
                return;
            }
        }
        l lVar = lVarArr[i11];
        Object[] objArr = kVar.f13624d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            l lVar2 = lVarArr[i11];
            if (kotlin.jvm.internal.m.a(lVar2.B[lVar2.D], obj)) {
                this.B = i11;
                return;
            } else {
                lVarArr[i11].D += 2;
            }
        }
    }

    @Override
    public final Object next() {
        if (this.E.E != this.H) {
            throw new ConcurrentModificationException();
        }
        if (!this.C) {
            throw new NoSuchElementException();
        }
        l lVar = ((l[]) this.D)[this.B];
        this.F = lVar.B[lVar.D];
        this.G = true;
        return super.next();
    }

    @Override
    public final void remove() {
        if (!this.G) {
            throw new IllegalStateException();
        }
        boolean z10 = this.C;
        e eVar = this.E;
        if (!z10) {
            d0.b(eVar).remove(this.F);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            l lVar = ((l[]) this.D)[this.B];
            Object obj = lVar.B[lVar.D];
            d0.b(eVar).remove(this.F);
            h(obj != null ? obj.hashCode() : 0, eVar.C, obj, 0);
        }
        this.F = null;
        this.G = false;
        this.H = eVar.E;
    }
}
