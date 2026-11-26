package ba;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public final class x extends y {

    public final int f2459d;

    public x(p0 p0Var, int i10) {
        super(p0Var);
        this.f2459d = i10;
    }

    @Override
    public final int d(View view) {
        int right;
        int i10;
        switch (this.f2459d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                right = view.getRight() + ((q0) view.getLayoutParams()).f2393b.right;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                right = view.getBottom() + ((q0) view.getLayoutParams()).f2393b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override
    public final int e(View view) {
        int iA;
        int i10;
        switch (this.f2459d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                iA = p0.A(view) + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                iA = p0.z(view) + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
                break;
        }
        return iA + i10;
    }

    @Override
    public final int f(View view) {
        int iZ;
        int i10;
        switch (this.f2459d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                iZ = p0.z(view) + ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                iZ = p0.A(view) + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
                break;
        }
        return iZ + i10;
    }

    @Override
    public final int g(View view) {
        int left;
        int i10;
        switch (this.f2459d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                left = view.getLeft() - ((q0) view.getLayoutParams()).f2393b.left;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((p0) this.f2462b).getClass();
                left = view.getTop() - ((q0) view.getLayoutParams()).f2393b.top;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                break;
        }
        return left - i10;
    }

    @Override
    public final int h() {
        switch (this.f2459d) {
            case 0:
                return ((p0) this.f2462b).f2388n;
            default:
                return ((p0) this.f2462b).f2389o;
        }
    }

    @Override
    public final int i() {
        int i10;
        int iE;
        switch (this.f2459d) {
            case 0:
                p0 p0Var = (p0) this.f2462b;
                i10 = p0Var.f2388n;
                iE = p0Var.E();
                break;
            default:
                p0 p0Var2 = (p0) this.f2462b;
                i10 = p0Var2.f2389o;
                iE = p0Var2.C();
                break;
        }
        return i10 - iE;
    }

    @Override
    public final int j() {
        switch (this.f2459d) {
            case 0:
                return ((p0) this.f2462b).E();
            default:
                return ((p0) this.f2462b).C();
        }
    }

    @Override
    public final int k() {
        switch (this.f2459d) {
            case 0:
                return ((p0) this.f2462b).l;
            default:
                return ((p0) this.f2462b).m;
        }
    }

    @Override
    public final int l() {
        switch (this.f2459d) {
            case 0:
                return ((p0) this.f2462b).m;
            default:
                return ((p0) this.f2462b).l;
        }
    }

    @Override
    public final int m() {
        switch (this.f2459d) {
            case 0:
                return ((p0) this.f2462b).D();
            default:
                return ((p0) this.f2462b).F();
        }
    }

    @Override
    public final int n() {
        int iD;
        int iE;
        switch (this.f2459d) {
            case 0:
                p0 p0Var = (p0) this.f2462b;
                iD = p0Var.f2388n - p0Var.D();
                iE = p0Var.E();
                break;
            default:
                p0 p0Var2 = (p0) this.f2462b;
                iD = p0Var2.f2389o - p0Var2.F();
                iE = p0Var2.C();
                break;
        }
        return iD - iE;
    }

    @Override
    public final int o(View view) {
        switch (this.f2459d) {
            case 0:
                p0 p0Var = (p0) this.f2462b;
                Rect rect = (Rect) this.f2463c;
                p0Var.J(view, rect);
                return rect.right;
            default:
                p0 p0Var2 = (p0) this.f2462b;
                Rect rect2 = (Rect) this.f2463c;
                p0Var2.J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int p(View view) {
        switch (this.f2459d) {
            case 0:
                p0 p0Var = (p0) this.f2462b;
                Rect rect = (Rect) this.f2463c;
                p0Var.J(view, rect);
                return rect.left;
            default:
                p0 p0Var2 = (p0) this.f2462b;
                Rect rect2 = (Rect) this.f2463c;
                p0Var2.J(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void q(int i10) {
        switch (this.f2459d) {
            case 0:
                ((p0) this.f2462b).O(i10);
                break;
            default:
                ((p0) this.f2462b).P(i10);
                break;
        }
    }
}
