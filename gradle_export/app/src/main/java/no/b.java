package no;

import com.mchutov.quranify.FavoriteReciterModel;
import com.mchutov.quranify.PlaylistsModel;
import com.mchutov.quranify.RecentReciterModel;
import g00.b0;
import h00.q;
import h00.r;
import ho.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lo.t;
import oo.b1;
import oo.e1;
import qo.x;
import ri.t1;
import su.s;
import za.g0;
import za.h0;

public final class b implements d40.j {
    public final int A;
    public final d40.j B;

    public b(d40.j jVar, int i) {
        this.A = i;
        this.B = jVar;
    }

    public b(d40.j jVar, Object obj, int i) {
        this.A = i;
        this.B = jVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        a aVar;
        nv.h hVar;
        b1 b1Var;
        e1 e1Var;
        x xVar;
        k00.c gVar;
        tq.d dVar;
        tq.i iVar;
        ut.f fVar;
        vn.l lVar;
        Integer numY0;
        ho.f fVar2;
        Integer num;
        Object objValueOf;
        Object obj2;
        Iterator it;
        String str;
        String strR0;
        Integer numY1;
        vr.b bVar;
        xw.c cVar2;
        yv.b bVar2;
        int i = this.A;
        Integer num2 = null;
        b0 b0Var = b0.a;
        d40.j jVar = this.B;
        switch (i) {
            case 0:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i2 = aVar.B;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.B = i2 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, cVar);
                    }
                } else {
                    aVar = new a(this, cVar);
                }
                Object obj3 = aVar.A;
                l00.a aVar2 = l00.a.A;
                int i3 = aVar.B;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj3);
                    return b0Var;
                }
                t1.O(obj3);
                if (!((Boolean) obj).booleanValue()) {
                    return b0Var;
                }
                aVar.B = 1;
                return jVar.emit(obj, aVar) == aVar2 ? aVar2 : b0Var;
            case 1:
                if (cVar instanceof nv.h) {
                    hVar = (nv.h) cVar;
                    int i4 = hVar.B;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        hVar.B = i4 - Integer.MIN_VALUE;
                    } else {
                        hVar = new nv.h(this, cVar);
                    }
                } else {
                    hVar = new nv.h(this, cVar);
                }
                Object obj4 = hVar.A;
                l00.a aVar3 = l00.a.A;
                int i5 = hVar.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj4);
                    return b0Var;
                }
                t1.O(obj4);
                Boolean boolValueOf = Boolean.valueOf(((s) obj) != null);
                hVar.B = 1;
                return jVar.emit(boolValueOf, hVar) == aVar3 ? aVar3 : b0Var;
            case 2:
                if (cVar instanceof b1) {
                    b1Var = (b1) cVar;
                    int i6 = b1Var.B;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        b1Var.B = i6 - Integer.MIN_VALUE;
                    } else {
                        b1Var = new b1(this, cVar);
                    }
                } else {
                    b1Var = new b1(this, cVar);
                }
                Object obj5 = b1Var.A;
                l00.a aVar4 = l00.a.A;
                int i7 = b1Var.B;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj5);
                    return b0Var;
                }
                t1.O(obj5);
                p pVar = (p) obj;
                t tVar = new t(pVar.d, pVar.e);
                b1Var.B = 1;
                return jVar.emit(tVar, b1Var) == aVar4 ? aVar4 : b0Var;
            case 3:
                if (cVar instanceof e1) {
                    e1Var = (e1) cVar;
                    int i8 = e1Var.B;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        e1Var.B = i8 - Integer.MIN_VALUE;
                    } else {
                        e1Var = new e1(this, cVar);
                    }
                } else {
                    e1Var = new e1(this, cVar);
                }
                Object obj6 = e1Var.A;
                l00.a aVar5 = l00.a.A;
                int i9 = e1Var.B;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj6);
                    return b0Var;
                }
                t1.O(obj6);
                p pVarA = p.a((p) obj, null, null, false, 0L, 0L, 0.0f, null, false, 231);
                e1Var.B = 1;
                return jVar.emit(pVarA, e1Var) == aVar5 ? aVar5 : b0Var;
            case 4:
                if (cVar instanceof x) {
                    xVar = (x) cVar;
                    int i11 = xVar.B;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        xVar.B = i11 - Integer.MIN_VALUE;
                    } else {
                        xVar = new x(this, cVar);
                    }
                } else {
                    xVar = new x(this, cVar);
                }
                Object obj7 = xVar.A;
                l00.a aVar6 = l00.a.A;
                int i12 = xVar.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj7);
                    return b0Var;
                }
                t1.O(obj7);
                p pVar2 = (p) obj;
                ho.a aVar7 = pVar2.a;
                if (aVar7 != null) {
                    Integer num3 = new Integer(aVar7.a);
                    if (pVar2.c) {
                        num2 = num3;
                    }
                }
                xVar.B = 1;
                return jVar.emit(num2, xVar) == aVar6 ? aVar6 : b0Var;
            case 5:
                if (cVar instanceof r9.g) {
                    gVar = (r9.g) cVar;
                    int i13 = ((r9.g) gVar).B;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ((r9.g) gVar).B = i13 - Integer.MIN_VALUE;
                    } else {
                        gVar = new r9.g(this, cVar);
                    }
                } else {
                    gVar = new r9.g(this, cVar);
                }
                Object obj8 = ((r9.g) gVar).A;
                l00.a aVar8 = l00.a.A;
                int i14 = ((r9.g) gVar).B;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj8);
                    return b0Var;
                }
                t1.O(obj8);
                if (((Boolean) obj).booleanValue()) {
                    return b0Var;
                }
                ((r9.g) gVar).B = 1;
                return jVar.emit(obj, gVar) == aVar8 ? aVar8 : b0Var;
            case 6:
                if (cVar instanceof tq.d) {
                    dVar = (tq.d) cVar;
                    int i15 = dVar.B;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        dVar.B = i15 - Integer.MIN_VALUE;
                    } else {
                        dVar = new tq.d(this, cVar);
                    }
                } else {
                    dVar = new tq.d(this, cVar);
                }
                Object obj9 = dVar.A;
                l00.a aVar9 = l00.a.A;
                int i16 = dVar.B;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj9);
                    return b0Var;
                }
                t1.O(obj9);
                List<sq.a> list = (List) obj;
                ArrayList arrayList = new ArrayList(r.q0(list, 10));
                for (sq.a from : list) {
                    kotlin.jvm.internal.m.e(from, "from");
                    arrayList.add(new zq.a(from.a, from.b, from.c, from.d));
                }
                dVar.B = 1;
                return jVar.emit(arrayList, dVar) == aVar9 ? aVar9 : b0Var;
            case 7:
                if (cVar instanceof tq.i) {
                    iVar = (tq.i) cVar;
                    int i17 = iVar.B;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        iVar.B = i17 - Integer.MIN_VALUE;
                    } else {
                        iVar = new tq.i(this, cVar);
                    }
                } else {
                    iVar = new tq.i(this, cVar);
                }
                Object obj10 = iVar.A;
                l00.a aVar10 = l00.a.A;
                int i18 = iVar.B;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj10);
                    return b0Var;
                }
                t1.O(obj10);
                FavoriteReciterModel from2 = (FavoriteReciterModel) obj;
                kotlin.jvm.internal.m.e(from2, "from");
                List<Integer> favoriteRecitersList = from2.getFavoriteRecitersList();
                kotlin.jvm.internal.m.d(favoriteRecitersList, "getFavoriteRecitersList(...)");
                iVar.B = 1;
                return jVar.emit(favoriteRecitersList, iVar) == aVar10 ? aVar10 : b0Var;
            case 8:
                if (cVar instanceof ut.f) {
                    fVar = (ut.f) cVar;
                    int i19 = fVar.B;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        fVar.B = i19 - Integer.MIN_VALUE;
                    } else {
                        fVar = new ut.f(this, cVar);
                    }
                } else {
                    fVar = new ut.f(this, cVar);
                }
                Object obj11 = fVar.A;
                l00.a aVar11 = l00.a.A;
                int i21 = fVar.B;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj11);
                    return b0Var;
                }
                t1.O(obj11);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj12 : (List) obj) {
                    g0 g0Var = ((h0) obj12).b;
                    if (g0Var == g0.B || g0Var == g0.A || g0Var == g0.E) {
                        arrayList2.add(obj12);
                    }
                }
                List listI1 = q.i1(arrayList2, p30.f.Y(ut.g.B, ut.g.C));
                fVar.B = 1;
                return jVar.emit(listI1, fVar) == aVar11 ? aVar11 : b0Var;
            case 9:
                if (cVar instanceof vn.l) {
                    lVar = (vn.l) cVar;
                    int i22 = lVar.B;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        lVar.B = i22 - Integer.MIN_VALUE;
                    } else {
                        lVar = new vn.l(this, cVar);
                    }
                } else {
                    lVar = new vn.l(this, cVar);
                }
                Object obj13 = lVar.A;
                l00.a aVar12 = l00.a.A;
                int i23 = lVar.B;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj13);
                    return b0Var;
                }
                t1.O(obj13);
                ArrayList<h0> arrayList3 = new ArrayList();
                for (Object obj14 : (List) obj) {
                    if (!((h0) obj14).b.a()) {
                        arrayList3.add(obj14);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (h0 h0Var : arrayList3) {
                    HashSet hashSet = h0Var.c;
                    za.g gVar2 = h0Var.e;
                    Iterator it2 = hashSet.iterator();
                    do {
                        if (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            String strR1 = r30.k.R0(str2, "audio_story:");
                            if (!r30.r.x0(str2, "audio_story:", false)) {
                                strR1 = null;
                            }
                            numY0 = strR1 != null ? r30.r.y0(strR1) : null;
                        } else {
                            numY0 = null;
                        }
                        if (numY0 != null) {
                            int iIntValue = numY0.intValue();
                            num = new Integer(gVar2.a("episodeId", -1));
                            if (num.intValue() == -1) {
                                num = null;
                            }
                            if (num == null) {
                                it = h0Var.c.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        str = (String) it.next();
                                        strR0 = r30.k.R0(str, "audio_story_episode:");
                                        if (!r30.r.x0(str, "audio_story_episode:", false)) {
                                            strR0 = null;
                                        }
                                        if (strR0 != null) {
                                            numY1 = r30.r.y0(strR0);
                                        } else {
                                            numY1 = null;
                                        }
                                        if (numY1 != null) {
                                            num = numY1;
                                        }
                                    } else {
                                        num = null;
                                    }
                                }
                            }
                            objValueOf = Float.valueOf(0.0f);
                            obj2 = gVar2.a.get("progress");
                            if (obj2 instanceof Float) {
                                objValueOf = obj2;
                            }
                            fVar2 = new ho.f(iIntValue, num, ((Number) objValueOf).floatValue());
                        } else {
                            fVar2 = null;
                        }
                        if (fVar2 != null) {
                            arrayList4.add(fVar2);
                        }
                    } while (numY0 == null);
                    if (numY0 != null) {
                        int iIntValue2 = numY0.intValue();
                        num = new Integer(gVar2.a("episodeId", -1));
                        if (num.intValue() == -1) {
                            num = null;
                        }
                        if (num == null) {
                            it = h0Var.c.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    str = (String) it.next();
                                    strR0 = r30.k.R0(str, "audio_story_episode:");
                                    if (!r30.r.x0(str, "audio_story_episode:", false)) {
                                        strR0 = null;
                                    }
                                    if (strR0 != null) {
                                        numY1 = r30.r.y0(strR0);
                                    } else {
                                        numY1 = null;
                                    }
                                    if (numY1 != null) {
                                        num = numY1;
                                    }
                                } else {
                                    num = null;
                                }
                            }
                        }
                        objValueOf = Float.valueOf(0.0f);
                        obj2 = gVar2.a.get("progress");
                        if (obj2 instanceof Float) {
                            objValueOf = obj2;
                        }
                        fVar2 = new ho.f(iIntValue2, num, ((Number) objValueOf).floatValue());
                    } else {
                        fVar2 = null;
                    }
                    if (fVar2 != null) {
                        arrayList4.add(fVar2);
                    }
                }
                lVar.B = 1;
                return jVar.emit(arrayList4, lVar) == aVar12 ? aVar12 : b0Var;
            case 10:
                if (cVar instanceof vr.b) {
                    bVar = (vr.b) cVar;
                    int i24 = bVar.B;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        bVar.B = i24 - Integer.MIN_VALUE;
                    } else {
                        bVar = new vr.b(this, cVar);
                    }
                } else {
                    bVar = new vr.b(this, cVar);
                }
                Object obj15 = bVar.A;
                l00.a aVar13 = l00.a.A;
                int i25 = bVar.B;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj15);
                    return b0Var;
                }
                t1.O(obj15);
                p pVar3 = (p) obj;
                ho.a aVar14 = pVar3.a;
                if (aVar14 != null) {
                    Integer num4 = new Integer(aVar14.a);
                    if (pVar3.c) {
                        num2 = num4;
                    }
                }
                bVar.B = 1;
                return jVar.emit(num2, bVar) == aVar13 ? aVar13 : b0Var;
            case 11:
                if (cVar instanceof xw.c) {
                    cVar2 = (xw.c) cVar;
                    int i26 = cVar2.B;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        cVar2.B = i26 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new xw.c(this, cVar);
                    }
                } else {
                    cVar2 = new xw.c(this, cVar);
                }
                Object obj16 = cVar2.A;
                l00.a aVar15 = l00.a.A;
                int i27 = cVar2.B;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj16);
                    return b0Var;
                }
                t1.O(obj16);
                RecentReciterModel from3 = (RecentReciterModel) obj;
                kotlin.jvm.internal.m.e(from3, "from");
                List<Integer> recentRecitersList = from3.getRecentRecitersList();
                kotlin.jvm.internal.m.d(recentRecitersList, "getRecentRecitersList(...)");
                cVar2.B = 1;
                return jVar.emit(recentRecitersList, cVar2) == aVar15 ? aVar15 : b0Var;
            default:
                if (cVar instanceof yv.b) {
                    bVar2 = (yv.b) cVar;
                    int i28 = bVar2.B;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        bVar2.B = i28 - Integer.MIN_VALUE;
                    } else {
                        bVar2 = new yv.b(this, cVar);
                    }
                } else {
                    bVar2 = new yv.b(this, cVar);
                }
                Object obj17 = bVar2.A;
                l00.a aVar16 = l00.a.A;
                int i29 = bVar2.B;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj17);
                    return b0Var;
                }
                t1.O(obj17);
                ArrayList arrayListX = vv.b.X((PlaylistsModel) obj);
                bVar2.B = 1;
                return jVar.emit(arrayListX, bVar2) == aVar16 ? aVar16 : b0Var;
        }
    }
}
