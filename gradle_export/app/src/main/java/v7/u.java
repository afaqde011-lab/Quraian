package v7;

import androidx.media3.common.s2;
import i7.i1;
import java.util.Objects;
import ta.c0;

public final class u {

    public final int f15528a;

    public final i1[] f15529b;

    public final r[] f15530c;

    public final s2 f15531d;

    public final Object f15532e;

    public u(i1[] i1VarArr, r[] rVarArr, s2 s2Var, Object obj) {
        c0.s(i1VarArr.length == rVarArr.length);
        this.f15529b = i1VarArr;
        this.f15530c = (r[]) rVarArr.clone();
        this.f15531d = s2Var;
        this.f15532e = obj;
        this.f15528a = i1VarArr.length;
    }

    public final boolean a(u uVar, int i10) {
        return uVar != null && Objects.equals(this.f15529b[i10], uVar.f15529b[i10]) && Objects.equals(this.f15530c[i10], uVar.f15530c[i10]);
    }

    public final boolean b(int i10) {
        return this.f15529b[i10] != null;
    }
}
