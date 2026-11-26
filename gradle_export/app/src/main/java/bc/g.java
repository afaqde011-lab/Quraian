package bc;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import g00.b0;
import java.lang.ref.WeakReference;
import lb.j;
import sd.p1;
import tf.y;

public final class g implements ComponentCallbacks2 {
    public final WeakReference A;
    public Context B;
    public vb.e C;
    public boolean D;
    public boolean E = true;

    public g(j jVar) {
        this.A = new WeakReference(jVar);
    }

    public final synchronized void a() {
        b0 b0Var;
        vb.e yVar;
        try {
            j jVar = (j) this.A.get();
            if (jVar != null) {
                if (this.C == null) {
                    if (jVar.f10209d.f2484b) {
                        Context context = jVar.f10206a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager == null || n4.b.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                            yVar = new y(15);
                        } else {
                            try {
                                yVar = new p1(connectivityManager, this);
                            } catch (Exception unused) {
                                yVar = new y(15);
                            }
                        }
                    } else {
                        yVar = new y(15);
                    }
                    this.C = yVar;
                    this.E = yVar.a();
                }
                b0Var = b0.a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.D) {
                return;
            }
            this.D = true;
            Context context = this.B;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            vb.e eVar = this.C;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.A.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((j) this.A.get()) != null ? b0.a : null) == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override
    public final synchronized void onTrimMemory(int i10) {
        b0 b0Var;
        try {
            j jVar = (j) this.A.get();
            if (jVar != null) {
                ub.d dVar = (ub.d) jVar.f10208c.getValue();
                if (dVar != null) {
                    dVar.f15236a.d(i10);
                    dVar.f15237b.d(i10);
                }
                b0Var = b0.a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
