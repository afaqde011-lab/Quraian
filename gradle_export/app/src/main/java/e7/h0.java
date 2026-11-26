package e7;

import java.util.concurrent.ThreadFactory;

public final class h0 implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
