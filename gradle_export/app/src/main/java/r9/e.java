package r9;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import ca.v;
import com.google.android.gms.internal.measurement.y3;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import h00.q;
import i2.c0;
import j3.y;
import java.util.ArrayList;
import k0.u;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import u00.k;
import w.c2;
import w.j0;
import w.s0;

public final class e implements k {
    public final int A;

    public e(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj) throws Exception {
        switch (this.A) {
            case 0:
                q9.c cVar = (q9.c) obj;
                return new g00.k(a0.a.b(cVar.getClass()), cVar.getKey());
            case 1:
                return new j0(s0.c(x.c.w(700, 0, null, 6), 2), s0.d(x.c.w(700, 0, null, 6), 2), (c2) null, 12);
            case 2:
                return new j0(s0.c(x.c.w(700, 0, null, 6), 2), s0.d(x.c.w(700, 0, null, 6), 2), (c2) null, 12);
            case 3:
                return Long.valueOf(obj instanceof pm.a ? ((pm.a) obj).getDebounce() : 0L);
            case 4:
                dw.a aVar = (dw.a) obj;
                m.e(aVar, "it");
                return q.D0(aVar.i);
            case 5:
                m.e((String) obj, "it");
                return b0.a;
            case 6:
                m.e((u) obj, "$this$item");
                return new k0.d(qd.s0.H(u.f8539b));
            case 7:
                m.e((u) obj, "$this$item");
                return new k0.d(qd.s0.H(u.f8539b));
            case 8:
                bx.c cVar2 = (bx.c) obj;
                m.e(cVar2, "it");
                return Integer.valueOf(cVar2.a);
            case 9:
                m.e((j3.a0) obj, "$this$clearAndSetSemantics");
                return b0.a;
            case 10:
                jk.f fVar = (jk.f) obj;
                m.e(fVar, "$this$drawBackdrop");
                lk.a.a(fVar);
                v.p(fVar, fVar.A * 2.0f);
                float f3 = fVar.A;
                y3.N(fVar, f3 * 24.0f, f3 * 24.0f, (12 & 4) == 0, (12 & 8) == 0);
                return b0.a;
            case 11:
                jk.f fVar2 = (jk.f) obj;
                m.e(fVar2, "$this$drawBackdrop");
                float fD = h2.e.d(fVar2.C);
                lk.a.a(fVar2);
                v.p(fVar2, fVar2.A * 2.0f);
                float f10 = fD * 0.6297106f;
                y3.N(fVar2, 0.5f * f10, f10, (12 & 4) == 0, (12 & 8) == 0);
                return b0.a;
            case 12:
                j3.a0 a0Var = (j3.a0) obj;
                m.e(a0Var, "$this$semantics");
                y.k(a0Var, 2);
                return b0.a;
            case 13:
                dw.a aVar2 = (dw.a) obj;
                m.e(aVar2, "it");
                return q.D0(aVar2.i);
            case 14:
                y50.a aVar3 = (y50.a) obj;
                m.e(aVar3, "$this$module");
                qs.c cVar3 = new qs.c(27);
                v50.c cVar4 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var = a0.a;
                a10.d dVarB = b0Var.b(qw.a.class);
                b60.b bVar = c60.a.e;
                aVar3.a(new w50.e(new v50.a(bVar, dVarB, (b60.a) null, cVar3, cVar4)));
                aVar3.a(new w50.e(new v50.a(bVar, b0Var.b(pw.a.class), (b60.a) null, new qs.c(28), cVar4)));
                qs.c cVar5 = new qs.c(29);
                v50.c cVar6 = v50.c.B;
                aVar3.a(new w50.a(new v50.a(bVar, b0Var.b(nw.b.class), (b60.a) null, cVar5, cVar6)));
                aVar3.a(new w50.a(new v50.a(bVar, b0Var.b(jw.b.class), (b60.a) null, new sw.a(0), cVar6)));
                aVar3.a(new w50.a(new v50.a(bVar, b0Var.b(jw.a.class), (b60.a) null, new sw.a(1), cVar6)));
                aVar3.a(new w50.a(new v50.a(bVar, b0Var.b(lw.b.class), (b60.a) null, new sw.a(2), cVar6)));
                aVar3.a(new w50.e(new v50.a(bVar, b0Var.b(mw.a.class), (b60.a) null, new sw.a(3), cVar4)));
                aVar3.a(new w50.e(new v50.a(bVar, b0Var.b(rw.a.class), (b60.a) null, new sw.a(4), cVar4)));
                return b0.a;
            case 15:
                m.e((w.v) obj, "$this$AnimatedContent");
                j0 j0VarD = w.m.d(s0.e(x.c.v(0.68f, 0.0f, null, 6), 0.28f, 4).a(s0.c(null, 3)), s0.f(null, 0.28f, 5).a(s0.d(null, 3)));
                j0VarD.f15779d = w.m.c(2);
                return j0VarD;
            case 16:
                ry.b bVar2 = (ry.b) obj;
                m.e(bVar2, "it");
                return bVar2.a;
            case 17:
                a10.d dVar = (a10.d) obj;
                m.e(dVar, "it");
                return g60.a.a(dVar);
            case TYPE_SINT64_VALUE:
                bo.c cVar7 = (bo.c) obj;
                m.e(cVar7, "it");
                return Boolean.valueOf(cVar7.d);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                bo.c cVar8 = (bo.c) obj;
                m.e(cVar8, "it");
                return Long.valueOf(cVar8.e);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ma.a aVar4 = (ma.a) obj;
                m.e(aVar4, "_connection");
                ma.c cVarK0 = aVar4.k0("SELECT * FROM favorites_data ORDER BY added_at ASC");
                try {
                    int I = w50.c.I(cVarK0, "id");
                    int I2 = w50.c.I(cVarK0, "surah_owner_id");
                    int I3 = w50.c.I(cVarK0, "is_from_catalog");
                    int I4 = w50.c.I(cVarK0, "collection_id");
                    int I5 = w50.c.I(cVarK0, "added_at");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        arrayList.add(new sq.a(cVarK0.getLong(I), (int) cVarK0.getLong(I2), ((int) cVarK0.getLong(I3)) != 0, cVarK0.isNull(I4) ? null : Integer.valueOf((int) cVarK0.getLong(I4)), cVarK0.getLong(I5)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarK0.close();
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                c0 c0Var = (c0) obj;
                m.e(c0Var, "$this$graphicsLayer");
                c0Var.Q(1);
                return b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                y50.a aVar5 = (y50.a) obj;
                m.e(aVar5, "$this$module");
                aVar5.a(new w50.e(new v50.a(c60.a.e, a0.a.b(tx.a.class), (b60.a) null, new sw.a(13), v50.c.A)));
                return b0.a;
            case 23:
                return new w6.a();
            case 24:
                CorruptionException corruptionException = (CorruptionException) obj;
                m.e(corruptionException, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException);
                return zj.h.B;
            case 25:
                m.e((w.v) obj, "$this$AnimatedContent");
                j0 j0VarH0 = va.a.h0();
                j0VarH0.f15779d = new c2(false, new sw.a(15));
                return j0VarH0;
            case RuntimeVersion.MINOR:
                String str = (String) obj;
                m.e(str, "it");
                return Integer.valueOf(str.length());
            case 27:
                m.e((w.v) obj, "$this$AnimatedContent");
                return va.a.h0();
            case 28:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            default:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
        }
    }
}
