package k9;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

public final class v0 implements Runnable {
    public final int A;
    public final z0 B;

    public v0(z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    public v0(z0 z0Var, sd.y1 y1Var) {
        this.A = 2;
        this.B = z0Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                z0 z0Var = this.B;
                if (!z0Var.f9567k && ((l9.v) z0Var.f9565i.A).f10187e.a() == null) {
                    z0Var.m();
                    break;
                }
                break;
            case 1:
                z0 z0Var2 = this.B;
                Context context = z0Var2.f9557a;
                ComponentName componentNameB = z0Var2.f9559c.f9293a.b();
                x0 x0Var = new x0(z0Var2);
                Bundle bundleE = z0Var2.f9558b.f9521d.e();
                l9.h hVar = new l9.h();
                hVar.f10149a = new l9.f(context, componentNameB, x0Var, bundleE);
                z0Var2.f9566j = hVar;
                e7.a.b("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                ((l9.f) hVar.f10149a).f10139b.connect();
                break;
            default:
                u uVar = this.B.f9558b;
                uVar.getClass();
                ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                s sVar = uVar.f9522e;
                sVar.getClass();
                s.z();
                sVar.o();
                break;
        }
    }
}
