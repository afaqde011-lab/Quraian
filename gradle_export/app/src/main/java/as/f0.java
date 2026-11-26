package as;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import h0.n1;
import z.l1;

public final class f0 implements u00.k {
    public final int A;
    public final y3.c B;
    public final l1.z0 C;

    public f0(y3.c cVar, l1.z0 z0Var, int i) {
        this.A = i;
        this.B = cVar;
        this.C = z0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        l1.z0 z0Var = this.C;
        y3.c cVar = this.B;
        switch (i) {
            case 0:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 1:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 2:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 3:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 4:
                z0Var.setValue(h0.c.g(0.0f, ((n1) z0Var.getValue()).c(), 0.0f, cVar.h0((int) (4294967295L & ((y3.l) obj).a)), 5));
                return b0Var;
            case 5:
                z0Var.setValue(h0.c.g(0.0f, ((n1) z0Var.getValue()).c(), 0.0f, cVar.h0((int) (4294967295L & ((y3.l) obj).a)), 5));
                return b0Var;
            case 6:
                z0Var.setValue(h0.c.g(0.0f, cVar.h0((int) (4294967295L & ((y3.l) obj).a)), 0.0f, ((n1) z0Var.getValue()).a(), 5));
                return b0Var;
            case 7:
                z0Var.setValue(h0.c.g(0.0f, ((n1) z0Var.getValue()).c(), 0.0f, cVar.h0((int) (4294967295L & ((y3.l) obj).a)), 5));
                return b0Var;
            case 8:
                ca.q qVar = new ca.q(2, (u00.a) obj);
                f0 f0Var = new f0(cVar, z0Var, 9);
                j3.z zVar = z.a1.a;
                return new z.w0(qVar, f0Var, l1.a);
            case 9:
                y3.h hVar = (y3.h) obj;
                z0Var.setValue(new y3.l((((long) cVar.R0(y3.h.a(hVar.a))) & 4294967295L) | (((long) cVar.R0(y3.h.b(hVar.a))) << 32)));
                return b0Var;
            case 10:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 11:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 12:
                z2.a0 coordinates = (z2.a0) obj;
                kotlin.jvm.internal.m.e(coordinates, "coordinates");
                float fH0 = (cVar.h0((int) (coordinates.p() >> 32)) - 40) / 6;
                if (y3.f.a(fH0, 95) > 0) {
                    fH0 = 72;
                }
                z0Var.setValue(new y3.f(fH0));
                return b0Var;
            case 13:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 14:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 15:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a >> 32))));
                return b0Var;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 17:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 18:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            case 19:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
            default:
                z0Var.setValue(new y3.f(cVar.h0((int) (((y3.l) obj).a & 4294967295L))));
                return b0Var;
        }
    }
}
