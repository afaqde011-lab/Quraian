package oj;

import android.util.Log;
import androidx.media3.common.l2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import fh.t0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import r3.e0;
import s7.y0;
import sd.p1;
import sd.y1;
import yh.q1;

public final class l implements ud.e, ii.e, e0, xf.f, eh.k, e7.h, xf.d, o8.g, ta.s, x.v, a8.t, th.b {
    public final int A;

    public l(int i10) {
        this.A = i10;
    }

    @Override
    public mh.b a(th.o oVar) throws GeneralSecurityException {
        if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            yh.b bVarC = yh.b.C((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
            if (bVarC.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            p1 p1Var = new p1(12, false);
            p1Var.B = null;
            p1Var.C = null;
            p1Var.D = uh.c.f15261f;
            p1Var.H(bVarC.y().size());
            int iX = bVarC.z().x();
            if (iX < 10 || 16 < iX) {
                throw new GeneralSecurityException(g4.c.f(iX, "Invalid tag size for AesCmacParameters: "));
            }
            p1Var.C = Integer.valueOf(iX);
            p1Var.D = uh.e.a((q1) oVar.F);
            uh.d dVarG = p1Var.g();
            p1 p1Var2 = new p1(11, false);
            p1Var2.C = null;
            p1Var2.D = null;
            p1Var2.B = dVarG;
            p1Var2.C = new me.i(ai.a.a(bVarC.y().h()), 6);
            p1Var2.D = (Integer) oVar.G;
            return p1Var2.f();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    @Override
    public void accept(Object obj) {
        ((y0) obj).f13796b.release();
    }

    @Override
    public Object apply(Object obj) {
        switch (this.A) {
            case 0:
                pj.e eVar = (pj.e) obj;
                a1.i iVar = n.f12100a;
                iVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    iVar.m(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 5:
                a8.q qVar = (a8.q) obj;
                qVar.getClass();
                return qVar.getClass().getSimpleName();
            case 6:
                return t0.o(fh.w.A(new l(8), ((s7.y) obj).s().f13711b));
            case 8:
                return Integer.valueOf(((l2) obj).f1340c);
            case 23:
                return Long.valueOf(((x8.a) obj).f16477b);
            case 24:
                return Long.valueOf(((x8.a) obj).f16478c);
            default:
                return (u8.q) obj;
        }
    }

    @Override
    public float b(float f3) {
        ArrayList arrayList = to.m.b;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((Number) ((g00.k) it.next()).A).floatValue() >= f3) {
                break;
            }
            i10++;
        }
        if (i10 <= 0) {
            return ((Number) ((g00.k) h00.q.L0(arrayList)).B).floatValue();
        }
        g00.k kVar = (g00.k) arrayList.get(i10 - 1);
        float fFloatValue = ((Number) kVar.A).floatValue();
        float fFloatValue2 = ((Number) kVar.B).floatValue();
        g00.k kVar2 = (g00.k) arrayList.get(i10);
        return (((f3 - fFloatValue) * (((Number) kVar2.B).floatValue() - fFloatValue2)) / (((Number) kVar2.A).floatValue() - fFloatValue)) + fFloatValue2;
    }

    @Override
    public void c(ta.r rVar, ta.t tVar, boolean z10) {
        switch (this.A) {
            case 17:
                rVar.f(tVar);
                break;
            case TYPE_SINT64_VALUE:
                rVar.d(tVar);
                break;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                rVar.b(tVar);
                break;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                rVar.a();
                break;
            default:
                rVar.e();
                break;
        }
    }

    @Override
    public r3.c0 d(m3.h hVar) {
        return new r3.c0(hVar, r3.o.f13083a);
    }

    @Override
    public a8.q[] e() {
        return new a8.q[]{new u8.l(x8.i.f16490z, 16)};
    }

    @Override
    public boolean g(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override
    public Task k(Object obj) {
        switch (this.A) {
            case 3:
                break;
            default:
                break;
        }
        return Tasks.d(null);
    }

    @Override
    public Object m(y1 y1Var) {
        Set setF = y1Var.f(ii.p.a(qj.a.class));
        qj.c cVar = qj.c.C;
        if (cVar == null) {
            synchronized (qj.c.class) {
                try {
                    cVar = qj.c.C;
                    if (cVar == null) {
                        cVar = new qj.c(0, (byte) 0);
                        qj.c.C = cVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new qj.b(setF, cVar);
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("ApiConfig", "fetchAndActivate failed: " + exc.getMessage(), exc);
    }
}
