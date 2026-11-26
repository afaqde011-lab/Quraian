package tf;

import android.app.Activity;
import android.os.Bundle;
import android.os.DeadObjectException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class l1 implements Callable {

    public final int f14655a;

    public final Object f14656b;

    public final Object f14657c;

    public final Object f14658d;

    public final Object f14659e;

    public l1(qd.b bVar, Bundle bundle, Activity activity, ah.d dVar) {
        this.f14655a = 4;
        this.f14656b = bVar;
        this.f14657c = bundle;
        this.f14658d = activity;
        this.f14659e = dVar;
    }

    public l1(n1 n1Var, String str, String str2, String str3, int i10) {
        this.f14655a = i10;
        this.f14656b = str;
        this.f14657c = str2;
        this.f14658d = str3;
        this.f14659e = n1Var;
    }

    @Override
    public final Object call() {
        com.google.android.gms.internal.play_billing.c cVar;
        switch (this.f14655a) {
            case 0:
                n1 n1Var = (n1) this.f14659e;
                n1Var.f14673e.x();
                m mVar = n1Var.f14673e.C;
                y3.R(mVar);
                return mVar.R1((String) this.f14656b, (String) this.f14657c, (String) this.f14658d);
            case 1:
                n1 n1Var2 = (n1) this.f14659e;
                n1Var2.f14673e.x();
                m mVar2 = n1Var2.f14673e.C;
                y3.R(mVar2);
                return mVar2.R1((String) this.f14656b, (String) this.f14657c, (String) this.f14658d);
            case 2:
                n1 n1Var3 = (n1) this.f14659e;
                n1Var3.f14673e.x();
                m mVar3 = n1Var3.f14673e.C;
                y3.R(mVar3);
                return mVar3.V1((String) this.f14656b, (String) this.f14657c, (String) this.f14658d);
            case 3:
                n1 n1Var4 = (n1) this.f14659e;
                n1Var4.f14673e.x();
                m mVar4 = n1Var4.f14673e.C;
                y3.R(mVar4);
                return mVar4.V1((String) this.f14656b, (String) this.f14657c, (String) this.f14658d);
            default:
                qd.b bVar = (qd.b) this.f14656b;
                Bundle bundle = (Bundle) this.f14657c;
                Activity activity = (Activity) this.f14658d;
                ah.d dVar = (ah.d) this.f14659e;
                try {
                    synchronized (bVar.f12839a) {
                        cVar = bVar.f12847i;
                        break;
                    }
                    if (cVar == null) {
                        bVar.E(-1, 107, null);
                    } else {
                        ((com.google.android.gms.internal.play_billing.a) cVar).A2(bVar.f12845g.getPackageName(), bundle, new qd.g0(new WeakReference(activity), dVar));
                    }
                } catch (DeadObjectException e3) {
                    bVar.E(-1, 106, e3);
                } catch (Exception e10) {
                    bVar.E(6, 106, e10);
                }
                return null;
        }
    }
}
