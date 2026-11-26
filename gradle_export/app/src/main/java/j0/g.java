package j0;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import g00.b0;
import h0.z1;
import l1.g0;
import q3.h0;
import sd.p1;

public final class g implements u00.p {
    public final int A;
    public final Object B;

    public g(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.A;
        Object obj5 = this.B;
        switch (i10) {
            case 0:
                u00.o oVar = (u00.o) obj5;
                b bVar = (b) obj;
                ((Integer) obj2).intValue();
                l1.j jVar = (l1.j) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((g0) jVar).g(bVar) ? 4 : 2;
                }
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 131) != 130)) {
                    oVar.invoke(bVar, jVar, Integer.valueOf(iIntValue & 14));
                } else {
                    g0Var.V();
                }
                return b0.a;
            case 1:
                v1.c cVar = (v1.c) obj5;
                k0.k kVar = (k0.k) obj;
                ((Integer) obj2).getClass();
                l1.j jVar2 = (l1.j) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((g0) jVar2).g(kVar) ? 4 : 2;
                }
                g0 g0Var2 = (g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    cVar.invoke(kVar, jVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 2:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                kotlin.jvm.internal.m.b(sQLiteQuery);
                oa.h hVar = new oa.h(sQLiteQuery);
                pa.e eVar = (pa.e) ((o9.q) obj5).B;
                int length = eVar.D.length;
                for (int i11 = 1; i11 < length; i11++) {
                    int i12 = eVar.D[i11];
                    if (i12 == 1) {
                        hVar.d(i11, eVar.E[i11]);
                    } else if (i12 == 2) {
                        hVar.U(eVar.F[i11], i11);
                    } else if (i12 == 3) {
                        String str2 = eVar.G[i11];
                        kotlin.jvm.internal.m.b(str2);
                        hVar.p(i11, str2);
                    } else if (i12 == 4) {
                        byte[] bArr = eVar.H[i11];
                        kotlin.jvm.internal.m.b(bArr);
                        hVar.e(i11, bArr);
                    } else if (i12 == 5) {
                        hVar.f(i11);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 3:
                u3.c cVar2 = (u3.c) obj5;
                h0 h0VarB = ((q3.j) cVar2.E).b((q3.i) obj, (q3.u) obj2, ((q3.o) obj3).f12746a, ((q3.p) obj4).f12747a);
                if (h0VarB instanceof q3.g0) {
                    Object obj6 = ((q3.g0) h0VarB).A;
                    kotlin.jvm.internal.m.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj6;
                }
                p1 p1Var = new p1(h0VarB, cVar2.J);
                cVar2.J = p1Var;
                Object obj7 = p1Var.D;
                kotlin.jvm.internal.m.c(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj7;
            default:
                to.a aVar = (to.a) obj5;
                ((Integer) obj2).getClass();
                l1.j jVar3 = (l1.j) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.e((b) obj, "$this$items");
                g0 g0Var3 = (g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    h0.o.a(rd.a.g0(24, 6, 0L, z1.n(b2.o.A, aVar.a, aVar.c), false), jVar3, 0);
                } else {
                    g0Var3.V();
                }
                return b0.a;
        }
    }
}
