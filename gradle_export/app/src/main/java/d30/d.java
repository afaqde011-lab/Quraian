package d30;

import a1.u0;
import androidx.media3.common.q;

public final class d extends h implements m {
    public volatile u0 D;
    public final a20.d E;

    public d(l lVar, a30.l lVar2, a20.d dVar) {
        super(lVar, lVar2);
        this.E = dVar;
        if (lVar == null) {
            g(0);
            throw null;
        }
        this.D = null;
    }

    public static void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override
    public final void e(Object obj) {
        this.D = new u0(obj);
        try {
            if (obj == null) {
                a(2);
                throw null;
            }
            this.E.invoke(obj);
            this.D = null;
        } catch (Throwable th) {
            this.D = null;
            throw th;
        }
    }

    @Override
    public final q f(boolean z) {
        return new q(new e30.e(va.a.R(g30.l.d)), false, 5);
    }

    @Override
    public final Object invoke() {
        Object objInvoke;
        u0 u0Var = this.D;
        if (u0Var == null || ((Thread) u0Var.B) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) u0Var.B) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = u0Var.C;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        g(2);
        throw null;
    }
}
