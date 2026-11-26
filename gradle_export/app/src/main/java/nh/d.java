package nh;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import k9.x0;

public final class d implements mh.a {

    public final x0 f11313a;

    public final tf.w f11314b;

    public final tf.w f11315c;

    public d(x0 x0Var) {
        this.f11313a = x0Var;
        boolean zIsEmpty = ((wh.a) x0Var.D).f16083a.isEmpty();
        tf.w wVar = th.p.f14810a;
        if (zIsEmpty) {
            this.f11314b = wVar;
            this.f11315c = wVar;
            return;
        }
        th.f fVar = (th.f) th.g.f14795b.f14797a.get();
        fVar = fVar == null ? th.g.f14796c : fVar;
        th.p.a(x0Var);
        fVar.getClass();
        this.f11314b = wVar;
        this.f11315c = wVar;
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        tf.w wVar = this.f11314b;
        mh.j jVar = (mh.j) this.f11313a.C;
        try {
            byte[] bArr3 = jVar.f10916c;
            byte[] bArrC = zh.i.c(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((mh.a) jVar.f10915b).a(bArr, bArr2));
            int i10 = jVar.f10919f;
            int length = bArr.length;
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
        x0 x0Var = this.f11313a;
        tf.w wVar = this.f11315c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = x0Var.G(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((mh.a) ((mh.j) it.next()).f10915b).b(bArrCopyOfRange, bArr2);
                    wVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e3) {
                    e.f11316a.info("ciphertext prefix matches a key, but cannot decrypt: " + e3);
                }
            }
        }
        Iterator it2 = x0Var.G(mh.b.f10903a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((mh.a) ((mh.j) it2.next()).f10915b).b(bArr, bArr2);
                wVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        wVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
