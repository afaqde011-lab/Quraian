package rh;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import k9.x0;
import mh.j;
import tf.w;
import th.f;
import th.g;
import th.p;
import zh.i;

public final class b implements mh.c {

    public final x0 f13230a;

    public final w f13231b;

    public final w f13232c;

    public b(x0 x0Var) {
        this.f13230a = x0Var;
        boolean zIsEmpty = ((wh.a) x0Var.D).f16083a.isEmpty();
        w wVar = p.f14810a;
        if (zIsEmpty) {
            this.f13231b = wVar;
            this.f13232c = wVar;
            return;
        }
        f fVar = (f) g.f14795b.f14797a.get();
        fVar = fVar == null ? g.f14796c : fVar;
        p.a(x0Var);
        fVar.getClass();
        this.f13231b = wVar;
        this.f13232c = wVar;
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        w wVar = this.f13231b;
        j jVar = (j) this.f13230a.C;
        try {
            byte[] bArr3 = jVar.f10916c;
            byte[] bArrC = i.c(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((mh.c) jVar.f10915b).a(bArr, bArr2));
            int i10 = jVar.f10919f;
            wVar.getClass();
            return bArrC;
        } catch (GeneralSecurityException e3) {
            wVar.getClass();
            throw e3;
        }
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        x0 x0Var = this.f13230a;
        w wVar = this.f13232c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = x0Var.G(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((mh.c) ((j) it.next()).f10915b).b(bArrCopyOfRange, bArr2);
                    wVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e3) {
                    c.f13233a.info("ciphertext prefix matches a key, but cannot decrypt: " + e3);
                }
            }
        }
        Iterator it2 = x0Var.G(mh.b.f10903a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((mh.c) ((j) it2.next()).f10915b).b(bArr, bArr2);
                wVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        wVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
