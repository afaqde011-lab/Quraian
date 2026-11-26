package k9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

public final class x2 implements n3, e7.h, xf.e {
    public final int A;
    public final boolean B;
    public final Object C;

    public x2(Object obj, boolean z10, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = z10;
    }

    @Override
    public void accept(Object obj) {
        ((v3) obj).setAudioAttributes((androidx.media3.common.d) this.C, this.B);
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        switch (this.A) {
            case 0:
                fh.d2 d2VarS = fh.t0.s((androidx.media3.common.q0) this.C);
                boolean z10 = this.B;
                return s1Var.B(a2Var, d2VarS, z10 ? -1 : s1Var.f9430t.getCurrentMediaItemIndex(), z10 ? -9223372036854775807L : s1Var.f9430t.getCurrentPosition());
            default:
                List list = (List) this.C;
                boolean z11 = this.B;
                return s1Var.B(a2Var, list, z11 ? -1 : s1Var.f9430t.getCurrentMediaItemIndex(), z11 ? -9223372036854775807L : s1Var.f9430t.getCurrentPosition());
        }
    }

    @Override
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = c7.i.D((Context) this.C).edit();
        editorEdit.putBoolean("proxy_retention", this.B);
        editorEdit.apply();
    }
}
