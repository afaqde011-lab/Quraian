package b50;

import android.util.Log;
import c3.a3;
import c3.z2;
import g00.b0;
import h00.r;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.z;
import ri.t1;

public final class l extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public l(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                t1 t1Var = ((x40.h) this.B).b;
                kotlin.jvm.internal.m.b(t1Var);
                return t1Var.q(((x40.a) this.D).h.d, ((x40.o) this.C).a());
            case 1:
                c3.a aVar = (c3.a) this.B;
                aVar.removeOnAttachStateChangeListener((z2) this.C);
                a3 listener = (a3) this.D;
                kotlin.jvm.internal.m.e(listener, "listener");
                w00.a.w(aVar).a.remove(listener);
                return b0.a;
            case 2:
                ((Executor) this.B).execute(new ab.f((f5.g) this.C, (z) this.D, 17));
                return b0.a;
            case 3:
                StringBuilder sb = new StringBuilder("During clear credential sign out failed with ");
                Exception exc = (Exception) this.B;
                sb.append(exc);
                Log.w("PlayServicesImpl", sb.toString());
                ((Executor) this.C).execute(new ab.f((f5.g) this.D, exc, 18));
                return b0.a;
            case 4:
                ((Executor) this.B).execute(new ab.f((f5.g) this.C, this.D, 24));
                return b0.a;
            default:
                List<Certificate> listQ = (List) this.C;
                t1 t1Var2 = ((x40.h) this.B).b;
                if (t1Var2 != null) {
                    listQ = t1Var2.q((String) this.D, listQ);
                }
                ArrayList arrayList = new ArrayList(r.q0(listQ, 10));
                for (Certificate certificate : listQ) {
                    kotlin.jvm.internal.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
