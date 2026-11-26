package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

public class PlaybackException extends Exception {
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public final int A;
    public final long B;
    public final Bundle C;

    static {
        String str = e7.i0.f5136a;
        D = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = Integer.toString(5, 36);
    }

    public PlaybackException(String str, Throwable th2, int i10, Bundle bundle, long j9) {
        super(str, th2);
        this.A = i10;
        this.C = bundle;
        this.B = j9;
    }

    public boolean a(PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.A == playbackException.A && Objects.equals(getMessage(), playbackException.getMessage()) && this.B == playbackException.B) {
                return true;
            }
        }
        return false;
    }
}
