package x40;

import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import ri.t1;

public final class h {
    public static final h c = new h(h00.q.r1(new ArrayList()), null);
    public final Set a;
    public final t1 b;

    public h(Set set, t1 t1Var) {
        this.a = set;
        this.b = t1Var;
    }

    public final void a(String hostname, u00.a aVar) throws NoSuchAlgorithmException, SSLPeerUnverifiedException {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        List<g> arrayList = h00.x.A;
        for (Object obj : this.a) {
            g gVar = (g) obj;
            gVar.getClass();
            String str = gVar.a;
            boolean zEquals = false;
            if (r30.r.x0(str, "**.", false)) {
                int length = str.length() - 3;
                int length2 = hostname.length() - length;
                if (r30.r.s0(hostname.length() - length, 3, length, hostname, gVar.a, false) && (length2 == 0 || hostname.charAt(length2 - 1) == '.')) {
                    zEquals = true;
                }
            } else if (r30.r.x0(str, "*.", false)) {
                int length3 = str.length() - 1;
                int length4 = hostname.length() - length3;
                if (r30.r.s0(hostname.length() - length3, 1, length3, hostname, gVar.a, false) && r30.k.O0(hostname, '.', length4 - 1, 4) == -1) {
                    zEquals = true;
                }
            } else {
                zEquals = hostname.equals(str);
            }
            if (zEquals) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                if ((arrayList instanceof v00.a) && !(arrayList instanceof v00.c)) {
                    kotlin.jvm.internal.d0.h(arrayList, "kotlin.collections.MutableList");
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) aVar.invoke();
        for (X509Certificate x509Certificate : list) {
            k50.l lVarF0 = null;
            k50.l lVarC = null;
            for (g gVar2 : arrayList) {
                String str2 = gVar2.b;
                k50.l lVar = gVar2.c;
                if (kotlin.jvm.internal.m.a(str2, SigningManager.POST_PARAMS_ALGORITHM)) {
                    if (lVarF0 == null) {
                        lVarF0 = rd.a.f0(x509Certificate);
                    }
                    if (kotlin.jvm.internal.m.a(lVar, lVarF0)) {
                        return;
                    }
                } else {
                    if (!kotlin.jvm.internal.m.a(str2, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + gVar2.b);
                    }
                    if (lVarC == null) {
                        kotlin.jvm.internal.m.e(x509Certificate, "<this>");
                        k50.l lVar2 = k50.l.D;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        kotlin.jvm.internal.m.d(encoded, "publicKey.encoded");
                        lVarC = sg.f.M(encoded).c("SHA-1");
                    }
                    if (kotlin.jvm.internal.m.a(lVar, lVarC)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(rd.a.O(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        for (g gVar3 : arrayList) {
            sb.append("\n    ");
            sb.append(gVar3);
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(hVar.a, this.a) && kotlin.jvm.internal.m.a(hVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        t1 t1Var = this.b;
        return iHashCode + (t1Var != null ? t1Var.hashCode() : 0);
    }
}
