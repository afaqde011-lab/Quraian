package ii;

import android.util.Log;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class g implements c {

    public static final f f7686h = new f(0);

    public final HashMap f7687a;

    public final HashMap f7688b;

    public final HashMap f7689c;

    public final HashSet f7690d;

    public final k f7691e;

    public final AtomicReference f7692f;

    public final sg.f f7693g;

    public g(ArrayList arrayList, ArrayList arrayList2, sg.f fVar) {
        ji.l lVar = ji.l.A;
        this.f7687a = new HashMap();
        this.f7688b = new HashMap();
        this.f7689c = new HashMap();
        this.f7690d = new HashSet();
        this.f7692f = new AtomicReference();
        k kVar = new k();
        this.f7691e = kVar;
        this.f7693g = fVar;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.c(kVar, k.class, fj.c.class, fj.b.class));
        arrayList3.add(b.c(this, g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ij.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f7693g.N(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e3) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e3);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((b) it4.next()).f7677b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f7690d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f7690d.add(obj.toString());
                    }
                }
            }
            if (this.f7687a.isEmpty()) {
                g4.B(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f7687a.keySet());
                arrayList6.addAll(arrayList3);
                g4.B(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.f7687a.put(bVar2, new l(new bi.c(this, bVar2, 2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f7692f.get();
        if (bool != null) {
            h(this.f7687a, bool.booleanValue());
        }
    }

    @Override
    public final n b(p pVar) {
        ij.b bVarE = e(pVar);
        if (bVarE == null) {
            return new n(n.f7710c, n.f7711d);
        }
        return bVarE instanceof n ? (n) bVarE : new n(null, bVarE);
    }

    @Override
    public final synchronized ij.b c(p pVar) {
        m mVar = (m) this.f7689c.get(pVar);
        if (mVar != null) {
            return mVar;
        }
        return f7686h;
    }

    @Override
    public final synchronized ij.b e(p pVar) {
        b5.m(pVar, "Null interface requested.");
        return (ij.b) this.f7688b.get(pVar);
    }

    public final void h(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            ij.b bVar2 = (ij.b) entry.getValue();
            int i10 = bVar.f7679d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar2.get();
            }
        }
        k kVar = this.f7691e;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f7703b;
                if (arrayDeque != null) {
                    kVar.f7703b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw a1.b.j(it);
            }
        }
    }

    public final void i() {
        HashMap map = this.f7688b;
        HashMap map2 = this.f7689c;
        for (b bVar : this.f7687a.keySet()) {
            for (j jVar : bVar.f7678c) {
                boolean z10 = jVar.f7700b == 2;
                p pVar = jVar.f7699a;
                if (z10 && !map2.containsKey(pVar)) {
                    Set set = Collections.EMPTY_SET;
                    m mVar = new m();
                    mVar.f7709b = null;
                    mVar.f7708a = Collections.newSetFromMap(new ConcurrentHashMap());
                    mVar.f7708a.addAll(set);
                    map2.put(pVar, mVar);
                } else if (map.containsKey(pVar)) {
                    continue;
                } else {
                    int i10 = jVar.f7700b;
                    if (i10 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + pVar);
                    }
                    if (i10 != 2) {
                        map.put(pVar, new n(n.f7710c, n.f7711d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f7680e == 0) {
                ij.b bVar2 = (ij.b) this.f7687a.get(bVar);
                for (p pVar : bVar.f7677b) {
                    HashMap map = this.f7688b;
                    if (map.containsKey(pVar)) {
                        arrayList2.add(new ab.f((n) ((ij.b) map.get(pVar)), bVar2, 22));
                    } else {
                        map.put(pVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap map = this.f7689c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f7687a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f7680e != 0) {
                ij.b bVar2 = (ij.b) entry.getValue();
                for (p pVar : bVar.f7677b) {
                    if (!map2.containsKey(pVar)) {
                        map2.put(pVar, new HashSet());
                    }
                    ((Set) map2.get(pVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                m mVar = (m) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ab.f(mVar, (ij.b) it.next(), 23));
                }
            } else {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                m mVar2 = new m();
                mVar2.f7709b = null;
                mVar2.f7708a = Collections.newSetFromMap(new ConcurrentHashMap());
                mVar2.f7708a.addAll(set);
                map.put(pVar2, mVar2);
            }
        }
        return arrayList;
    }
}
