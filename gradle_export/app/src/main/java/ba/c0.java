package ba;

import android.view.animation.Interpolator;

public final class c0 implements Interpolator {

    public final int f2255a;

    @Override
    public final float getInterpolation(float f3) {
        switch (this.f2255a) {
        }
        float f10 = f3 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
