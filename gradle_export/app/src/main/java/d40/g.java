package d40;

import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import d0.i2;
import ri.t1;

public final class g implements j {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public g(j jVar, k00.i iVar) {
        this.A = 4;
        this.C = iVar;
        this.D = f40.a.m(iVar);
        this.B = new i2(jVar, (k00.c) null, 16);
    }

    public g(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.B = obj3;
    }

    public g(kotlin.jvm.internal.v vVar, j jVar, u00.n nVar) {
        this.A = 1;
        this.C = vVar;
        this.B = jVar;
        this.D = (m00.i) nVar;
    }

    public g(kotlin.jvm.internal.x xVar, j jVar, Object obj) {
        this.A = 2;
        this.C = xVar;
        this.B = jVar;
        this.D = obj;
    }

    public g(kotlin.jvm.internal.z zVar, a40.z zVar2, u00.n nVar) {
        this.A = 5;
        this.D = zVar;
        this.C = zVar2;
        this.B = nVar;
    }

    public g(kotlin.jvm.internal.z zVar, u00.o oVar, j jVar) {
        this.A = 3;
        this.D = zVar;
        this.C = (m00.i) oVar;
        this.B = jVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        f fVar;
        a0 a0Var;
        d0 d0Var;
        r0 r0Var;
        kotlin.jvm.internal.z zVar;
        Object objInvoke;
        h1.e eVar;
        char c;
        g gVar = this;
        Object obj2 = obj;
        int i = gVar.A;
        Object obj3 = gVar.B;
        g00.b0 b0Var = g00.b0.a;
        Object obj4 = gVar.C;
        Object obj5 = gVar.D;
        switch (i) {
            case 0:
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) obj5;
                h hVar = (h) obj4;
                if (cVar instanceof f) {
                    fVar = (f) cVar;
                    int i2 = fVar.C;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fVar.C = i2 - Integer.MIN_VALUE;
                    } else {
                        fVar = new f(gVar, cVar);
                    }
                } else {
                    fVar = new f(gVar, cVar);
                }
                Object obj6 = fVar.A;
                l00.a aVar = l00.a.A;
                int i3 = fVar.C;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj6);
                    return b0Var;
                }
                t1.O(obj6);
                Object objInvoke2 = hVar.B.invoke(obj2);
                Object obj7 = zVar2.A;
                if (obj7 != e40.b.b && ((Boolean) hVar.C.invoke(obj7, objInvoke2)).booleanValue()) {
                    return b0Var;
                }
                zVar2.A = objInvoke2;
                fVar.C = 1;
                return ((j) obj3).emit(obj2, fVar) == aVar ? aVar : b0Var;
            case 1:
                if (cVar instanceof a0) {
                    a0Var = (a0) cVar;
                    int i4 = a0Var.E;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        a0Var.E = i4 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new a0(gVar, cVar);
                    }
                } else {
                    a0Var = new a0(gVar, cVar);
                }
                Object objInvoke3 = a0Var.C;
                l00.a aVar2 = l00.a.A;
                int i5 = a0Var.E;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            Object obj8 = a0Var.B;
                            g gVar2 = a0Var.A;
                            t1.O(objInvoke3);
                            obj2 = obj8;
                            gVar = gVar2;
                        } else if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    t1.O(objInvoke3);
                    return b0Var;
                }
                t1.O(objInvoke3);
                if (((kotlin.jvm.internal.v) obj4).A) {
                    a0Var.E = 1;
                    if (((j) obj3).emit(obj2, a0Var) != aVar2) {
                        return b0Var;
                    }
                } else {
                    a0Var.A = gVar;
                    a0Var.B = obj2;
                    a0Var.E = 2;
                    objInvoke3 = ((m00.i) obj5).invoke(obj2, a0Var);
                    if (objInvoke3 != aVar2) {
                    }
                }
                return aVar2;
                if (((Boolean) objInvoke3).booleanValue()) {
                    return b0Var;
                }
                ((kotlin.jvm.internal.v) gVar.C).A = true;
                j jVar = (j) gVar.B;
                a0Var.A = null;
                a0Var.B = null;
                a0Var.E = 3;
                if (jVar.emit(obj2, a0Var) != aVar2) {
                    return b0Var;
                }
                return aVar2;
            case 2:
                j jVar2 = (j) obj3;
                if (cVar instanceof d0) {
                    d0Var = (d0) cVar;
                    int i6 = d0Var.C;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        d0Var.C = i6 - Integer.MIN_VALUE;
                    } else {
                        d0Var = new d0(gVar, cVar);
                    }
                } else {
                    d0Var = new d0(gVar, cVar);
                }
                Object obj9 = d0Var.A;
                l00.a aVar3 = l00.a.A;
                int i7 = d0Var.C;
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj9);
                    return b0Var;
                }
                t1.O(obj9);
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) obj4;
                int i8 = xVar.A + 1;
                xVar.A = i8;
                if (i8 < 1) {
                    d0Var.C = 1;
                    if (jVar2.emit(obj2, d0Var) != aVar3) {
                        return b0Var;
                    }
                } else {
                    d0Var.C = 2;
                    o.d(jVar2, obj2, obj5, d0Var);
                }
                return aVar3;
            case 3:
                if (cVar instanceof r0) {
                    r0Var = (r0) cVar;
                    int i9 = r0Var.E;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        r0Var.E = i9 - Integer.MIN_VALUE;
                    } else {
                        r0Var = new r0(gVar, cVar);
                    }
                } else {
                    r0Var = new r0(gVar, cVar);
                }
                Object obj10 = r0Var.C;
                l00.a aVar4 = l00.a.A;
                int i11 = r0Var.E;
                if (i11 == 0) {
                    t1.O(obj10);
                    zVar = (kotlin.jvm.internal.z) obj5;
                    Object obj11 = zVar.A;
                    r0Var.A = gVar;
                    r0Var.B = zVar;
                    r0Var.E = 1;
                    objInvoke = ((m00.i) obj4).invoke(obj11, obj2, r0Var);
                    if (objInvoke != aVar4) {
                    }
                    return aVar4;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj10);
                    return b0Var;
                }
                kotlin.jvm.internal.z zVar3 = r0Var.B;
                g gVar3 = r0Var.A;
                t1.O(obj10);
                zVar = zVar3;
                gVar = gVar3;
                objInvoke = obj10;
                zVar.A = objInvoke;
                j jVar3 = (j) gVar.B;
                Object obj12 = ((kotlin.jvm.internal.z) gVar.D).A;
                r0Var.A = null;
                r0Var.B = null;
                r0Var.E = 2;
                if (jVar3.emit(obj12, r0Var) != aVar4) {
                    return b0Var;
                }
                return aVar4;
            case 4:
                Object objC = e40.b.c((k00.i) obj4, obj2, obj5, (i2) obj3, cVar);
                return objC == l00.a.A ? objC : b0Var;
            case 5:
                kotlin.jvm.internal.z zVar4 = (kotlin.jvm.internal.z) obj5;
                if (cVar instanceof h1.e) {
                    eVar = (h1.e) cVar;
                    int i12 = eVar.D;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        eVar.D = i12 - Integer.MIN_VALUE;
                    } else {
                        eVar = new h1.e(gVar, cVar);
                    }
                } else {
                    eVar = new h1.e(gVar, cVar);
                }
                Object obj13 = eVar.B;
                l00.a aVar5 = l00.a.A;
                int i13 = eVar.D;
                if (i13 == 0) {
                    t1.O(obj13);
                    a40.e1 e1Var = (a40.e1) zVar4.A;
                    if (e1Var != null) {
                        e1Var.i(new AnchoredDragFinishedSignal());
                        eVar.A = obj2;
                        eVar.D = 1;
                        if (e1Var.F(eVar) == aVar5) {
                            return aVar5;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = eVar.A;
                    t1.O(obj13);
                }
                a40.z zVar5 = (a40.z) obj4;
                zVar4.A = a40.c0.y(zVar5, null, a40.a0.D, new ev.p((u00.n) obj3, obj2, zVar5, null, 8), 1);
                return b0Var;
            case 6:
                f0.h hVar2 = (f0.h) obj2;
                l1.z0 z0Var = (l1.z0) obj5;
                if (hVar2 instanceof f0.b) {
                    float f = hv.v.a;
                    Boolean bool = Boolean.TRUE;
                    z0Var.setValue(bool);
                    ((l1.z0) obj3).setValue(bool);
                    hv.w wVar = (hv.w) obj4;
                    wVar.a = 0.0f;
                    wVar.b = false;
                } else if ((hVar2 instanceof f0.c) || (hVar2 instanceof f0.a)) {
                    float f2 = hv.v.a;
                    z0Var.setValue(Boolean.FALSE);
                }
                return b0Var;
            case 7:
                f0.h hVar3 = (f0.h) obj2;
                po.p pVar = (po.p) obj4;
                if (hVar3 instanceof f0.b) {
                    h0.p1 p1Var = po.m.a;
                    ((l1.z0) obj5).setValue(Boolean.FALSE);
                    pVar.C = true;
                    pVar.D = false;
                    pVar.E = 0.0f;
                } else if ((hVar3 instanceof f0.c) || (hVar3 instanceof f0.a)) {
                    pVar.C = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    h0.p1 p1Var2 = po.m.a;
                    ((l1.g1) obj3).i(jCurrentTimeMillis);
                }
                return b0Var;
            case 8:
                ((Boolean) obj2).getClass();
                l1.i1 i1Var = ((x.n1) obj4).d;
                g00.k kVar = new g00.k(kotlin.jvm.internal.a0.a.b(i1Var.getValue().getClass()), ((q9.c) i1Var.getValue()).getKey());
                z1.s sVar = (z1.s) obj5;
                for (g00.k kVar2 : h00.q.n1(sVar.C)) {
                    if (!kotlin.jvm.internal.m.a(kVar2, kVar)) {
                        sVar.remove(kVar2);
                    }
                }
                u.b0 b0Var2 = (u.b0) obj3;
                long[] jArr = b0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j = jArr[i14];
                        char c2 = 7;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j & 255) < 128) {
                                    int i17 = (i14 << 3) + i16;
                                    c = c2;
                                    Object obj14 = b0Var2.b[i17];
                                    float f3 = b0Var2.c[i17];
                                    if (!kotlin.jvm.internal.m.a((g00.k) obj14, kVar)) {
                                        b0Var2.e--;
                                        long[] jArr2 = b0Var2.a;
                                        int i18 = b0Var2.d;
                                        int i19 = i17 >> 3;
                                        int i21 = (i17 & 7) << 3;
                                        long j2 = (jArr2[i19] & (~(255 << i21))) | (254 << i21);
                                        jArr2[i19] = j2;
                                        jArr2[(((i17 - 7) & i18) + (i18 & 7)) >> 3] = j2;
                                        b0Var2.b[i17] = null;
                                    }
                                } else {
                                    c = c2;
                                }
                                j >>= 8;
                                i16++;
                                c2 = c;
                            }
                            if (i15 == 8) {
                            }
                        }
                        if (i14 != length) {
                            i14++;
                        }
                    }
                }
                return b0Var;
            default:
                x.n1 n1Var = (x.n1) obj5;
                ((l1.o1) obj4).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((u00.n) ((l1.z0) obj3).getValue()).invoke(n1Var.a.J0(), n1Var.d.getValue())).booleanValue() : false));
                return b0Var;
        }
    }
}
