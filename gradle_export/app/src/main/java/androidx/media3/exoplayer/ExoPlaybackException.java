package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.t;
import e7.i0;
import java.util.Objects;
import s7.a0;
import ta.c0;
import w.c;

public final class ExoPlaybackException extends PlaybackException {
    public final int J;
    public final String K;
    public final int L;
    public final t M;
    public final int N;
    public final a0 O;
    public final boolean P;

    public ExoPlaybackException(int i10, int i11, Exception exc) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public ExoPlaybackException(int i10, Exception exc, int i11, String str, int i12, t tVar, int i13, a0 a0Var, boolean z10) {
        String str2;
        int i14;
        t tVar2;
        String string;
        String str3;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            tVar2 = tVar;
            string = "Source error";
        } else if (i10 != 1) {
            string = i10 != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i14 = i12;
            tVar2 = tVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            tVar2 = tVar;
            sb2.append(tVar2);
            sb2.append(", format_supported=");
            String str4 = i0.f5136a;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : c.j(string, ": null"), exc, i11, i10, str2, i14, tVar2, i13, a0Var, SystemClock.elapsedRealtime(), z10);
    }

    public ExoPlaybackException(String str, Throwable th2, int i10, int i11, String str2, int i12, t tVar, int i13, a0 a0Var, long j9, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j9);
        c0.s(!z10 || i11 == 1);
        c0.s(th2 != null || i11 == 3);
        this.J = i11;
        this.K = str2;
        this.L = i12;
        this.M = tVar;
        this.N = i13;
        this.O = a0Var;
        this.P = z10;
    }

    @Override
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = i0.f5136a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.J == exoPlaybackException.J && Objects.equals(this.K, exoPlaybackException.K) && this.L == exoPlaybackException.L && Objects.equals(this.M, exoPlaybackException.M) && this.N == exoPlaybackException.N && Objects.equals(this.O, exoPlaybackException.O) && this.P == exoPlaybackException.P;
    }

    public final ExoPlaybackException b(a0 a0Var) {
        String message = getMessage();
        String str = i0.f5136a;
        return new ExoPlaybackException(message, getCause(), this.A, this.J, this.K, this.L, this.M, this.N, a0Var, this.B, this.P);
    }
}
