package j7;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.d1;
import e7.m;

public final class b implements m {
    public final int A;
    public final PlaybackException B;

    public b(int i10, PlaybackException playbackException) {
        this.A = i10;
        this.B = playbackException;
    }

    public b(a aVar, PlaybackException playbackException) {
        this.A = 0;
        this.B = playbackException;
    }

    @Override
    public final void invoke(Object obj) {
        int i10 = this.A;
        PlaybackException playbackException = this.B;
        switch (i10) {
            case 0:
                ((i) obj).f8236o = playbackException;
                break;
            case 1:
                ((d1) obj).P(playbackException);
                break;
            case 2:
                ((d1) obj).R(playbackException);
                break;
            case 3:
                ((d1) obj).P(playbackException);
                break;
            default:
                ((d1) obj).R(playbackException);
                break;
        }
    }
}
