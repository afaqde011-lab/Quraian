package bd;

import a40.a0;
import a40.c0;
import android.net.Network;
import android.os.Handler;
import android.util.SparseBooleanArray;
import e7.i0;
import g00.p;
import java.util.ArrayList;
import java.util.Arrays;
import k9.a2;
import k9.b2;
import k9.s1;
import k9.t2;
import kh.q;
import kotlin.jvm.internal.m;
import x40.f0;
import x40.j;
import x40.k;

public final class f implements q {
    public boolean A = true;
    public boolean B;
    public Object C;
    public Object D;

    public static void i(f fVar, Network network, boolean z10, boolean z11, int i10) {
        if ((i10 & 2) != 0) {
            z10 = fVar.A;
        }
        if ((i10 & 4) != 0) {
            z11 = fVar.B;
        }
        fVar.getClass();
        if (((Network) fVar.C).equals(network)) {
            boolean z12 = (fVar.A == z10 && fVar.B == z11) ? false : true;
            fVar.A = z10;
            fVar.B = z11;
            if (z12) {
                fVar.f();
            }
        }
    }

    public ke.a a() {
        return new ke.a(this.A, (String) this.C, (String) this.D, this.B, null, null, false);
    }

    public k b() {
        return new k(this.A, this.B, (String[]) this.C, (String[]) this.D);
    }

    public void c(String... strArr) {
        m.e(strArr, "cipherSuites");
        if (!this.A) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.C = (String[]) strArr.clone();
    }

    public void d(j... jVarArr) {
        m.e(jVarArr, "cipherSuites");
        if (!this.A) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(jVarArr.length);
        for (j jVar : jVarArr) {
            arrayList.add(jVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public dd.a e() {
        return (dd.a) ((p) this.D).getValue();
    }

    public void f() {
        rc.c cVar = (rc.c) ((wi.b) this.D).B;
        if (!this.A || this.B) {
            cVar.f().b("AndroidNetworkListener, onNetworkUnavailable.");
            cVar.f13151a.f13186q = Boolean.TRUE;
        } else {
            cVar.f().b("AndroidNetworkListener, onNetworkAvailable.");
            cVar.f13151a.f13186q = Boolean.FALSE;
            c0.y(cVar.f13153c, cVar.f13154d, (a0) null, new a1.a0(cVar, (k00.c) null, 18), 2);
        }
    }

    public void g(String... strArr) {
        m.e(strArr, "tlsVersions");
        if (!this.A) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.D = (String[]) strArr.clone();
    }

    public void h(f0... f0VarArr) {
        if (!this.A) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(f0VarArr.length);
        for (f0 f0Var : f0VarArr) {
            arrayList.add(f0Var.A);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        g((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override
    public void h0(Throwable th2) {
    }

    @Override
    public void onSuccess(Object obj) {
        final b2 b2Var = (b2) obj;
        s1 s1Var = ((t2) this.D).f9463f;
        Handler handler = s1Var.l;
        final a2 a2Var = (a2) this.C;
        final boolean z10 = this.A;
        final boolean z11 = this.B;
        i0.M(handler, new ji.a(s1Var, a2Var, new Runnable() {
            @Override
            public final void run() {
                s1 s1Var2 = ((t2) this.A.D).f9463f;
                v3 v3Var = s1Var2.f9430t;
                q3.f(v3Var, b2Var);
                int playbackState = v3Var.getPlaybackState();
                if (z10) {
                    if (playbackState == 1) {
                        if (v3Var.isCommandAvailable(2)) {
                            v3Var.prepare();
                        }
                    } else if (playbackState == 4 && v3Var.isCommandAvailable(4)) {
                        v3Var.seekToDefaultPosition();
                    }
                }
                boolean z12 = z11;
                if (z12 && v3Var.isCommandAvailable(1)) {
                    v3Var.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 : new int[]{31, 2}) {
                    ta.c0.A(!false);
                    sparseBooleanArray.append(i10, true);
                }
                if (z12) {
                    ta.c0.A(!false);
                    sparseBooleanArray.append(1, true);
                }
                ta.c0.A(!false);
                s1Var2.y(a2Var);
            }
        }));
    }
}
