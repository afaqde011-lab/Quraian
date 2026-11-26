package tg;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cast.MediaError;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a extends a.a {

    public final int f14784a;

    public final SideSheetBehavior f14785b;

    public a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f14784a = i10;
        this.f14785b = sideSheetBehavior;
    }

    @Override
    public final int B() {
        switch (this.f14784a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f14785b;
                return (-sideSheetBehavior.l) - sideSheetBehavior.f4190o;
            default:
                return this.f14785b.m;
        }
    }

    @Override
    public final int C() {
        switch (this.f14784a) {
            case 0:
                return this.f14785b.f4190o;
            default:
                return this.f14785b.m;
        }
    }

    @Override
    public final int D() {
        switch (this.f14784a) {
            case 0:
                return -this.f14785b.l;
            default:
                return z();
        }
    }

    @Override
    public final int F(View view) {
        switch (this.f14784a) {
            case 0:
                return view.getRight() + this.f14785b.f4190o;
            default:
                return view.getLeft() - this.f14785b.f4190o;
        }
    }

    @Override
    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.f14784a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override
    public final int H() {
        switch (this.f14784a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override
    public final boolean L(float f3) {
        switch (this.f14784a) {
            case 0:
                return f3 > 0.0f;
            default:
                return f3 < 0.0f;
        }
    }

    @Override
    public final boolean P(View view) {
        switch (this.f14784a) {
            case 0:
                return view.getRight() < (z() - B()) / 2;
            default:
                return view.getLeft() > (z() + this.f14785b.m) / 2;
        }
    }

    @Override
    public final boolean Q(float f3, float f10) {
        switch (this.f14784a) {
            case 0:
                return Math.abs(f3) > Math.abs(f10) && Math.abs(f3) > ((float) MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
            default:
                return Math.abs(f3) > Math.abs(f10) && Math.abs(f3) > ((float) MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
        }
    }

    @Override
    public final boolean e0(View view, float f3) {
        switch (this.f14784a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f14785b;
                float fAbs = Math.abs((f3 * sideSheetBehavior.f4188k) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f14785b;
                float fAbs2 = Math.abs((f3 * sideSheetBehavior2.f4188k) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f14784a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override
    public final float i(int i10) {
        switch (this.f14784a) {
            case 0:
                float fB = B();
                return (i10 - fB) / (z() - fB);
            default:
                float f3 = this.f14785b.m;
                return (f3 - i10) / (f3 - z());
        }
    }

    @Override
    public final void i0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        switch (this.f14784a) {
            case 0:
                marginLayoutParams.leftMargin = i10;
                break;
            default:
                marginLayoutParams.rightMargin = i10;
                break;
        }
    }

    @Override
    public final void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        switch (this.f14784a) {
            case 0:
                if (i10 <= this.f14785b.m) {
                    marginLayoutParams.leftMargin = i11;
                }
                break;
            default:
                int i12 = this.f14785b.m;
                if (i10 <= i12) {
                    marginLayoutParams.rightMargin = i12 - i10;
                }
                break;
        }
    }

    @Override
    public final int y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f14784a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override
    public final int z() {
        switch (this.f14784a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f14785b;
                return Math.max(0, sideSheetBehavior.f4189n + sideSheetBehavior.f4190o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f14785b;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.f4190o);
        }
    }
}
