package androidx.media3.cast;

import androidx.media3.common.d1;
import androidx.media3.common.e1;

public final class p implements e7.m {
    public final int A;
    public final e1 B;
    public final e1 C;

    public p(e1 e1Var, e1 e1Var2, int i10) {
        this.A = i10;
        this.B = e1Var;
        this.C = e1Var2;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.A) {
            case 0:
                RemoteCastPlayer.lambda$seekTo$3(this.B, this.C, (d1) obj);
                break;
            case 1:
                RemoteCastPlayer.lambda$updateTimelineAndNotifyIfChanged$12(this.B, this.C, (d1) obj);
                break;
            default:
                RemoteCastPlayer.lambda$updateInternalStateAndNotifyIfChanged$7(this.B, this.C, (d1) obj);
                break;
        }
    }
}
