package ab;

import androidx.work.impl.WorkerStoppedException;
import as.r0;
import b3.o0;
import g1.m6;
import g1.n6;
import q0.w0;

public final class d0 implements u00.k {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;

    public d0(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = z10;
        this.D = obj2;
        this.E = obj3;
    }

    public d0(boolean z10, u00.a aVar, u00.a aVar2, u00.k kVar) {
        this.A = 2;
        this.B = z10;
        this.C = aVar;
        this.D = aVar2;
        this.E = kVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                za.u uVar = (za.u) this.C;
                String str = (String) this.D;
                l0 l0Var = (l0) this.E;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof WorkerStoppedException) {
                    uVar.f17399d.compareAndSet(-256, ((WorkerStoppedException) th2).A);
                }
                if (this.B && str != null) {
                    za.i iVar = l0Var.f390e.m;
                    int iHashCode = l0Var.f386a.hashCode();
                    iVar.getClass();
                    kh.o.u(iHashCode, str);
                }
                return g00.b0.a;
            case 1:
                u00.a aVar = (u00.a) this.C;
                i2.d dVar = (i2.d) this.D;
                i2.m mVar = (i2.m) this.E;
                o0 o0Var = (o0) obj;
                o0Var.a();
                k2.b bVar = o0Var.A;
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    if (this.B) {
                        long jY0 = bVar.Y0();
                        a1.i iVar2 = bVar.B;
                        long jQ = iVar2.q();
                        iVar2.n().i();
                        try {
                            ((hf.c) iVar2.B).H(-1.0f, 1.0f, jY0);
                            k2.d.m(o0Var, dVar, 0L, 0.0f, mVar, 46);
                        } finally {
                            w.c.t(iVar2, jQ);
                        }
                    } else {
                        k2.d.m(o0Var, dVar, 0L, 0.0f, mVar, 46);
                    }
                }
                return g00.b0.a;
            case 2:
                u00.a aVar2 = (u00.a) this.C;
                u00.a aVar3 = (u00.a) this.D;
                u00.k kVar = (u00.k) this.E;
                return new m6(this.B, aVar2, aVar3, (n6) obj, kVar);
            default:
                h00.b bVar2 = (u30.b) this.C;
                u00.a aVar4 = (u00.a) this.D;
                gm.a aVar5 = (gm.a) this.E;
                k0.i iVar3 = (k0.i) obj;
                kotlin.jvm.internal.m.e(iVar3, "$this$LazyVerticalGrid");
                iVar3.q(bVar2.a(), new w0(new xn.a(22), bVar2, 13), new r0(28, bVar2), new v1.c(new ev.r(bVar2, this.B, aVar4, aVar5, 2), -1117249557, true));
                return g00.b0.a;
        }
    }
}
