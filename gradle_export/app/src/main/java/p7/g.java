package p7;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import k9.x0;

public final class g implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    public final x0 f12394a;

    public g(x0 x0Var) {
        this.f12394a = x0Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((h) this.f12394a.C).getClass();
        return bundle;
    }
}
