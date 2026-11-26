package bs;

import a40.z;
import android.graphics.Bitmap;
import as.b0;
import b2.r;
import b6.m;
import bt.a1;
import java.util.List;
import kotlin.jvm.internal.w;
import l1.g0;
import l1.q;
import oo.o0;
import oo.z0;
import ta.c0;
import u00.k;
import u00.n;
import x.y0;

public final class g implements n {
    public final int A;
    public final float B;
    public final Object C;
    public final Object D;
    public final Object E;

    public g(z zVar, float f, y0 y0Var, q9.c cVar) {
        this.A = 5;
        this.D = zVar;
        this.B = f;
        this.C = y0Var;
        this.E = cVar;
    }

    public g(a1 a1Var, gm.a aVar, float f, k kVar, int i) {
        this.A = 1;
        this.D = a1Var;
        this.E = aVar;
        this.B = f;
        this.C = kVar;
    }

    public g(dw.a aVar, float f, u00.a aVar2, r rVar, int i) {
        this.A = 6;
        this.D = aVar;
        this.B = f;
        this.C = aVar2;
        this.E = rVar;
    }

    public g(Object obj, Object obj2, float f, Object obj3, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.C = obj2;
        this.B = f;
        this.E = obj3;
    }

    public g(List list, qn.a aVar, float f, w wVar) {
        this.A = 4;
        this.D = list;
        this.C = aVar;
        this.B = f;
        this.E = wVar;
    }

    public g(z0 z0Var, k kVar, kk.c cVar, float f, int i) {
        this.A = 3;
        this.D = z0Var;
        this.C = kVar;
        this.E = cVar;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.j((qr.r) this.D, (k) this.C, this.B, (r) this.E, (l1.j) obj, q.K(3073));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bt.a.f((a1) this.D, (gm.a) this.E, this.B, (k) this.C, (l1.j) obj, q.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                kh.n.q((Bitmap) this.D, (String) this.C, this.B, (m) this.E, (l1.j) obj, q.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                o0.t((z0) this.D, (k) this.C, (kk.c) this.E, this.B, (l1.j) obj, q.K(1));
                break;
            case 4:
                List list = (List) this.D;
                qn.a aVar = (qn.a) this.C;
                w wVar = (w) this.E;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b6.k kVar = b6.k.a;
                    w00.a.b(ze.d.u(kVar), 0, 0, v1.d.d(-1827258666, new b0(list, aVar, this.B, wVar, 1), g0Var), g0Var, 3072, 6);
                    c0.d(ze.d.v(kVar), 0, pn.a.b, g0Var, 3072, 6);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 5:
                z zVar = (z) this.D;
                y0 y0Var = (y0) this.C;
                q9.c cVar = (q9.c) this.E;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                a40.c0.y(zVar, null, null, new r9.h(fFloatValue, this.B, y0Var, cVar, (k00.c) null), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.x((dw.a) this.D, this.B, (u00.a) this.C, (r) this.E, (l1.j) obj, q.K(9));
                break;
        }
        return g00.b0.a;
    }
}
