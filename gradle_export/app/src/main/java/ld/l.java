package ld;

import a1.f2;
import a40.a0;
import a40.c0;
import a40.v;
import a40.z;
import az.p;
import g1.b5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

public final class l {

    public final ad.f f10277a;

    public final b5 f10278b;

    public final z f10279c;

    public final v f10280d;

    public final cd.b f10281e;

    public l(ad.f fVar, b5 b5Var, rc.g gVar, z zVar, v vVar, cd.b bVar) {
        kotlin.jvm.internal.m.e(zVar, "scope");
        this.f10277a = fVar;
        this.f10278b = b5Var;
        this.f10279c = zVar;
        this.f10280d = vVar;
        this.f10281e = bVar;
    }

    public Boolean a(f5.c cVar, Object obj, String str) throws JSONException {
        kotlin.jvm.internal.m.e(obj, "events");
        if (cVar instanceof md.h) {
            md.h hVar = (md.h) cVar;
            kotlin.jvm.internal.m.e(obj, "events");
            String str2 = (String) obj;
            cd.b bVar = this.f10281e;
            if (bVar != null) {
                bVar.b("Handle response, status: " + ((md.f) hVar.B));
            }
            c(((z00.c) md.f.SUCCESS.A).A, "Event sent success.", bi.b.W(b(str, str2)));
            c0.y(this.f10279c, this.f10280d, (a0) null, new j(this, str2, null, 2), 2);
            return null;
        }
        if (cVar instanceof md.a) {
            md.a aVar = (md.a) cVar;
            String str3 = aVar.C;
            kotlin.jvm.internal.m.e(obj, "events");
            cd.b bVar2 = this.f10281e;
            if (bVar2 != null) {
                bVar2.b("Handle response, status: " + ((md.f) aVar.B) + ", error: " + str3);
            }
            String str4 = (String) obj;
            ArrayList arrayListW = bi.b.W(b(str, str4));
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            boolean z10 = false;
            boolean zA0 = r30.k.A0(lowerCase, "invalid api key", false);
            v vVar = this.f10280d;
            z zVar = this.f10279c;
            k00.c cVar2 = null;
            if (zA0) {
                c(((z00.c) md.f.BAD_REQUEST.A).A, str3, arrayListW);
                c0.y(zVar, vVar, (a0) null, new j(this, str4, cVar2, 0), 2);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(aVar.D);
                linkedHashSet.addAll(aVar.E);
                linkedHashSet.addAll(aVar.F);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                for (Object obj2 : arrayListW) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        va.a.k0();
                        throw null;
                    }
                    gd.a aVar2 = (gd.a) obj2;
                    if (linkedHashSet.contains(Integer.valueOf(i10))) {
                        arrayList.add(aVar2);
                    } else {
                        kotlin.jvm.internal.m.e(aVar2, "event");
                        String str5 = aVar2.f6290b;
                        if (str5 != null ? aVar.G.contains(str5) : false) {
                            arrayList.add(aVar2);
                        } else {
                            arrayList2.add(aVar2);
                        }
                    }
                    i10 = i11;
                }
                if (arrayList.isEmpty()) {
                    c0.y(zVar, vVar, (a0) null, new k(this, obj, cVar2, 0), 2);
                    z10 = true;
                } else {
                    c(((z00.c) md.f.BAD_REQUEST.A).A, str3, arrayList);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        this.f10278b.b((gd.a) it.next());
                    }
                    c0.y(zVar, vVar, (a0) null, new p(this, str4, arrayList, arrayList2, (k00.c) null, 4), 2);
                    z10 = false;
                }
            }
            return Boolean.valueOf(z10);
        }
        if (cVar instanceof md.g) {
            md.g gVar = (md.g) cVar;
            String str6 = gVar.C;
            kotlin.jvm.internal.m.e(obj, "events");
            cd.b bVar3 = this.f10281e;
            if (bVar3 != null) {
                bVar3.b("Handle response, status: " + ((md.f) gVar.B) + ", error: " + str6);
            }
            String str7 = (String) obj;
            JSONArray jSONArrayB = b(str, str7);
            int length = jSONArrayB.length();
            v vVar2 = this.f10280d;
            z zVar2 = this.f10279c;
            k00.c cVar3 = null;
            if (length == 1) {
                c(((z00.c) md.f.PAYLOAD_TOO_LARGE.A).A, str6, bi.b.W(jSONArrayB));
                c0.y(zVar2, vVar2, (a0) null, new j(this, str7, cVar3, 1), 2);
            } else {
                c0.y(zVar2, vVar2, (a0) null, new f2(this, str7, jSONArrayB, cVar3, 14), 2);
            }
            return Boolean.TRUE;
        }
        if (cVar instanceof md.j) {
            md.j jVar = (md.j) cVar;
            kotlin.jvm.internal.m.e(obj, "events");
            cd.b bVar4 = this.f10281e;
            if (bVar4 != null) {
                bVar4.b("Handle response, status: " + ((md.f) jVar.B) + ", error: " + jVar.C);
            }
            c0.y(this.f10279c, this.f10280d, (a0) null, new k(this, obj, null, 3), 2);
            return Boolean.TRUE;
        }
        if (cVar instanceof md.i) {
            md.i iVar = (md.i) cVar;
            kotlin.jvm.internal.m.e(obj, "events");
            cd.b bVar5 = this.f10281e;
            if (bVar5 != null) {
                bVar5.b("Handle response, status: " + ((md.f) iVar.B));
            }
            c0.y(this.f10279c, this.f10280d, (a0) null, new k(this, obj, null, 2), 2);
            return Boolean.TRUE;
        }
        md.b bVar6 = (md.b) cVar;
        kotlin.jvm.internal.m.e(obj, "events");
        cd.b bVar7 = this.f10281e;
        if (bVar7 != null) {
            bVar7.b("Handle response, status: " + ((md.f) bVar6.B) + ", error: " + bVar6.C);
        }
        c0.y(this.f10279c, this.f10280d, (a0) null, new k(this, obj, null, 1), 2);
        return Boolean.TRUE;
    }

    public final JSONArray b(String str, String str2) throws JSONException {
        try {
            return new JSONArray(str);
        } catch (JSONException e3) {
            k00.c cVar = null;
            j jVar = new j(this, str2, cVar, 3);
            z zVar = this.f10279c;
            v vVar = this.f10280d;
            c0.y(zVar, vVar, (a0) null, jVar, 2);
            r30.j jVar2 = new r30.j("\"insert_id\":\"(.{36})\",");
            if (str.length() < 0) {
                throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
            }
            q30.h hVar = new q30.h(new q30.i(new l6.c(jVar2, str, 16), r30.i.A));
            while (hVar.hasNext()) {
                c0.y(zVar, vVar, (a0) null, new a1.c0(this, (r30.h) hVar.next(), cVar, 28), 2);
            }
            throw e3;
        }
    }

    public final void c(int i10, String str, ArrayList arrayList) {
        l lVar;
        int i11;
        String str2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gd.a aVar = (gd.a) it.next();
            String str3 = aVar.f6294f;
            if (str3 != null) {
                lVar = this;
                i11 = i10;
                str2 = str;
                c0.y(lVar.f10279c, lVar.f10280d, (a0) null, new l6.v(lVar, str3, aVar, i11, str2, (k00.c) null), 2);
            } else {
                lVar = this;
                i11 = i10;
                str2 = str;
            }
            this = lVar;
            i10 = i11;
            str = str2;
        }
    }
}
