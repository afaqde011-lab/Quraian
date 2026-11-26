package k9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;

public final class k1 implements z1 {
    public final l9.g0 B;
    public final m1 D;
    public final Object A = new Object();
    public final ArrayList C = new ArrayList();

    public k1(m1 m1Var, l9.g0 g0Var) {
        this.D = m1Var;
        this.B = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return Objects.equals(this.B, ((k1) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.B);
    }

    @Override
    public final void p(int i10, int i11, String str, e1 e1Var) {
        Bundle bundle = e1Var != null ? e1Var.f9276a : null;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        l9.g0 g0Var = this.B;
        if (g0Var == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle2 == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        l9.p pVar = this.D.A;
        pVar.getClass();
        ((m1) pVar.f10174d).G.post(new com.google.android.gms.internal.cast.r0(1, pVar, g0Var, str, bundle2, false));
    }

    @Override
    public final void t(int i10, int i11, String str, e1 e1Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A) {
            try {
                for (int size = this.C.size() - 1; size >= 0; size--) {
                    l1 l1Var = (l1) this.C.get(size);
                    if (Objects.equals(this.B, l1Var.f9372b) && l1Var.f9373c.equals(str)) {
                        arrayList.add(l1Var);
                        this.C.remove(size);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                e7.i0.M(this.D.M.l, new ji.a(this, arrayList, 14));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
