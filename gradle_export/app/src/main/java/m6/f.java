package m6;

import android.content.Context;
import androidx.datastore.core.DataStore;
import d40.i;
import d40.o;
import g00.b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.n;

public final class f implements a {

    public static final f f10566a = new f();

    public static final j40.c f10567b = j40.d.a();

    public static final LinkedHashMap f10568c = new LinkedHashMap();

    public final Object a(Context context, h hVar, String str, m00.c cVar) {
        b bVar;
        j40.a aVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.G = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.E;
        l00.a aVar2 = l00.a.A;
        int i11 = bVar.G;
        if (i11 == 0) {
            t1.O(obj);
            bVar.A = context;
            bVar.B = hVar;
            bVar.C = str;
            aVar = f10567b;
            bVar.D = aVar;
            bVar.G = 1;
            if (aVar.l(bVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = bVar.D;
            str = bVar.C;
            hVar = bVar.B;
            Context context2 = bVar.A;
            t1.O(obj);
            aVar = aVar3;
            context = context2;
        }
        try {
            f10568c.remove(str);
            hVar.a(context, str).delete();
            return b0.a;
        } finally {
            aVar.i((Object) null);
        }
    }

    public final Object b(Context context, g gVar, String str, m00.c cVar) throws Throwable {
        c cVar2;
        j40.a aVar;
        j40.a aVar2;
        Throwable th2;
        Object obj;
        String str2;
        Map map;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.G = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj2 = cVar2.E;
        l00.a aVar3 = l00.a.A;
        int i11 = cVar2.G;
        try {
            if (i11 == 0) {
                t1.O(obj2);
                cVar2.A = context;
                cVar2.B = gVar;
                cVar2.C = str;
                aVar = f10567b;
                cVar2.D = aVar;
                cVar2.G = 1;
                if (aVar.l(cVar2) != aVar3) {
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = cVar2.C;
                map = (Map) cVar2.B;
                aVar2 = (j40.a) cVar2.A;
                try {
                    t1.O(obj2);
                    obj = (DataStore) obj2;
                    map.put(str2, obj);
                    m.c(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
                    DataStore dataStore = (DataStore) obj;
                    aVar2.i((Object) null);
                    return dataStore;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i((Object) null);
                    throw th2;
                }
            }
            j40.a aVar4 = cVar2.D;
            str = cVar2.C;
            gVar = (g) cVar2.B;
            Context context2 = (Context) cVar2.A;
            t1.O(obj2);
            aVar = aVar4;
            context = context2;
            LinkedHashMap linkedHashMap = f10568c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                cVar2.A = aVar;
                cVar2.B = linkedHashMap;
                cVar2.C = str;
                cVar2.D = null;
                cVar2.G = 2;
                Object objB = gVar.b(context, str);
                if (objB != aVar3) {
                    String str3 = str;
                    aVar2 = aVar;
                    obj2 = objB;
                    str2 = str3;
                    map = linkedHashMap;
                    obj = (DataStore) obj2;
                    map.put(str2, obj);
                }
                return aVar3;
            }
            aVar2 = aVar;
            m.c(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
            DataStore dataStore2 = (DataStore) obj;
            aVar2.i((Object) null);
            return dataStore2;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.i((Object) null);
            throw th2;
        }
    }

    public final Object c(Context context, g gVar, String str, m00.c cVar) throws Throwable {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.C = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.A;
        Object obj = l00.a.A;
        int i11 = dVar.C;
        if (i11 == 0) {
            t1.O(objB);
            dVar.C = 1;
            objB = b(context, gVar, str, dVar);
            if (objB != obj) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
            return objB;
        }
        t1.O(objB);
        i data = ((DataStore) objB).getData();
        dVar.C = 2;
        Object objS = o.s(data, dVar);
        return objS == obj ? obj : objS;
    }

    public final Object d(Context context, g gVar, String str, n nVar, m00.c cVar) throws Throwable {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.D = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objB = eVar.B;
        Object obj = l00.a.A;
        int i11 = eVar.D;
        if (i11 == 0) {
            t1.O(objB);
            eVar.A = (m00.i) nVar;
            eVar.D = 1;
            objB = b(context, gVar, str, eVar);
            if (objB != obj) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
            return objB;
        }
        nVar = (n) eVar.A;
        t1.O(objB);
        eVar.A = null;
        eVar.D = 2;
        Object objUpdateData = ((DataStore) objB).updateData(nVar, eVar);
        return objUpdateData == obj ? obj : objUpdateData;
    }
}
