package c3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

public final class j2 implements b2.s {
    public final Context A;
    public f40.c B;
    public final l1.e1 C = new l1.e1(1.0f);
    public a40.u1 D;

    public j2(Context context) {
        this.A = context;
    }

    @Override
    public final float I() {
        k00.c cVar;
        d40.n1 n1Var;
        if (this.D == null) {
            Context context = this.A;
            u.i0 i0Var = q3.f2756a;
            synchronized (i0Var) {
                try {
                    Object objG = i0Var.g(context);
                    cVar = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        c40.h hVarB = ri.t1.b(-1, 6, null);
                        bt.a2 a2Var = new bt.a2(new o3(contentResolver, uriFor, new p3(hVarB, Handler.createAsync(Looper.getMainLooper())), hVarB, context, null));
                        a40.w1 w1VarE = a40.c0.e();
                        h40.e eVar = a40.m0.a;
                        objG = d40.o.x(a2Var, new f40.c(rd.a.P(w1VarE, f40.m.a)), d40.g1.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        i0Var.m(context, objG);
                    }
                    n1Var = (d40.n1) objG;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.C.i(((Number) n1Var.getValue()).floatValue());
            f40.c cVar2 = this.B;
            if (cVar2 == null) {
                throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.D = a40.c0.y(cVar2, (k00.i) null, (a40.a0) null, new a1.d(n1Var, this, cVar, 19), 3);
        }
        return this.C.h();
    }

    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }
}
