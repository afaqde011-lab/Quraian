package l9;

import android.media.VolumeProvider;
import k9.p2;
import k9.q2;
import k9.x0;

public final class l0 extends VolumeProvider {

    public final int f10167a;

    public final Object f10168b;

    public l0(Object obj, int i10, int i11, int i12, String str, int i13) {
        super(i10, i11, i12, str);
        this.f10167a = i13;
        this.f10168b = obj;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        switch (this.f10167a) {
            case 0:
                q2 q2Var = (q2) this.f10168b;
                e7.i0.M(q2Var.f9405f, new p2(q2Var.f9406g, i10, 1));
                break;
            default:
                o9.d dVar = (o9.d) this.f10168b;
                ((o9.f) ((x0) dVar.f11765f).D).f11778a.post(new o9.c(dVar, i10, 1));
                break;
        }
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        switch (this.f10167a) {
            case 0:
                q2 q2Var = (q2) this.f10168b;
                e7.i0.M(q2Var.f9405f, new p2(q2Var.f9406g, i10, 0));
                break;
            default:
                o9.d dVar = (o9.d) this.f10168b;
                ((o9.f) ((x0) dVar.f11765f).D).f11778a.post(new o9.c(dVar, i10, 0));
                break;
        }
    }
}
