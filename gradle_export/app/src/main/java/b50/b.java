package b50;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import tf.q0;

public final class b {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public b(List connectionSpecs) {
        kotlin.jvm.internal.m.e(connectionSpecs, "connectionSpecs");
        this.d = connectionSpecs;
    }

    public b(q0 q0Var, int i, boolean z, boolean z2) {
        this.d = q0Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public x40.k a(SSLSocket sSLSocket) throws UnknownServiceException {
        x40.k kVar;
        int i;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i2 = this.a;
        List list = (List) this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                kVar = null;
                break;
            }
            kVar = (x40.k) list.get(i2);
            if (kVar.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (kVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.m.b(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.m.d(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((x40.k) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.b = z;
        boolean z2 = this.c;
        String[] strArr = kVar.d;
        String[] strArr2 = kVar.c;
        if (strArr2 != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.m.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = y40.b.o(enabledCipherSuites, strArr2, x40.j.c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.m.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = y40.b.o(enabledProtocols2, strArr, j00.a.B);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.m.d(supportedCipherSuites, "supportedCipherSuites");
        x40.i iVar = x40.j.c;
        byte[] bArr = y40.b.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (iVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            kotlin.jvm.internal.m.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.m.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        bd.f fVar = new bd.f();
        fVar.A = kVar.a;
        fVar.C = strArr2;
        fVar.D = strArr;
        fVar.B = kVar.b;
        kotlin.jvm.internal.m.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        fVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.m.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        fVar.g((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        x40.k kVarB = fVar.b();
        if (kVarB.c() != null) {
            sSLSocket.setEnabledProtocols(kVarB.d);
        }
        if (kVarB.a() != null) {
            sSLSocket.setEnabledCipherSuites(kVarB.c);
        }
        return kVar;
    }

    public void b(String str) {
        ((q0) this.d).e1(this.a, this.b, this.c, str, (Object) null, (Object) null, (Object) null);
    }

    public void c(Object obj, String str) {
        ((q0) this.d).e1(this.a, this.b, this.c, str, obj, (Object) null, (Object) null);
    }

    public void d(String str, Object obj, Object obj2) {
        ((q0) this.d).e1(this.a, this.b, this.c, str, obj, obj2, (Object) null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((q0) this.d).e1(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
