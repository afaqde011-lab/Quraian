package z1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class s implements z, Map, v00.e {
    public r A;
    public final m B;
    public final m C;
    public final m D;

    public s() {
        s1.c cVar = s1.c.C;
        f fVarJ = l.j();
        r rVar = new r(fVarJ.g(), cVar);
        if (!(fVarJ instanceof a)) {
            rVar.f17010b = new r(1, cVar);
        }
        this.A = rVar;
        this.B = new m(this, 0);
        this.C = new m(this, 1);
        this.D = new m(this, 2);
    }

    public static final boolean g(s sVar, r rVar, int i10, q1.d dVar) {
        boolean z10;
        synchronized (q.f17049b) {
            int i11 = rVar.f17052d;
            if (i11 == i10) {
                rVar.f17051c = dVar;
                z10 = true;
                rVar.f17052d = i11 + 1;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final b0 a() {
        return this.A;
    }

    @Override
    public final void clear() {
        f fVarJ;
        r rVar = this.A;
        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        r rVar2 = (r) l.h(rVar);
        s1.c cVar = s1.c.C;
        if (cVar != rVar2.f17051c) {
            r rVar3 = this.A;
            kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                r rVar4 = (r) l.w(rVar3, this, fVarJ);
                synchronized (q.f17049b) {
                    rVar4.f17051c = cVar;
                    rVar4.f17052d++;
                }
            }
            l.n(fVarJ, this);
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        return h().f17051c.containsKey(obj);
    }

    @Override
    public final boolean containsValue(Object obj) {
        return h().f17051c.containsValue(obj);
    }

    @Override
    public final void e(b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.A = (r) b0Var;
    }

    @Override
    public final Set entrySet() {
        return this.B;
    }

    @Override
    public final Object get(Object obj) {
        return h().f17051c.get(obj);
    }

    public final r h() {
        r rVar = this.A;
        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (r) l.t(rVar, this);
    }

    @Override
    public final boolean isEmpty() {
        return h().f17051c.isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.C;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        q1.d dVar;
        int i10;
        Object objPut;
        f fVarJ;
        boolean zG;
        do {
            synchronized (q.f17049b) {
                r rVar = this.A;
                kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f17051c;
                i10 = rVar2.f17052d;
            }
            kotlin.jvm.internal.m.b(dVar);
            s1.e eVar = (s1.e) dVar.h();
            objPut = eVar.put(obj, obj2);
            q1.d dVarBuild = eVar.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.A;
            kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zG = g(this, (r) l.w(rVar3, this, fVarJ), i10, dVarBuild);
            }
            l.n(fVarJ, this);
        } while (!zG);
        return objPut;
    }

    @Override
    public final void putAll(Map map) {
        q1.d dVar;
        int i10;
        f fVarJ;
        boolean zG;
        do {
            synchronized (q.f17049b) {
                r rVar = this.A;
                kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f17051c;
                i10 = rVar2.f17052d;
            }
            kotlin.jvm.internal.m.b(dVar);
            s1.e eVar = (s1.e) dVar.h();
            eVar.putAll(map);
            q1.d dVarBuild = eVar.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                return;
            }
            r rVar3 = this.A;
            kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zG = g(this, (r) l.w(rVar3, this, fVarJ), i10, dVarBuild);
            }
            l.n(fVarJ, this);
        } while (!zG);
    }

    @Override
    public final Object remove(Object obj) {
        q1.d dVar;
        int i10;
        Object objRemove;
        f fVarJ;
        boolean zG;
        do {
            synchronized (q.f17049b) {
                r rVar = this.A;
                kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f17051c;
                i10 = rVar2.f17052d;
            }
            kotlin.jvm.internal.m.b(dVar);
            q1.c cVarH = dVar.h();
            objRemove = cVarH.remove(obj);
            q1.d dVarBuild = cVarH.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.A;
            kotlin.jvm.internal.m.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zG = g(this, (r) l.w(rVar3, this, fVarJ), i10, dVarBuild);
            }
            l.n(fVarJ, this);
        } while (!zG);
        return objRemove;
    }

    @Override
    public final int size() {
        return h().f17051c.size();
    }

    public final String toString() {
        r rVar = this.A;
        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((r) l.h(rVar)).f17051c + ")@" + hashCode();
    }

    @Override
    public final Collection values() {
        return this.D;
    }
}
