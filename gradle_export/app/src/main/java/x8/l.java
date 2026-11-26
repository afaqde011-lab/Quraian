package x8;

import a8.k0;
import a8.l0;
import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import e7.i0;
import e7.u;
import java.io.EOFException;
import ta.c0;

public final class l implements l0 {

    public final l0 f16494a;

    public final i f16495b;

    public k f16500g;

    public t f16501h;

    public boolean f16502i;

    public int f16497d = 0;

    public int f16498e = 0;

    public byte[] f16499f = i0.f5137b;

    public final u f16496c = new u();

    public l(l0 l0Var, i iVar) {
        this.f16494a = l0Var;
        this.f16495b = iVar;
    }

    @Override
    public final int b(androidx.media3.common.j jVar, int i10, boolean z10) throws EOFException {
        if (this.f16500g == null) {
            return this.f16494a.b(jVar, i10, z10);
        }
        h(i10);
        int i11 = jVar.read(this.f16499f, this.f16498e, i10);
        if (i11 != -1) {
            this.f16498e += i11;
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public final void d(long j9, int i10, int i11, int i12, k0 k0Var) {
        int i13;
        if (this.f16500g == null) {
            this.f16494a.d(j9, i10, i11, i12, k0Var);
            return;
        }
        c0.r("DRM on subtitles is not supported", k0Var == null);
        int i14 = (this.f16498e - i12) - i11;
        try {
            i13 = i14;
            try {
                this.f16500g.D(this.f16499f, i13, i11, j.f16491c, new j7.d(this, j9, i10));
            } catch (RuntimeException e3) {
                e = e3;
                RuntimeException runtimeException = e;
                if (!this.f16502i) {
                    throw runtimeException;
                }
                e7.a.n("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e10) {
            e = e10;
            i13 = i14;
        }
        int i15 = i13 + i11;
        this.f16497d = i15;
        if (i15 == this.f16498e) {
            this.f16497d = 0;
            this.f16498e = 0;
        }
    }

    @Override
    public final void e(u uVar, int i10, int i11) {
        if (this.f16500g == null) {
            this.f16494a.e(uVar, i10, i11);
            return;
        }
        h(i10);
        uVar.k(this.f16498e, i10, this.f16499f);
        this.f16498e += i10;
    }

    @Override
    public final void f(t tVar) {
        tVar.f1594n.getClass();
        String str = tVar.f1594n;
        c0.s(x0.h(str) == 3);
        boolean zEquals = tVar.equals(this.f16501h);
        i iVar = this.f16495b;
        if (!zEquals) {
            this.f16501h = tVar;
            this.f16500g = iVar.m(tVar) ? iVar.k(tVar) : null;
        }
        k kVar = this.f16500g;
        l0 l0Var = this.f16494a;
        if (kVar == null) {
            l0Var.f(tVar);
            return;
        }
        s sVarA = tVar.a();
        sVarA.m = x0.n("application/x-media3-cues");
        sVarA.f1500j = str;
        sVarA.f1506r = Long.MAX_VALUE;
        sVarA.K = iVar.c(tVar);
        oi.k.w(sVarA, l0Var);
    }

    public final void h(int i10) {
        int length = this.f16499f.length;
        int i11 = this.f16498e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f16497d;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f16499f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f16497d, bArr2, 0, i12);
        this.f16497d = 0;
        this.f16498e = i12;
        this.f16499f = bArr2;
    }
}
