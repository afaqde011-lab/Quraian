package c3;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

public final class n3 implements androidx.lifecycle.u {
    public final f40.c A;
    public final w0 B;
    public final l1.x1 C;
    public final kotlin.jvm.internal.z D;

    public n3(f40.c cVar, w0 w0Var, l1.x1 x1Var, kotlin.jvm.internal.z zVar) {
        this.A = cVar;
        this.B = w0Var;
        this.C = x1Var;
        this.D = zVar;
    }

    @Override
    public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) throws NoWhenBranchMatchedException {
        boolean z10;
        a40.j jVarC = null;
        switch (m3.f2694a[oVar.ordinal()]) {
            case 1:
                a40.c0.y(this.A, (k00.i) null, a40.a0.D, new a1.g(this.D, this.C, wVar, this, null, 11), 1);
                return;
            case 2:
                w0 w0Var = this.B;
                if (w0Var != null) {
                    c7.c cVar = (c7.c) w0Var.C;
                    synchronized (cVar.B) {
                        try {
                            synchronized (cVar.B) {
                                z10 = cVar.A;
                            }
                            if (!z10) {
                                ArrayList arrayList = (ArrayList) cVar.C;
                                cVar.C = (ArrayList) cVar.D;
                                cVar.D = arrayList;
                                cVar.A = true;
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((k00.c) arrayList.get(i10)).resumeWith(g00.b0.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                l1.x1 x1Var = this.C;
                synchronized (x1Var.f9952d) {
                    if (x1Var.f9968v) {
                        x1Var.f9968v = false;
                        jVarC = x1Var.C();
                    }
                    break;
                }
                if (jVarC != null) {
                    ((a40.k) jVarC).resumeWith(g00.b0.a);
                    return;
                }
                return;
            case 3:
                l1.x1 x1Var2 = this.C;
                synchronized (x1Var2.f9952d) {
                    x1Var2.f9968v = true;
                }
                return;
            case 4:
                this.C.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
