package rf;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.cast.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import tf.b4;
import tf.e1;
import tf.e4;
import tf.h1;
import tf.i2;
import tf.q0;
import tf.q2;
import tf.t2;
import tf.v;
import tf.z1;
import u.e;

public final class a extends c {

    public final h1 f13225a;

    public final i2 f13226b;

    public a(h1 h1Var) {
        d0.h(h1Var);
        this.f13225a = h1Var;
        i2 i2Var = h1Var.M;
        h1.f(i2Var);
        this.f13226b = i2Var;
    }

    @Override
    public final void b(String str, String str2, Bundle bundle) {
        i2 i2Var = this.f13226b;
        ((h1) i2Var.B).K.getClass();
        i2Var.a1(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override
    public final void c(Bundle bundle) {
        i2 i2Var = this.f13226b;
        ((h1) i2Var.B).K.getClass();
        i2Var.i1(bundle, System.currentTimeMillis());
    }

    @Override
    public final void d(String str) {
        h1 h1Var = this.f13225a;
        v vVar = h1Var.N;
        h1.d(vVar);
        h1Var.K.getClass();
        vVar.X0(SystemClock.elapsedRealtime(), str);
    }

    @Override
    public final void e(String str) {
        h1 h1Var = this.f13225a;
        v vVar = h1Var.N;
        h1.d(vVar);
        h1Var.K.getClass();
        vVar.W0(SystemClock.elapsedRealtime(), str);
    }

    @Override
    public final void f(String str, String str2, Bundle bundle) {
        i2 i2Var = this.f13225a.M;
        h1.f(i2Var);
        i2Var.j1(str, str2, bundle);
    }

    @Override
    public final List g(String str, String str2) {
        i2 i2Var = this.f13226b;
        h1 h1Var = (h1) i2Var.B;
        e1 e1Var = h1Var.G;
        q0 q0Var = h1Var.F;
        h1.g(e1Var);
        if (e1Var.b1()) {
            h1.g(q0Var);
            q0Var.G.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (ru.c.a()) {
            h1.g(q0Var);
            q0Var.G.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        e1 e1Var2 = h1Var.G;
        h1.g(e1Var2);
        e1Var2.f1(atomicReference, 5000L, "get conditional user properties", new r0(i2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return e4.K1(list);
        }
        h1.g(q0Var);
        q0Var.G.c((Object) null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override
    public final Map h(String str, String str2, boolean z10) {
        i2 i2Var = this.f13226b;
        h1 h1Var = (h1) i2Var.B;
        e1 e1Var = h1Var.G;
        q0 q0Var = h1Var.F;
        h1.g(e1Var);
        if (e1Var.b1()) {
            h1.g(q0Var);
            q0Var.G.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (ru.c.a()) {
            h1.g(q0Var);
            q0Var.G.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        e1 e1Var2 = h1Var.G;
        h1.g(e1Var2);
        e1Var2.f1(atomicReference, 5000L, "get user properties", new z1(i2Var, atomicReference, str, str2, z10));
        List<b4> list = (List) atomicReference.get();
        if (list == null) {
            h1.g(q0Var);
            q0Var.G.c(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (b4 b4Var : list) {
            Object objA = b4Var.a();
            if (objA != null) {
                eVar.put(b4Var.B, objA);
            }
        }
        return eVar;
    }

    @Override
    public final String zzh() {
        t2 t2Var = ((h1) this.f13226b.B).L;
        h1.f(t2Var);
        q2 q2Var = t2Var.D;
        if (q2Var != null) {
            return q2Var.f14694a;
        }
        return null;
    }

    @Override
    public final String zzi() {
        t2 t2Var = ((h1) this.f13226b.B).L;
        h1.f(t2Var);
        q2 q2Var = t2Var.D;
        if (q2Var != null) {
            return q2Var.f14695b;
        }
        return null;
    }

    @Override
    public final String zzj() {
        return (String) this.f13226b.H.get();
    }

    @Override
    public final String zzk() {
        return this.f13226b.k1();
    }

    @Override
    public final long zzl() {
        e4 e4Var = this.f13225a.I;
        h1.e(e4Var);
        return e4Var.R1();
    }

    @Override
    public final int zzr(String str) {
        i2 i2Var = this.f13226b;
        i2Var.getClass();
        d0.e(str);
        ((h1) i2Var.B).getClass();
        return 25;
    }
}
