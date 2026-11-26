package ki;

import a8.o0;
import android.content.Context;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.play_billing.q;
import ii.n;
import java.util.ArrayList;
import qd.l0;
import qd.u;
import sg.f;

public final class b {

    public volatile Object f9679a;

    public final Object f9680b;

    public volatile Object f9681c;

    public b(n nVar) {
        ni.b bVar = new ni.b();
        f fVar = new f();
        this.f9681c = bVar;
        this.f9680b = new ArrayList();
        this.f9679a = fVar;
        nVar.a(new a(this));
    }

    public b(Object obj) {
        this.f9680b = obj;
    }

    public qd.b a() {
        Context context = (Context) this.f9680b;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((u) this.f9681c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((o0) this.f9679a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((o0) this.f9679a).getClass();
        if (((u) this.f9681c) == null) {
            o0 o0Var = (o0) this.f9679a;
            return b() ? new l0(o0Var, context, this) : new qd.b(o0Var, context, this);
        }
        o0 o0Var2 = (o0) this.f9679a;
        u uVar = (u) this.f9681c;
        return b() ? new l0(o0Var2, context, uVar, this) : new qd.b(o0Var2, context, uVar, this);
    }

    public boolean b() {
        try {
            Context context = (Context) this.f9680b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), Cast.MAX_NAMESPACE_LENGTH).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e3) {
            q.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e3);
            return false;
        }
    }
}
