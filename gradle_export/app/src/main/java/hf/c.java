package hf;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import c40.w;
import ca.u;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.n;
import e7.i0;
import i2.f0;
import i2.s;
import java.util.ArrayList;
import k.k0;
import k9.e1;
import k9.m1;
import k9.z1;
import kotlin.jvm.internal.m;
import l0.o;
import l1.e2;
import l1.n1;
import l1.u0;
import l1.x0;
import l9.p;
import r30.r;
import u.j0;

public final class c implements q, o.j, z1, l7.j, yb.a, mi.a {
    public final int A;
    public Object B;

    public c(int i10) {
        this.A = i10;
        switch (i10) {
            case 3:
                this.B = l1.q.z(Boolean.FALSE);
                break;
            case 15:
                this.B = new m1.e(0, new o[16]);
                break;
            default:
                this.B = new i2.a();
                break;
        }
    }

    public c(int i10, boolean z10) {
        this.A = i10;
    }

    public c(WorkDatabase workDatabase) {
        this.A = 4;
        m.e(workDatabase, "workDatabase");
        this.B = workDatabase;
    }

    public c(n nVar, re.a aVar, int i10) {
        this.A = i10;
        this.B = aVar;
    }

    public c(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public static java.util.ArrayList E(hf.c r22, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: hf.c.E(hf.c, java.lang.String):java.util.ArrayList");
    }

    @Override
    public void A(Bundle bundle) {
        ((fi.c) ((fi.b) this.B)).a("clx", "_ae", bundle);
    }

    @Override
    public long B(long j9, long j10) {
        return 1L;
    }

    public me.i C(n20.b bVar, k20.f fVar) {
        o10.c cVarU;
        m.e(bVar, "classId");
        m.e(fVar, "metadataVersion");
        String strU0 = r.u0(bVar.b.a.a, '.', '$');
        n20.c cVar = bVar.a;
        if (!cVar.a.c()) {
            strU0 = cVar + '.' + strU0;
        }
        Class clsF = f50.k.F((ClassLoader) this.B, strU0);
        if (clsF == null || (cVarU = k00.f.u(clsF)) == null) {
            return null;
        }
        return new me.i(cVarU, 28);
    }

    public void D(float f3, float f10, float f11, float f12) {
        a1.i iVar = (a1.i) this.B;
        s sVarN = iVar.n();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (iVar.q() >> 32)) - (f11 + f3);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (iVar.q() & 4294967295L)) - (f12 + f10))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            f0.a("Width and height must be greater than or equal to zero");
        }
        iVar.C(jFloatToRawIntBits);
        sVarN.p(f3, f10);
    }

    public void F(float f3, long j9) {
        s sVarN = ((a1.i) this.B).n();
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        sVarN.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        sVarN.d(f3);
        sVarN.p(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public Object G(c40.l lVar, u00.a aVar) {
        e2 e2Var;
        w wVar;
        if (((f5.c) this.B) == null) {
            n1.b("Called runAndWatch on a manager that has been disposed of");
        }
        f5.c cVar = (f5.c) this.B;
        if ((cVar instanceof e2) && (wVar = (e2Var = (e2) cVar).G) != null && !wVar.equals(lVar)) {
            x0 x0Var = new x0();
            w wVar2 = e2Var.G;
            if (wVar2 == null) {
                n1.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            j0 j0Var = e2Var.E;
            ArrayList arrayList = x0Var.D;
            if (j0Var != null) {
                Object[] objArr = j0Var.f14865b;
                long[] jArr = j0Var.f14864a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j9 = jArr[i10];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j9 & 255) < 128) {
                                    arrayList.add(new u0(objArr[(i10 << 3) + i13], wVar2));
                                }
                                j9 >>= i11;
                                i13++;
                                i11 = i11;
                            }
                            if (i12 != i11) {
                                break;
                            }
                            if (i10 != length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } else {
                Object obj = e2Var.C;
                m.b(obj);
                arrayList.add(new u0(obj, wVar2));
            }
            x0Var.C0();
            e2Var.G0();
            this.B = x0Var;
        }
        f5.c cVar2 = (f5.c) this.B;
        m.b(cVar2);
        z1.f fVarU = z1.l.j().u(cVar2.P0(lVar));
        cVar2.B0(lVar);
        try {
            z1.f fVarJ = fVarU.j();
            try {
                Object objInvoke = aVar.invoke();
                z1.f.q(fVarJ);
                fVarU.c();
                cVar2.C0();
                return objInvoke;
            } catch (Throwable th2) {
                z1.f.q(fVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            fVarU.c();
            throw th3;
        }
    }

    public void H(float f3, float f10, long j9) {
        s sVarN = ((a1.i) this.B).n();
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        sVarN.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        sVarN.c(f3, f10);
        sVarN.p(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public void I(float f3, float f10) {
        ((a1.i) this.B).n().p(f3, f10);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                a aVar = new a(2, (xf.g) obj2);
                l lVar = (l) ((e) obj).getService();
                ke.g gVar = (ke.g) this.B;
                Parcel parcelD = lVar.d();
                int i10 = h.f7055a;
                parcelD.writeStrongBinder(aVar);
                h.c(parcelD, gVar);
                lVar.f(3, parcelD);
                break;
            case 7:
                jf.f fVar = new jf.f(2, (xf.g) obj2);
                jf.e eVar = (jf.e) ((jf.d) obj).getService();
                ne.b bVar = (ne.b) this.B;
                Parcel parcelD2 = eVar.d();
                int i11 = jf.c.f8279a;
                parcelD2.writeStrongBinder(fVar);
                jf.c.b(parcelD2, bVar);
                eVar.f(13, parcelD2);
                break;
            default:
                jf.f fVar2 = new jf.f(1, (xf.g) obj2);
                jf.e eVar2 = (jf.e) ((jf.d) obj).getService();
                ne.c cVar = (ne.c) this.B;
                Parcel parcelD3 = eVar2.d();
                int i12 = jf.c.f8279a;
                parcelD3.writeStrongBinder(fVar2);
                jf.c.b(parcelD3, cVar);
                eVar2.f(12, parcelD3);
                break;
        }
    }

    @Override
    public long c(long j9) {
        return 0L;
    }

    @Override
    public long e(long j9, long j10) {
        return j10;
    }

    @Override
    public long h(long j9, long j10) {
        return 0L;
    }

    @Override
    public long k(long j9, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m7.j l(long j9) {
        return (m7.j) this.B;
    }

    @Override
    public boolean n(o.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override
    public long o(long j9, long j10) {
        return 0L;
    }

    @Override
    public void p(int i10, int i11, String str, e1 e1Var) {
        Bundle bundle;
        m1 m1Var = (m1) this.B;
        if (e1Var == null || (bundle = e1Var.f9276a) == null) {
            if (str == null) {
                throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
            }
            p pVar = m1Var.A;
            pVar.getClass();
            pVar.b(str, null);
            ((m1) pVar.f10174d).G.post(new u(pVar, str, null, false, 1));
            return;
        }
        String str2 = i0.f5136a;
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        p pVar2 = m1Var.A;
        pVar2.getClass();
        pVar2.b(str, bundle);
        ((m1) pVar2.f10174d).G.post(new u(pVar2, str, bundle, false, 1));
    }

    @Override
    public void q(Drawable drawable) {
        mb.j jVar = (mb.j) this.B;
        jVar.l(new mb.f(drawable != null ? jVar.k(drawable) : null));
    }

    @Override
    public void t(int i10, int i11, String str, e1 e1Var) {
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void w(o.l lVar) {
        k0 k0Var = (k0) this.B;
        Window.Callback callback = k0Var.f8415b;
        if (k0Var.f8414a.f12208a.o()) {
            callback.onPanelClosed(108, lVar);
        } else if (callback.onPreparePanel(0, null, lVar)) {
            callback.onMenuOpened(108, lVar);
        }
    }

    @Override
    public long x() {
        return 0L;
    }

    public void y(float f3, float f10, float f11, float f12, int i10) {
        ((a1.i) this.B).n().o(f3, f10, f11, f12, i10);
    }

    @Override
    public long z(long j9) {
        return 1L;
    }
}
