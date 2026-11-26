package x40;

import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

public final class k {
    public static final k e;
    public static final k f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        j jVar = j.r;
        j jVar2 = j.s;
        j jVar3 = j.t;
        j jVar4 = j.l;
        j jVar5 = j.n;
        j jVar6 = j.m;
        j jVar7 = j.o;
        j jVar8 = j.q;
        j jVar9 = j.p;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        j[] jVarArr2 = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.j, j.k, j.h, j.i, j.f, j.g, j.e};
        bd.f fVar = new bd.f();
        fVar.d((j[]) Arrays.copyOf(jVarArr, 9));
        f0 f0Var = f0.TLS_1_3;
        f0 f0Var2 = f0.TLS_1_2;
        fVar.h(new f0[]{f0Var, f0Var2});
        fVar.B = true;
        fVar.b();
        bd.f fVar2 = new bd.f();
        fVar2.d((j[]) Arrays.copyOf(jVarArr2, 16));
        fVar2.h(new f0[]{f0Var, f0Var2});
        fVar2.B = true;
        e = fVar2.b();
        bd.f fVar3 = new bd.f();
        fVar3.d((j[]) Arrays.copyOf(jVarArr2, 16));
        fVar3.h(new f0[]{f0Var, f0Var2, f0.TLS_1_1, f0.TLS_1_0});
        fVar3.B = true;
        fVar3.b();
        f = new k(false, false, null, null);
    }

    public k(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.b.c(str));
        }
        return h00.q.n1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !y40.b.i(strArr, sSLSocket.getEnabledProtocols(), j00.a.B)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || y40.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), j.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ze.d.w(str));
        }
        return h00.q.n1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z = kVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, kVar.c) && Arrays.equals(this.d, kVar.d) && this.b == kVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return x5.o(sb, this.b, ')');
    }
}
