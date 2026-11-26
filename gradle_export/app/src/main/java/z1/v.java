package z1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

public final class v implements Parcelable, z, Set, RandomAccess, v00.f {
    public static final Parcelable.Creator<v> CREATOR = new o(11);
    public d0 A;

    public v() {
        t1.b bVar = t1.b.D;
        d0 d0Var = new d0(l.j().g(), bVar);
        if (l.f17037b.get() != null) {
            d0Var.f17010b = new d0(1, bVar);
        }
        this.A = d0Var;
    }

    @Override
    public final b0 a() {
        return this.A;
    }

    @Override
    public final boolean add(Object obj) {
        int i10;
        q1.e eVar;
        f fVarJ;
        boolean zC;
        do {
            synchronized (q.f17050c) {
                d0 d0Var = this.A;
                kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                d0 d0Var2 = (d0) l.h(d0Var);
                i10 = d0Var2.f17016d;
                eVar = d0Var2.f17015c;
            }
            kotlin.jvm.internal.m.b(eVar);
            t1.b bVarC = ((t1.b) eVar).c(obj);
            if (bVarC.equals(eVar)) {
                return false;
            }
            d0 d0Var3 = this.A;
            kotlin.jvm.internal.m.c(d0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zC = q.c((d0) l.w(d0Var3, this, fVarJ), i10, bVarC);
            }
            l.n(fVarJ, this);
        } while (!zC);
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        int i10;
        q1.e eVar;
        f fVarJ;
        boolean zC;
        do {
            synchronized (q.f17050c) {
                d0 d0Var = this.A;
                kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                d0 d0Var2 = (d0) l.h(d0Var);
                i10 = d0Var2.f17016d;
                eVar = d0Var2.f17015c;
            }
            kotlin.jvm.internal.m.b(eVar);
            ?? cVar = new t1.c((t1.b) eVar);
            cVar.addAll(collection);
            t1.b bVarC = cVar.c();
            if (bVarC.equals(eVar)) {
                return false;
            }
            d0 d0Var3 = this.A;
            kotlin.jvm.internal.m.c(d0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zC = q.c((d0) l.w(d0Var3, this, fVarJ), i10, bVarC);
            }
            l.n(fVarJ, this);
        } while (!zC);
        return true;
    }

    @Override
    public final void clear() {
        f fVarJ;
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        synchronized (l.f17038c) {
            fVarJ = l.j();
            d0 d0Var2 = (d0) l.w(d0Var, this, fVarJ);
            synchronized (q.f17050c) {
                d0Var2.f17015c = t1.b.D;
                d0Var2.f17016d++;
            }
        }
        l.n(fVarJ, this);
    }

    @Override
    public final boolean contains(Object obj) {
        return q.i(this).f17015c.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return q.i(this).f17015c.containsAll(collection);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(b0 b0Var) {
        b0Var.f17010b = this.A;
        this.A = (d0) b0Var;
    }

    @Override
    public final boolean isEmpty() {
        return q.i(this).f17015c.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c0(this, q.i(this).f17015c.iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        q1.e eVar;
        f fVarJ;
        boolean zC;
        do {
            synchronized (q.f17050c) {
                d0 d0Var = this.A;
                kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                d0 d0Var2 = (d0) l.h(d0Var);
                i10 = d0Var2.f17016d;
                eVar = d0Var2.f17015c;
            }
            kotlin.jvm.internal.m.b(eVar);
            t1.b bVarE = ((t1.b) eVar).e(obj);
            if (bVarE.equals(eVar)) {
                return false;
            }
            d0 d0Var3 = this.A;
            kotlin.jvm.internal.m.c(d0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zC = q.c((d0) l.w(d0Var3, this, fVarJ), i10, bVarE);
            }
            l.n(fVarJ, this);
        } while (!zC);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        int i10;
        q1.e eVar;
        f fVarJ;
        boolean zC;
        do {
            synchronized (q.f17050c) {
                d0 d0Var = this.A;
                kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                d0 d0Var2 = (d0) l.h(d0Var);
                i10 = d0Var2.f17016d;
                eVar = d0Var2.f17015c;
            }
            kotlin.jvm.internal.m.b(eVar);
            ?? cVar = new t1.c((t1.b) eVar);
            cVar.removeAll(collection);
            t1.b bVarC = cVar.c();
            if (bVarC.equals(eVar)) {
                return false;
            }
            d0 d0Var3 = this.A;
            kotlin.jvm.internal.m.c(d0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zC = q.c((d0) l.w(d0Var3, this, fVarJ), i10, bVarC);
            }
            l.n(fVarJ, this);
        } while (!zC);
        return true;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int i10;
        q1.e eVar;
        boolean zRetainAll;
        f fVarJ;
        boolean zC;
        do {
            synchronized (q.f17050c) {
                d0 d0Var = this.A;
                kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                d0 d0Var2 = (d0) l.h(d0Var);
                i10 = d0Var2.f17016d;
                eVar = d0Var2.f17015c;
            }
            if (eVar == null) {
                throw new IllegalStateException("No set to mutate");
            }
            ?? cVar = new t1.c((t1.b) eVar);
            zRetainAll = cVar.retainAll(h00.q.r1(collection));
            t1.b bVarC = cVar.c();
            if (bVarC.equals(eVar)) {
                break;
            }
            d0 d0Var3 = this.A;
            kotlin.jvm.internal.m.c(d0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zC = q.c((d0) l.w(d0Var3, this, fVarJ), i10, bVarC);
            }
            l.n(fVarJ, this);
        } while (!zC);
        return zRetainAll;
    }

    @Override
    public final int size() {
        return q.i(this).f17015c.size();
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.c(this, objArr);
    }

    public final String toString() {
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((d0) l.h(d0Var)).f17015c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        q1.e eVar = q.i(this).f17015c;
        parcel.writeInt(size());
        Iterator it = eVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }
}
