package ht;

import a40.c0;
import a40.m0;
import a40.p;
import android.content.SharedPreferences;
import bk.m;
import com.revenuecat.purchases.common.Constants;
import g00.b0;
import h00.q;
import h00.r;
import h00.x;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import ot.o;
import ri.t1;

public final class k {
    public final ot.e a;
    public final m00.i b;
    public final u00.a c;
    public final et.b d;
    public final jt.d e;
    public final gt.a f;
    public final SharedPreferences g;
    public final m h;
    public volatile List i;
    public volatile boolean j;
    public volatile String k;
    public final ConcurrentHashMap l = new ConcurrentHashMap();
    public final ConcurrentHashMap m = new ConcurrentHashMap();
    public final ConcurrentHashMap n = new ConcurrentHashMap();

    public k(ot.e eVar, u00.k kVar, u00.a aVar, et.b bVar, jt.d dVar, gt.a aVar2, SharedPreferences sharedPreferences, m mVar) {
        this.a = eVar;
        this.b = (m00.i) kVar;
        this.c = aVar;
        this.d = bVar;
        this.e = dVar;
        this.f = aVar2;
        this.g = sharedPreferences;
        this.h = mVar;
    }

    public static String j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            arrayList2.add(oVar.a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + oVar.i);
        }
        return q.R0(q.h1(arrayList2), "|", null, null, null, 62);
    }

    public final ArrayList a() {
        List list;
        if (this.j && kotlin.jvm.internal.m.a(this.k, this.c.invoke()) && (list = this.i) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                return g(list);
            }
        }
        return null;
    }

    public final Object b(o oVar, m00.c cVar) {
        String str = oVar.g;
        if (str == null) {
            throw new IllegalStateException("Missing remote file URL");
        }
        String str2 = oVar.a;
        int i = oVar.i;
        h40.e eVar = m0.a;
        Object objJ = c0.J(new jt.b(this.e, str2, str, i, null), h40.d.C, cVar);
        return objJ == l00.a.A ? objJ : b0.a;
    }

    public final Object c(m00.c cVar) throws Throwable {
        f fVar;
        Exception e;
        a40.q qVar;
        CancellationException e2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.D = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.B;
        l00.a aVar = l00.a.A;
        int i2 = fVar.D;
        a aVar2 = a.a;
        ConcurrentHashMap concurrentHashMap = this.l;
        try {
            if (i2 == 0) {
                t1.O(obj);
                ArrayList arrayListA = a();
                if (arrayListA != null) {
                    return arrayListA;
                }
                p pVar = (p) concurrentHashMap.get(aVar2);
                if (pVar != null) {
                    fVar.A = null;
                    fVar.D = 1;
                    Object objP = ((a40.q) pVar).p(fVar);
                    if (objP != aVar) {
                        return objP;
                    }
                } else {
                    a40.q qVarB = c0.b();
                    p pVar2 = (p) concurrentHashMap.putIfAbsent(aVar2, qVarB);
                    if (pVar2 != null) {
                        fVar.A = null;
                        fVar.D = 2;
                        Object objP2 = ((a40.q) pVar2).p(fVar);
                        if (objP2 != aVar) {
                            return objP2;
                        }
                    } else {
                        try {
                            fVar.A = qVarB;
                            fVar.D = 3;
                            Serializable serializableI = i(fVar);
                            if (serializableI != aVar) {
                                obj = serializableI;
                                qVar = qVarB;
                            }
                        } catch (CancellationException e3) {
                            e2 = e3;
                            qVar = qVarB;
                            qVar.t(e2);
                            throw e2;
                        } catch (Exception e4) {
                            e = e4;
                            qVar = qVarB;
                            qVar.h0(e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            this = qVarB;
                            concurrentHashMap.remove(aVar2, this);
                            throw th;
                        }
                    }
                }
                return aVar;
            }
            if (i2 == 1) {
                t1.O(obj);
                return obj;
            }
            if (i2 == 2) {
                t1.O(obj);
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = fVar.A;
            try {
                t1.O(obj);
            } catch (CancellationException e5) {
                e2 = e5;
                qVar.t(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                qVar.h0(e);
                throw e;
            }
            List list = (List) obj;
            qVar.S(list);
            concurrentHashMap.remove(aVar2, qVar);
            return list;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean d(o option) {
        Integer num;
        kotlin.jvm.internal.m.e(option, "option");
        String translationId = option.a;
        String str = option.g;
        int i = option.i;
        kotlin.jvm.internal.m.e(translationId, "translationId");
        jt.d dVar = this.e;
        File fileB = dVar.b(translationId, str);
        return fileB != null && fileB.exists() && (num = (Integer) dVar.c().get(translationId)) != null && num.intValue() == i;
    }

    public final Object e(o oVar, m00.c cVar) throws Throwable {
        h hVar;
        Exception e;
        a40.q qVar;
        CancellationException e2;
        Object obj;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.E = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj2 = hVar.C;
        l00.a aVar = l00.a.A;
        int i2 = hVar.E;
        ConcurrentHashMap concurrentHashMap = this.n;
        try {
            if (i2 == 0) {
                t1.O(obj2);
                ft.f fVar = new ft.f(oVar.a, oVar.i);
                Map map = (Map) this.m.get(fVar);
                if (map != null) {
                    return map;
                }
                p pVar = (p) concurrentHashMap.get(fVar);
                if (pVar != null) {
                    hVar.A = null;
                    hVar.B = null;
                    hVar.E = 1;
                    Object objP = ((a40.q) pVar).p(hVar);
                    if (objP != aVar) {
                        return objP;
                    }
                } else {
                    a40.q qVarB = c0.b();
                    p pVar2 = (p) concurrentHashMap.putIfAbsent(fVar, qVarB);
                    if (pVar2 != null) {
                        hVar.A = null;
                        hVar.B = null;
                        hVar.E = 2;
                        Object objP2 = ((a40.q) pVar2).p(hVar);
                        if (objP2 != aVar) {
                            return objP2;
                        }
                    } else {
                        try {
                            hVar.A = fVar;
                            hVar.B = qVarB;
                            hVar.E = 3;
                            Object objF = f(oVar, fVar, hVar);
                            if (objF != aVar) {
                                obj = fVar;
                                obj2 = objF;
                                qVar = qVarB;
                            }
                        } catch (CancellationException e3) {
                            e2 = e3;
                            qVar = qVarB;
                            qVar.t(e2);
                            throw e2;
                        } catch (Exception e4) {
                            e = e4;
                            qVar = qVarB;
                            qVar.h0(e);
                            throw e;
                        } catch (Throwable th) {
                            oVar = fVar;
                            th = th;
                            this = qVarB;
                            concurrentHashMap.remove(oVar, this);
                            throw th;
                        }
                    }
                }
                return aVar;
            }
            if (i2 == 1) {
                t1.O(obj2);
                return obj2;
            }
            if (i2 == 2) {
                t1.O(obj2);
                return obj2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = hVar.B;
            obj = hVar.A;
            try {
                t1.O(obj2);
            } catch (CancellationException e5) {
                e2 = e5;
                qVar.t(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                qVar.h0(e);
                throw e;
            }
            Map map2 = (Map) obj2;
            qVar.S(map2);
            concurrentHashMap.remove(obj, qVar);
            return map2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object f(o oVar, ft.f fVar, m00.c cVar) throws IOException {
        i iVar;
        Integer surahNumber;
        Integer ayahNumber;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.E = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.C;
        Object obj2 = l00.a.A;
        int i2 = iVar.E;
        ConcurrentHashMap concurrentHashMap = this.m;
        if (i2 == 0) {
            t1.O(obj);
            Map map = (Map) concurrentHashMap.get(fVar);
            if (map != null) {
                return map;
            }
            iVar.A = oVar;
            iVar.B = fVar;
            iVar.E = 1;
            if (b(oVar, iVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = iVar.B;
            oVar = iVar.A;
            t1.O(obj);
        }
        File fileB = this.e.b(oVar.a, oVar.g);
        if (fileB == null) {
            throw new IllegalStateException("Missing local file");
        }
        byte[] bArrB0 = r00.i.b0(fileB);
        if (bArrB0.length >= 2 && bArrB0[0] == 31 && bArrB0[1] == -117) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrB0));
            try {
                bArrB0 = w50.c.a0(gZIPInputStream);
                gZIPInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ta.c0.C(gZIPInputStream, th);
                    throw th2;
                }
            }
        }
        ft.h hVar = (ft.h) this.f.a.d(ft.h.class, new String(bArrB0, r30.a.a));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ft.i> surahs = hVar.getSurahs();
        x xVar = x.A;
        if (surahs == null) {
            surahs = xVar;
        }
        for (ft.i iVar2 : surahs) {
            if (iVar2 != null && (surahNumber = iVar2.getSurahNumber()) != null) {
                Object linkedHashMap2 = linkedHashMap.get(surahNumber);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(surahNumber, linkedHashMap2);
                }
                Map map2 = (Map) linkedHashMap2;
                List<ft.g> ayahs = iVar2.getAyahs();
                if (ayahs == null) {
                    ayahs = xVar;
                }
                for (ft.g gVar : ayahs) {
                    if (gVar != null && (ayahNumber = gVar.getAyahNumber()) != null) {
                        String text = gVar.getText();
                        if (text == null) {
                            text = "";
                        }
                        map2.put(ayahNumber, text);
                    }
                }
            }
        }
        concurrentHashMap.put(fVar, linkedHashMap);
        return linkedHashMap;
    }

    public final ArrayList g(List list) {
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVarA = (o) it.next();
            if (d(oVarA) || oVarA.j) {
                oVarA = oVarA.a();
            }
            arrayList.add(oVarA);
        }
        return arrayList;
    }

    public final void h(List list) {
        this.i = list;
        this.j = true;
        this.k = (String) this.c.invoke();
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.g.edit();
        editorEdit.putString(this.a.D, this.h.i(list));
        editorEdit.apply();
    }

    public final Serializable i(m00.c cVar) throws Exception {
        j jVar;
        Object objS;
        List list;
        et.b bVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.D = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.B;
        l00.a aVar = l00.a.A;
        int i2 = jVar.D;
        try {
            if (i2 == 0) {
                t1.O(obj);
                ArrayList arrayListA = a();
                if (arrayListA != null) {
                    return arrayListA;
                }
                et.b bVar2 = this.d;
                ?? r2 = this.b;
                jVar.A = bVar2;
                jVar.D = 1;
                Object objInvoke = r2.invoke(jVar);
                if (objInvoke == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                obj = objInvoke;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = jVar.A;
                t1.O(obj);
            }
            List listX = bVar.X((List) obj);
            String strJ = j((ArrayList) listX);
            if (!kotlin.jvm.internal.m.a(strJ, this.g.getString(this.a.C, null))) {
                SharedPreferences.Editor editorEdit = this.g.edit();
                editorEdit.putString(this.a.C, strJ);
                editorEdit.apply();
            }
            h(listX);
            return g(listX);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            List list2 = this.i;
            if (list2 != null) {
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    return g(list2);
                }
            }
            String string = this.g.getString(this.a.D, null);
            if (string == null) {
                list = null;
            } else {
                try {
                    objS = (List) this.h.e(string, new g().getType());
                } catch (Throwable th) {
                    objS = t1.s(th);
                }
                if (objS instanceof g00.m) {
                    objS = null;
                }
                list = (List) objS;
            }
            if (list == null) {
                throw e2;
            }
            List list3 = list.isEmpty() ? null : list;
            if (list3 == null) {
                throw e2;
            }
            h(list3);
            return g(list3);
        }
    }
}
