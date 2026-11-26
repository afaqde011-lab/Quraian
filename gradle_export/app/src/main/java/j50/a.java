package j50;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.m;
import ri.t1;

public final class a extends t1 {
    public final b a;

    public a(b trustRootIndex) {
        m.e(trustRootIndex, "trustRootIndex");
        this.a = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && m.a(((a) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final List q(String hostname, List chain) throws SSLPeerUnverifiedException {
        m.e(chain, "chain");
        m.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        m.d(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            b bVar = this.a;
            bVar.getClass();
            Set set = (Set) bVar.a.get(x509Certificate.getIssuerX500Principal());
            X509Certificate x509Certificate2 = null;
            Object obj2 = null;
            if (set != null) {
                for (Object obj3 : set) {
                    try {
                        x509Certificate.verify(((X509Certificate) obj3).getPublicKey());
                        obj2 = obj3;
                        break;
                    } catch (Exception unused) {
                    }
                }
                x509Certificate2 = (X509Certificate) obj2;
            }
            if (x509Certificate2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509Certificate2)) {
                    arrayList.add(x509Certificate2);
                }
                if (m.a(x509Certificate2.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                    try {
                        x509Certificate2.verify(x509Certificate2.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused2) {
                    }
                }
                z = true;
                i++;
                z = z;
            } else {
                Iterator it = arrayDeque.iterator();
                m.d(it, "queue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    m.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate3 = (X509Certificate) next;
                    if (m.a(x509Certificate.getIssuerDN(), x509Certificate3.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate3.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate3);
                            break;
                        } catch (GeneralSecurityException unused3) {
                            continue;
                        }
                    }
                }
                i++;
                z = z;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
