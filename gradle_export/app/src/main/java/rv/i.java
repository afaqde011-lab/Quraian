package rv;

import a1.o0;
import bt.y1;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import h00.d0;
import h00.r;
import h00.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ri.t1;

public final class i {
    public final xv.c a;
    public final tq.k b;
    public final zt.a c;
    public final p d;
    public final qu.a e;
    public final cw.a f;
    public final wu.a g;

    public i(xv.c cVar, tq.k kVar, zt.a aVar, p pVar, qu.a aVar2, cw.a aVar3, wu.a aVar4) {
        this.a = cVar;
        this.b = kVar;
        this.c = aVar;
        this.d = pVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar4;
    }

    public static HashMap a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bx.c cVar = (bx.c) it.next();
            bx.b bVarA = cVar.a();
            List<bx.f> list2 = bVarA != null ? bVarA.e : null;
            if (list2 == null) {
                list2 = x.A;
            }
            for (bx.f fVar : list2) {
                map.put(new g00.k(Integer.valueOf(cVar.a), Long.valueOf(fVar.a)), new g00.k(cVar, fVar));
            }
        }
        return map;
    }

    public static List b(int i, long j, LinkedHashMap linkedHashMap) {
        yt.b bVar = (yt.b) linkedHashMap.get(new g00.k(Integer.valueOf(i), Long.valueOf(j)));
        List listR = bVar != null ? va.a.R(bVar) : null;
        return listR == null ? x.A : listR;
    }

    public final Object c(String str, m00.c cVar) {
        a aVar;
        int i;
        int i2;
        p pVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i3 = aVar.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.F = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objF = aVar.D;
        Object obj = l00.a.A;
        int i4 = aVar.F;
        if (i4 == 0) {
            t1.O(objF);
            g00.q qVarG = kh.o.G(str);
            if (qVarG == null) {
                return null;
            }
            int iIntValue = ((Number) qVarG.A).intValue();
            int iIntValue2 = ((Number) qVarG.B).intValue();
            int iIntValue3 = ((Number) qVarG.C).intValue();
            p pVar2 = this.d;
            aVar.A = pVar2;
            aVar.B = iIntValue2;
            aVar.C = iIntValue3;
            aVar.F = 1;
            objF = f(iIntValue, aVar);
            if (objF == obj) {
                return obj;
            }
            i = iIntValue3;
            i2 = iIntValue2;
            pVar = pVar2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = aVar.C;
            i2 = aVar.B;
            pVar = aVar.A;
            t1.O(objF);
        }
        return pVar.d(new o0(i2, i, 1), (List) objF);
    }

    public final Object d(m00.c cVar) {
        b bVar;
        Object next;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objI = bVar.A;
        Object obj = l00.a.A;
        int i2 = bVar.C;
        if (i2 == 0) {
            t1.O(objI);
            bVar.C = 1;
            objI = i(bVar);
            if (objI != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objI);
            return objI;
        }
        t1.O(objI);
        Iterator it = ((Iterable) objI).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((dw.a) next).c());
        dw.a aVar = (dw.a) next;
        int i3 = aVar != null ? aVar.a : -1;
        bVar.C = 2;
        Object objE = e(i3, bVar);
        return objE == obj ? obj : objE;
    }

    public final Serializable e(int i, m00.c cVar) {
        c cVar2;
        List list;
        i iVar;
        HashMap mapA;
        Object objI;
        Map map;
        List list2;
        LinkedHashMap linkedHashMap;
        q30.e eVar;
        Object objI2;
        LinkedHashMap linkedHashMap2;
        List<zq.a> list3;
        int iP;
        LinkedHashMap linkedHashMap3;
        ArrayList arrayList;
        boolean z;
        Integer num;
        long j;
        PlayerItem playerItemX;
        dw.b bVar;
        int iIntValue;
        g00.k kVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.G = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objU = cVar2.E;
        l00.a aVar = l00.a.A;
        int i3 = cVar2.G;
        if (i3 == 0) {
            t1.O(objU);
            y1 y1VarC = this.b.c();
            cVar2.A = i;
            cVar2.G = 1;
            objU = d40.o.u(y1VarC, cVar2);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            i = cVar2.A;
            t1.O(objU);
        } else {
            if (i3 == 2) {
                i = cVar2.A;
                iVar = (i) cVar2.C;
                list = cVar2.B;
                t1.O(objU);
                iVar.getClass();
                mapA = a((List) objU);
                cVar2.B = list;
                cVar2.C = mapA;
                cVar2.A = i;
                cVar2.G = 3;
                objI = i(cVar2);
                if (objI != aVar) {
                    map = mapA;
                    objU = objI;
                    list2 = list;
                    q30.g gVar = new q30.g(h00.q.D0((Iterable) objU), new r9.e(4), q30.o.A);
                    linkedHashMap = new LinkedHashMap();
                    eVar = new q30.e(gVar);
                    while (eVar.hasNext()) {
                        Object next = eVar.next();
                        linkedHashMap.put(new Long(((dw.b) next).a), next);
                    }
                    cVar2.B = list2;
                    cVar2.C = map;
                    cVar2.D = linkedHashMap;
                    cVar2.A = i;
                    cVar2.G = 4;
                    objI2 = ((ut.p) this.c).i(cVar2);
                    if (objI2 != aVar) {
                        linkedHashMap2 = linkedHashMap;
                        objU = objI2;
                        list3 = list2;
                    }
                }
                return aVar;
            }
            if (i3 == 3) {
                i = cVar2.A;
                map = (Map) cVar2.C;
                list2 = cVar2.B;
                t1.O(objU);
                q30.g gVar2 = new q30.g(h00.q.D0((Iterable) objU), new r9.e(4), q30.o.A);
                linkedHashMap = new LinkedHashMap();
                eVar = new q30.e(gVar2);
                while (eVar.hasNext()) {
                    Object next2 = eVar.next();
                    linkedHashMap.put(new Long(((dw.b) next2).a), next2);
                }
                cVar2.B = list2;
                cVar2.C = map;
                cVar2.D = linkedHashMap;
                cVar2.A = i;
                cVar2.G = 4;
                objI2 = ((ut.p) this.c).i(cVar2);
                if (objI2 != aVar) {
                    linkedHashMap2 = linkedHashMap;
                    objU = objI2;
                    list3 = list2;
                }
                return aVar;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = cVar2.A;
            linkedHashMap2 = cVar2.D;
            map = (Map) cVar2.C;
            list3 = cVar2.B;
            t1.O(objU);
        }
        Iterable iterable = (Iterable) objU;
        iP = d0.P(r.q0(iterable, 10));
        if (iP < 16) {
            iP = 16;
        }
        linkedHashMap3 = new LinkedHashMap(iP);
        for (Object obj : iterable) {
            yt.b bVar2 = (yt.b) obj;
            linkedHashMap3.put(new g00.k(new Integer(bVar2.a), new Long(bVar2.b)), obj);
        }
        arrayList = new ArrayList();
        for (zq.a aVar2 : list3) {
            z = aVar2.c;
            num = aVar2.d;
            j = aVar2.a;
            playerItemX = null;
            if (z) {
                kVar = (g00.k) map.get(new g00.k(Integer.valueOf(aVar2.b), Long.valueOf(j)));
                if (kVar != null) {
                    bx.c cVar3 = (bx.c) kVar.A;
                    bx.f fVar = (bx.f) kVar.B;
                    playerItemX = this.e.X(new ru.b(cVar3, fVar, num, b(cVar3.a, fVar.a, linkedHashMap3)));
                }
            } else {
                bVar = (dw.b) linkedHashMap2.get(Long.valueOf(j));
                if (bVar != null) {
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i;
                    }
                    playerItemX = this.f.X(new g00.q(Integer.valueOf(iIntValue), bVar, b(bVar.f.a, bVar.a, linkedHashMap3)));
                }
            }
            if (playerItemX != null) {
                arrayList.add(playerItemX);
            }
        }
        return arrayList;
        List list4 = (List) objU;
        x xVar = x.A;
        if (list4 == null) {
            list4 = xVar;
        }
        if (list4.isEmpty()) {
            return xVar;
        }
        cVar2.B = list4;
        cVar2.C = this;
        cVar2.A = i;
        cVar2.G = 2;
        Object objF = this.d.f(cVar2);
        if (objF != aVar) {
            list = list4;
            objU = objF;
            iVar = this;
            iVar.getClass();
            mapA = a((List) objU);
            cVar2.B = list;
            cVar2.C = mapA;
            cVar2.A = i;
            cVar2.G = 3;
            objI = i(cVar2);
            if (objI != aVar) {
                map = mapA;
                objU = objI;
                list2 = list;
                q30.g gVar3 = new q30.g(h00.q.D0((Iterable) objU), new r9.e(4), q30.o.A);
                linkedHashMap = new LinkedHashMap();
                eVar = new q30.e(gVar3);
                while (eVar.hasNext()) {
                    Object next3 = eVar.next();
                    linkedHashMap.put(new Long(((dw.b) next3).a), next3);
                }
                cVar2.B = list2;
                cVar2.C = map;
                cVar2.D = linkedHashMap;
                cVar2.A = i;
                cVar2.G = 4;
                objI2 = ((ut.p) this.c).i(cVar2);
                if (objI2 != aVar) {
                    linkedHashMap2 = linkedHashMap;
                    objU = objI2;
                    list3 = list2;
                    Iterable iterable2 = (Iterable) objU;
                    iP = d0.P(r.q0(iterable2, 10));
                    if (iP < 16) {
                        iP = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(iP);
                    while (r13.hasNext()) {
                        yt.b bVar3 = (yt.b) obj;
                        linkedHashMap3.put(new g00.k(new Integer(bVar3.a), new Long(bVar3.b)), obj);
                    }
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        z = aVar2.c;
                        num = aVar2.d;
                        j = aVar2.a;
                        playerItemX = null;
                        if (z) {
                            kVar = (g00.k) map.get(new g00.k(Integer.valueOf(aVar2.b), Long.valueOf(j)));
                            if (kVar != null) {
                                bx.c cVar4 = (bx.c) kVar.A;
                                bx.f fVar2 = (bx.f) kVar.B;
                                playerItemX = this.e.X(new ru.b(cVar4, fVar2, num, b(cVar4.a, fVar2.a, linkedHashMap3)));
                            }
                        } else {
                            bVar = (dw.b) linkedHashMap2.get(Long.valueOf(j));
                            if (bVar != null) {
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = i;
                                }
                                playerItemX = this.f.X(new g00.q(Integer.valueOf(iIntValue), bVar, b(bVar.f.a, bVar.a, linkedHashMap3)));
                            }
                        }
                        if (playerItemX != null) {
                            arrayList.add(playerItemX);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return aVar;
    }

    public final Object f(int i, m00.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.D = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objG = dVar.B;
        Object obj = l00.a.A;
        int i3 = dVar.D;
        if (i3 == 0) {
            t1.O(objG);
            dVar.A = i;
            dVar.D = 1;
            objG = g(i, dVar);
            if (objG != obj) {
            }
            return obj;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                t1.O(objG);
                return objG;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objG);
            return objG;
        }
        i = dVar.A;
        t1.O(objG);
        dw.a aVar = (dw.a) objG;
        if (aVar == null) {
            return x.A;
        }
        if (aVar.c()) {
            int i4 = aVar.a;
            dVar.A = i;
            dVar.D = 2;
            Object objE = e(i4, dVar);
            if (objE != obj) {
                return objE;
            }
        } else {
            dVar.A = i;
            dVar.D = 3;
            Object objH = h(aVar, dVar);
            if (objH != obj) {
                return objH;
            }
        }
        return obj;
    }

    public final Object g(int i, m00.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.D = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objI = eVar.B;
        Object obj = l00.a.A;
        int i3 = eVar.D;
        if (i3 == 0) {
            t1.O(objI);
            eVar.A = i;
            eVar.D = 1;
            objI = i(eVar);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = eVar.A;
            t1.O(objI);
        }
        for (Object obj2 : (Iterable) objI) {
            if (((dw.a) obj2).a == i) {
                return obj2;
            }
        }
        return null;
    }

    public final Serializable h(dw.a aVar, m00.c cVar) {
        f fVar;
        dw.a aVar2;
        i iVar;
        Map mapA;
        dw.a aVar3;
        int iP;
        LinkedHashMap linkedHashMap;
        int i;
        ArrayList arrayList;
        long j;
        g00.k kVar;
        PlayerItem playerItemX;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.E = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objF = fVar.C;
        l00.a aVar4 = l00.a.A;
        int i3 = fVar.E;
        if (i3 == 0) {
            t1.O(objF);
            fVar.A = aVar;
            fVar.B = this;
            fVar.E = 1;
            objF = this.d.f(fVar);
            if (objF != aVar4) {
                aVar2 = aVar;
                iVar = this;
            }
            return aVar4;
        }
        if (i3 == 1) {
            iVar = (i) fVar.B;
            aVar2 = fVar.A;
            t1.O(objF);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mapA = (Map) fVar.B;
            aVar3 = fVar.A;
            t1.O(objF);
        }
        Iterable iterable = (Iterable) objF;
        iP = d0.P(r.q0(iterable, 10));
        if (iP < 16) {
            iP = 16;
        }
        linkedHashMap = new LinkedHashMap(iP);
        for (Object obj : iterable) {
            yt.b bVar = (yt.b) obj;
            linkedHashMap.put(new g00.k(new Integer(bVar.a), new Long(bVar.b)), obj);
        }
        u30.b<dw.b> bVar2 = aVar3.i;
        i = aVar3.a;
        arrayList = new ArrayList(r.q0(bVar2, 10));
        for (dw.b bVar3 : bVar2) {
            dw.c cVar2 = bVar3.f;
            j = bVar3.a;
            kVar = (g00.k) mapA.get(new g00.k(new Integer(cVar2.a), new Long(j)));
            if (kVar != null) {
                bx.c cVar3 = (bx.c) kVar.A;
                bx.f fVar2 = (bx.f) kVar.B;
                playerItemX = this.e.X(new ru.b(cVar3, fVar2, new Integer(i), b(cVar3.a, fVar2.a, linkedHashMap)));
            } else {
                playerItemX = this.f.X(new g00.q(new Integer(i), bVar3, b(bVar3.f.a, j, linkedHashMap)));
            }
            arrayList.add(playerItemX);
        }
        return arrayList;
        iVar.getClass();
        mapA = a((List) objF);
        fVar.A = aVar2;
        fVar.B = mapA;
        fVar.E = 2;
        objF = ((ut.p) this.c).i(fVar);
        if (objF != aVar4) {
            aVar3 = aVar2;
            Iterable iterable2 = (Iterable) objF;
            iP = d0.P(r.q0(iterable2, 10));
            if (iP < 16) {
                iP = 16;
            }
            linkedHashMap = new LinkedHashMap(iP);
            while (r12.hasNext()) {
                yt.b bVar4 = (yt.b) obj;
                linkedHashMap.put(new g00.k(new Integer(bVar4.a), new Long(bVar4.b)), obj);
            }
            u30.b<dw.b> bVar5 = aVar3.i;
            i = aVar3.a;
            arrayList = new ArrayList(r.q0(bVar5, 10));
            while (r12.hasNext()) {
                dw.c cVar4 = bVar3.f;
                j = bVar3.a;
                kVar = (g00.k) mapA.get(new g00.k(new Integer(cVar4.a), new Long(j)));
                if (kVar != null) {
                    bx.c cVar5 = (bx.c) kVar.A;
                    bx.f fVar3 = (bx.f) kVar.B;
                    playerItemX = this.e.X(new ru.b(cVar5, fVar3, new Integer(i), b(cVar5.a, fVar3.a, linkedHashMap)));
                } else {
                    playerItemX = this.f.X(new g00.q(new Integer(i), bVar3, b(bVar3.f.a, j, linkedHashMap)));
                }
                arrayList.add(playerItemX);
            }
            return arrayList;
        }
        return aVar4;
    }

    public final java.lang.Object i(m00.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: rv.i.i(m00.c):java.lang.Object");
    }

    public final Object j(String str, m00.c cVar) {
        h hVar;
        int iIntValue;
        int i;
        Object next;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.E = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objF = hVar.C;
        Object obj = l00.a.A;
        int i3 = hVar.E;
        if (i3 == 0) {
            t1.O(objF);
            g00.q qVarG = kh.o.G(str);
            if (qVarG != null) {
                int iIntValue2 = ((Number) qVarG.A).intValue();
                int iIntValue3 = ((Number) qVarG.B).intValue();
                iIntValue = ((Number) qVarG.C).intValue();
                hVar.A = iIntValue3;
                hVar.B = iIntValue;
                hVar.E = 1;
                objF = f(iIntValue2, hVar);
                if (objF == obj) {
                    return obj;
                }
                i = iIntValue3;
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iIntValue = hVar.B;
        i = hVar.A;
        t1.O(objF);
        Iterator it = ((Iterable) objF).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PlayerItem playerItem = (PlayerItem) next;
            if (playerItem.getReciterId() == i && playerItem.getSurahNumber() == iIntValue) {
                break;
            }
        }
        PlayerItem playerItem2 = (PlayerItem) next;
        if (playerItem2 != null) {
            return h00.q.N0(this.g.X(va.a.R(playerItem2)));
        }
        return null;
    }
}
