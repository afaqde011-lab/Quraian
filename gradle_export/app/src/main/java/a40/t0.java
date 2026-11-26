package a40;

public abstract class t0 implements Runnable, Comparable, o0 {
    public long A;
    public int B = -1;
    private volatile Object _heap;

    public t0(long j) {
        this.A = j;
    }

    public final int a(long j, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == c0.b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (v0.I.get(v0Var) == 1) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.c = j;
                    } else {
                        long j2 = t0Var.A;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - u0Var.c > 0) {
                            u0Var.c = j;
                        }
                    }
                    long j3 = this.A;
                    long j4 = u0Var.c;
                    if (j3 - j4 < 0) {
                        this.A = j4;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(u0 u0Var) {
        if (this._heap == c0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        long j = this.A - ((t0) obj).A;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                eh.l lVar = c0.b;
                if (obj == lVar) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    synchronized (u0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof f40.v ? (f40.v) obj2 : null) != null) {
                            u0Var.b(this.B);
                        }
                    }
                }
                this._heap = lVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.A + ']';
    }
}
