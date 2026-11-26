package z1;

import java.util.Arrays;
import java.util.HashMap;
import u.j0;

public final class c extends b {

    public final b f17011o;

    public boolean f17012p;

    public c(long j9, j jVar, u00.k kVar, u00.k kVar2, b bVar) {
        super(j9, jVar, kVar, kVar2);
        this.f17011o = bVar;
        bVar.k();
    }

    @Override
    public final void c() {
        if (this.f17021c) {
            return;
        }
        super.c();
        if (this.f17012p) {
            return;
        }
        this.f17012p = true;
        this.f17011o.l();
    }

    @Override
    public final q w() {
        c cVar;
        b bVar = this.f17011o;
        if (bVar.m || bVar.f17021c) {
            return new g(this);
        }
        j0 j0Var = this.f17005h;
        long j9 = this.f17020b;
        HashMap mapB = j0Var != null ? l.b(bVar.g(), this, this.f17011o.d()) : null;
        Object obj = l.f17038c;
        synchronized (obj) {
            try {
                l.c(this);
                if (j0Var == null || j0Var.f14867d == 0) {
                    cVar = this;
                    cVar.a();
                } else {
                    cVar = this;
                    q qVarZ = cVar.z(this.f17011o.g(), j0Var, mapB, this.f17011o.d());
                    if (!qVarZ.equals(h.f17035d)) {
                        return qVarZ;
                    }
                    j0 j0VarX = cVar.f17011o.x();
                    if (j0VarX != null) {
                        j0VarX.k(j0Var);
                    } else {
                        cVar.f17011o.B(j0Var);
                        cVar.f17005h = null;
                    }
                }
                if (kotlin.jvm.internal.m.g(cVar.f17011o.g(), j9) < 0) {
                    cVar.f17011o.v();
                }
                b bVar2 = cVar.f17011o;
                bVar2.r(bVar2.d().c(j9).a(cVar.f17007j));
                cVar.f17011o.A(j9);
                b bVar3 = cVar.f17011o;
                int i10 = cVar.f17022d;
                cVar.f17022d = -1;
                if (i10 >= 0) {
                    int[] iArr = bVar3.f17008k;
                    kotlin.jvm.internal.m.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    bVar3.f17008k = iArrCopyOf;
                } else {
                    bVar3.getClass();
                }
                b bVar4 = cVar.f17011o;
                j jVar = cVar.f17007j;
                bVar4.getClass();
                synchronized (obj) {
                    bVar4.f17007j = bVar4.f17007j.h(jVar);
                    b bVar5 = cVar.f17011o;
                    int[] iArr2 = cVar.f17008k;
                    bVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = bVar5.f17008k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            kotlin.jvm.internal.m.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        bVar5.f17008k = iArr2;
                    }
                }
                cVar.m = true;
                if (!cVar.f17012p) {
                    cVar.f17012p = true;
                    cVar.f17011o.l();
                }
                return h.f17035d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
