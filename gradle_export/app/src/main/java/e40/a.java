package e40;

import g00.b0;
import java.util.Arrays;

public abstract class a {
    public c[] A;
    public int B;
    public int C;
    public u D;

    public final c c() {
        c cVarD;
        u uVar;
        synchronized (this) {
            try {
                c[] cVarArrE = this.A;
                if (cVarArrE == null) {
                    cVarArrE = e();
                    this.A = cVarArrE;
                } else if (this.B >= cVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrE, cVarArrE.length * 2);
                    kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    this.A = (c[]) objArrCopyOf;
                    cVarArrE = (c[]) objArrCopyOf;
                }
                int i = this.C;
                do {
                    cVarD = cVarArrE[i];
                    if (cVarD == null) {
                        cVarD = d();
                        cVarArrE[i] = cVarD;
                    }
                    i++;
                    if (i >= cVarArrE.length) {
                        i = 0;
                    }
                } while (!cVarD.a(this));
                this.C = i;
                this.B++;
                uVar = this.D;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (uVar != null) {
            uVar.v(1);
        }
        return cVarD;
    }

    public abstract c d();

    public abstract c[] e();

    public final void g(c cVar) {
        u uVar;
        int i;
        k00.c[] cVarArrB;
        synchronized (this) {
            try {
                int i2 = this.B - 1;
                this.B = i2;
                uVar = this.D;
                if (i2 == 0) {
                    this.C = 0;
                }
                kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (k00.c cVar2 : cVarArrB) {
            if (cVar2 != null) {
                cVar2.resumeWith(b0.a);
            }
        }
        if (uVar != null) {
            uVar.v(-1);
        }
    }

    public final u h() {
        u uVar;
        synchronized (this) {
            uVar = this.D;
            if (uVar == null) {
                int i = this.B;
                uVar = new u(1, Integer.MAX_VALUE, c40.a.B);
                uVar.f(Integer.valueOf(i));
                this.D = uVar;
            }
        }
        return uVar;
    }
}
