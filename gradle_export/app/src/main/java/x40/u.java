package x40;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

public final class u extends z {
    public static final s e;
    public static final s f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final k50.l a;
    public final List b;
    public final s c;
    public long d;

    static {
        Pattern pattern = s.d;
        e = w50.c.H("multipart/mixed");
        w50.c.H("multipart/alternative");
        w50.c.H("multipart/digest");
        w50.c.H("multipart/parallel");
        f = w50.c.H("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public u(k50.l boundaryByteString, s type, List list) {
        kotlin.jvm.internal.m.e(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.m.e(type, "type");
        this.a = boundaryByteString;
        this.b = list;
        Pattern pattern = s.d;
        this.c = w50.c.H(type + "; boundary=" + boundaryByteString.q());
        this.d = -1L;
    }

    @Override
    public final long a() throws EOFException {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jD = d(null, true);
        this.d = jD;
        return jD;
    }

    @Override
    public final s b() {
        return this.c;
    }

    @Override
    public final void c(k50.j jVar) throws EOFException {
        d(jVar, false);
    }

    public final long d(k50.j jVar, boolean z) throws EOFException {
        k50.i iVar;
        k50.j iVar2;
        if (z) {
            iVar2 = new k50.i();
            iVar = iVar2;
        } else {
            iVar = 0;
            iVar2 = jVar;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            k50.l lVar = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                kotlin.jvm.internal.m.b(iVar2);
                iVar2.write(bArr);
                iVar2.V(lVar);
                iVar2.write(bArr);
                iVar2.write(bArr2);
                if (!z) {
                    return j;
                }
                kotlin.jvm.internal.m.b(iVar);
                long j2 = j + iVar.B;
                iVar.a();
                return j2;
            }
            t tVar = (t) list.get(i2);
            p pVar = tVar.a;
            z zVar = tVar.b;
            kotlin.jvm.internal.m.b(iVar2);
            iVar2.write(bArr);
            iVar2.V(lVar);
            iVar2.write(bArr2);
            int size2 = pVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                iVar2.K(pVar.c(i3)).write(g).K(pVar.h(i3)).write(bArr2);
            }
            s sVarB = zVar.b();
            if (sVarB != null) {
                iVar2.K("Content-Type: ").K(sVarB.a).write(bArr2);
            }
            long jA = zVar.a();
            if (jA != -1) {
                iVar2.K("Content-Length: ").h0(jA).write(bArr2);
            } else if (z) {
                kotlin.jvm.internal.m.b(iVar);
                iVar.a();
                return -1L;
            }
            iVar2.write(bArr2);
            if (z) {
                j += jA;
            } else {
                zVar.c(iVar2);
            }
            iVar2.write(bArr2);
            i2++;
        }
    }
}
