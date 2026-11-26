package du;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.media3.common.d1;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.android.gms.internal.measurement.f4;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import fh.a1;
import fh.a2;
import fh.c1;
import fh.d2;
import fh.e1;
import fh.j2;
import fh.x1;
import fh.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import sd.p1;

public final class w implements qd.j, qd.u, ee.f, a8.t, h0.g, s.a, eh.k, e7.m, ij.a, j2.i {
    public final int A;

    public void a(qd.k kVar) {
        int i = MainActivity.R;
    }

    public Object apply(Object obj) {
        StringBuilder sb;
        char cCharAt;
        a2 arrayList = null;
        boolean z = true;
        switch (this.A) {
            case 7:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        p1 p1VarA = xd.i.a();
                        p1VarA.G(cursorRawQuery.getString(1));
                        p1VarA.D = he.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        p1VarA.C = string == null ? null : Base64.decode(string, 0);
                        arrayList2.add(p1VarA.i());
                        break;
                    }
                    return arrayList2;
                } finally {
                    cursorRawQuery.close();
                }
            case 17:
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(h00.r.q0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((hb.o) it.next()).a());
                    }
                }
                return arrayList;
            case 18:
                return new j7.f((e7.b0) obj);
            case 21:
                String str = (String) obj;
                eh.b bVar = ih.a.g;
                bVar.getClass();
                for (int length = str.length() - 1; length >= 0; length--) {
                    if (!bVar.c(str.charAt(length))) {
                        z = false;
                        if (!z && !str.isEmpty()) {
                            return str;
                        }
                        sb = new StringBuilder(str.length() + 16);
                        sb.append('\"');
                        for (int i = 0; i < str.length(); i++) {
                            cCharAt = str.charAt(i);
                            if (cCharAt != '\r' || cCharAt == '\\' || cCharAt == '\"') {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                        }
                        sb.append('\"');
                        return sb.toString();
                    }
                }
                if (!z) {
                }
                sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                while (i < str.length()) {
                    cCharAt = str.charAt(i);
                    if (cCharAt != '\r') {
                        sb.append('\\');
                    } else {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            default:
                c1 c1Var = (Collection) obj;
                int i2 = c1.D;
                if (c1Var instanceof c1) {
                    return c1Var;
                }
                boolean z2 = c1Var instanceof x1;
                int size = z2 ? ((x1) c1Var).l().size() : 11;
                a1 a1Var = new a1();
                a1Var.b = false;
                a2 a2Var = new a2();
                a2Var.d(size);
                a1Var.a = a2Var;
                if (z2) {
                    j2 j2Var = (x1) c1Var;
                    arrayList = j2Var instanceof j2 ? j2Var.E : null;
                    if (arrayList != null) {
                        a2Var.a(Math.max(a2Var.c, arrayList.c));
                        i = arrayList.c == 0 ? -1 : 0;
                        while (i >= 0) {
                            ta.c0.u(i, arrayList.c);
                            Object obj2 = arrayList.a[i];
                            ta.c0.u(i, arrayList.c);
                            a1Var.c(arrayList.b[i], obj2);
                            i++;
                            if (i >= arrayList.c) {
                                i = -1;
                            }
                        }
                    } else {
                        c1 c1Var2 = (c1) j2Var;
                        e1 e1VarM = c1Var2.m();
                        a2 a2Var2 = a1Var.a;
                        a2Var2.a(Math.max(a2Var2.c, e1VarM.size()));
                        for (z1 z1Var : c1Var2.m()) {
                            a1Var.c(z1Var.a(), z1Var.a);
                        }
                    }
                } else {
                    Iterator it2 = c1Var.iterator();
                    while (it2.hasNext()) {
                        a1Var.a(it2.next());
                    }
                }
                Objects.requireNonNull(a1Var.a);
                if (a1Var.a.c == 0) {
                    return j2.H;
                }
                a1Var.b = true;
                return new j2(a1Var.a);
        }
    }

    public double b(double d) {
        switch (this.A) {
            case 24:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 25:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 26:
                float[] fArr = j2.d.a;
                return j2.d.b(j2.d.c, d);
            case 27:
                float[] fArr2 = j2.d.a;
                return j2.d.a(j2.d.c, d);
            case 28:
                float[] fArr3 = j2.d.a;
                return j2.d.d(j2.d.d, d);
            default:
                float[] fArr4 = j2.d.a;
                return j2.d.c(j2.d.d, d);
        }
    }

    public e1.u c(f4 f4Var) {
        e1.t tVarL;
        e1.t tVarL2;
        switch (this.A) {
            case 2:
                androidx.media3.common.k kVar = (androidx.media3.common.k) f4Var.D;
                return new e1.u(kVar.a(kVar.b), kVar.a(kVar.c), f4Var.i() == e1.i.A);
            case 3:
                androidx.media3.common.k kVar2 = (androidx.media3.common.k) f4Var.D;
                return ab.a0.X(new e1.u(kVar2.a(kVar2.b), kVar2.a(kVar2.c), f4Var.i() == e1.i.A), f4Var);
            case 4:
                return ab.a0.k(f4Var, e1.v.c);
            case 5:
                return ab.a0.k(f4Var, e1.v.b);
            default:
                e1.u uVar = (e1.u) f4Var.C;
                if (uVar == null) {
                    return ab.a0.k(f4Var, e1.v.c);
                }
                e1.t tVar = uVar.b;
                e1.t tVar2 = uVar.a;
                androidx.media3.common.k kVar3 = (androidx.media3.common.k) f4Var.D;
                if (f4Var.B) {
                    tVarL2 = ab.a0.l(f4Var, kVar3, tVar2);
                    tVarL = tVar;
                    tVar = tVar2;
                    tVar2 = tVarL2;
                } else {
                    tVarL = ab.a0.l(f4Var, kVar3, tVar);
                    tVarL2 = tVarL;
                }
                if (kotlin.jvm.internal.m.a(tVarL2, tVar)) {
                    return uVar;
                }
                return ab.a0.X(new e1.u(tVar2, tVarL, f4Var.i() == e1.i.A || (f4Var.i() == e1.i.C && tVar2.b > tVarL.b)), f4Var);
        }
    }

    public a8.q[] e() {
        switch (this.A) {
            case 8:
                return new a8.q[]{new f8.c()};
            case 9:
                return new a8.q[]{new g8.b()};
            case 10:
            case 11:
            default:
                return new a8.q[]{new i9.c()};
            case 12:
                return new a8.q[]{new h9.a()};
            case 13:
                return new a8.q[]{new h9.c()};
            case 14:
                return new a8.q[]{new h9.d()};
            case 15:
                return new a8.q[]{new h9.a0()};
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e7.e0 e0Var = new e7.e0(0L);
                fh.r0 r0Var = fh.t0.B;
                return new a8.q[]{new h9.e0(1, x8.i.z, e0Var, new h9.f(d2.E))};
        }
    }

    public void invoke(Object obj) {
        ((d1) obj).R(new ExoPlaybackException(2, 1003, new ExoTimeoutException("Player release timed out.")));
    }

    public void j(ij.b bVar) {
    }

    public int k(int i, y3.m mVar) {
        switch (this.A) {
            case 10:
                return Math.round((1 + (mVar != y3.m.A ? (-1.0f) * (-1) : -1.0f)) * (i / 2.0f));
            default:
                return Math.round((1 + 0.0f) * ((i + 0) / 2.0f));
        }
    }

    public void onPurchasesUpdated(qd.h hVar, List list) {
        int i = MainActivity.R;
        kotlin.jvm.internal.m.e(hVar, "<unused var>");
    }
}
