package androidx.media3.cast;

import androidx.media3.common.d1;
import androidx.media3.common.r;

public final class l implements e7.m, e7.n {
    public final int A;
    public final RemoteCastPlayer B;

    public l(RemoteCastPlayer remoteCastPlayer, int i10) {
        this.A = i10;
        this.B = remoteCastPlayer;
    }

    @Override
    public void h(Object obj, r rVar) {
        this.B.lambda$new$0((d1) obj, rVar);
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        RemoteCastPlayer remoteCastPlayer = this.B;
        d1 d1Var = (d1) obj;
        switch (i10) {
            case 0:
                remoteCastPlayer.lambda$setPlaylistMetadata$6(d1Var);
                break;
            case 1:
                remoteCastPlayer.lambda$updateAvailableCommandsAndNotifyIfChanged$14(d1Var);
                break;
            case 2:
                remoteCastPlayer.lambda$seekTo$5(d1Var);
                break;
            case 3:
            default:
                remoteCastPlayer.lambda$updateInternalStateAndNotifyIfChanged$10(d1Var);
                break;
            case 4:
                remoteCastPlayer.lambda$updateTimelineAndNotifyIfChanged$13(d1Var);
                break;
            case 5:
                remoteCastPlayer.lambda$prepare$1(d1Var);
                break;
            case 6:
                remoteCastPlayer.lambda$prepare$2(d1Var);
                break;
            case 7:
                remoteCastPlayer.lambda$updateInternalStateAndNotifyIfChanged$8(d1Var);
                break;
            case 8:
                remoteCastPlayer.lambda$updateInternalStateAndNotifyIfChanged$9(d1Var);
                break;
        }
    }
}
