package is;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.io.IOException;
import java.security.MessageDigest;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import retrofit2.HttpException;
import ri.t1;

public final class l0 {
    public final Context a;
    public final ms.b b;
    public final ms.a c;
    public final js.h d;
    public volatile ss.o e;

    public l0(Context context, ms.b bVar, ms.a aVar, js.h hVar, fs.g gVar, fs.h hVar2, fs.j jVar) {
        this.a = context;
        this.b = bVar;
        this.c = aVar;
        this.d = hVar;
    }

    public final String a(ss.n nVar) {
        int i = nVar.b;
        List hours = nVar.c;
        List list = nVar.d;
        List surahs = nVar.e;
        List background = nVar.f;
        kotlin.jvm.internal.m.e(hours, "hours");
        kotlin.jvm.internal.m.e(surahs, "surahs");
        kotlin.jvm.internal.m.e(background, "background");
        byte[] bytes = ("ListeningImportSnapshot(importId=, dailyGoalMinutes=" + i + ", hours=" + hours + ", days=" + list + ", surahs=" + surahs + ", background=" + background + ")").getBytes(r30.a.a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        kotlin.jvm.internal.m.d(bArrDigest, "digest(...)");
        return h00.n.L0(bArrDigest, "", new hx.t(17), 30);
    }

    public final Object b(ss.n nVar, m00.c cVar) {
        d0 d0Var;
        String id;
        js.h hVar;
        int i;
        String str;
        String str2;
        ss.n from = nVar;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i2 = d0Var.H;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.H = i2 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object obj = d0Var.F;
        l00.a aVar = l00.a.A;
        int i3 = d0Var.H;
        js.h hVar2 = this.d;
        if (i3 != 0) {
            if (i3 == 1) {
                String str3 = d0Var.B;
                ss.n nVar2 = d0Var.A;
                t1.O(obj);
                id = str3;
                from = nVar2;
                hVar = hVar2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = d0Var.E;
                String str4 = d0Var.D;
                String str5 = d0Var.C;
                t1.O(obj);
                str = str5;
                str2 = str4;
                hVar = hVar2;
            }
            ss.j jVar = new ss.j(str, str2, i, (String) obj, hVar.a().length(), h00.z.A, false, false);
            k(jVar);
            return jVar;
        }
        t1.O(obj);
        id = ZoneId.systemDefault().getId();
        kotlin.jvm.internal.m.d(id, "getId(...)");
        kotlin.jvm.internal.m.e(from, "from");
        String str6 = from.a;
        int i4 = from.b;
        List<ss.k> list = from.d;
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        for (ss.k kVar : list) {
            arrayList.add(new hs.i(kVar.a, ab.a0.A(kVar.c / 1000, 0L, 86400L), kVar.b));
            hVar2 = hVar2;
        }
        js.h hVar3 = hVar2;
        List<ss.i> list2 = from.c;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(list2, 10));
        for (ss.i iVar : list2) {
            arrayList2.add(new hs.k(iVar.a, ab.a0.A(iVar.c / 1000, 0L, 3600L), iVar.b));
        }
        List<ss.w> list3 = from.e;
        ArrayList arrayList3 = new ArrayList(h00.r.q0(list3, 10));
        for (ss.w wVar : list3) {
            String str7 = wVar.a;
            arrayList3.add(new hs.q(wVar.b, wVar.c, ab.a0.y(wVar.e, 0, 100000), ab.a0.A(wVar.d / 1000, 0L, 86400L), str7));
        }
        List<ss.b> list4 = from.f;
        ArrayList arrayList4 = new ArrayList(h00.r.q0(list4, 10));
        for (ss.b bVar : list4) {
            arrayList4.add(new hs.h(bVar.a, bVar.b, bVar.c, ab.a0.A(bVar.d / 1000, 0L, 3600L), Integer.valueOf(ab.a0.y(bVar.e, 0, 1000))));
        }
        hs.j jVar2 = new hs.j(str6, id, i4, arrayList, arrayList2, arrayList3, arrayList4);
        d0Var.A = from;
        d0Var.B = id;
        d0Var.H = 1;
        h40.e eVar = a40.m0.a;
        hVar = hVar3;
        Object objJ = a40.c0.J(new a1.c0(hVar, jVar2, (k00.c) null, 26), h40.d.C, d0Var);
        if (objJ != l00.a.A) {
            objJ = g00.b0.a;
        }
        if (objJ != aVar) {
        }
        return aVar;
        String str8 = from.a;
        i = from.b;
        d0Var.A = null;
        d0Var.B = null;
        d0Var.C = str8;
        d0Var.D = id;
        d0Var.E = i;
        d0Var.H = 2;
        h40.e eVar2 = a40.m0.a;
        Object objJ2 = a40.c0.J(new js.g(hVar, null, 1), h40.d.C, d0Var);
        if (objJ2 != aVar) {
            str = str8;
            obj = objJ2;
            str2 = id;
            ss.j jVar3 = new ss.j(str, str2, i, (String) obj, hVar.a().length(), h00.z.A, false, false);
            k(jVar3);
            return jVar3;
        }
        return aVar;
    }

    public final Object c(m00.c cVar) {
        h40.e eVar = a40.m0.a;
        Object objJ = a40.c0.J(new js.g(this.d, null, 0), h40.d.C, cVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objJ != aVar) {
            objJ = b0Var;
        }
        return objJ == aVar ? objJ : b0Var;
    }

    public final String d() {
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    public final ss.j e() {
        gs.f fVar;
        js.h hVar = this.d;
        String string = hVar.b.getString("listening_import", null);
        if (string == null) {
            fVar = null;
        } else {
            try {
                fVar = (gs.f) hVar.c.d(gs.f.class, string);
            } catch (Throwable unused) {
                fVar = null;
            }
        }
        if (fVar == null) {
            return null;
        }
        String importId = fVar.getImportId();
        String timezone = fVar.getTimezone();
        int dailyGoalMinutes = fVar.getDailyGoalMinutes();
        String sha256 = fVar.getCom.revenuecat.purchases.common.verification.SigningManager.POST_PARAMS_ALGORITHM java.lang.String();
        long byteSize = fVar.getByteSize();
        List confirmedParts = fVar.getConfirmedParts();
        if (confirmedParts == null) {
            confirmedParts = h00.x.A;
        }
        return new ss.j(importId, timezone, dailyGoalMinutes, sha256, byteSize, h00.q.r1(confirmedParts), fVar.getIsStarted(), fVar.getIsAddedToSummary());
    }

    public final Object f(m00.c cVar) {
        e0 e0Var;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i = e0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0Var.C = i - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object objJ = e0Var.A;
        l00.a aVar = l00.a.A;
        int i2 = e0Var.C;
        k00.c cVar2 = null;
        if (i2 == 0) {
            t1.O(objJ);
            e0Var.C = 1;
            h40.e eVar = a40.m0.a;
            objJ = a40.c0.J(new js.g(this.d, cVar2, 2), h40.d.C, e0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        hs.j jVar = (hs.j) objJ;
        if (jVar == null) {
            return null;
        }
        String importId = jVar.getImportId();
        int dailyGoalMinutes = jVar.getDailyGoalMinutes();
        List<hs.i> days = jVar.getDays();
        List<hs.h> list = h00.x.A;
        if (days == null) {
            days = list;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(days, 10));
        for (hs.i iVar : days) {
            arrayList.add(new ss.k(iVar.getDate(), iVar.getListenedSeconds() * 1000, iVar.getDailyGoalMinutes()));
        }
        List<hs.k> hours = jVar.getHours();
        if (hours == null) {
            hours = list;
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(hours, 10));
        for (hs.k kVar : hours) {
            arrayList2.add(new ss.i(kVar.getDate(), kVar.getQuranSeconds() * 1000, kVar.getHour()));
        }
        List<hs.q> surahs = jVar.getSurahs();
        if (surahs == null) {
            surahs = list;
        }
        ArrayList arrayList3 = new ArrayList(h00.r.q0(surahs, 10));
        for (hs.q qVar : surahs) {
            arrayList3.add(new ss.w(qVar.getReciterId(), qVar.getSurahNumber(), qVar.getPlayCount(), qVar.getSeconds() * 1000, qVar.getDate()));
        }
        List background = jVar.getBackground();
        if (background != null) {
            list = background;
        }
        ArrayList arrayList4 = new ArrayList(h00.r.q0(list, 10));
        for (hs.h hVar : list) {
            String date = hVar.getDate();
            int hour = hVar.getHour();
            String soundId = hVar.getSoundId();
            long seconds = hVar.getSeconds() * 1000;
            Integer avgVolumeTimes1000 = hVar.getAvgVolumeTimes1000();
            arrayList4.add(new ss.b(hour, avgVolumeTimes1000 != null ? avgVolumeTimes1000.intValue() : 0, seconds, date, soundId));
        }
        return new ss.n(importId, dailyGoalMinutes, arrayList2, arrayList, arrayList3, arrayList4);
    }

    public final Enum g(m00.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i = f0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0Var.C = i - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objB = f0Var.A;
        l00.a aVar = l00.a.A;
        int i2 = f0Var.C;
        if (i2 == 0) {
            t1.O(objB);
            ms.b bVar = this.b;
            String strD = d();
            f0Var.C = 1;
            objB = bVar.b(strD, f0Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
        }
        hs.p pVar = (hs.p) objB;
        ss.o oVarA = fs.j.a(pVar != null ? pVar.getDeviceImport() : null);
        this.e = oVarA;
        return oVarA;
    }

    public final boolean h() {
        ss.o oVar = this.e;
        return e() != null || oVar == ss.o.A || oVar == ss.o.B;
    }

    public final Object i(m00.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i = g0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0Var.C = i - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objF = g0Var.A;
        Object obj = l00.a.A;
        int i2 = g0Var.C;
        Object obj2 = g00.b0.a;
        if (i2 == 0) {
            t1.O(objF);
            g0Var.C = 1;
            objF = f(g0Var);
            if (objF != obj) {
            }
        }
        if (i2 == 1) {
            t1.O(objF);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objF);
        }
        ss.n nVar = (ss.n) objF;
        js.h hVar = this.d;
        if (nVar != null) {
            String sha256 = a(nVar);
            kotlin.jvm.internal.m.e(sha256, "sha256");
            SharedPreferences.Editor editorEdit = hVar.b.edit();
            editorEdit.putString("listening_import_rejected_content", sha256);
            editorEdit.apply();
        }
        g0Var.C = 2;
        h40.e eVar = a40.m0.a;
        Object objJ = a40.c0.J(new js.g(hVar, null, 0), h40.d.C, g0Var);
        if (objJ != obj) {
            objJ = obj2;
        }
        return objJ == obj ? obj : obj2;
    }

    public final Object j(String str, int i, m00.c cVar) throws IOException {
        h0 h0Var;
        String url;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i2 = h0Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.C = i2 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objG = h0Var.A;
        l00.a aVar = l00.a.A;
        int i3 = h0Var.C;
        if (i3 == 0) {
            t1.O(objG);
            String strD = d();
            hs.m mVar = new hs.m(str, i);
            h0Var.C = 1;
            objG = this.b.g(strD, mVar, h0Var);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objG);
        }
        hs.n nVar = (hs.n) objG;
        if (nVar == null || (url = nVar.getUrl()) == null) {
            throw new IOException("Listening import part url is missing");
        }
        return url;
    }

    public final void k(ss.j jVar) {
        gs.f fVar = new gs.f(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e, h00.q.h1(jVar.f), jVar.g, jVar.h);
        js.h hVar = this.d;
        SharedPreferences.Editor editorEdit = hVar.b.edit();
        editorEdit.putString("listening_import", hVar.c.i(fVar));
        editorEdit.apply();
    }

    public final Enum l(m00.c cVar) {
        i0 i0Var;
        ss.j jVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.D = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.B;
        l00.a aVar = l00.a.A;
        int i2 = i0Var.D;
        try {
            if (i2 == 0) {
                t1.O(obj);
                ss.j jVarE = e();
                if (jVarE == null) {
                    return ss.m.C;
                }
                ms.b bVar = this.b;
                String strD = d();
                hs.o oVar = new hs.o(jVarE.a, jVarE.b, jVarE.c, jVarE.d, new Long(jVarE.e));
                i0Var.A = jVarE;
                i0Var.D = 1;
                if (bVar.a(strD, oVar, i0Var) == aVar) {
                    return aVar;
                }
                jVar = jVarE;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = i0Var.A;
                t1.O(obj);
            }
            k(ss.j.a(jVar, null, 191));
            return ss.m.A;
        } catch (HttpException e) {
            int i3 = e.A;
            if (i3 == 409) {
                return ss.m.B;
            }
            if (i3 == 403) {
                return ss.m.D;
            }
            if (m0.a.contains(new Integer(i3))) {
                return ss.m.C;
            }
            throw e;
        }
    }

    public final java.lang.Enum m(m00.c r22) {
        throw new UnsupportedOperationException("Method not decompiled: is.l0.m(m00.c):java.lang.Enum");
    }

    public final java.lang.Object n(java.lang.String r18, int r19, java.lang.String r20, byte[] r21, m00.c r22) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: is.l0.n(java.lang.String, int, java.lang.String, byte[], m00.c):java.lang.Object");
    }
}
