package f40;

import a40.t0;
import a40.u0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class v {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile int _size$volatile;
    public t0[] a;

    public final void a(t0 t0Var) {
        t0Var.c((u0) this);
        t0[] t0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            t0VarArr = (t0[]) objArrCopyOf;
            this.a = t0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        t0VarArr[i] = t0Var;
        t0Var.B = i;
        c(i);
    }

    public final t0 b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        kotlin.jvm.internal.m.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                t0 t0Var = objArr2[i];
                kotlin.jvm.internal.m.b(t0Var);
                Object obj2 = objArr2[i5];
                kotlin.jvm.internal.m.b(obj2);
                if (t0Var.compareTo(obj2) < 0) {
                    d(i, i5);
                    c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        kotlin.jvm.internal.m.b(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            kotlin.jvm.internal.m.b(comparable3);
                            obj = objArr[i3];
                            kotlin.jvm.internal.m.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        kotlin.jvm.internal.m.b(comparable);
                        comparable2 = objArr[i4];
                        kotlin.jvm.internal.m.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    kotlin.jvm.internal.m.b(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        kotlin.jvm.internal.m.b(comparable3);
                        obj = objArr[i3];
                        kotlin.jvm.internal.m.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    kotlin.jvm.internal.m.b(comparable);
                    comparable2 = objArr[i4];
                    kotlin.jvm.internal.m.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i4);
                    i = i4;
                }
            }
        }
        t0 t0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.m.b(t0Var2);
        t0Var2.c(null);
        t0Var2.B = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return t0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            t0[] t0VarArr = this.a;
            kotlin.jvm.internal.m.b(t0VarArr);
            int i2 = (i - 1) / 2;
            t0 t0Var = t0VarArr[i2];
            kotlin.jvm.internal.m.b(t0Var);
            t0 t0Var2 = t0VarArr[i];
            kotlin.jvm.internal.m.b(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        t0[] t0VarArr = this.a;
        kotlin.jvm.internal.m.b(t0VarArr);
        t0 t0Var = t0VarArr[i2];
        kotlin.jvm.internal.m.b(t0Var);
        t0 t0Var2 = t0VarArr[i];
        kotlin.jvm.internal.m.b(t0Var2);
        t0VarArr[i] = t0Var;
        t0VarArr[i2] = t0Var2;
        t0Var.B = i;
        t0Var2.B = i2;
    }
}
