package z1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l1.n1;

public final class p implements Parcelable, z, List, RandomAccess, v00.c {
    public static final Parcelable.Creator<p> CREATOR = new o(0);
    public w A;

    public p() {
        this(r1.i.B);
    }

    public p(r1.c cVar) {
        f fVarJ = l.j();
        w wVar = new w(fVarJ.g(), cVar);
        if (!(fVarJ instanceof a)) {
            wVar.f17010b = new w(1, cVar);
        }
        this.A = wVar;
    }

    @Override
    public final b0 a() {
        return this.A;
    }

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i11 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.c cVarC = cVar.c(i10, obj);
            if (cVarC.equals(cVar)) {
                return;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i11, cVarC, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
    }

    @Override
    public final boolean add(Object obj) {
        int i10;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i10 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.c cVarE = cVar.e(obj);
            if (cVarE.equals(cVar)) {
                return false;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i10, cVarE, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        return q.l(this, new k0.w(i10, collection));
    }

    @Override
    public final boolean addAll(Collection collection) {
        int i10;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i10 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.c cVarH = cVar.h(collection);
            if (kotlin.jvm.internal.m.a(cVarH, cVar)) {
                return false;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i10, cVarH, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final void clear() {
        f fVarJ;
        w wVar = this.A;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (l.f17038c) {
            fVarJ = l.j();
            w wVar2 = (w) l.w(wVar, this, fVarJ);
            synchronized (q.f17048a) {
                wVar2.f17074c = r1.i.B;
                wVar2.f17075d++;
                wVar2.f17076e++;
            }
        }
        l.n(fVarJ, this);
    }

    @Override
    public final boolean contains(Object obj) {
        return q.h(this).f17074c.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return q.h(this).f17074c.containsAll(collection);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(b0 b0Var) {
        b0Var.f17010b = this.A;
        this.A = (w) b0Var;
    }

    @Override
    public final Object get(int i10) {
        return q.h(this).f17074c.get(i10);
    }

    public final void h(int i10, int i11) {
        int i12;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i12 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            ?? I = cVar.i();
            I.subList(i10, i11).clear();
            r1.c cVarE = I.e();
            if (kotlin.jvm.internal.m.a(cVarE, cVar)) {
                return;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i12, cVarE, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
    }

    @Override
    public final int indexOf(Object obj) {
        return q.h(this).f17074c.indexOf(obj);
    }

    @Override
    public final boolean isEmpty() {
        return q.h(this).f17074c.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return q.h(this).f17074c.lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        return new b3.q(this, 0);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new b3.q(this, i10);
    }

    @Override
    public final Object remove(int i10) {
        int i11;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        Object obj = get(i10);
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i11 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.c cVarL = cVar.l(i10);
            if (cVarL.equals(cVar)) {
                break;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i11, cVarL, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i10 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            r1.c cVarL = iIndexOf != -1 ? cVar.l(iIndexOf) : cVar;
            if (cVarL.equals(cVar)) {
                return false;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i10, cVarL, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        int i10;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i10 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.c cVarK = cVar.k(new r1.b(0, collection));
            if (kotlin.jvm.internal.m.a(cVarK, cVar)) {
                return false;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i10, cVarK, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        return q.l(this, new r1.b(2, collection));
    }

    @Override
    public final Object set(int i10, Object obj) {
        int i11;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        Object obj2 = get(i10);
        do {
            synchronized (q.f17048a) {
                w wVar = this.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i11 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.c cVarM = cVar.m(i10, obj);
            if (cVarM.equals(cVar)) {
                break;
            }
            w wVar3 = this.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, this, fVarJ), i11, cVarM, false);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override
    public final int size() {
        return q.h(this).f17074c.a();
    }

    @Override
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        return new e0(this, i10, i11);
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
        w wVar = this.A;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((w) l.h(wVar)).f17074c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        h00.b bVar = q.h(this).f17074c;
        int iA = bVar.a();
        parcel.writeInt(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            parcel.writeValue(bVar.get(i11));
        }
    }
}
