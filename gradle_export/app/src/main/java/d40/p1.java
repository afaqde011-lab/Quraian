package d40;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class p1 extends e40.a implements x0, i, e40.m {
    public static final AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_state$volatile");
    public int E;
    private volatile Object _state$volatile;

    public p1(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override
    public final i b(k00.i iVar, int i, c40.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != c40.a.B) ? o.w(this, iVar, i, aVar) : this;
    }

    @Override
    public final java.lang.Object collect(d40.j r13, k00.c r14) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: d40.p1.collect(d40.j, k00.c):java.lang.Object");
    }

    @Override
    public final e40.c d() {
        return new q1();
    }

    @Override
    public final e40.c[] e() {
        return new q1[2];
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        j(obj);
        return g00.b0.a;
    }

    @Override
    public final boolean f(Object obj) {
        j(obj);
        return true;
    }

    @Override
    public final Object getValue() {
        eh.l lVar = e40.b.b;
        Object obj = F.get(this);
        if (obj == lVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        eh.l lVar = e40.b.b;
        if (obj == null) {
            obj = lVar;
        }
        if (obj2 == null) {
            obj2 = lVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = e40.b.b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        e40.c[] cVarArr;
        eh.l lVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.m.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.m.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.E;
            if ((i2 & 1) != 0) {
                this.E = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.E = i3;
            e40.c[] cVarArr2 = this.A;
            while (true) {
                q1[] q1VarArr = (q1[]) cVarArr2;
                if (q1VarArr != null) {
                    for (q1 q1Var : q1VarArr) {
                        if (q1Var != null) {
                            AtomicReference atomicReference = q1Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (lVar = o.e)) {
                                    break;
                                }
                                eh.l lVar2 = o.d;
                                if (obj4 != lVar2) {
                                    if (atomicReference.compareAndSet(obj4, lVar2)) {
                                        ((a40.k) obj4).resumeWith(g00.b0.a);
                                        break;
                                    }
                                } else {
                                    if (atomicReference.compareAndSet(obj4, lVar)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.E;
                    if (i == i3) {
                        this.E = i3 + 1;
                        return true;
                    }
                    cVarArr = this.A;
                }
                cVarArr2 = cVarArr;
                i3 = i;
            }
        }
    }
}
