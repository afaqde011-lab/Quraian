package a40;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k1 implements b1 {
    public static final AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(k1.class, "_isCompleting$volatile");
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_rootCause$volatile");
    public static final AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_exceptionsHolder$volatile");
    public final p1 A;
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile = 0;
    private volatile Object _rootCause$volatile;

    public k1(p1 p1Var, Throwable th) {
        this.A = p1Var;
        this._rootCause$volatile = th;
    }

    @Override
    public final boolean a() {
        return d() == null;
    }

    public final void b(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            C.set(this, th);
            return;
        }
        if (th == thD) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override
    public final p1 c() {
        return this.A;
    }

    public final Throwable d() {
        return (Throwable) C.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thD = d();
        if (thD != null) {
            arrayList.add(0, thD);
        }
        if (th != null && !th.equals(thD)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, c0.h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(B.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(D.get(this));
        sb.append(", list=");
        sb.append(this.A);
        sb.append(']');
        return sb.toString();
    }
}
