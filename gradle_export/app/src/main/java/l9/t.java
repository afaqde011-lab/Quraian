package l9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import k9.a2;
import k9.k1;
import k9.m1;

public final class t implements Runnable {
    public final int A;
    public final h B;
    public final String C;
    public final Bundle D;
    public final c.d E;
    public final h F;

    public t(h hVar, h hVar2, String str, Bundle bundle, c.d dVar, int i10) {
        this.A = i10;
        this.F = hVar;
        this.B = hVar2;
        this.C = str;
        this.D = bundle;
        this.E = dVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                IBinder binder = ((Messenger) this.B.f10149a).getBinder();
                h hVar = this.F;
                l lVar = (l) ((m1) hVar.f10149a).E.get(binder);
                if (lVar == null) {
                    e7.a.m("MBServiceCompat", "search for callback that isn't registered query=" + this.C);
                    return;
                }
                m1 m1Var = (m1) hVar.f10149a;
                String str = this.C;
                j jVar = new j(str, this.E, 1);
                m1Var.F = lVar;
                a2 a2VarB = m1Var.b();
                if (a2VarB == null) {
                    jVar.f(null);
                } else if (TextUtils.isEmpty(str)) {
                    e7.a.m("MLSLegacyStub", "Ignoring empty query from " + a2VarB);
                    jVar.f(null);
                } else if (a2VarB.f9209d instanceof k1) {
                    jVar.a();
                    e7.i0.M(m1Var.M.l, new com.revenuecat.purchases.d(m1Var, a2VarB, jVar, str, this.D, 6));
                }
                m1Var.F = null;
                if (!jVar.b()) {
                    throw new IllegalStateException(a1.b.o("onSearch must call detach() or sendResult() before returning for query=", str));
                }
                return;
            default:
                IBinder binder2 = ((Messenger) this.B.f10149a).getBinder();
                h hVar2 = this.F;
                l lVar2 = (l) ((m1) hVar2.f10149a).E.get(binder2);
                Bundle bundle = this.D;
                if (lVar2 == null) {
                    e7.a.m("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.C + ", extras=" + bundle);
                    return;
                }
                m1 m1Var2 = (m1) hVar2.f10149a;
                String str2 = this.C;
                j jVar2 = new j(str2, this.E, 2);
                m1Var2.F = lVar2;
                Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
                a2 a2VarB2 = m1Var2.b();
                if (a2VarB2 == null) {
                    jVar2.e();
                } else {
                    jVar2.a();
                    e7.i0.M(m1Var2.M.l, new com.revenuecat.purchases.d(m1Var2, str2, a2VarB2, jVar2, bundle2, 4));
                }
                m1Var2.F = null;
                if (jVar2.b()) {
                    return;
                }
                throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str2 + " extras=" + bundle);
        }
    }
}
