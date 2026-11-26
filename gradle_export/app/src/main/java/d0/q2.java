package d0;

import androidx.compose.foundation.gestures.FlingCancellationException;

public final class q2 implements y1 {

    public final u2 f4494a;

    public final s2 f4495b;

    public q2(u2 u2Var, s2 s2Var) {
        this.f4494a = u2Var;
        this.f4495b = s2Var;
    }

    @Override
    public final float a(float f3) {
        float fAbs = Math.abs(f3);
        u2 u2Var = this.f4494a;
        if (fAbs != 0.0f && !((Boolean) u2Var.f4519h.invoke()).booleanValue()) {
            throw new FlingCancellationException();
        }
        return u2Var.d(u2Var.g(this.f4495b.a(2, u2Var.e(u2Var.h(f3)))));
    }
}
