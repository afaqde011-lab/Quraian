package tf;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a1 extends t3 implements f {
    public final u.e E;
    public final u.e F;
    public final u.e G;
    public final u.e H;
    public final u.e I;
    public final u.e J;
    public final ea.h K;
    public final o10.b L;
    public final u.e M;
    public final u.e N;
    public final u.e O;

    public a1(y3 y3Var) {
        super(y3Var);
        this.E = new u.e(0);
        this.F = new u.e(0);
        this.G = new u.e(0);
        this.H = new u.e(0);
        this.I = new u.e(0);
        this.M = new u.e(0);
        this.N = new u.e(0);
        this.O = new u.e(0);
        this.J = new u.e(0);
        this.K = new ea.h(this);
        this.L = new o10.b(this, 18);
    }

    public static final u.e f1(com.google.android.gms.internal.measurement.e2 e2Var) {
        u.e eVar = new u.e(0);
        for (com.google.android.gms.internal.measurement.i2 i2Var : e2Var.t()) {
            eVar.put(i2Var.p(), i2Var.q());
        }
        return eVar;
    }

    public static final s1 g1(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return s1.AD_STORAGE;
        }
        if (i11 == 2) {
            return s1.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return s1.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return s1.AD_PERSONALIZATION;
    }

    @Override
    public final String V(String str, String str2) {
        V0();
        b1(str);
        Map map = (Map) this.E.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override
    public final void Y0() {
    }

    public final q1 Z0(String str, s1 s1Var) {
        V0();
        b1(str);
        com.google.android.gms.internal.measurement.z1 z1VarQ1 = q1(str);
        if (z1VarQ1 != null) {
            for (com.google.android.gms.internal.measurement.w1 w1Var : z1VarQ1.u()) {
                if (g1(w1Var.p()) == s1Var) {
                    int iQ = w1Var.q() - 1;
                    if (iQ == 1) {
                        return q1.GRANTED;
                    }
                    if (iQ != 2) {
                        break;
                    }
                    return q1.DENIED;
                }
            }
        }
        return q1.UNINITIALIZED;
    }

    public final boolean a1(String str) {
        V0();
        b1(str);
        com.google.android.gms.internal.measurement.z1 z1VarQ1 = q1(str);
        if (z1VarQ1 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.w1 w1Var : z1VarQ1.p()) {
            if (w1Var.p() == 3 && w1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void b1(String str) {
        W0();
        V0();
        com.google.android.gms.common.internal.d0.e(str);
        u.e eVar = this.I;
        if (eVar.get(str) == null) {
            m mVar = this.C.C;
            y3.R(mVar);
            sd.p1 p1VarB2 = mVar.b2(str);
            u.e eVar2 = this.O;
            u.e eVar3 = this.N;
            u.e eVar4 = this.M;
            u.e eVar5 = this.E;
            if (p1VarB2 != null) {
                com.google.android.gms.internal.measurement.d2 d2Var = (com.google.android.gms.internal.measurement.d2) e1(str, (byte[]) p1VarB2.B).i();
                c1(str, d2Var);
                eVar5.put(str, f1((com.google.android.gms.internal.measurement.e2) d2Var.e()));
                eVar.put(str, (com.google.android.gms.internal.measurement.e2) d2Var.e());
                d1(str, (com.google.android.gms.internal.measurement.e2) d2Var.e());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.e2) d2Var.B).A());
                eVar3.put(str, (String) p1VarB2.C);
                eVar2.put(str, (String) p1VarB2.D);
                return;
            }
            eVar5.put(str, null);
            this.G.put(str, null);
            this.F.put(str, null);
            this.H.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.J.put(str, null);
        }
    }

    public final void c1(String str, com.google.android.gms.internal.measurement.d2 d2Var) {
        h1 h1Var = (h1) this.B;
        HashSet hashSet = new HashSet();
        u.e eVar = new u.e(0);
        u.e eVar2 = new u.e(0);
        u.e eVar3 = new u.e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.e2) d2Var.B).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.a2) it.next()).p());
        }
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.e2) d2Var.B).u(); i10++) {
            com.google.android.gms.internal.measurement.b2 b2Var = (com.google.android.gms.internal.measurement.b2) ((com.google.android.gms.internal.measurement.e2) d2Var.B).v(i10).i();
            if (b2Var.h().isEmpty()) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.J.b("EventConfig contained null event name");
            } else {
                String strH = b2Var.h();
                String strG = u1.g(b2Var.h(), u1.f14727a, u1.f14729c);
                if (!TextUtils.isEmpty(strG)) {
                    b2Var.b();
                    ((com.google.android.gms.internal.measurement.c2) b2Var.B).w(strG);
                    d2Var.b();
                    ((com.google.android.gms.internal.measurement.e2) d2Var.B).H(i10, (com.google.android.gms.internal.measurement.c2) b2Var.e());
                }
                if (((com.google.android.gms.internal.measurement.c2) b2Var.B).q() && ((com.google.android.gms.internal.measurement.c2) b2Var.B).r()) {
                    eVar.put(strH, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.c2) b2Var.B).s() && ((com.google.android.gms.internal.measurement.c2) b2Var.B).t()) {
                    eVar2.put(b2Var.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.c2) b2Var.B).u()) {
                    if (((com.google.android.gms.internal.measurement.c2) b2Var.B).v() < 2 || ((com.google.android.gms.internal.measurement.c2) b2Var.B).v() > 65535) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.J.d("Invalid sampling rate. Event name, sample rate", b2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.c2) b2Var.B).v()));
                    } else {
                        eVar3.put(b2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.c2) b2Var.B).v()));
                    }
                }
            }
        }
        this.F.put(str, hashSet);
        this.G.put(str, eVar);
        this.H.put(str, eVar2);
        this.J.put(str, eVar3);
    }

    public final void d1(String str, com.google.android.gms.internal.measurement.e2 e2Var) {
        h1 h1Var = (h1) this.B;
        int iY = e2Var.y();
        ea.h hVar = this.K;
        if (iY == 0) {
            hVar.e(str);
            return;
        }
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.O.c(Integer.valueOf(e2Var.y()), "EES programs found");
        com.google.android.gms.internal.measurement.u3 u3Var = (com.google.android.gms.internal.measurement.u3) e2Var.x().get(0);
        try {
            com.google.android.gms.internal.measurement.e0 e0Var = new com.google.android.gms.internal.measurement.e0();
            oj.q qVar = e0Var.f3746a;
            ((HashMap) ((r5) qVar.E).f3857a).put("internal.remoteConfig", new z0(this, str, 2));
            ((HashMap) ((r5) qVar.E).f3857a).put("internal.appMetadata", new z0(this, str, 0));
            ((HashMap) ((r5) qVar.E).f3857a).put("internal.logger", new ef.b(this, 2));
            e0Var.b(u3Var);
            hVar.d(str, e0Var);
            h1.g(q0Var);
            b50.b bVar = q0Var.O;
            bVar.d("EES program loaded for appId, activities", str, Integer.valueOf(u3Var.q().q()));
            for (com.google.android.gms.internal.measurement.t3 t3Var : u3Var.q().p()) {
                h1.g(q0Var);
                bVar.c(t3Var.p(), "EES program activity");
            }
        } catch (zzd unused) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.e2 e1(String str, byte[] bArr) {
        h1 h1Var = (h1) this.B;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.e2.G();
        }
        try {
            com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) ((com.google.android.gms.internal.measurement.d2) t0.I1(com.google.android.gms.internal.measurement.e2.F(), bArr)).e();
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.d("Parsed config. version, gmp_app_id", e2Var.p() ? Long.valueOf(e2Var.q()) : null, e2Var.r() ? e2Var.s() : null);
            return e2Var;
        } catch (zzmr e3) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.J.d("Unable to merge remote config. appId", q0.d1(str), e3);
            return com.google.android.gms.internal.measurement.e2.G();
        } catch (RuntimeException e10) {
            q0 q0Var3 = h1Var.F;
            h1.g(q0Var3);
            q0Var3.J.d("Unable to merge remote config. appId", q0.d1(str), e10);
            return com.google.android.gms.internal.measurement.e2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.e2 h1(String str) {
        W0();
        V0();
        com.google.android.gms.common.internal.d0.e(str);
        b1(str);
        return (com.google.android.gms.internal.measurement.e2) this.I.get(str);
    }

    public final String i1(String str) {
        V0();
        b1(str);
        return (String) this.M.get(str);
    }

    public final void j1(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        com.google.android.gms.internal.measurement.d2 d2Var;
        byte[] bArrA;
        Iterator it;
        int i10;
        boolean z10;
        W0();
        V0();
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.internal.measurement.d2 d2Var2 = (com.google.android.gms.internal.measurement.d2) e1(str, bArr).i();
        c1(str, d2Var2);
        d1(str, (com.google.android.gms.internal.measurement.e2) d2Var2.e());
        com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) d2Var2.e();
        u.e eVar = this.I;
        eVar.put(str, e2Var);
        this.M.put(str, ((com.google.android.gms.internal.measurement.e2) d2Var2.B).A());
        this.N.put(str, str2);
        this.O.put(str, str3);
        this.E.put(str, f1((com.google.android.gms.internal.measurement.e2) d2Var2.e()));
        y3 y3Var = this.C;
        m mVar = y3Var.C;
        y3.R(mVar);
        ArrayList<com.google.android.gms.internal.measurement.l1> arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.e2) d2Var2.B).w()));
        h1 h1Var = (h1) mVar.B;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            com.google.android.gms.internal.measurement.k1 k1Var = (com.google.android.gms.internal.measurement.k1) ((com.google.android.gms.internal.measurement.l1) arrayList.get(i11)).i();
            u.e eVar2 = eVar;
            if (((com.google.android.gms.internal.measurement.l1) k1Var.B).v() != 0) {
                int i12 = 0;
                while (i12 < ((com.google.android.gms.internal.measurement.l1) k1Var.B).v()) {
                    com.google.android.gms.internal.measurement.m1 m1Var = (com.google.android.gms.internal.measurement.m1) ((com.google.android.gms.internal.measurement.l1) k1Var.B).w(i12).i();
                    com.google.android.gms.internal.measurement.m1 m1Var2 = (com.google.android.gms.internal.measurement.m1) m1Var.clone();
                    y3 y3Var2 = y3Var;
                    com.google.android.gms.internal.measurement.d2 d2Var3 = d2Var2;
                    String strG = u1.g(((com.google.android.gms.internal.measurement.n1) m1Var.B).r(), u1.f14727a, u1.f14729c);
                    if (strG != null) {
                        m1Var2.b();
                        ((com.google.android.gms.internal.measurement.n1) m1Var2.B).C(strG);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = 0;
                    while (i13 < ((com.google.android.gms.internal.measurement.n1) m1Var.B).t()) {
                        com.google.android.gms.internal.measurement.p1 p1VarU = ((com.google.android.gms.internal.measurement.n1) m1Var.B).u(i13);
                        boolean z11 = z10;
                        com.google.android.gms.internal.measurement.m1 m1Var3 = m1Var;
                        String strG2 = u1.g(p1VarU.w(), u1.f14731e, u1.f14732f);
                        if (strG2 != null) {
                            com.google.android.gms.internal.measurement.o1 o1Var = (com.google.android.gms.internal.measurement.o1) p1VarU.i();
                            o1Var.b();
                            ((com.google.android.gms.internal.measurement.p1) o1Var.B).y(strG2);
                            com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) o1Var.e();
                            m1Var2.b();
                            ((com.google.android.gms.internal.measurement.n1) m1Var2.B).D(i13, p1Var);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i13++;
                        m1Var = m1Var3;
                    }
                    if (z10) {
                        k1Var.b();
                        ((com.google.android.gms.internal.measurement.l1) k1Var.B).y(i12, (com.google.android.gms.internal.measurement.n1) m1Var2.e());
                        arrayList.set(i11, (com.google.android.gms.internal.measurement.l1) k1Var.e());
                    }
                    i12++;
                    y3Var = y3Var2;
                    d2Var2 = d2Var3;
                }
            }
            com.google.android.gms.internal.measurement.d2 d2Var4 = d2Var2;
            y3 y3Var3 = y3Var;
            if (((com.google.android.gms.internal.measurement.l1) k1Var.B).s() != 0) {
                for (int i14 = 0; i14 < ((com.google.android.gms.internal.measurement.l1) k1Var.B).s(); i14++) {
                    com.google.android.gms.internal.measurement.u1 u1VarT = ((com.google.android.gms.internal.measurement.l1) k1Var.B).t(i14);
                    String strG3 = u1.g(u1VarT.r(), u1.f14735i, u1.f14736j);
                    if (strG3 != null) {
                        com.google.android.gms.internal.measurement.t1 t1Var = (com.google.android.gms.internal.measurement.t1) u1VarT.i();
                        t1Var.b();
                        ((com.google.android.gms.internal.measurement.u1) t1Var.B).y(strG3);
                        k1Var.b();
                        ((com.google.android.gms.internal.measurement.l1) k1Var.B).x(i14, (com.google.android.gms.internal.measurement.u1) t1Var.e());
                        arrayList.set(i11, (com.google.android.gms.internal.measurement.l1) k1Var.e());
                    }
                }
            }
            i11++;
            eVar = eVar2;
            y3Var = y3Var3;
            d2Var2 = d2Var4;
        }
        com.google.android.gms.internal.measurement.d2 d2Var5 = d2Var2;
        u.e eVar3 = eVar;
        y3 y3Var4 = y3Var;
        mVar.W0();
        mVar.V0();
        com.google.android.gms.common.internal.d0.e(str);
        SQLiteDatabase sQLiteDatabaseK1 = mVar.K1();
        sQLiteDatabaseK1.beginTransaction();
        try {
            mVar.W0();
            mVar.V0();
            com.google.android.gms.common.internal.d0.e(str);
            SQLiteDatabase sQLiteDatabaseK2 = mVar.K1();
            sQLiteDatabaseK2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseK2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) it2.next();
                mVar.W0();
                mVar.V0();
                com.google.android.gms.common.internal.d0.e(str);
                com.google.android.gms.common.internal.d0.h(l1Var);
                if (l1Var.p()) {
                    int iQ = l1Var.q();
                    Iterator it3 = l1Var.u().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.n1) it3.next()).p()) {
                                q0 q0Var = h1Var.F;
                                h1.g(q0Var);
                                q0Var.J.d("Event filter with no ID. Audience definition ignored. appId, audienceId", q0.d1(str), Integer.valueOf(iQ));
                                break;
                            }
                        } else {
                            Iterator it4 = l1Var.r().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = l1Var.u().iterator();
                                    while (true) {
                                        com.google.android.gms.internal.measurement.l1 l1Var2 = l1Var;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseK1;
                                        String str5 = "app_id";
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            i10 = iQ;
                                            for (com.google.android.gms.internal.measurement.u1 u1Var : l1Var2.r()) {
                                                mVar.W0();
                                                mVar.V0();
                                                com.google.android.gms.common.internal.d0.e(str);
                                                com.google.android.gms.common.internal.d0.h(u1Var);
                                                if (u1Var.r().isEmpty()) {
                                                    q0 q0Var2 = h1Var.F;
                                                    h1.g(q0Var2);
                                                    q0Var2.J.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", q0.d1(str), Integer.valueOf(i10), String.valueOf(u1Var.p() ? Integer.valueOf(u1Var.q()) : null));
                                                } else {
                                                    byte[] bArrA2 = u1Var.a();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i10));
                                                    contentValues.put("filter_id", u1Var.p() ? Integer.valueOf(u1Var.q()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", u1Var.r());
                                                    contentValues.put("session_scoped", u1Var.v() ? Boolean.valueOf(u1Var.w()) : null);
                                                    contentValues.put("data", bArrA2);
                                                    try {
                                                        if (mVar.K1().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            q0 q0Var3 = h1Var.F;
                                                            h1.g(q0Var3);
                                                            q0Var3.G.c(q0.d1(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e3) {
                                                        q0 q0Var4 = h1Var.F;
                                                        h1.g(q0Var4);
                                                        q0Var4.G.d("Error storing property filter. appId", q0.d1(str), e3);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) it5.next();
                                            mVar.W0();
                                            mVar.V0();
                                            com.google.android.gms.common.internal.d0.e(str);
                                            com.google.android.gms.common.internal.d0.h(n1Var);
                                            if (n1Var.r().isEmpty()) {
                                                q0 q0Var5 = h1Var.F;
                                                h1.g(q0Var5);
                                                q0Var5.J.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", q0.d1(str), Integer.valueOf(iQ), String.valueOf(n1Var.p() ? Integer.valueOf(n1Var.q()) : null));
                                                it = it2;
                                                i10 = iQ;
                                            } else {
                                                it = it2;
                                                byte[] bArrA3 = n1Var.a();
                                                i10 = iQ;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(i10));
                                                contentValues2.put("filter_id", n1Var.p() ? Integer.valueOf(n1Var.q()) : null);
                                                contentValues2.put("event_name", n1Var.r());
                                                contentValues2.put("session_scoped", n1Var.z() ? Boolean.valueOf(n1Var.A()) : null);
                                                contentValues2.put("data", bArrA3);
                                                try {
                                                    if (mVar.K1().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        q0 q0Var6 = h1Var.F;
                                                        h1.g(q0Var6);
                                                        q0Var6.G.c(q0.d1(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    l1Var = l1Var2;
                                                    sQLiteDatabaseK1 = sQLiteDatabase;
                                                    it2 = it;
                                                    iQ = i10;
                                                } catch (SQLiteException e10) {
                                                    q0 q0Var7 = h1Var.F;
                                                    h1.g(q0Var7);
                                                    q0Var7.G.d("Error storing event filter. appId", q0.d1(str), e10);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        mVar.W0();
                                        mVar.V0();
                                        com.google.android.gms.common.internal.d0.e(str);
                                        SQLiteDatabase sQLiteDatabaseK3 = mVar.K1();
                                        sQLiteDatabaseK3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i10)});
                                        sQLiteDatabaseK3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i10)});
                                        break;
                                    }
                                    sQLiteDatabaseK1 = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((com.google.android.gms.internal.measurement.u1) it4.next()).p()) {
                                    q0 q0Var8 = h1Var.F;
                                    h1.g(q0Var8);
                                    q0Var8.J.d("Property filter with no ID. Audience definition ignored. appId, audienceId", q0.d1(str), Integer.valueOf(iQ));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    q0 q0Var9 = h1Var.F;
                    h1.g(q0Var9);
                    q0Var9.J.c(q0.d1(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseK1;
            ArrayList arrayList2 = new ArrayList();
            for (com.google.android.gms.internal.measurement.l1 l1Var3 : arrayList) {
                arrayList2.add(l1Var3.p() ? Integer.valueOf(l1Var3.q()) : null);
            }
            com.google.android.gms.common.internal.d0.e(str);
            mVar.W0();
            mVar.V0();
            SQLiteDatabase sQLiteDatabaseK4 = mVar.K1();
            try {
                long jF1 = mVar.F1("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(CastStatusCodes.AUTHENTICATION_FAILED, h1Var.D.d1(str, b0.U)));
                if (jF1 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseK4.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i15);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i15++;
                    }
                }
            } catch (SQLiteException e11) {
                q0 q0Var10 = h1Var.F;
                h1.g(q0Var10);
                q0Var10.G.d("Database error querying filters. appId", q0.d1(str), e11);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                d2Var5.b();
                d2Var = d2Var5;
                try {
                    ((com.google.android.gms.internal.measurement.e2) d2Var.B).I();
                    bArrA = ((com.google.android.gms.internal.measurement.e2) d2Var.e()).a();
                } catch (RuntimeException e12) {
                    e = e12;
                    q0 q0Var11 = ((h1) this.B).F;
                    h1.g(q0Var11);
                    q0Var11.J.d("Unable to serialize reduced-size config. Storing full config instead. appId", q0.d1(str), e);
                    bArrA = bArr;
                }
            } catch (RuntimeException e13) {
                e = e13;
                d2Var = d2Var5;
            }
            m mVar2 = y3Var4.C;
            y3.R(mVar2);
            h1 h1Var2 = (h1) mVar2.B;
            com.google.android.gms.common.internal.d0.e(str);
            mVar2.V0();
            mVar2.W0();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (mVar2.K1().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    q0 q0Var12 = h1Var2.F;
                    h1.g(q0Var12);
                    q0Var12.G.c(q0.d1(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e14) {
                q0 q0Var13 = h1Var2.F;
                h1.g(q0Var13);
                q0Var13.G.d("Error storing remote config. appId", q0.d1(str), e14);
            }
            d2Var.b();
            ((com.google.android.gms.internal.measurement.e2) d2Var.B).J();
            eVar3.put(str, (com.google.android.gms.internal.measurement.e2) d2Var.e());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseK1;
        }
    }

    public final boolean k1(String str, String str2) {
        Boolean bool;
        V0();
        b1(str);
        if ("1".equals(V(str, "measurement.upload.blacklist_internal")) && e4.t1(str2)) {
            return true;
        }
        if ("1".equals(V(str, "measurement.upload.blacklist_public")) && e4.T1(str2)) {
            return true;
        }
        Map map = (Map) this.G.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean l1(String str, String str2) {
        Boolean bool;
        V0();
        b1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.H.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int m1(String str, String str2) {
        Integer num;
        V0();
        b1(str);
        Map map = (Map) this.J.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean n1(String str) {
        V0();
        b1(str);
        u.e eVar = this.F;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean o1(String str) {
        V0();
        b1(str);
        u.e eVar = this.F;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean p1(String str, s1 s1Var) {
        V0();
        b1(str);
        com.google.android.gms.internal.measurement.z1 z1VarQ1 = q1(str);
        if (z1VarQ1 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.w1 w1Var : z1VarQ1.p()) {
            if (s1Var == g1(w1Var.p())) {
                return w1Var.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.z1 q1(String str) {
        V0();
        b1(str);
        com.google.android.gms.internal.measurement.e2 e2VarH1 = h1(str);
        if (e2VarH1 == null || !e2VarH1.B()) {
            return null;
        }
        return e2VarH1.C();
    }
}
