package p7;

import android.os.HandlerThread;
import b3.g1;
import eh.x;

public final class b implements x {
    public final int A;
    public final int B;

    public b(int i10, int i11) {
        this.A = i11;
        this.B = i10;
    }

    @Override
    public final Object get() {
        switch (this.A) {
            case 0:
                return new HandlerThread(g1.d(this.B, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(g1.d(this.B, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
