package is;

import bt.a2;
import bt.y1;
import d40.p1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ri.t1;

public final class c1 {
    public final js.i a;
    public final fs.k b;
    public final c0 c;
    public final bk.m d;
    public final j40.c e = j40.d.a();
    public final j40.c f = j40.d.a();
    public final j40.c g = j40.d.a();
    public final p1 h = d40.o.c(null);

    public c1(js.i iVar, fs.k kVar, fs.l lVar, c0 c0Var, bk.m mVar) {
        this.a = iVar;
        this.b = kVar;
        this.c = c0Var;
        this.d = mVar;
    }

    public final Object a(List list, m00.c cVar) throws Throwable {
        r0 r0Var;
        List list2;
        j40.a aVar;
        int i;
        List list3;
        int i2;
        int i3;
        List list4;
        int i4;
        int i5;
        j40.a aVar2;
        Iterator it;
        int i6;
        j40.a aVar3;
        int iIntValue;
        q0 q0Var;
        ss.v vVarD;
        long j;
        Map map;
        ss.v vVarD2;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i7 = r0Var.I;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                r0Var.I = i7 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        r0 r0Var2 = r0Var;
        Object obj = r0Var2.G;
        Object obj2 = l00.a.A;
        int i8 = r0Var2.I;
        g00.b0 b0Var = g00.b0.a;
        j40.a aVar4 = 0;
        try {
            if (i8 == 0) {
                t1.O(obj);
                if (list.isEmpty()) {
                    return b0Var;
                }
                list2 = list;
                r0Var2.A = list2;
                j40.c cVar2 = this.e;
                r0Var2.B = cVar2;
                r0Var2.D = 0;
                r0Var2.I = 1;
                if (cVar2.l(r0Var2) != obj2) {
                    aVar = cVar2;
                    i = 0;
                }
                return obj2;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    try {
                        if (i8 == 3) {
                            aVar3 = r0Var2.B;
                            t1.O(obj);
                        } else {
                            if (i8 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i9 = r0Var2.F;
                            int i11 = r0Var2.E;
                            int i12 = r0Var2.D;
                            Iterator it2 = r0Var2.C;
                            j40.a aVar5 = r0Var2.B;
                            List list5 = r0Var2.A;
                            t1.O(obj);
                            i4 = i9;
                            i5 = i12;
                            list4 = list5;
                            aVar2 = aVar5;
                            it = it2;
                            i6 = i11;
                            while (it.hasNext()) {
                                try {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    iIntValue = ((Number) entry.getKey()).intValue();
                                    q0Var = (q0) entry.getValue();
                                    vVarD = fs.l.d(q0Var.a, list4, iIntValue);
                                    if (vVarD != q0Var.a) {
                                        j = q0Var.b;
                                        r0Var2.A = list4;
                                        r0Var2.B = aVar2;
                                        r0Var2.C = it;
                                        r0Var2.D = i5;
                                        r0Var2.E = i6;
                                        r0Var2.F = i4;
                                        r0Var2.I = 4;
                                        if (f(vVarD, iIntValue, j, r0Var2) != obj2) {
                                            return obj2;
                                        }
                                        i4 = i4;
                                        i5 = i5;
                                        list4 = list4;
                                        aVar2 = aVar2;
                                        it = it;
                                        i6 = i6;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    aVar4 = aVar2;
                                    aVar4.i(null);
                                    throw th;
                                }
                            }
                            aVar3 = aVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar4.i(null);
                        throw th;
                    }
                } else {
                    i3 = r0Var2.E;
                    i2 = r0Var2.D;
                    aVar = r0Var2.B;
                    list3 = r0Var2.A;
                    t1.O(obj);
                    map = (Map) obj;
                    if (!map.isEmpty()) {
                        ss.x xVar = new ss.x("", 0L, 5);
                        h00.x xVar2 = h00.x.A;
                        vVarD2 = fs.l.d(new ss.v(5, 0, 0, xVar, 0L, xVar2, xVar2, xVar2, xVar2, xVar2, null, null), list3, 7);
                        r0Var2.A = null;
                        r0Var2.B = aVar;
                        r0Var2.D = i2;
                        r0Var2.E = i3;
                        r0Var2.I = 3;
                        if (f(vVarD2, 7, 0L, r0Var2) != obj2) {
                            return obj2;
                        }
                        aVar3 = aVar;
                    } else {
                        i5 = i2;
                        i4 = 0;
                        list4 = list3;
                        it = map.entrySet().iterator();
                        aVar2 = aVar;
                        i6 = i3;
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            iIntValue = ((Number) entry2.getKey()).intValue();
                            q0Var = (q0) entry2.getValue();
                            vVarD = fs.l.d(q0Var.a, list4, iIntValue);
                            if (vVarD != q0Var.a) {
                                j = q0Var.b;
                                r0Var2.A = list4;
                                r0Var2.B = aVar2;
                                r0Var2.C = it;
                                r0Var2.D = i5;
                                r0Var2.E = i6;
                                r0Var2.F = i4;
                                r0Var2.I = 4;
                                if (f(vVarD, iIntValue, j, r0Var2) != obj2) {
                                    return obj2;
                                }
                                i4 = i4;
                                i5 = i5;
                                list4 = list4;
                                aVar2 = aVar2;
                                it = it;
                                i6 = i6;
                            }
                        }
                        aVar3 = aVar2;
                    }
                }
                aVar3.i(null);
                return b0Var;
            }
            i = r0Var2.D;
            aVar = r0Var2.B;
            List list6 = r0Var2.A;
            t1.O(obj);
            list2 = list6;
            r0Var2.A = list2;
            r0Var2.B = aVar;
            r0Var2.D = i;
            r0Var2.E = 0;
            r0Var2.I = 2;
            Object objC = c(r0Var2);
            if (objC != obj2) {
                list3 = list2;
                obj = objC;
                i2 = i;
                i3 = 0;
                map = (Map) obj;
                if (!map.isEmpty()) {
                    i5 = i2;
                    i4 = 0;
                    list4 = list3;
                    it = map.entrySet().iterator();
                    aVar2 = aVar;
                    i6 = i3;
                    while (it.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it.next();
                        iIntValue = ((Number) entry3.getKey()).intValue();
                        q0Var = (q0) entry3.getValue();
                        vVarD = fs.l.d(q0Var.a, list4, iIntValue);
                        if (vVarD != q0Var.a) {
                            j = q0Var.b;
                            r0Var2.A = list4;
                            r0Var2.B = aVar2;
                            r0Var2.C = it;
                            r0Var2.D = i5;
                            r0Var2.E = i6;
                            r0Var2.F = i4;
                            r0Var2.I = 4;
                            if (f(vVarD, iIntValue, j, r0Var2) != obj2) {
                                i4 = i4;
                                i5 = i5;
                                list4 = list4;
                                aVar2 = aVar2;
                                it = it;
                                i6 = i6;
                            }
                        }
                    }
                    aVar3 = aVar2;
                    aVar3.i(null);
                    return b0Var;
                }
                ss.x xVar3 = new ss.x("", 0L, 5);
                h00.x xVar4 = h00.x.A;
                vVarD2 = fs.l.d(new ss.v(5, 0, 0, xVar3, 0L, xVar4, xVar4, xVar4, xVar4, xVar4, null, null), list3, 7);
                r0Var2.A = null;
                r0Var2.B = aVar;
                r0Var2.D = i2;
                r0Var2.E = i3;
                r0Var2.I = 3;
                if (f(vVarD2, 7, 0L, r0Var2) != obj2) {
                    aVar3 = aVar;
                    aVar3.i(null);
                    return b0Var;
                }
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            aVar4 = 1;
        }
    }

    public final Object b(m00.c cVar) throws Throwable {
        s0 s0Var;
        j40.a aVar;
        int i;
        j40.a aVar2;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i2 = s0Var.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.E = i2 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object obj = s0Var.C;
        l00.a aVar3 = l00.a.A;
        int i3 = s0Var.E;
        g00.b0 b0Var = g00.b0.a;
        try {
            if (i3 == 0) {
                t1.O(obj);
                aVar = this.e;
                s0Var.A = aVar;
                s0Var.B = 0;
                s0Var.E = 1;
                if (aVar.l(s0Var) != aVar3) {
                    i = 0;
                }
                return aVar3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = s0Var.A;
                try {
                    t1.O(obj);
                    p1 p1Var = this.h;
                    h00.y yVar = h00.y.A;
                    p1Var.getClass();
                    p1Var.k(null, yVar);
                    aVar2.i(null);
                    return b0Var;
                } catch (Throwable th) {
                    th = th;
                    aVar2.i(null);
                    throw th;
                }
            }
            i = s0Var.B;
            j40.a aVar4 = s0Var.A;
            t1.O(obj);
            aVar = aVar4;
            js.i iVar = this.a;
            s0Var.A = aVar;
            s0Var.B = i;
            s0Var.E = 2;
            Object objN = rd.a.N(iVar.a.a, false, true, new ks.e(8), s0Var);
            if (objN != aVar3) {
                objN = b0Var;
            }
            if (objN != aVar3) {
                objN = b0Var;
            }
            if (objN != aVar3) {
                aVar2 = aVar;
                p1 p1Var2 = this.h;
                h00.y yVar2 = h00.y.A;
                p1Var2.getClass();
                p1Var2.k(null, yVar2);
                aVar2.i(null);
                return b0Var;
            }
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public final Object c(m00.c cVar) throws Throwable {
        t0 t0Var;
        j40.a aVar;
        int i;
        Throwable th;
        j40.a aVar2;
        Map map;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i2 = t0Var.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0Var.E = i2 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object obj = t0Var.C;
        l00.a aVar3 = l00.a.A;
        int i3 = t0Var.E;
        p1 p1Var = this.h;
        try {
            if (i3 == 0) {
                t1.O(obj);
                Map map2 = (Map) p1Var.getValue();
                if (map2 != null) {
                    return map2;
                }
                aVar = this.f;
                t0Var.A = aVar;
                i = 0;
                t0Var.B = 0;
                t0Var.E = 1;
                if (aVar.l(t0Var) != aVar3) {
                }
                return aVar3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = t0Var.A;
                try {
                    t1.O(obj);
                    p1Var.j((Map) obj);
                    map = (Map) obj;
                    aVar = aVar2;
                    aVar.i(null);
                    return map;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i(null);
                    throw th;
                }
            }
            i = t0Var.B;
            j40.a aVar4 = t0Var.A;
            t1.O(obj);
            aVar = aVar4;
            map = (Map) p1Var.getValue();
            if (map == null) {
                h40.e eVar = a40.m0.a;
                a1.a0 a0Var = new a1.a0(this, (k00.c) null, 26);
                t0Var.A = aVar;
                t0Var.B = i;
                t0Var.E = 2;
                Object objJ = a40.c0.J(a0Var, eVar, t0Var);
                if (objJ != aVar3) {
                    j40.a aVar5 = aVar;
                    obj = objJ;
                    aVar2 = aVar5;
                    p1Var.j((Map) obj);
                    map = (Map) obj;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.i(null);
            return map;
        } catch (Throwable th3) {
            j40.a aVar6 = aVar;
            th = th3;
            aVar2 = aVar6;
            aVar2.i(null);
            throw th;
        }
    }

    public final Object d(m00.c cVar) throws Throwable {
        u0 u0Var;
        j40.a aVar;
        int i;
        j40.a aVar2;
        j40.a aVar3;
        int i2;
        int i3;
        Map map;
        Object objN;
        Map map2;
        LinkedHashMap linkedHashMap;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i4 = u0Var.G;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                u0Var.G = i4 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object obj = u0Var.E;
        Object obj2 = l00.a.A;
        int i5 = u0Var.G;
        Object obj3 = g00.b0.a;
        try {
            if (i5 == 0) {
                t1.O(obj);
                aVar = this.e;
                u0Var.A = aVar;
                u0Var.C = 0;
                u0Var.G = 1;
                if (aVar.l(u0Var) != obj2) {
                    i = 0;
                }
                return obj2;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map2 = u0Var.B;
                    aVar2 = u0Var.A;
                    try {
                        t1.O(obj);
                        p1 p1Var = this.h;
                        linkedHashMap = new LinkedHashMap(h00.d0.P(map2.size()));
                        for (Object obj4 : map2.entrySet()) {
                            linkedHashMap.put(((Map.Entry) obj4).getKey(), new q0(((q0) ((Map.Entry) obj4).getValue()).a, 0L));
                        }
                        p1Var.getClass();
                        p1Var.k(null, linkedHashMap);
                        aVar2.i(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.i(null);
                        throw th;
                    }
                }
                i3 = u0Var.D;
                i2 = u0Var.C;
                aVar3 = u0Var.A;
                try {
                    t1.O(obj);
                    map = (Map) obj;
                    js.i iVar = this.a;
                    u0Var.A = aVar3;
                    u0Var.B = map;
                    u0Var.C = i2;
                    u0Var.D = i3;
                    u0Var.G = 3;
                    objN = rd.a.N(iVar.a.a, false, true, new ks.e(7), u0Var);
                    if (objN != obj2) {
                        objN = obj3;
                    }
                    if (objN != obj2) {
                        objN = obj3;
                    }
                    if (objN != obj2) {
                        map2 = map;
                        aVar2 = aVar3;
                        p1 p1Var2 = this.h;
                        linkedHashMap = new LinkedHashMap(h00.d0.P(map2.size()));
                        while (r1.hasNext()) {
                            linkedHashMap.put(((Map.Entry) obj4).getKey(), new q0(((q0) ((Map.Entry) obj4).getValue()).a, 0L));
                        }
                        p1Var2.getClass();
                        p1Var2.k(null, linkedHashMap);
                        aVar2.i(null);
                        return obj3;
                    }
                    return obj2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    aVar2.i(null);
                    throw th;
                }
            }
            i = u0Var.C;
            j40.a aVar4 = u0Var.A;
            t1.O(obj);
            aVar = aVar4;
            u0Var.A = aVar;
            u0Var.C = i;
            u0Var.D = 0;
            u0Var.G = 2;
            Object objC = c(u0Var);
            if (objC != obj2) {
                aVar3 = aVar;
                obj = objC;
                i2 = i;
                i3 = 0;
                map = (Map) obj;
                js.i iVar2 = this.a;
                u0Var.A = aVar3;
                u0Var.B = map;
                u0Var.C = i2;
                u0Var.D = i3;
                u0Var.G = 3;
                objN = rd.a.N(iVar2.a.a, false, true, new ks.e(7), u0Var);
                if (objN != obj2) {
                    objN = obj3;
                }
                if (objN != obj2) {
                    objN = obj3;
                }
                if (objN != obj2) {
                    map2 = map;
                    aVar2 = aVar3;
                    p1 p1Var3 = this.h;
                    linkedHashMap = new LinkedHashMap(h00.d0.P(map2.size()));
                    while (r1.hasNext()) {
                        linkedHashMap.put(((Map.Entry) obj4).getKey(), new q0(((q0) ((Map.Entry) obj4).getValue()).a, 0L));
                    }
                    p1Var3.getClass();
                    p1Var3.k(null, linkedHashMap);
                    aVar2.i(null);
                    return obj3;
                }
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public final d40.i e(int i) {
        a2 a2Var = new a2(new as.y0(this, i, (k00.c) null, 3));
        c0 c0Var = this.c;
        return d40.o.v(new d40.u0(a2Var, new y1(rd.a.o(c0Var.b.a.a, false, new String[]{"listening_event_queue"}, new ks.e(3)), c0Var, 10), new d40.g0(this, i, (k00.c) null)), a40.m0.a);
    }

    public final Object f(ss.v vVar, int i, long j, m00.c cVar) {
        x0 x0Var;
        int i2;
        long j2;
        ss.v vVar2;
        ss.v vVar3;
        int i3;
        long j3;
        Map map;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i4 = x0Var.F;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x0Var.F = i4 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objJ = x0Var.D;
        l00.a aVar = l00.a.A;
        int i5 = x0Var.F;
        g00.b0 b0Var = g00.b0.a;
        if (i5 == 0) {
            t1.O(objJ);
            h40.e eVar = a40.m0.a;
            a1.c0 c0Var = new a1.c0(this, vVar, (k00.c) null, 25);
            x0Var.A = vVar;
            i2 = i;
            x0Var.B = i2;
            j2 = j;
            x0Var.C = j2;
            x0Var.F = 1;
            objJ = a40.c0.J(c0Var, eVar, x0Var);
            if (objJ != aVar) {
                vVar2 = vVar;
            }
            return aVar;
        }
        if (i5 == 1) {
            long j4 = x0Var.C;
            int i6 = x0Var.B;
            ss.v vVar4 = x0Var.A;
            t1.O(objJ);
            j2 = j4;
            i2 = i6;
            vVar2 = vVar4;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = x0Var.C;
            i3 = x0Var.B;
            vVar3 = x0Var.A;
            t1.O(objJ);
        }
        p1 p1Var = this.h;
        map = (Map) p1Var.getValue();
        if (map == null) {
            map = h00.y.A;
        }
        Map mapV = h00.d0.V(map, new g00.k(new Integer(i3), new q0(vVar3, j3)));
        p1Var.getClass();
        p1Var.k(null, mapV);
        return b0Var;
        String str = (String) objJ;
        kotlin.jvm.internal.m.b(str);
        gs.g gVar = new gs.g(str, j2, i2);
        x0Var.A = vVar2;
        x0Var.B = i2;
        x0Var.C = j2;
        x0Var.F = 2;
        ks.l lVar = this.a.a;
        Object objN = rd.a.N(lVar.a, false, true, new h1.v0(lVar, gVar, 15), x0Var);
        if (objN != aVar) {
            objN = b0Var;
        }
        if (objN != aVar) {
            objN = b0Var;
        }
        if (objN != aVar) {
            vVar3 = vVar2;
            i3 = i2;
            j3 = j2;
            p1 p1Var2 = this.h;
            map = (Map) p1Var2.getValue();
            if (map == null) {
                map = h00.y.A;
            }
            Map mapV2 = h00.d0.V(map, new g00.k(new Integer(i3), new q0(vVar3, j3)));
            p1Var2.getClass();
            p1Var2.k(null, mapV2);
            return b0Var;
        }
        return aVar;
    }

    public final Object g(ss.v vVar, int i, m00.c cVar) throws Throwable {
        y0 y0Var;
        j40.a aVar;
        int i2;
        int i3;
        Object objC;
        ss.v vVar2;
        int i4;
        int i5;
        Throwable th;
        j40.a aVar2;
        q0 q0Var;
        ss.v vVar3;
        ss.v vVarC;
        long jCurrentTimeMillis;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i6 = y0Var.H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                y0Var.H = i6 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        y0 y0Var2 = y0Var;
        Object obj = y0Var2.F;
        Object obj2 = l00.a.A;
        int i7 = y0Var2.H;
        int i8 = 0;
        try {
            if (i7 == 0) {
                t1.O(obj);
                y0Var2.A = vVar;
                aVar = this.e;
                y0Var2.B = aVar;
                y0Var2.C = i;
                y0Var2.D = 0;
                y0Var2.H = 1;
                if (aVar.l(y0Var2) != obj2) {
                    i2 = i;
                    i3 = 0;
                }
                return obj2;
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    i8 = y0Var2.E;
                    i4 = y0Var2.D;
                    i5 = y0Var2.C;
                    j40.a aVar3 = y0Var2.B;
                    ss.v vVar4 = y0Var2.A;
                    try {
                        t1.O(obj);
                        objC = obj;
                        aVar = aVar3;
                        vVar2 = vVar4;
                        try {
                            q0Var = (q0) ((Map) objC).get(new Integer(i5));
                            if (q0Var != null) {
                                vVar3 = q0Var.a;
                            } else {
                                vVar3 = null;
                            }
                            vVarC = fs.l.c(vVar2, vVar3, i5);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            y0Var2.A = null;
                            y0Var2.B = aVar;
                            y0Var2.C = i5;
                            y0Var2.D = i4;
                            y0Var2.E = i8;
                            y0Var2.H = 3;
                            if (f(vVarC, i5, jCurrentTimeMillis, y0Var2) != obj2) {
                                aVar2 = aVar;
                            }
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = aVar;
                            aVar2.i(null);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar3;
                    }
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = y0Var2.B;
                    try {
                        t1.O(obj);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                aVar2.i(null);
                throw th;
            }
            int i9 = y0Var2.D;
            int i11 = y0Var2.C;
            j40.a aVar4 = y0Var2.B;
            ss.v vVar5 = y0Var2.A;
            t1.O(obj);
            aVar = aVar4;
            i2 = i11;
            i3 = i9;
            vVar = vVar5;
            aVar2.i(null);
            return g00.b0.a;
            y0Var2.A = vVar;
            y0Var2.B = aVar;
            y0Var2.C = i2;
            y0Var2.D = i3;
            y0Var2.E = 0;
            y0Var2.H = 2;
            objC = c(y0Var2);
            if (objC != obj2) {
                int i12 = i2;
                vVar2 = vVar;
                i4 = i3;
                i5 = i12;
                q0Var = (q0) ((Map) objC).get(new Integer(i5));
                if (q0Var != null) {
                    vVar3 = q0Var.a;
                } else {
                    vVar3 = null;
                }
                vVarC = fs.l.c(vVar2, vVar3, i5);
                jCurrentTimeMillis = System.currentTimeMillis();
                y0Var2.A = null;
                y0Var2.B = aVar;
                y0Var2.C = i5;
                y0Var2.D = i4;
                y0Var2.E = i8;
                y0Var2.H = 3;
                if (f(vVarC, i5, jCurrentTimeMillis, y0Var2) != obj2) {
                    aVar2 = aVar;
                    aVar2.i(null);
                    return g00.b0.a;
                }
            }
            return obj2;
        } catch (Throwable th5) {
            th = th5;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public final Object h(int i, m00.c cVar) throws Throwable {
        z0 z0Var;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i2 = z0Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0Var.D = i2 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object objC = z0Var.B;
        Object obj = l00.a.A;
        int i3 = z0Var.D;
        if (i3 == 0) {
            t1.O(objC);
            z0Var.A = i;
            z0Var.D = 1;
            objC = c(z0Var);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = z0Var.A;
            t1.O(objC);
        }
        q0 q0Var = (q0) ((Map) objC).get(new Integer(i));
        return new Long(q0Var != null ? q0Var.b : 0L);
    }

    public final java.lang.Object i(int r27, m00.c r28) {
        throw new UnsupportedOperationException("Method not decompiled: is.c1.i(int, m00.c):java.lang.Object");
    }

    public final java.lang.Object j(u00.k r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: is.c1.j(u00.k, m00.c):java.lang.Object");
    }
}
