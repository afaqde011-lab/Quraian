package vn;

import a40.m0;
import bt.y1;
import d40.u0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import ri.t1;

public final class f {
    public final co.a a;
    public final wn.d b;
    public final xn.e c;
    public final tn.i d;
    public final tn.l e;
    public final wo.c0 f;
    public final bp.b g;
    public final bk.m h;
    public final ConcurrentHashMap i;
    public final j40.c j;
    public final ConcurrentHashMap k;

    public f(co.a aVar, wn.d dVar, xn.e eVar, tn.i iVar, tn.l lVar, wo.c0 c0Var, bp.b bVar) {
        bk.m mVar = new bk.m();
        this.a = aVar;
        this.b = dVar;
        this.c = eVar;
        this.d = iVar;
        this.e = lVar;
        this.f = c0Var;
        this.g = bVar;
        this.h = mVar;
        this.i = new ConcurrentHashMap();
        this.j = j40.d.a();
        this.k = new ConcurrentHashMap();
    }

    public static final java.lang.Object a(vn.f r28, un.j r29, java.lang.String r30, long r31, m00.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: vn.f.a(vn.f, un.j, java.lang.String, long, m00.c):java.lang.Object");
    }

    public static final Object b(f fVar, String str, m00.c cVar) throws IOException {
        b bVar;
        un.j jVar;
        Object objN;
        String str2;
        String str3;
        String strB;
        Object objC;
        un.j jVar2;
        un.j jVar3;
        un.j jVar4;
        String str4 = str;
        co.a aVar = fVar.a;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.F = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar, cVar);
            }
        } else {
            bVar = new b(fVar, cVar);
        }
        Object objC2 = bVar.D;
        l00.a aVar2 = l00.a.A;
        int i2 = bVar.F;
        if (i2 == 0) {
            t1.O(objC2);
            bVar.A = str4;
            bVar.F = 1;
            objC2 = aVar.c(str4, bVar);
            if (objC2 != aVar2) {
            }
            return aVar2;
        }
        if (i2 == 1) {
            str4 = bVar.A;
            t1.O(objC2);
        } else {
            if (i2 == 2) {
                str3 = bVar.C;
                un.j jVar5 = bVar.B;
                String str5 = bVar.A;
                t1.O(objC2);
                objN = objC2;
                jVar = jVar5;
                str2 = str5;
                if (((Boolean) objN).booleanValue() && (strB = fVar.g.b(str3)) != null && !strB.equals(str3)) {
                    bVar.A = null;
                    bVar.B = jVar;
                    bVar.C = null;
                    bVar.F = 3;
                    objC = aVar.c(str2, bVar);
                    if (objC != aVar2) {
                        un.j jVar6 = jVar;
                        objC2 = objC;
                        jVar2 = jVar6;
                    }
                    return aVar2;
                }
                return jVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = bVar.B;
            t1.O(objC2);
        }
        jVar3 = (un.j) objC2;
        if (jVar3 != null) {
            jVar4 = jVar3.getStories() != null ? jVar3 : null;
            if (jVar4 == null) {
                return jVar4;
            }
        }
        return jVar2;
        jVar = (un.j) objC2;
        if (jVar != null) {
            if (jVar.getStories() == null) {
                jVar = null;
            }
            if (jVar != null) {
                ep.g session = fVar.f.a.getSession();
                String str6 = session != null ? session.a : null;
                if (str6 != null && !r30.k.L0(str6)) {
                    List stories = jVar.getStories();
                    h00.x xVar = h00.x.A;
                    if (stories == null) {
                        stories = xVar;
                    }
                    ArrayList arrayListJ0 = h00.q.J0(stories);
                    ArrayList<un.d> arrayList = new ArrayList();
                    Iterator it = arrayListJ0.iterator();
                    while (it.hasNext()) {
                        List episodes = ((un.a) it.next()).getEpisodes();
                        if (episodes == null) {
                            episodes = xVar;
                        }
                        h00.v.u0(h00.q.J0(episodes), arrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        for (un.d dVar : arrayList) {
                            Long positionMs = dVar.getPositionMs();
                            if ((positionMs != null ? positionMs.longValue() : 0L) > 0 || kotlin.jvm.internal.m.a(dVar.getIsCompleted(), Boolean.TRUE)) {
                            }
                        }
                    }
                    xn.e eVar = fVar.c;
                    bVar.A = str4;
                    bVar.B = jVar;
                    bVar.C = str6;
                    bVar.F = 2;
                    objN = rd.a.N(eVar.a, true, false, new xn.a(8), bVar);
                    if (objN != aVar2) {
                        String str7 = str6;
                        str2 = str4;
                        str3 = str7;
                        if (((Boolean) objN).booleanValue()) {
                            bVar.A = null;
                            bVar.B = jVar;
                            bVar.C = null;
                            bVar.F = 3;
                            objC = aVar.c(str2, bVar);
                            if (objC != aVar2) {
                                un.j jVar7 = jVar;
                                objC2 = objC;
                                jVar2 = jVar7;
                                jVar3 = (un.j) objC2;
                                if (jVar3 != null) {
                                    if (jVar3.getStories() != null) {
                                    }
                                    if (jVar4 == null) {
                                        return jVar4;
                                    }
                                }
                                return jVar2;
                            }
                        }
                    }
                    return aVar2;
                }
                return jVar;
            }
        }
        throw new IOException("No catalog in the answer");
    }

    public static final byte[] c(f fVar, byte[] bArr) throws IOException {
        if (bArr.length < 2 || (bArr[0] & 255) != 31 || (bArr[1] & 255) != 139) {
            return bArr;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrA0 = w50.c.a0(gZIPInputStream);
            gZIPInputStream.close();
            return bArrA0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ta.c0.C(gZIPInputStream, th);
                throw th2;
            }
        }
    }

    public final Object d(String str, int i, m00.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.C = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.A;
        l00.a aVar = l00.a.A;
        int i3 = cVar2.C;
        if (i3 == 0) {
            t1.O(objJ);
            String str2 = str + "#" + i;
            ho.r rVar = (ho.r) this.k.get(str2);
            if (rVar != null) {
                return rVar;
            }
            h40.e eVar = m0.a;
            h40.d dVar = h40.d.C;
            pz.k kVar = new pz.k(str, str2, (k00.c) null, this);
            cVar2.C = 1;
            objJ = a40.c0.J(kVar, dVar, cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        return ((g00.n) objJ).A;
    }

    public final d40.i e(String language, String str) {
        kotlin.jvm.internal.m.e(language, "language");
        wn.d dVar = this.b;
        dVar.getClass();
        return d40.o.v(d40.o.o(new u0(new y1(d40.o.o(new jo.g(dVar.a.getData(), language, 2)), dVar, 25), rd.a.o(this.c.a, false, new String[]{"audio_story_progress"}, new xn.a(11)), new d(language, str, null, this))), m0.a);
    }

    public final Object g(String str, m00.c cVar, boolean z) throws Throwable {
        e eVar;
        j40.a aVar;
        int i;
        j40.a aVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.G = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.E;
        l00.a aVar3 = l00.a.A;
        int i3 = eVar.G;
        try {
            if (i3 == 0) {
                t1.O(obj);
                eVar.A = str;
                aVar = this.j;
                eVar.B = aVar;
                eVar.C = z;
                i = 0;
                eVar.D = 0;
                eVar.G = 1;
                if (aVar.l(eVar) != aVar3) {
                }
                return aVar3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = eVar.B;
                try {
                    t1.O(obj);
                    Object obj2 = ((g00.n) obj).A;
                    aVar2.i(null);
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    aVar2.i(null);
                    throw th;
                }
            }
            int i4 = eVar.D;
            z = eVar.C;
            j40.a aVar4 = eVar.B;
            String str2 = eVar.A;
            t1.O(obj);
            aVar = aVar4;
            i = i4;
            str = str2;
            Long l = (Long) this.i.get(str);
            if (!z && l != null && System.currentTimeMillis() - l.longValue() < 1800000) {
                g00.b0 b0Var = g00.b0.a;
                aVar.i(null);
                return b0Var;
            }
            try {
                h40.e eVar2 = m0.a;
                h40.d dVar = h40.d.C;
                b1.w wVar = new b1.w(this, str, (k00.c) null);
                eVar.A = null;
                eVar.B = aVar;
                eVar.C = z;
                eVar.D = i;
                eVar.G = 2;
                Object objJ = a40.c0.J(wVar, dVar, eVar);
                if (objJ != aVar3) {
                    j40.a aVar5 = aVar;
                    obj = objJ;
                    aVar2 = aVar5;
                    Object obj3 = ((g00.n) obj).A;
                    aVar2.i(null);
                    return obj3;
                }
                return aVar3;
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar;
                aVar2.i(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
