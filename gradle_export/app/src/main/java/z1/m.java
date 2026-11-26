package z1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class m implements Set, v00.f {
    public final s A;
    public final int B;

    public m(s sVar, int i10) {
        this.B = i10;
        this.A = sVar;
    }

    private final boolean a(Collection collection) {
        q1.d dVar;
        int i10;
        f fVarJ;
        boolean zG;
        Set setR1 = h00.q.r1(collection);
        s sVar = this.A;
        boolean z10 = false;
        do {
            synchronized (q.f17049b) {
                r rVar = sVar.A;
                kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f17051c;
                i10 = rVar2.f17052d;
            }
            kotlin.jvm.internal.m.b(dVar);
            q1.c cVarH = dVar.h();
            Iterator it = sVar.B.iterator();
            while (((y) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((y) it).next();
                if (!setR1.contains(entry.getKey())) {
                    cVarH.remove(entry.getKey());
                    z10 = true;
                }
            }
            q1.d dVarBuild = cVarH.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = sVar.A;
            kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zG = s.g(sVar, (r) l.w(rVar3, sVar, fVarJ), i10, dVarBuild);
            }
            l.n(fVarJ, sVar);
        } while (!zG);
        return z10;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.B) {
            case 0:
                q.o();
                throw null;
            case 1:
                q.o();
                throw null;
            default:
                q.o();
                throw null;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.B) {
            case 0:
                q.o();
                throw null;
            case 1:
                q.o();
                throw null;
            default:
                q.o();
                throw null;
        }
    }

    @Override
    public final void clear() {
        this.A.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.B) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof v00.a) && !(obj instanceof v00.d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return kotlin.jvm.internal.m.a(this.A.get(entry.getKey()), entry.getValue());
            case 1:
                return this.A.containsKey(obj);
            default:
                return this.A.containsValue(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.B) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.A.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.A.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.B) {
            case 0:
                s sVar = this.A;
                return new y(sVar, ((q1.b) sVar.h().f17051c.entrySet()).iterator(), 0);
            case 1:
                s sVar2 = this.A;
                return new y(sVar2, ((q1.b) sVar2.h().f17051c.entrySet()).iterator(), 1);
            default:
                s sVar3 = this.A;
                return new y(sVar3, ((q1.b) sVar3.h().f17051c.entrySet()).iterator(), 2);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: z1.m.remove(java.lang.Object):boolean");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        q1.d dVar;
        int i10;
        f fVarJ;
        boolean zG;
        switch (this.B) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it.hasNext()) {
                        if (this.A.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        if (this.A.remove(it2.next()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
            default:
                Set setR1 = h00.q.r1(collection);
                s sVar = this.A;
                boolean z12 = false;
                do {
                    synchronized (q.f17049b) {
                        r rVar = sVar.A;
                        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.h(rVar);
                        dVar = rVar2.f17051c;
                        i10 = rVar2.f17052d;
                    }
                    kotlin.jvm.internal.m.b(dVar);
                    q1.c cVarH = dVar.h();
                    Iterator it3 = sVar.B.iterator();
                    while (((y) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((y) it3).next();
                        if (setR1.contains(entry.getValue())) {
                            cVarH.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                    q1.d dVarBuild = cVarH.build();
                    if (!kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                        r rVar3 = sVar.A;
                        kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f17038c) {
                            fVarJ = l.j();
                            zG = s.g(sVar, (r) l.w(rVar3, sVar, fVarJ), i10, dVarBuild);
                        }
                        l.n(fVarJ, sVar);
                    }
                    return z12;
                } while (!zG);
                return z12;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        q1.d dVar;
        int i10;
        f fVarJ;
        boolean zG;
        q1.d dVar2;
        int i11;
        f fVarJ2;
        boolean zG2;
        switch (this.B) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iP = h00.d0.P(h00.r.q0(collection2, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                s sVar = this.A;
                boolean z10 = false;
                do {
                    synchronized (q.f17049b) {
                        r rVar = sVar.A;
                        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.h(rVar);
                        dVar = rVar2.f17051c;
                        i10 = rVar2.f17052d;
                    }
                    kotlin.jvm.internal.m.b(dVar);
                    q1.c cVarH = dVar.h();
                    Iterator it = sVar.B.iterator();
                    while (((y) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((y) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.m.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            cVarH.remove(entry2.getKey());
                            z10 = true;
                        }
                    }
                    q1.d dVarBuild = cVarH.build();
                    if (!kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                        r rVar3 = sVar.A;
                        kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f17038c) {
                            fVarJ = l.j();
                            zG = s.g(sVar, (r) l.w(rVar3, sVar, fVarJ), i10, dVarBuild);
                        }
                        l.n(fVarJ, sVar);
                    }
                    return z10;
                } while (!zG);
                return z10;
            case 1:
                return a(collection);
            default:
                Set setR1 = h00.q.r1(collection);
                s sVar2 = this.A;
                boolean z11 = false;
                do {
                    synchronized (q.f17049b) {
                        r rVar4 = sVar2.A;
                        kotlin.jvm.internal.m.c(rVar4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar5 = (r) l.h(rVar4);
                        dVar2 = rVar5.f17051c;
                        i11 = rVar5.f17052d;
                    }
                    kotlin.jvm.internal.m.b(dVar2);
                    q1.c cVarH2 = dVar2.h();
                    Iterator it2 = sVar2.B.iterator();
                    while (((y) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((y) it2).next();
                        if (!setR1.contains(entry3.getValue())) {
                            cVarH2.remove(entry3.getKey());
                            z11 = true;
                        }
                    }
                    q1.d dVarBuild2 = cVarH2.build();
                    if (!kotlin.jvm.internal.m.a(dVarBuild2, dVar2)) {
                        r rVar6 = sVar2.A;
                        kotlin.jvm.internal.m.c(rVar6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f17038c) {
                            fVarJ2 = l.j();
                            zG2 = s.g(sVar2, (r) l.w(rVar6, sVar2, fVarJ2), i11, dVarBuild2);
                        }
                        l.n(fVarJ2, sVar2);
                    }
                    return z11;
                } while (!zG2);
                return z11;
        }
    }

    @Override
    public final int size() {
        return this.A.size();
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.c(this, objArr);
    }
}
