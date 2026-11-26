package on;

import android.graphics.Bitmap;
import bt.y1;
import com.mchutov.quranify.appwidget.domain.model.RecentPlayEntry;
import d40.o;
import g00.k;
import h00.d0;
import h00.q;
import h00.r;
import h00.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ri.t1;
import y3.f;

public final class d {
    public final nn.d a;
    public final zm.b b;
    public final xv.c c;
    public final uu.a d;
    public final dn.c e;

    public d(nn.d dVar, zm.b bVar, xv.c cVar, uu.a aVar, dn.c cVar2) {
        this.a = dVar;
        this.b = bVar;
        this.c = cVar;
        this.d = aVar;
        this.e = cVar2;
    }

    public static final Object a(d dVar, RecentPlayEntry recentPlayEntry, dw.a aVar, float f, Map map, m00.c cVar) {
        a aVar2;
        Bitmap bitmap;
        String str;
        Object obj;
        k kVar;
        k kVar2;
        Object obj2;
        k kVar3;
        dn.c cVar2 = dVar.e;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i = aVar2.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.E = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar, cVar);
            }
        } else {
            aVar2 = new a(dVar, cVar);
        }
        Object objA = aVar2.C;
        l00.a aVar3 = l00.a.A;
        int i2 = aVar2.E;
        if (i2 == 0) {
            t1.O(objA);
            bitmap = null;
            if (aVar != null) {
                str = aVar.f;
                if (r30.k.L0(str)) {
                    str = null;
                }
            } else {
                str = null;
            }
            if (recentPlayEntry.getCollectionId() == null) {
                k kVar4 = new k(g4.c.f(recentPlayEntry.getReciterId(), "reciter-"), new f(f));
                obj = map.get(kVar4);
                if (obj == null) {
                    String reciterPhotoUrl = recentPlayEntry.getReciterPhotoUrl();
                    aVar2.A = map;
                    aVar2.B = kVar4;
                    aVar2.E = 2;
                    objA = cVar2.a(reciterPhotoUrl, f, new zb.a(), aVar2);
                    if (objA != aVar3) {
                        kVar = kVar4;
                        obj = (Bitmap) objA;
                        map.put(kVar, obj);
                    }
                }
                return (Bitmap) obj;
            }
            kVar2 = new k("collection-" + recentPlayEntry.getCollectionId(), new f(f));
            obj2 = map.get(kVar2);
            if (obj2 == null) {
                if (str != null) {
                    aVar2.A = map;
                    aVar2.B = kVar2;
                    aVar2.E = 1;
                    objA = cVar2.a(str, f, new zb.b(cVar2.a.getResources().getDisplayMetrics().density * f * 0.2f), aVar2);
                    if (objA != aVar3) {
                        kVar3 = kVar2;
                        bitmap = (Bitmap) objA;
                        kVar2 = kVar3;
                    }
                }
                map.put(kVar2, bitmap);
                obj2 = bitmap;
            }
            return aVar3;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = aVar2.B;
            map = aVar2.A;
            t1.O(objA);
            obj = (Bitmap) objA;
            map.put(kVar, obj);
            return (Bitmap) obj;
        }
        kVar3 = aVar2.B;
        map = aVar2.A;
        t1.O(objA);
        bitmap = (Bitmap) objA;
        kVar2 = kVar3;
        map.put(kVar2, bitmap);
        obj2 = bitmap;
        return (Bitmap) obj2;
    }

    public static final Serializable b(d dVar, List list, m00.c cVar) {
        c cVar2;
        Set set;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.D = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar, cVar);
            }
        } else {
            cVar2 = new c(dVar, cVar);
        }
        Object objS = cVar2.B;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.D;
        if (i2 == 0) {
            t1.O(objS);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer collectionId = ((RecentPlayEntry) it.next()).getCollectionId();
                if (collectionId != null) {
                    arrayList.add(collectionId);
                }
            }
            Set setR1 = q.r1(arrayList);
            if (setR1.isEmpty()) {
                return y.A;
            }
            y1 y1Var = dVar.c.c.c;
            cVar2.A = setR1;
            cVar2.D = 1;
            objS = o.s(y1Var, cVar2);
            if (objS == aVar) {
                return aVar;
            }
            set = setR1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = cVar2.A;
            t1.O(objS);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) objS) {
            if (set.contains(new Integer(((dw.a) obj).a))) {
                arrayList2.add(obj);
            }
        }
        int iP = d0.P(r.q0(arrayList2, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(new Integer(((dw.a) obj2).a), obj2);
        }
        return linkedHashMap;
    }
}
