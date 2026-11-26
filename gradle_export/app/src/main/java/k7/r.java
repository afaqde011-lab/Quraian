package k7;

import android.media.AudioTrack;

public final class r extends AudioTrack.StreamEventCallback {

    public final a1.i f9130a;

    public r(a1.i iVar) {
        this.f9130a = iVar;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        ((s) this.f9130a.D).f9142i.f(-1, new j7.e(8));
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((s) this.f9130a.D).f9142i.f(-1, new j7.e(9));
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        ((s) this.f9130a.D).f9142i.f(-1, new j7.e(8));
    }
}
