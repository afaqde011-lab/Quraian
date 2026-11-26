package v8;

import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import e7.u;
import fh.t0;
import java.util.ArrayList;
import java.util.Arrays;
import s10.w0;

public final class h extends i {

    public static final byte[] f15551o = {79, 112, 117, 115, 72, 101, 97, 100};

    public static final byte[] f15552p = {79, 112, 117, 115, 84, 97, 103, 115};

    public boolean f15553n;

    public static boolean e(u uVar, byte[] bArr) {
        if (uVar.a() < bArr.length) {
            return false;
        }
        int i10 = uVar.f5183b;
        byte[] bArr2 = new byte[bArr.length];
        uVar.k(0, bArr.length, bArr2);
        uVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(u uVar) {
        byte[] bArr = uVar.f5182a;
        return (((long) this.f15562i) * a8.b.m(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override
    public final boolean c(u uVar, long j9, w0 w0Var) {
        if (e(uVar, f15551o)) {
            byte[] bArrCopyOf = Arrays.copyOf(uVar.f5182a, uVar.f5184c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = a8.b.a(bArrCopyOf);
            if (((t) w0Var.B) == null) {
                s sVar = new s();
                sVar.l = x0.n("audio/ogg");
                sVar.m = x0.n("audio/opus");
                sVar.E = i10;
                sVar.F = 48000;
                sVar.f1504p = arrayListA;
                w0Var.B = new t(sVar);
                return true;
            }
        } else {
            if (!e(uVar, f15552p)) {
                ((t) w0Var.B).getClass();
                return false;
            }
            ((t) w0Var.B).getClass();
            if (!this.f15553n) {
                this.f15553n = true;
                uVar.O(8);
                v0 v0VarT = a8.b.t(t0.p((String[]) a8.b.w(uVar, false, false).B));
                if (v0VarT != null) {
                    s sVarA = ((t) w0Var.B).a();
                    sVarA.f1501k = v0VarT.b(((t) w0Var.B).l);
                    w0Var.B = new t(sVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f15553n = false;
        }
    }
}
