package o9;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

public abstract class t {
    public final Context A;
    public final q B;
    public final androidx.mediarouter.app.d C = new androidx.mediarouter.app.d(this, 9);
    public a D;
    public n E;
    public boolean F;
    public b20.z G;
    public boolean H;

    public t(Context context, q qVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.A = context;
        if (qVar == null) {
            this.B = new q(new ComponentName(context, getClass()), 0);
        } else {
            this.B = qVar;
        }
    }

    public p a(String str, s sVar) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public r b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public r c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str, s.f11865b);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public r d(String str, s sVar) {
        return b(str);
    }

    public abstract void e(n nVar);

    public final void f(b20.z zVar) {
        c0.b();
        if (this.G != zVar) {
            this.G = zVar;
            if (this.H) {
                return;
            }
            this.H = true;
            this.C.sendEmptyMessage(1);
        }
    }

    public final void g(n nVar) {
        c0.b();
        if (Objects.equals(this.E, nVar)) {
            return;
        }
        this.E = nVar;
        if (this.F) {
            return;
        }
        this.F = true;
        this.C.sendEmptyMessage(2);
    }
}
