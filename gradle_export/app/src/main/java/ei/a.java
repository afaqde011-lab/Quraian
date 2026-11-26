package ei;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.z0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import tf.j2;

public final class a implements j2 {

    public final j1 f5381a;

    public a(j1 j1Var) {
        this.f5381a = j1Var;
    }

    @Override
    public final void b(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f5381a;
        j1Var.c(new w0(j1Var, str, str2, bundle, 1));
    }

    @Override
    public final void c(Bundle bundle) {
        j1 j1Var = this.f5381a;
        j1Var.c(new v0(j1Var, bundle));
    }

    @Override
    public final void d(String str) {
        j1 j1Var = this.f5381a;
        j1Var.c(new z0(j1Var, str, 1));
    }

    @Override
    public final void e(String str) {
        j1 j1Var = this.f5381a;
        j1Var.c(new z0(j1Var, str, 0));
    }

    @Override
    public final void f(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f5381a;
        j1Var.c(new w0(j1Var, str, str2, bundle, 0));
    }

    @Override
    public final List g(String str, String str2) {
        return this.f5381a.f(str, str2);
    }

    @Override
    public final Map h(String str, String str2, boolean z10) {
        return this.f5381a.a(str, str2, z10);
    }

    @Override
    public final String zzh() {
        g0 g0Var = new g0();
        j1 j1Var = this.f5381a;
        j1Var.c(new b1(j1Var, g0Var, 3));
        return (String) g0.g2(g0Var.f(500L), String.class);
    }

    @Override
    public final String zzi() {
        g0 g0Var = new g0();
        j1 j1Var = this.f5381a;
        j1Var.c(new b1(j1Var, g0Var, 4));
        return (String) g0.g2(g0Var.f(500L), String.class);
    }

    @Override
    public final String zzj() {
        g0 g0Var = new g0();
        j1 j1Var = this.f5381a;
        j1Var.c(new b1(j1Var, g0Var, 1));
        return (String) g0.g2(g0Var.f(50L), String.class);
    }

    @Override
    public final String zzk() {
        g0 g0Var = new g0();
        j1 j1Var = this.f5381a;
        j1Var.c(new b1(j1Var, g0Var, 0));
        return (String) g0.g2(g0Var.f(500L), String.class);
    }

    @Override
    public final long zzl() {
        g0 g0Var = new g0();
        j1 j1Var = this.f5381a;
        j1Var.c(new b1(j1Var, g0Var, 2));
        Long l = (Long) g0.g2(g0Var.f(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = j1Var.f3781d + 1;
        j1Var.f3781d = i10;
        return jNextLong + ((long) i10);
    }

    @Override
    public final int zzr(String str) {
        return this.f5381a.b(str);
    }
}
