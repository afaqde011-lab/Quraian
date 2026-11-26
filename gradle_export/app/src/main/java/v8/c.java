package v8;

import a8.w;
import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import e7.u;
import java.util.Arrays;
import l9.f0;
import s7.w0;

public final class c extends i {

    public w f15534n;

    public w0 f15535o;

    @Override
    public final long b(u uVar) {
        byte[] bArr = uVar.f5182a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            uVar.O(4);
            uVar.I();
        }
        int iU = a8.b.u(i10, uVar);
        uVar.N(0);
        return iU;
    }

    @Override
    public final boolean c(u uVar, long j9, s10.w0 w0Var) {
        byte[] bArr = uVar.f5182a;
        w wVar = this.f15534n;
        if (wVar == null) {
            w wVar2 = new w(17, bArr);
            this.f15534n = wVar2;
            s sVarA = wVar2.c(Arrays.copyOfRange(bArr, 9, uVar.f5184c), null).a();
            sVarA.l = x0.n("audio/ogg");
            w0Var.B = new t(sVarA);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & 127) != 3) {
            if (b7 != -1) {
                return true;
            }
            w0 w0Var2 = this.f15535o;
            if (w0Var2 != null) {
                w0Var2.A = j9;
                w0Var.C = w0Var2;
            }
            ((t) w0Var.B).getClass();
            return false;
        }
        f0 f0VarV = a8.b.v(uVar);
        w wVar3 = new w(wVar.f311a, wVar.f312b, wVar.f313c, wVar.f314d, wVar.f315e, wVar.f317g, wVar.f318h, wVar.f320j, f0VarV, wVar.l);
        this.f15534n = wVar3;
        w0 w0Var3 = new w0();
        w0Var3.C = wVar3;
        w0Var3.D = f0VarV;
        w0Var3.A = -1L;
        w0Var3.B = -1L;
        this.f15535o = w0Var3;
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f15534n = null;
            this.f15535o = null;
        }
    }
}
