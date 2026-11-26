package i7;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Objects;

public final class m1 implements n0 {
    public long A;
    public long B;
    public boolean C;
    public final Object D;
    public Object E;

    public m1(e7.b0 b0Var) {
        this.D = b0Var;
        this.E = androidx.media3.common.z0.f1685d;
    }

    public m1(m9.f fVar) {
        this.D = new Handler(Looper.getMainLooper());
        this.E = fVar;
    }

    public m1(tf.w0 w0Var, String str, long j9) {
        Objects.requireNonNull(w0Var);
        this.E = w0Var;
        com.google.android.gms.common.internal.d0.e(str);
        this.D = str;
        this.A = j9;
    }

    @Override
    public long a() {
        long j9 = this.A;
        if (!this.C) {
            return j9;
        }
        ((e7.b0) this.D).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.B;
        androidx.media3.common.z0 z0Var = (androidx.media3.common.z0) this.E;
        return (z0Var.f1688a == 1.0f ? e7.i0.H(jElapsedRealtime) : jElapsedRealtime * ((long) z0Var.f1690c)) + j9;
    }

    public void c(long j9) {
        this.A = j9;
        if (this.C) {
            ((e7.b0) this.D).getClass();
            this.B = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (this.C) {
            return;
        }
        ((e7.b0) this.D).getClass();
        this.B = SystemClock.elapsedRealtime();
        this.C = true;
    }

    public long e() {
        if (!this.C) {
            this.C = true;
            tf.w0 w0Var = (tf.w0) this.E;
            this.B = w0Var.Z0().getLong((String) this.D, this.A);
        }
        return this.B;
    }

    public void f(long j9) {
        SharedPreferences.Editor editorEdit = ((tf.w0) this.E).Z0().edit();
        editorEdit.putLong((String) this.D, j9);
        editorEdit.apply();
        this.B = j9;
    }

    @Override
    public androidx.media3.common.z0 getPlaybackParameters() {
        return (androidx.media3.common.z0) this.E;
    }

    @Override
    public void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        if (this.C) {
            c(a());
        }
        this.E = z0Var;
    }
}
