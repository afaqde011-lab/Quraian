package a40;

public abstract class v extends k00.a implements k00.e {
    public static final u B = new u(k00.d.A, new a1.s0(3));

    public v() {
        super(k00.d.A);
    }

    @Override
    public final k00.g get(k00.h key) {
        k00.g gVar;
        kotlin.jvm.internal.m.e(key, "key");
        if (key instanceof u) {
            u uVar = (u) key;
            k00.h key2 = this.A;
            kotlin.jvm.internal.m.e(key2, "key");
            if ((key2 == uVar || uVar.B == key2) && (gVar = (k00.g) uVar.A.invoke(this)) != null) {
                return gVar;
            }
        } else if (k00.d.A == key) {
            return this;
        }
        return null;
    }

    @Override
    public final k00.i minusKey(k00.h key) {
        kotlin.jvm.internal.m.e(key, "key");
        if (key instanceof u) {
            u uVar = (u) key;
            k00.h key2 = this.A;
            kotlin.jvm.internal.m.e(key2, "key");
            if ((key2 != uVar && uVar.B != key2) || ((k00.g) uVar.A.invoke(this)) == null) {
                return this;
            }
        } else if (k00.d.A != key) {
            return this;
        }
        return k00.j.A;
    }

    public abstract void n0(k00.i iVar, Runnable runnable);

    public void o0(k00.i iVar, Runnable runnable) {
        f40.a.i(this, iVar, runnable);
    }

    public boolean p0(k00.i iVar) {
        return !(this instanceof b2);
    }

    public v q0(int i) {
        f40.a.a(i);
        return new f40.f(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c0.q(this);
    }
}
