package w30;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kh.o;
import kotlin.jvm.internal.d0;

public class e extends s1.d {
    public final d E;
    public Object F;
    public boolean G;
    public int H;

    public e(d builder, s1.l[] lVarArr) {
        super(builder.C, lVarArr);
        kotlin.jvm.internal.m.e(builder, "builder");
        this.E = builder;
        this.H = builder.E;
    }

    public final void h(int i, k kVar, Object obj, int i2) {
        s1.l[] lVarArr = (s1.l[]) ((s1.d) this).D;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int iA = 1 << o.A(i, i3);
            if (kVar.i(iA)) {
                int iF = kVar.f(iA);
                s1.l lVar = lVarArr[i2];
                Object[] buffer = kVar.d;
                int iBitCount = Integer.bitCount(kVar.a) * 2;
                lVar.getClass();
                kotlin.jvm.internal.m.e(buffer, "buffer");
                lVar.B = buffer;
                lVar.C = iBitCount;
                lVar.D = iF;
                ((s1.d) this).B = i2;
                return;
            }
            int iU = kVar.u(iA);
            k kVarT = kVar.t(iU);
            s1.l lVar2 = lVarArr[i2];
            Object[] buffer2 = kVar.d;
            int iBitCount2 = Integer.bitCount(kVar.a) * 2;
            lVar2.getClass();
            kotlin.jvm.internal.m.e(buffer2, "buffer");
            lVar2.B = buffer2;
            lVar2.C = iBitCount2;
            lVar2.D = iU;
            h(i, kVarT, obj, i2 + 1);
            return;
        }
        s1.l lVar3 = lVarArr[i2];
        Object[] objArr = kVar.d;
        int length = objArr.length;
        lVar3.getClass();
        lVar3.B = objArr;
        lVar3.C = length;
        lVar3.D = 0;
        while (true) {
            s1.l lVar4 = lVarArr[i2];
            if (kotlin.jvm.internal.m.a(lVar4.B[lVar4.D], obj)) {
                ((s1.d) this).B = i2;
                return;
            } else {
                lVarArr[i2].D += 2;
            }
        }
    }

    public final Object next() {
        if (this.E.E != this.H) {
            throw new ConcurrentModificationException();
        }
        if (!((s1.d) this).C) {
            throw new NoSuchElementException();
        }
        s1.l lVar = ((s1.l[]) ((s1.d) this).D)[((s1.d) this).B];
        this.F = lVar.B[lVar.D];
        this.G = true;
        return super.next();
    }

    public final void remove() {
        if (!this.G) {
            throw new IllegalStateException();
        }
        boolean z = ((s1.d) this).C;
        d dVar = this.E;
        if (!z) {
            d0.b(dVar).remove(this.F);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            s1.l lVar = ((s1.l[]) ((s1.d) this).D)[((s1.d) this).B];
            Object obj = lVar.B[lVar.D];
            d0.b(dVar).remove(this.F);
            h(obj != null ? obj.hashCode() : 0, dVar.C, obj, 0);
        }
        this.F = null;
        this.G = false;
        this.H = dVar.E;
    }
}
