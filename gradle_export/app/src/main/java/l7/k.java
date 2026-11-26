package l7;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.common.internal.d0;
import java.util.Iterator;
import tf.e4;
import tf.h1;
import tf.q0;
import tf.r;

public final class k {

    public final int f10087a = 0;

    public final long f10088b;

    public final long f10089c;

    public final Object f10090d;

    public final Object f10091e;

    public final Object f10092f;

    public final Object f10093g;

    public k(long j9, m7.m mVar, m7.b bVar, t7.d dVar, long j10, j jVar) {
        this.f10088b = j9;
        this.f10091e = mVar;
        this.f10092f = bVar;
        this.f10089c = j10;
        this.f10090d = dVar;
        this.f10093g = jVar;
    }

    public k(h1 h1Var, String str, String str2, String str3, long j9, long j10, Bundle bundle) {
        r rVar;
        d0.e(str2);
        d0.e(str3);
        this.f10090d = str2;
        this.f10091e = str3;
        this.f10092f = true == TextUtils.isEmpty(str) ? null : str;
        this.f10088b = j9;
        this.f10089c = j10;
        if (j10 != 0 && j10 > j9) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.J.c(q0.d1(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.b("Param name can't be null");
                    it.remove();
                } else {
                    e4 e4Var = h1Var.I;
                    h1.e(e4Var);
                    Object objC1 = e4Var.c1(bundle2.get(next), next);
                    if (objC1 == null) {
                        q0 q0Var3 = h1Var.F;
                        h1.g(q0Var3);
                        q0Var3.J.c(h1Var.J.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        e4 e4Var2 = h1Var.I;
                        h1.e(e4Var2);
                        e4Var2.k1(bundle2, next, objC1);
                    }
                }
            }
            rVar = new r(bundle2);
        }
        this.f10093g = rVar;
    }

    public k(h1 h1Var, String str, String str2, String str3, long j9, long j10, r rVar) {
        d0.e(str2);
        d0.e(str3);
        d0.h(rVar);
        this.f10090d = str2;
        this.f10091e = str3;
        this.f10092f = true == TextUtils.isEmpty(str) ? null : str;
        this.f10088b = j9;
        this.f10089c = j10;
        if (j10 != 0 && j10 > j9) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.J.d("Event created with reverse previous/current timestamps. appId, name", q0.d1(str2), q0.d1(str3));
        }
        this.f10093g = rVar;
    }

    public k a(long j9, m7.m mVar) throws BehindLiveWindowException {
        long jO;
        long jO2;
        j jVarB = ((m7.m) this.f10091e).b();
        j jVarB2 = mVar.b();
        if (jVarB == null) {
            return new k(j9, mVar, (m7.b) this.f10092f, (t7.d) this.f10090d, this.f10089c, jVarB);
        }
        if (!jVarB.v()) {
            return new k(j9, mVar, (m7.b) this.f10092f, (t7.d) this.f10090d, this.f10089c, jVarB2);
        }
        long jZ = jVarB.z(j9);
        if (jZ == 0) {
            return new k(j9, mVar, (m7.b) this.f10092f, (t7.d) this.f10090d, this.f10089c, jVarB2);
        }
        jVarB2.getClass();
        long jX = jVarB.x();
        long jC = jVarB.c(jX);
        long j10 = jZ + jX;
        long j11 = j10 - 1;
        long jE = jVarB.e(j11, j9) + jVarB.c(j11);
        long jX2 = jVarB2.x();
        long jC2 = jVarB2.c(jX2);
        long j12 = this.f10089c;
        if (jE != jC2) {
            if (jE < jC2) {
                throw new BehindLiveWindowException();
            }
            if (jC2 < jC) {
                jO2 = j12 - (jVarB2.o(jC, j9) - jX);
            } else {
                jO = jVarB.o(jC2, j9) - jX2;
            }
            return new k(j9, mVar, (m7.b) this.f10092f, (t7.d) this.f10090d, jO2, jVarB2);
        }
        jO = j10 - jX2;
        jO2 = jO + j12;
        return new k(j9, mVar, (m7.b) this.f10092f, (t7.d) this.f10090d, jO2, jVarB2);
    }

    public long b(long j9) {
        j jVar = (j) this.f10093g;
        jVar.getClass();
        long j10 = this.f10088b;
        long jH = jVar.h(j10, j9) + this.f10089c;
        jVar.getClass();
        return (jVar.B(j10, j9) + jH) - 1;
    }

    public long c() {
        j jVar = (j) this.f10093g;
        jVar.getClass();
        return jVar.z(this.f10088b);
    }

    public long d(long j9) {
        long jE = e(j9);
        j jVar = (j) this.f10093g;
        jVar.getClass();
        return jVar.e(j9 - this.f10089c, this.f10088b) + jE;
    }

    public long e(long j9) {
        j jVar = (j) this.f10093g;
        jVar.getClass();
        return jVar.c(j9 - this.f10089c);
    }

    public boolean f(long j9, long j10) {
        j jVar = (j) this.f10093g;
        jVar.getClass();
        return jVar.v() || j10 == -9223372036854775807L || d(j9) <= j10;
    }

    public k g(h1 h1Var, long j9) {
        return new k(h1Var, (String) this.f10092f, (String) this.f10090d, (String) this.f10091e, this.f10088b, j9, (r) this.f10093g);
    }

    public String toString() {
        switch (this.f10087a) {
            case 1:
                String string = ((r) this.f10093g).toString();
                String str = (String) this.f10090d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f10091e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                a1.b.z(sb2, "Event{appId='", str, "', name='", str2);
                return w.c.l(sb2, "', params=", string, "}");
            default:
                return super.toString();
        }
    }
}
