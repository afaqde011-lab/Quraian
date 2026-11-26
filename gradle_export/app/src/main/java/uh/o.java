package uh;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import k9.x0;
import tf.w;
import yh.q1;

public final class o implements mh.i {

    public final x0 f15289a;

    public final w f15290b;

    public final w f15291c;

    public o(x0 x0Var) {
        this.f15289a = x0Var;
        boolean zIsEmpty = ((wh.a) x0Var.D).f16083a.isEmpty();
        w wVar = th.p.f14810a;
        if (zIsEmpty) {
            this.f15290b = wVar;
            this.f15291c = wVar;
            return;
        }
        th.f fVar = (th.f) th.g.f14795b.f14797a.get();
        fVar = fVar == null ? th.g.f14796c : fVar;
        th.p.a(x0Var);
        fVar.getClass();
        this.f15290b = wVar;
        this.f15291c = wVar;
    }

    @Override
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        w wVar = this.f15291c;
        if (length <= 5) {
            wVar.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        x0 x0Var = this.f15289a;
        for (mh.j jVar : x0Var.G(bArrCopyOf)) {
            try {
                ((mh.i) jVar.f10915b).a(bArrCopyOfRange, jVar.f10918e.equals(q1.LEGACY) ? zh.i.c(bArr2, p.f15293b) : bArr2);
                wVar.getClass();
                return;
            } catch (GeneralSecurityException e3) {
                p.f15292a.info("tag prefix matches a key, but cannot verify: " + e3);
            }
        }
        Iterator it = x0Var.G(mh.b.f10903a).iterator();
        while (it.hasNext()) {
            try {
                ((mh.i) ((mh.j) it.next()).f10915b).a(bArr, bArr2);
                wVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        wVar.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        w wVar = this.f15290b;
        mh.j jVar = (mh.j) this.f15289a.C;
        if (jVar.f10918e.equals(q1.LEGACY)) {
            bArr = zh.i.c(bArr, p.f15293b);
        }
        try {
            byte[] bArr2 = jVar.f10916c;
            byte[] bArrC = zh.i.c(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((mh.i) jVar.f10915b).b(bArr));
            int i10 = jVar.f10919f;
            wVar.getClass();
            return bArrC;
        } catch (GeneralSecurityException e3) {
            wVar.getClass();
            throw e3;
        }
    }
}
