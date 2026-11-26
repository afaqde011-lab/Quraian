package nn;

import a40.c0;
import android.util.Log;
import bt.y1;
import com.google.android.gms.internal.measurement.b5;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d40.o;
import g00.b0;
import h00.q;
import h00.r;
import h00.x;
import is.w0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.TimeoutCancellationException;
import ri.t1;
import ut.p;
import uu.w;

public final class j {
    public final d a;
    public final xv.c b;
    public final cw.a c;
    public final sn.c d;
    public final uu.a e;
    public final xw.k f;
    public final tq.k g;
    public final zt.a h;
    public final qu.a i;
    public final tk.c j;

    public j(d dVar, xv.c cVar, cw.a aVar, sn.c cVar2, uu.a aVar2, xw.k kVar, tq.k kVar2, zt.a aVar3, qu.a aVar4, tk.c cVar3) {
        this.a = dVar;
        this.b = cVar;
        this.c = aVar;
        this.d = cVar2;
        this.e = aVar2;
        this.f = kVar;
        this.g = kVar2;
        this.h = aVar3;
        this.i = aVar4;
        this.j = cVar3;
    }

    public static final Serializable a(j jVar, int i, m00.c cVar) {
        e eVar;
        int i2;
        j jVar2;
        bx.c cVar2;
        Set setR1;
        Object objI;
        Set set;
        j jVar3;
        List list;
        bx.b bVarA;
        u30.b bVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i3 = eVar.H;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.H = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new e(jVar, cVar);
            }
        } else {
            eVar = new e(jVar, cVar);
        }
        Object objD = eVar.F;
        l00.a aVar = l00.a.A;
        int i4 = eVar.H;
        ?? r6 = x.A;
        if (i4 == 0) {
            t1.O(objD);
            xw.k kVar = jVar.f;
            eVar.C = jVar;
            eVar.A = i;
            i2 = 0;
            eVar.B = 0;
            eVar.H = 1;
            objD = kVar.d(i, eVar);
            if (objD != aVar) {
            }
            return aVar;
        }
        if (i4 == 1) {
            int i5 = eVar.B;
            i = eVar.A;
            j jVar4 = eVar.C;
            t1.O(objD);
            i2 = i5;
            jVar = jVar4;
        } else {
            if (i4 == 2) {
                int i6 = eVar.B;
                i = eVar.A;
                bx.c cVar3 = (bx.c) eVar.D;
                jVar2 = eVar.C;
                t1.O(objD);
                i2 = i6;
                cVar2 = cVar3;
                setR1 = q.r1((Iterable) objD);
                if (!setR1.isEmpty()) {
                    zt.a aVar2 = jVar2.h;
                    eVar.C = jVar2;
                    eVar.D = setR1;
                    eVar.E = cVar2;
                    eVar.A = i;
                    eVar.B = i2;
                    eVar.H = 3;
                    objI = ((p) aVar2).i(eVar);
                    if (objI != aVar) {
                        objD = objI;
                        set = setR1;
                        jVar3 = jVar2;
                    }
                    return aVar;
                }
                return r6;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = eVar.E;
            set = (Set) eVar.D;
            jVar3 = eVar.C;
            t1.O(objD);
        }
        list = (List) objD;
        bVarA = cVar2.a();
        if (bVarA != null) {
            bVar = bVarA.e;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            r6 = bVar;
        }
        arrayList = new ArrayList();
        for (Object obj : r6) {
            if (set.contains(new Long(((bx.f) obj).a))) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList(r.q0(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(jVar3.i.X(new ru.b(cVar2, (bx.f) it.next(), null, list)));
        }
        return arrayList2;
        bx.c cVar4 = (bx.c) objD;
        if (cVar4 != null) {
            w0 w0Var = new w0(jVar.g.c(), i, 1);
            eVar.C = jVar;
            eVar.D = cVar4;
            eVar.A = i;
            eVar.B = i2;
            eVar.H = 2;
            Object objS = o.s(w0Var, eVar);
            if (objS != aVar) {
                jVar2 = jVar;
                cVar2 = cVar4;
                objD = objS;
                setR1 = q.r1((Iterable) objD);
                if (!setR1.isEmpty()) {
                    zt.a aVar3 = jVar2.h;
                    eVar.C = jVar2;
                    eVar.D = setR1;
                    eVar.E = cVar2;
                    eVar.A = i;
                    eVar.B = i2;
                    eVar.H = 3;
                    objI = ((p) aVar3).i(eVar);
                    if (objI != aVar) {
                        objD = objI;
                        set = setR1;
                        jVar3 = jVar2;
                        list = (List) objD;
                        bVarA = cVar2.a();
                        if (bVarA != null) {
                            bVar = bVarA.e;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            r6 = bVar;
                        }
                        arrayList = new ArrayList();
                        while (r3.hasNext()) {
                            if (set.contains(new Long(((bx.f) obj).a))) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(r.q0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(jVar3.i.X(new ru.b(cVar2, (bx.f) it.next(), null, list)));
                        }
                        return arrayList2;
                    }
                }
            }
            return aVar;
        }
        return r6;
    }

    public static final boolean b(j jVar, Integer num, int i) {
        w wVar = (w) jVar.e;
        PlayerItem playerItem = (PlayerItem) wVar.C.getValue();
        if (playerItem != null && ((Boolean) wVar.G.getValue()).booleanValue()) {
            return m.a(b5.I(playerItem.getReciterId(), playerItem.getCollectionId()), b5.I(i, num));
        }
        return false;
    }

    public static final Object c(j jVar, int i, int i2, int i3, Long l, m00.c cVar) {
        g gVar;
        Long l2;
        int i4;
        int i5;
        int i6;
        Object next;
        int i7;
        dw.a aVar;
        int i8;
        Long l3;
        int i9;
        List list;
        ArrayList arrayList;
        Iterator it;
        b0 b0Var;
        Iterator it2;
        Object next2;
        PlayerItem playerItem;
        uu.a aVar2;
        Iterator it3;
        Object next3;
        PlayerItem playerItem2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.H;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.H = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(jVar, cVar);
            }
        } else {
            gVar = new g(jVar, cVar);
        }
        Object objS = gVar.F;
        l00.a aVar3 = l00.a.A;
        int i12 = gVar.H;
        b0 b0Var2 = b0.a;
        if (i12 == 0) {
            t1.O(objS);
            y1 y1Var = jVar.b.c.c;
            l2 = l;
            gVar.D = l2;
            i4 = i;
            gVar.A = i4;
            i5 = i2;
            gVar.B = i5;
            i6 = i3;
            gVar.C = i6;
            gVar.H = 1;
            objS = o.s(y1Var, gVar);
            if (objS != aVar3) {
            }
            return aVar3;
        }
        if (i12 == 1) {
            int i13 = gVar.C;
            int i14 = gVar.B;
            i4 = gVar.A;
            Long l4 = gVar.D;
            t1.O(objS);
            i6 = i13;
            l2 = l4;
            i5 = i14;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objS);
                return b0Var2;
            }
            i9 = gVar.C;
            i8 = gVar.B;
            i7 = gVar.A;
            aVar = gVar.E;
            l3 = gVar.D;
            t1.O(objS);
        }
        list = (List) objS;
        u30.b bVar = aVar.i;
        arrayList = new ArrayList(r.q0(bVar, 10));
        it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(jVar.c.X(new g00.q(new Integer(aVar.a), (dw.b) it.next(), list)));
            it = it;
            aVar = aVar;
            b0Var2 = b0Var2;
        }
        b0Var = b0Var2;
        if (arrayList.isEmpty()) {
            Log.w("WidgetPlayback", "playlist " + i7 + " has nothing playable");
            return b0Var;
        }
        it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            long surahId = ((PlayerItem) next2).getSurahId();
            if (l3 != null && surahId == l3.longValue()) {
                break;
            }
        }
        playerItem = (PlayerItem) next2;
        if (playerItem == null) {
            it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                playerItem2 = (PlayerItem) next3;
                if (playerItem2.getReciterId() != i8 && playerItem2.getSurahNumber() == i9) {
                    break;
                }
            }
            playerItem = (PlayerItem) next3;
            if (playerItem == null) {
                playerItem = (PlayerItem) q.L0(arrayList);
            }
        }
        aVar2 = jVar.e;
        gVar.D = null;
        gVar.E = null;
        gVar.A = i7;
        gVar.B = i8;
        gVar.C = i9;
        gVar.H = 3;
        if (((w) aVar2).r(playerItem, arrayList, false, gVar) != aVar3) {
            return aVar3;
        }
        return b0Var;
        Iterator it4 = ((Iterable) objS).iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (((dw.a) next).a != i4);
        dw.a aVar4 = (dw.a) next;
        if (aVar4 == null) {
            Log.w("WidgetPlayback", "playlist " + i4 + " is gone");
            return b0Var2;
        }
        zt.a aVar5 = jVar.h;
        gVar.D = l2;
        gVar.E = aVar4;
        gVar.A = i4;
        gVar.B = i5;
        gVar.C = i6;
        gVar.H = 2;
        Object objI = ((p) aVar5).i(gVar);
        if (objI != aVar3) {
            i7 = i4;
            aVar = aVar4;
            objS = objI;
            i8 = i5;
            l3 = l2;
            i9 = i6;
            list = (List) objS;
            u30.b bVar2 = aVar.i;
            arrayList = new ArrayList(r.q0(bVar2, 10));
            it = bVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(jVar.c.X(new g00.q(new Integer(aVar.a), (dw.b) it.next(), list)));
                it = it;
                aVar = aVar;
                b0Var2 = b0Var2;
            }
            b0Var = b0Var2;
            if (arrayList.isEmpty()) {
                Log.w("WidgetPlayback", "playlist " + i7 + " has nothing playable");
                return b0Var;
            }
            it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                long surahId2 = ((PlayerItem) next2).getSurahId();
                if (l3 != null) {
                    break;
                    break;
                }
            }
            playerItem = (PlayerItem) next2;
            if (playerItem == null) {
                it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    playerItem2 = (PlayerItem) next3;
                    if (playerItem2.getReciterId() != i8) {
                    }
                }
                playerItem = (PlayerItem) next3;
                if (playerItem == null) {
                    playerItem = (PlayerItem) q.L0(arrayList);
                }
            }
            aVar2 = jVar.e;
            gVar.D = null;
            gVar.E = null;
            gVar.A = i7;
            gVar.B = i8;
            gVar.C = i9;
            gVar.H = 3;
            if (((w) aVar2).r(playerItem, arrayList, false, gVar) != aVar3) {
                return b0Var;
            }
        }
        return aVar3;
    }

    public final Object d(String str, u00.k kVar, m00.c cVar) {
        f fVar;
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
        try {
            if (i2 == 0) {
                t1.O(obj);
                l6.d dVar = new l6.d(kVar, (k00.c) null, 4);
                fVar.A = str;
                fVar.D = 1;
                if (c0.K(8000L, dVar, fVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = fVar.A;
                t1.O(obj);
            }
        } catch (TimeoutCancellationException e) {
            Log.w("WidgetPlayback", str + ": player did not respond in 8000ms", e);
        }
        return b0.a;
    }
}
