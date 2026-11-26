package bt;

import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class m1 implements d40.j {
    public final int A;
    public final d40.j B;

    public m1(d40.j jVar, int i) {
        this.A = i;
        this.B = jVar;
    }

    public m1(d40.j jVar, Object obj, int i) {
        this.A = i;
        this.B = jVar;
    }

    private final Object b(Object obj, k00.c cVar) {
        mb.i iVar;
        xb.g gVar;
        if (cVar instanceof mb.i) {
            iVar = (mb.i) cVar;
            int i = iVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.B = i - Integer.MIN_VALUE;
            } else {
                iVar = new mb.i(this, cVar);
            }
        } else {
            iVar = new mb.i(this, cVar);
        }
        Object obj2 = iVar.A;
        l00.a aVar = l00.a.A;
        int i2 = iVar.B;
        if (i2 == 0) {
            ri.t1.O(obj2);
            long j = ((h2.e) obj).a;
            if (j == 9205357640488583168L) {
                gVar = xb.g.c;
            } else {
                xb.e eVar = mb.c0.b;
                if (h2.e.e(j) < 0.5d || h2.e.b(j) < 0.5d) {
                    gVar = null;
                } else {
                    float fE = h2.e.e(j);
                    boolean zIsInfinite = Float.isInfinite(fE);
                    xb.a aVar2 = xb.b.a;
                    xb.a aVar3 = (zIsInfinite || Float.isNaN(fE)) ? aVar2 : new xb.a(w00.a.F(h2.e.e(j)));
                    float fB = h2.e.b(j);
                    if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                        aVar2 = new xb.a(w00.a.F(h2.e.b(j)));
                    }
                    gVar = new xb.g(aVar3, aVar2);
                }
            }
            if (gVar != null) {
                iVar.B = 1;
                if (this.B.emit(gVar, iVar) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj2);
        }
        return g00.b0.a;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        l1 l1Var;
        s1 s1Var;
        u1 u1Var;
        v1 v1Var;
        w1 w1Var;
        x1 x1Var;
        z1 z1Var;
        d2 d2Var;
        e2 e2Var;
        int i;
        bv.c2 c2Var;
        bv.f2 f2Var;
        bv.g2 g2Var;
        bv.k2 k2Var;
        bv.l2 l2Var;
        bv.m2 m2Var;
        bv.n2 n2Var;
        d40.o0 o0Var;
        dq.j jVar;
        ev.o oVar;
        ev.a0 a0Var;
        k00.c qVar;
        is.b bVar;
        is.e eVar;
        is.i iVar;
        is.l lVar;
        is.o oVar2;
        is.b0 b0Var;
        iv.g gVar;
        k00.c pVar;
        int i2 = this.A;
        Object objValueOf = null;
        Object gVar2 = null;
        Object next = null;
        Integer num = null;
        g00.b0 b0Var2 = g00.b0.a;
        d40.j jVar2 = this.B;
        int i3 = 1;
        switch (i2) {
            case 0:
                if (cVar instanceof l1) {
                    l1Var = (l1) cVar;
                    int i4 = l1Var.B;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        l1Var.B = i4 - Integer.MIN_VALUE;
                    } else {
                        l1Var = new l1(this, cVar);
                    }
                } else {
                    l1Var = new l1(this, cVar);
                }
                Object obj2 = l1Var.A;
                Object obj3 = l00.a.A;
                int i5 = l1Var.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj2);
                    return b0Var2;
                }
                ri.t1.O(obj2);
                if (!((Boolean) obj).booleanValue()) {
                    return b0Var2;
                }
                l1Var.B = 1;
                return jVar2.emit(obj, l1Var) == obj3 ? obj3 : b0Var2;
            case 1:
                if (cVar instanceof s1) {
                    s1Var = (s1) cVar;
                    int i6 = s1Var.B;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        s1Var.B = i6 - Integer.MIN_VALUE;
                    } else {
                        s1Var = new s1(this, cVar);
                    }
                } else {
                    s1Var = new s1(this, cVar);
                }
                Object obj4 = s1Var.A;
                Object obj5 = l00.a.A;
                int i7 = s1Var.B;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj4);
                    return b0Var2;
                }
                ri.t1.O(obj4);
                Object num2 = new Integer(((a1) obj).a.b());
                s1Var.B = 1;
                return jVar2.emit(num2, s1Var) == obj5 ? obj5 : b0Var2;
            case 2:
                if (cVar instanceof u1) {
                    u1Var = (u1) cVar;
                    int i8 = u1Var.B;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        u1Var.B = i8 - Integer.MIN_VALUE;
                    } else {
                        u1Var = new u1(this, cVar);
                    }
                } else {
                    u1Var = new u1(this, cVar);
                }
                Object obj6 = u1Var.A;
                Object obj7 = l00.a.A;
                int i9 = u1Var.B;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj6);
                    return b0Var2;
                }
                ri.t1.O(obj6);
                Object obj8 = ((a1) obj).a;
                u1Var.B = 1;
                return jVar2.emit(obj8, u1Var) == obj7 ? obj7 : b0Var2;
            case 3:
                if (cVar instanceof v1) {
                    v1Var = (v1) cVar;
                    int i11 = v1Var.B;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        v1Var.B = i11 - Integer.MIN_VALUE;
                    } else {
                        v1Var = new v1(this, cVar);
                    }
                } else {
                    v1Var = new v1(this, cVar);
                }
                Object obj9 = v1Var.A;
                Object obj10 = l00.a.A;
                int i12 = v1Var.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj9);
                    return b0Var2;
                }
                ri.t1.O(obj9);
                Object obj11 = ((a1) obj).a;
                v1Var.B = 1;
                return jVar2.emit(obj11, v1Var) == obj10 ? obj10 : b0Var2;
            case 4:
                if (cVar instanceof w1) {
                    w1Var = (w1) cVar;
                    int i13 = w1Var.B;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        w1Var.B = i13 - Integer.MIN_VALUE;
                    } else {
                        w1Var = new w1(this, cVar);
                    }
                } else {
                    w1Var = new w1(this, cVar);
                }
                Object obj12 = w1Var.A;
                Object obj13 = l00.a.A;
                int i14 = w1Var.B;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj12);
                    return b0Var2;
                }
                ri.t1.O(obj12);
                Object obj14 = ((a1) obj).a;
                w1Var.B = 1;
                return jVar2.emit(obj14, w1Var) == obj13 ? obj13 : b0Var2;
            case 5:
                if (cVar instanceof x1) {
                    x1Var = (x1) cVar;
                    int i15 = x1Var.B;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        x1Var.B = i15 - Integer.MIN_VALUE;
                    } else {
                        x1Var = new x1(this, cVar);
                    }
                } else {
                    x1Var = new x1(this, cVar);
                }
                Object obj15 = x1Var.A;
                Object obj16 = l00.a.A;
                int i16 = x1Var.B;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj15);
                    return b0Var2;
                }
                ri.t1.O(obj15);
                Object obj17 = ((a1) obj).a;
                if (obj17 == ys.c.DAY) {
                    obj17 = ys.c.WEEK;
                }
                x1Var.B = 1;
                return jVar2.emit(obj17, x1Var) == obj16 ? obj16 : b0Var2;
            case 6:
                if (cVar instanceof z1) {
                    z1Var = (z1) cVar;
                    int i17 = z1Var.B;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        z1Var.B = i17 - Integer.MIN_VALUE;
                    } else {
                        z1Var = new z1(this, cVar);
                    }
                } else {
                    z1Var = new z1(this, cVar);
                }
                Object obj18 = z1Var.A;
                Object obj19 = l00.a.A;
                int i18 = z1Var.B;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj18);
                    return b0Var2;
                }
                ri.t1.O(obj18);
                Object obj20 = (ys.f) ((g00.k) obj).B;
                z1Var.B = 1;
                return jVar2.emit(obj20, z1Var) == obj19 ? obj19 : b0Var2;
            case 7:
                if (cVar instanceof d2) {
                    d2Var = (d2) cVar;
                    int i19 = d2Var.B;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        d2Var.B = i19 - Integer.MIN_VALUE;
                    } else {
                        d2Var = new d2(this, cVar);
                    }
                } else {
                    d2Var = new d2(this, cVar);
                }
                Object obj21 = d2Var.A;
                Object obj22 = l00.a.A;
                int i21 = d2Var.B;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj21);
                    return b0Var2;
                }
                ri.t1.O(obj21);
                mr.g gVar3 = (mr.g) obj;
                if (gVar3 instanceof mr.d) {
                    objValueOf = Boolean.TRUE;
                } else if (gVar3 instanceof mr.f) {
                    mr.f fVar = (mr.f) gVar3;
                    objValueOf = Boolean.valueOf(fVar.a >= ((long) fVar.b));
                } else if (!(gVar3 instanceof mr.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                d2Var.B = 1;
                return jVar2.emit(objValueOf, d2Var) == obj22 ? obj22 : b0Var2;
            case 8:
                if (cVar instanceof e2) {
                    e2Var = (e2) cVar;
                    int i22 = e2Var.B;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        e2Var.B = i22 - Integer.MIN_VALUE;
                    } else {
                        e2Var = new e2(this, cVar);
                    }
                } else {
                    e2Var = new e2(this, cVar);
                }
                Object obj23 = e2Var.A;
                Object obj24 = l00.a.A;
                int i23 = e2Var.B;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj23);
                    return b0Var2;
                }
                ri.t1.O(obj23);
                int[] iArr = new int[24];
                for (rs.c cVar2 : ((k2) obj).c) {
                    int i24 = cVar2.c;
                    if (i24 >= 0 && i24 < 24) {
                        iArr[i24] = iArr[i24] + cVar2.d;
                    }
                }
                int i25 = iArr[0];
                int i26 = 1;
                while (true) {
                    int i27 = iArr[i26];
                    if (i25 < i27) {
                        i25 = i27;
                    }
                    if (i26 != 23) {
                        i26++;
                    } else {
                        if (i25 > 0) {
                            z00.d dVar = (z00.d) h00.n.F0(iArr).iterator();
                            if (dVar.C) {
                                next = dVar.next();
                                if (dVar.C) {
                                    int i28 = iArr[((Number) next).intValue()];
                                    do {
                                        Object next2 = dVar.next();
                                        int i29 = iArr[((Number) next2).intValue()];
                                        if (i28 < i29) {
                                            next = next2;
                                            i28 = i29;
                                        }
                                    } while (dVar.C);
                                }
                            }
                            num = (Integer) next;
                        }
                        z00.e eVarI0 = ab.a0.I0(0, 24);
                        ArrayList arrayList = new ArrayList(h00.r.q0(eVarI0, 10));
                        Iterator it = eVarI0.iterator();
                        while (true) {
                            z00.d dVar2 = (z00.d) it;
                            if (!dVar2.C) {
                                Object aVar = new ys.a(g4.d0(arrayList), num);
                                e2Var.B = 1;
                                return jVar2.emit(aVar, e2Var) == obj24 ? obj24 : b0Var2;
                            }
                            int i31 = iArr[dVar2.nextInt()];
                            if (i31 == 0 || i25 == 0) {
                                i = 0;
                            } else if (i25 <= 0) {
                                i = 1;
                            } else {
                                double d = ((double) i31) / ((double) i25);
                                if (d > 0.66d) {
                                    i = 3;
                                } else if (d > 0.33d) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                            }
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                }
                break;
            case 9:
                if (cVar instanceof bv.c2) {
                    c2Var = (bv.c2) cVar;
                    int i32 = c2Var.B;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        c2Var.B = i32 - Integer.MIN_VALUE;
                    } else {
                        c2Var = new bv.c2(this, cVar);
                    }
                } else {
                    c2Var = new bv.c2(this, cVar);
                }
                Object obj25 = c2Var.A;
                Object obj26 = l00.a.A;
                int i33 = c2Var.B;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj25);
                    return b0Var2;
                }
                ri.t1.O(obj25);
                bv.o1 o1Var = (bv.o1) obj;
                Object aVar2 = new cv.a(o1Var.C && !o1Var.v && (o1Var.t != yu.g.D || o1Var.Q), !o1Var.g || o1Var.R || o1Var.w || o1Var.y || o1Var.z || o1Var.A || o1Var.S || o1Var.T || o1Var.V || o1Var.Z != null || o1Var.U != null);
                c2Var.B = 1;
                return jVar2.emit(aVar2, c2Var) == obj26 ? obj26 : b0Var2;
            case 10:
                if (cVar instanceof bv.f2) {
                    f2Var = (bv.f2) cVar;
                    int i34 = f2Var.B;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        f2Var.B = i34 - Integer.MIN_VALUE;
                    } else {
                        f2Var = new bv.f2(this, cVar);
                    }
                } else {
                    f2Var = new bv.f2(this, cVar);
                }
                Object obj27 = f2Var.A;
                Object obj28 = l00.a.A;
                int i35 = f2Var.B;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj27);
                    return b0Var2;
                }
                ri.t1.O(obj27);
                PlayerItem playerItem = (PlayerItem) obj;
                Object kVar = new g00.k(playerItem != null ? new Long(playerItem.getSurahId()) : null, playerItem != null ? new Integer(playerItem.getSurahNumber()) : null);
                f2Var.B = 1;
                return jVar2.emit(kVar, f2Var) == obj28 ? obj28 : b0Var2;
            case 11:
                if (cVar instanceof bv.g2) {
                    g2Var = (bv.g2) cVar;
                    int i36 = g2Var.B;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        g2Var.B = i36 - Integer.MIN_VALUE;
                    } else {
                        g2Var = new bv.g2(this, cVar);
                    }
                } else {
                    g2Var = new bv.g2(this, cVar);
                }
                Object obj29 = g2Var.A;
                Object obj30 = l00.a.A;
                int i37 = g2Var.B;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj29);
                    return b0Var2;
                }
                ri.t1.O(obj29);
                Object obj31 = ((bv.o1) obj).E;
                g2Var.B = 1;
                return jVar2.emit(obj31, g2Var) == obj30 ? obj30 : b0Var2;
            case 12:
                if (cVar instanceof bv.k2) {
                    k2Var = (bv.k2) cVar;
                    int i38 = k2Var.B;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        k2Var.B = i38 - Integer.MIN_VALUE;
                    } else {
                        k2Var = new bv.k2(this, cVar);
                    }
                } else {
                    k2Var = new bv.k2(this, cVar);
                }
                Object obj32 = k2Var.A;
                Object obj33 = l00.a.A;
                int i39 = k2Var.B;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj32);
                    return b0Var2;
                }
                ri.t1.O(obj32);
                PlayerItem playerItem2 = (PlayerItem) obj;
                Object num3 = playerItem2 != null ? new Integer(playerItem2.getSurahNumber()) : null;
                k2Var.B = 1;
                return jVar2.emit(num3, k2Var) == obj33 ? obj33 : b0Var2;
            case 13:
                if (cVar instanceof bv.l2) {
                    l2Var = (bv.l2) cVar;
                    int i41 = l2Var.B;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        l2Var.B = i41 - Integer.MIN_VALUE;
                    } else {
                        l2Var = new bv.l2(this, cVar);
                    }
                } else {
                    l2Var = new bv.l2(this, cVar);
                }
                Object obj34 = l2Var.A;
                Object obj35 = l00.a.A;
                int i42 = l2Var.B;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj34);
                    return b0Var2;
                }
                ri.t1.O(obj34);
                Object objValueOf2 = Boolean.valueOf(((bv.o1) obj).D);
                l2Var.B = 1;
                return jVar2.emit(objValueOf2, l2Var) == obj35 ? obj35 : b0Var2;
            case 14:
                if (cVar instanceof bv.m2) {
                    m2Var = (bv.m2) cVar;
                    int i43 = m2Var.B;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        m2Var.B = i43 - Integer.MIN_VALUE;
                    } else {
                        m2Var = new bv.m2(this, cVar);
                    }
                } else {
                    m2Var = new bv.m2(this, cVar);
                }
                Object obj36 = m2Var.A;
                Object obj37 = l00.a.A;
                int i44 = m2Var.B;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj36);
                    return b0Var2;
                }
                ri.t1.O(obj36);
                PlayerItem playerItem3 = (PlayerItem) obj;
                Object num4 = playerItem3 != null ? new Integer(playerItem3.getSurahNumber()) : null;
                m2Var.B = 1;
                return jVar2.emit(num4, m2Var) == obj37 ? obj37 : b0Var2;
            case 15:
                if (cVar instanceof bv.n2) {
                    n2Var = (bv.n2) cVar;
                    int i45 = n2Var.B;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        n2Var.B = i45 - Integer.MIN_VALUE;
                    } else {
                        n2Var = new bv.n2(this, cVar);
                    }
                } else {
                    n2Var = new bv.n2(this, cVar);
                }
                Object obj38 = n2Var.A;
                Object obj39 = l00.a.A;
                int i46 = n2Var.B;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj38);
                    return b0Var2;
                }
                ri.t1.O(obj38);
                Object objValueOf3 = Boolean.valueOf(((bv.o1) obj).D);
                n2Var.B = 1;
                return jVar2.emit(objValueOf3, n2Var) == obj39 ? obj39 : b0Var2;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                if (cVar instanceof d40.o0) {
                    o0Var = (d40.o0) cVar;
                    int i47 = o0Var.B;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        o0Var.B = i47 - Integer.MIN_VALUE;
                    } else {
                        o0Var = new d40.o0(this, cVar);
                    }
                } else {
                    o0Var = new d40.o0(this, cVar);
                }
                Object obj40 = o0Var.A;
                Object obj41 = l00.a.A;
                int i48 = o0Var.B;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj40);
                    return b0Var2;
                }
                ri.t1.O(obj40);
                if (obj == null) {
                    return b0Var2;
                }
                o0Var.B = 1;
                return jVar2.emit(obj, o0Var) == obj41 ? obj41 : b0Var2;
            case 17:
                if (cVar instanceof dq.j) {
                    jVar = (dq.j) cVar;
                    int i49 = jVar.B;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        jVar.B = i49 - Integer.MIN_VALUE;
                    } else {
                        jVar = new dq.j(this, cVar);
                    }
                } else {
                    jVar = new dq.j(this, cVar);
                }
                Object obj42 = jVar.A;
                Object obj43 = l00.a.A;
                int i50 = jVar.B;
                if (i50 != 0) {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj42);
                    return b0Var2;
                }
                ri.t1.O(obj42);
                Object objValueOf4 = Boolean.valueOf(((ho.p) obj).a != null);
                jVar.B = 1;
                return jVar2.emit(objValueOf4, jVar) == obj43 ? obj43 : b0Var2;
            case 18:
                if (cVar instanceof ev.o) {
                    oVar = (ev.o) cVar;
                    int i51 = oVar.B;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        oVar.B = i51 - Integer.MIN_VALUE;
                    } else {
                        oVar = new ev.o(this, cVar);
                    }
                } else {
                    oVar = new ev.o(this, cVar);
                }
                Object obj44 = oVar.A;
                Object obj45 = l00.a.A;
                int i52 = oVar.B;
                if (i52 != 0) {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj44);
                    return b0Var2;
                }
                ri.t1.O(obj44);
                if (!((Boolean) obj).booleanValue()) {
                    return b0Var2;
                }
                oVar.B = 1;
                return jVar2.emit(obj, oVar) == obj45 ? obj45 : b0Var2;
            case 19:
                if (cVar instanceof ev.a0) {
                    a0Var = (ev.a0) cVar;
                    int i53 = a0Var.B;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        a0Var.B = i53 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new ev.a0(this, cVar);
                    }
                } else {
                    a0Var = new ev.a0(this, cVar);
                }
                Object obj46 = a0Var.A;
                Object obj47 = l00.a.A;
                int i54 = a0Var.B;
                if (i54 != 0) {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj46);
                    return b0Var2;
                }
                ri.t1.O(obj46);
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new ev.w((bx.c) it2.next()));
                }
                a0Var.B = 1;
                return jVar2.emit(arrayList2, a0Var) == obj47 ? obj47 : b0Var2;
            case 20:
                if (cVar instanceof hb.q) {
                    qVar = (hb.q) cVar;
                    int i55 = ((hb.q) qVar).B;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ((hb.q) qVar).B = i55 - Integer.MIN_VALUE;
                    } else {
                        qVar = new hb.q(this, cVar);
                    }
                } else {
                    qVar = new hb.q(this, cVar);
                }
                Object obj48 = ((hb.q) qVar).A;
                Object obj49 = l00.a.A;
                int i56 = ((hb.q) qVar).B;
                if (i56 != 0) {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj48);
                    return b0Var2;
                }
                ri.t1.O(obj48);
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(h00.r.q0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((hb.o) it3.next()).a());
                }
                ((hb.q) qVar).B = 1;
                return jVar2.emit(arrayList3, qVar) == obj49 ? obj49 : b0Var2;
            case 21:
                if (cVar instanceof is.b) {
                    bVar = (is.b) cVar;
                    int i57 = bVar.B;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bVar.B = i57 - Integer.MIN_VALUE;
                    } else {
                        bVar = new is.b(this, cVar);
                    }
                } else {
                    bVar = new is.b(this, cVar);
                }
                Object obj50 = bVar.A;
                Object obj51 = l00.a.A;
                int i58 = bVar.B;
                if (i58 != 0) {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj50);
                    return b0Var2;
                }
                ri.t1.O(obj50);
                List<gs.a> list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(h00.r.q0(list3, 10));
                for (gs.a from : list3) {
                    kotlin.jvm.internal.m.e(from, "from");
                    arrayList4.add(new rs.a(from.a, from.b, from.c, from.d, from.e));
                }
                bVar.B = 1;
                return jVar2.emit(arrayList4, bVar) == obj51 ? obj51 : b0Var2;
            case 22:
                if (cVar instanceof is.e) {
                    eVar = (is.e) cVar;
                    int i59 = eVar.B;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        eVar.B = i59 - Integer.MIN_VALUE;
                    } else {
                        eVar = new is.e(this, cVar);
                    }
                } else {
                    eVar = new is.e(this, cVar);
                }
                Object obj52 = eVar.A;
                Object obj53 = l00.a.A;
                int i60 = eVar.B;
                if (i60 != 0) {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj52);
                    return b0Var2;
                }
                ri.t1.O(obj52);
                List<gs.b> list4 = (List) obj;
                ArrayList arrayList5 = new ArrayList(h00.r.q0(list4, 10));
                for (gs.b from2 : list4) {
                    kotlin.jvm.internal.m.e(from2, "from");
                    arrayList5.add(new rs.b(from2.a, from2.b, from2.c, from2.d, from2.e, from2.f));
                }
                eVar.B = 1;
                return jVar2.emit(arrayList5, eVar) == obj53 ? obj53 : b0Var2;
            case 23:
                if (cVar instanceof is.i) {
                    iVar = (is.i) cVar;
                    int i61 = iVar.B;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        iVar.B = i61 - Integer.MIN_VALUE;
                    } else {
                        iVar = new is.i(this, cVar);
                    }
                } else {
                    iVar = new is.i(this, cVar);
                }
                Object obj54 = iVar.A;
                Object obj55 = l00.a.A;
                int i62 = iVar.B;
                if (i62 != 0) {
                    if (i62 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj54);
                    return b0Var2;
                }
                ri.t1.O(obj54);
                List list5 = (List) obj;
                ArrayList arrayList6 = new ArrayList(h00.r.q0(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(fs.c.X((gs.c) it4.next()));
                }
                iVar.B = 1;
                return jVar2.emit(arrayList6, iVar) == obj55 ? obj55 : b0Var2;
            case 24:
                if (cVar instanceof is.l) {
                    lVar = (is.l) cVar;
                    int i63 = lVar.B;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        lVar.B = i63 - Integer.MIN_VALUE;
                    } else {
                        lVar = new is.l(this, cVar);
                    }
                } else {
                    lVar = new is.l(this, cVar);
                }
                Object obj56 = lVar.A;
                Object obj57 = l00.a.A;
                int i64 = lVar.B;
                if (i64 != 0) {
                    if (i64 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj56);
                    return b0Var2;
                }
                ri.t1.O(obj56);
                List<gs.d> list6 = (List) obj;
                ArrayList arrayList7 = new ArrayList(h00.r.q0(list6, 10));
                for (gs.d from3 : list6) {
                    kotlin.jvm.internal.m.e(from3, "from");
                    arrayList7.add(new rs.d(from3.a, from3.b, from3.c, from3.d, from3.e, from3.f, from3.g));
                    i3 = 1;
                }
                lVar.B = i3;
                return jVar2.emit(arrayList7, lVar) == obj57 ? obj57 : b0Var2;
            case 25:
                if (cVar instanceof is.o) {
                    oVar2 = (is.o) cVar;
                    int i65 = oVar2.B;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        oVar2.B = i65 - Integer.MIN_VALUE;
                    } else {
                        oVar2 = new is.o(this, cVar);
                    }
                } else {
                    oVar2 = new is.o(this, cVar);
                }
                Object obj58 = oVar2.A;
                Object obj59 = l00.a.A;
                int i66 = oVar2.B;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj58);
                    return b0Var2;
                }
                ri.t1.O(obj58);
                if (!((Boolean) obj).booleanValue()) {
                    return b0Var2;
                }
                oVar2.B = 1;
                return jVar2.emit(obj, oVar2) == obj59 ? obj59 : b0Var2;
            case 26:
                if (cVar instanceof is.b0) {
                    b0Var = (is.b0) cVar;
                    int i67 = b0Var.B;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        b0Var.B = i67 - Integer.MIN_VALUE;
                    } else {
                        b0Var = new is.b0(this, cVar);
                    }
                } else {
                    b0Var = new is.b0(this, cVar);
                }
                Object obj60 = b0Var.A;
                Object obj61 = l00.a.A;
                int i68 = b0Var.B;
                if (i68 != 0) {
                    if (i68 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj60);
                    return b0Var2;
                }
                ri.t1.O(obj60);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj62 : (List) obj) {
                    if (is.c0.c((gs.e) obj62)) {
                        arrayList8.add(obj62);
                    }
                }
                ArrayList arrayList9 = new ArrayList(h00.r.q0(arrayList8, 10));
                Iterator it5 = arrayList8.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(fs.f.X((gs.e) it5.next()));
                }
                b0Var.B = 1;
                return jVar2.emit(arrayList9, b0Var) == obj61 ? obj61 : b0Var2;
            case 27:
                if (cVar instanceof iv.g) {
                    gVar = (iv.g) cVar;
                    int i69 = gVar.B;
                    if ((i69 & Integer.MIN_VALUE) != 0) {
                        gVar.B = i69 - Integer.MIN_VALUE;
                    } else {
                        gVar = new iv.g(this, cVar);
                    }
                } else {
                    gVar = new iv.g(this, cVar);
                }
                Object obj63 = gVar.A;
                Object obj64 = l00.a.A;
                int i70 = gVar.B;
                if (i70 != 0) {
                    if (i70 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj63);
                    return b0Var2;
                }
                ri.t1.O(obj63);
                if (((Boolean) obj).booleanValue()) {
                    return b0Var2;
                }
                gVar.B = 1;
                return jVar2.emit(obj, gVar) == obj64 ? obj64 : b0Var2;
            case 28:
                return b(obj, cVar);
            default:
                if (cVar instanceof mb.p) {
                    pVar = (mb.p) cVar;
                    int i71 = ((mb.p) pVar).B;
                    if ((i71 & Integer.MIN_VALUE) != 0) {
                        ((mb.p) pVar).B = i71 - Integer.MIN_VALUE;
                    } else {
                        pVar = new mb.p(this, cVar);
                    }
                } else {
                    pVar = new mb.p(this, cVar);
                }
                Object obj65 = ((mb.p) pVar).A;
                Object obj66 = l00.a.A;
                int i72 = ((mb.p) pVar).B;
                if (i72 != 0) {
                    if (i72 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj65);
                    return b0Var2;
                }
                ri.t1.O(obj65);
                long j = ((y3.a) obj).a;
                xb.e eVar2 = mb.c0.b;
                int i73 = (int) (3 & j);
                int i74 = (((2 & i73) >> 1) * 3) + ((i73 & 1) << 1);
                if (!(((((int) (j >> 33)) & ((1 << (i74 + 13)) - 1)) - 1 == 0) | ((((1 << (18 - i74)) - 1) & ((int) (j >> (i74 + 46)))) - 1 == 0))) {
                    boolean zD = y3.a.d(j);
                    xb.a aVar3 = xb.b.a;
                    xb.a aVar4 = zD ? new xb.a(y3.a.h(j)) : aVar3;
                    if (y3.a.c(j)) {
                        aVar3 = new xb.a(y3.a.g(j));
                    }
                    gVar2 = new xb.g(aVar4, aVar3);
                }
                if (gVar2 == null) {
                    return b0Var2;
                }
                ((mb.p) pVar).B = 1;
                return jVar2.emit(gVar2, pVar) == obj66 ? obj66 : b0Var2;
        }
    }
}
