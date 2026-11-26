package rv;

import a10.w;
import a40.c0;
import a40.z;
import android.content.Context;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import b3.k0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g1.s1;
import h00.r;
import h00.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class p {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public volatile Object f;

    public p(String name, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, u00.k kVar, z zVar) {
        kotlin.jvm.internal.m.e(name, "name");
        this.a = name;
        this.b = replaceFileCorruptionHandler;
        this.c = kVar;
        this.d = zVar;
        this.e = new Object();
    }

    public p(xw.k kVar, zt.a aVar, qu.a aVar2, wu.a aVar3) {
        this.a = kVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = j40.d.a();
    }

    public Object a(String mediaId, m00.c cVar) {
        j jVar;
        int iIntValue;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.E = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objC = jVar.C;
        Object obj = l00.a.A;
        int i2 = jVar.E;
        if (i2 == 0) {
            t1.O(objC);
            kotlin.jvm.internal.m.e(mediaId, "mediaId");
            g00.k kVarH = kh.o.H(mediaId, "surah/");
            if (kVarH == null) {
                return null;
            }
            int iIntValue2 = ((Number) kVarH.A).intValue();
            iIntValue = ((Number) kVarH.B).intValue();
            jVar.A = this;
            jVar.B = iIntValue;
            jVar.E = 1;
            objC = c(iIntValue2, jVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = jVar.B;
            p pVar = jVar.A;
            t1.O(objC);
            iIntValue = i3;
            this = pVar;
        }
        return this.d(new s1(iIntValue, 13), (List) objC);
    }

    public Object b(w property, Object obj) {
        t5.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.m.e(thisRef, "thisRef");
        kotlin.jvm.internal.m.e(property, "property");
        t5.c cVar2 = (t5.c) this.f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.e) {
            try {
                if (((t5.c) this.f) == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler) this.b;
                    u00.k kVar = (u00.k) this.c;
                    kotlin.jvm.internal.m.d(applicationContext, "applicationContext");
                    List migrations = (List) kVar.invoke(applicationContext);
                    z zVar = (z) this.d;
                    k0 k0Var = new k0(applicationContext, this, 22);
                    kotlin.jvm.internal.m.e(migrations, "migrations");
                    this.f = new t5.c(new t5.c(DataStoreFactory.INSTANCE.create(new FileStorage(t5.g.A, (u00.k) null, new b6.n(4, k0Var), 2, (kotlin.jvm.internal.f) null), replaceFileCorruptionHandler, migrations, zVar)));
                }
                cVar = (t5.c) this.f;
                kotlin.jvm.internal.m.b(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public Serializable c(int i, m00.c cVar) {
        k kVar;
        bx.c cVar2;
        List list;
        List list2;
        ArrayList arrayList;
        Iterator it;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i2 = kVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.F = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objE = kVar.D;
        l00.a aVar = l00.a.A;
        int i3 = kVar.F;
        if (i3 == 0) {
            t1.O(objE);
            kVar.A = i;
            kVar.F = 1;
            objE = e(i, kVar);
            if (objE != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            i = kVar.A;
            t1.O(objE);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) kVar.C;
            cVar2 = kVar.B;
            t1.O(objE);
        }
        list2 = (List) objE;
        arrayList = new ArrayList(r.q0(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qu.a) this.c).X(new ru.b(cVar2, (bx.f) it.next(), null, list2)));
        }
        return arrayList;
        bx.c cVar3 = (bx.c) objE;
        x xVar = x.A;
        if (cVar3 != null) {
            bx.b bVarA = cVar3.a();
            List list3 = bVarA != null ? bVarA.e : null;
            if (list3 == null) {
                list3 = xVar;
            }
            if (!list3.isEmpty()) {
                zt.a aVar2 = (zt.a) this.b;
                kVar.B = cVar3;
                kVar.C = list3;
                kVar.A = i;
                kVar.F = 2;
                Object objI = ((ut.p) aVar2).i(kVar);
                if (objI != aVar) {
                    cVar2 = cVar3;
                    objE = objI;
                    list = list3;
                    list2 = (List) objE;
                    arrayList = new ArrayList(r.q0(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((qu.a) this.c).X(new ru.b(cVar2, (bx.f) it.next(), null, list2)));
                    }
                    return arrayList;
                }
                return aVar;
            }
        }
        return xVar;
    }

    public q d(u00.k kVar, List playerItems) {
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        if (playerItems.isEmpty()) {
            return null;
        }
        Iterator it = playerItems.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Boolean) kVar.invoke(it.next())).booleanValue()) {
                break;
            }
            i++;
        }
        return new q((ArrayList) ((wu.a) this.d).X(playerItems), i >= 0 ? i : 0, playerItems);
    }

    public Object e(int i, m00.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.D = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objF = lVar.B;
        Object obj = l00.a.A;
        int i3 = lVar.D;
        if (i3 == 0) {
            t1.O(objF);
            lVar.A = i;
            lVar.D = 1;
            objF = f(lVar);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = lVar.A;
            t1.O(objF);
        }
        for (Object obj2 : (Iterable) objF) {
            if (((bx.c) obj2).a == i) {
                return obj2;
            }
        }
        return null;
    }

    public Object f(m00.c cVar) {
        m mVar;
        j40.a aVar;
        int i;
        j40.a aVar2;
        j40.a aVar3;
        List list;
        List list2;
        List list3 = x.A;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i2 = mVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.F = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objL = mVar.D;
        l00.a aVar4 = l00.a.A;
        int i3 = mVar.F;
        int i4 = 0;
        k00.c cVar2 = null;
        try {
            if (i3 == 0) {
                t1.O(objL);
                List list4 = (List) this.f;
                if (list4 != null) {
                    return list4;
                }
                aVar = (j40.c) this.e;
                mVar.A = aVar;
                mVar.B = 0;
                mVar.F = 1;
                if (aVar.l(mVar) != aVar4) {
                    i = 0;
                }
                return aVar4;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = mVar.A;
                    try {
                        t1.O(objL);
                        list2 = (List) objL;
                        if (list2 != null) {
                            list3 = list2;
                        }
                        if (!list3.isEmpty()) {
                            this.f = list3;
                        }
                        list = list3;
                        aVar3 = aVar2;
                        aVar3.i(null);
                        return list;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.i(null);
                        throw th;
                    }
                }
                i4 = mVar.C;
                i = mVar.B;
                aVar3 = mVar.A;
                try {
                    t1.O(objL);
                    list = (List) objL;
                    if (list == null) {
                        list = list3;
                    }
                    if (list.isEmpty()) {
                        n nVar = new n(this, cVar2, 1);
                        mVar.A = aVar3;
                        mVar.B = i;
                        mVar.C = i4;
                        mVar.F = 3;
                        objL = c0.L(8000L, nVar, mVar);
                        if (objL != aVar4) {
                            aVar2 = aVar3;
                            list2 = (List) objL;
                            if (list2 != null) {
                                list3 = list2;
                            }
                            if (!list3.isEmpty()) {
                                this.f = list3;
                            }
                            list = list3;
                            aVar3 = aVar2;
                        }
                        return aVar4;
                    }
                    this.f = list;
                    aVar3.i(null);
                    return list;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    aVar2.i(null);
                    throw th;
                }
            }
            i = mVar.B;
            j40.a aVar5 = mVar.A;
            t1.O(objL);
            aVar = aVar5;
            List list5 = (List) this.f;
            if (list5 != null) {
                aVar.i(null);
                return list5;
            }
            n nVar2 = new n(this, cVar2, 0);
            mVar.A = aVar;
            mVar.B = i;
            mVar.C = 0;
            mVar.F = 2;
            Object objL2 = c0.L(3000L, nVar2, mVar);
            if (objL2 != aVar4) {
                aVar3 = aVar;
                objL = objL2;
                list = (List) objL;
                if (list == null) {
                    list = list3;
                }
                if (list.isEmpty()) {
                    this.f = list;
                } else {
                    n nVar3 = new n(this, cVar2, 1);
                    mVar.A = aVar3;
                    mVar.B = i;
                    mVar.C = i4;
                    mVar.F = 3;
                    objL = c0.L(8000L, nVar3, mVar);
                    if (objL != aVar4) {
                        aVar2 = aVar3;
                        list2 = (List) objL;
                        if (list2 != null) {
                            list3 = list2;
                        }
                        if (!list3.isEmpty()) {
                            this.f = list3;
                        }
                        list = list3;
                        aVar3 = aVar2;
                    }
                }
                aVar3.i(null);
                return list;
            }
            return aVar4;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public Object g(String mediaId, m00.c cVar) {
        o oVar;
        g00.k kVarH;
        int i;
        Object next;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.D = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.B;
        Serializable serializable = l00.a.A;
        int i3 = oVar.D;
        if (i3 == 0) {
            t1.O(obj);
            kotlin.jvm.internal.m.e(mediaId, "mediaId");
            if (r30.r.x0(mediaId, "pltt/", false)) {
                g00.q qVarG = kh.o.G(mediaId);
                if (qVarG != null) {
                    kVarH = new g00.k(Integer.valueOf(((Number) qVarG.B).intValue()), Integer.valueOf(((Number) qVarG.C).intValue()));
                } else {
                    kVarH = null;
                }
            } else if (r30.r.x0(mediaId, "dl/", false)) {
                kVarH = kh.o.H(mediaId, "dl/");
            } else if (r30.r.x0(mediaId, "surah/", false)) {
                kVarH = kh.o.H(mediaId, "surah/");
            } else {
                kVarH = null;
            }
            if (kVarH != null) {
                int iIntValue = ((Number) kVarH.A).intValue();
                int iIntValue2 = ((Number) kVarH.B).intValue();
                oVar.A = iIntValue2;
                oVar.D = 1;
                Serializable serializableC = c(iIntValue, oVar);
                if (serializableC == serializable) {
                    return serializable;
                }
                obj = serializableC;
                i = iIntValue2;
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = oVar.A;
        t1.O(obj);
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PlayerItem) next).getSurahNumber() != i);
        PlayerItem playerItem = (PlayerItem) next;
        if (playerItem != null) {
            return h00.q.N0((ArrayList) ((wu.a) this.d).X(va.a.R(playerItem)));
        }
        return null;
    }
}
