package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import ba.a1;
import ba.b1;
import ba.p0;
import ba.q0;
import ba.v0;
import com.google.android.material.datepicker.w;
import gg.a;
import gg.b;
import gg.c;
import gg.e;

public class CarouselLayoutManager extends p0 implements a1 {

    public final e f4148p;

    public f7.e f4149q;

    public final View.OnLayoutChangeListener f4150r;

    public CarouselLayoutManager() {
        e eVar = new e(0);
        new b();
        this.f4150r = new a(this, 0);
        this.f4148p = eVar;
        o0();
        G0(0);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        new b();
        this.f4150r = new a(this, 0);
        this.f4148p = new e(0);
        o0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17428b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            o0();
            G0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override
    public final void A0(RecyclerView recyclerView, int i10) {
        w wVar = new w(this, recyclerView.getContext());
        wVar.f2445a = i10;
        B0(wVar);
    }

    public final float D0(float f3, float f10) {
        return F0() ? f3 - f10 : f3 + f10;
    }

    public final boolean E0() {
        return this.f4149q.B == 0;
    }

    public final boolean F0() {
        return E0() && this.f2378b.getLayoutDirection() == 1;
    }

    public final void G0(int i10) {
        c cVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(g4.c.f(i10, "invalid orientation:"));
        }
        c(null);
        f7.e eVar = this.f4149q;
        if (eVar == null || i10 != eVar.B) {
            if (i10 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f4149q = cVar;
            o0();
        }
    }

    @Override
    public final boolean K() {
        return true;
    }

    @Override
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        e eVar = this.f4148p;
        float dimension = eVar.A;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(2131165508);
        }
        eVar.A = dimension;
        float dimension2 = eVar.B;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(2131165507);
        }
        eVar.B = dimension2;
        o0();
        recyclerView.addOnLayoutChangeListener(this.f4150r);
    }

    @Override
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f4150r);
    }

    @Override
    public final View T(View view, int i10, v0 v0Var, b1 b1Var) {
        byte b7;
        if (v() == 0) {
            return null;
        }
        int i11 = this.f4149q.B;
        if (i10 == 1) {
            b7 = -1;
        } else if (i10 == 2) {
            b7 = 1;
        } else if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
                    } else if (i11 == 1) {
                        b7 = 1;
                    }
                    b7 = -2147483648;
                } else if (i11 != 0) {
                    b7 = -2147483648;
                } else if (F0()) {
                    b7 = -1;
                } else {
                    b7 = 1;
                }
            } else if (i11 == 1) {
                b7 = -1;
            } else {
                b7 = -2147483648;
            }
        } else if (i11 != 0) {
            b7 = -2147483648;
        } else if (F0()) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 == -2147483648) {
            return null;
        }
        if (b7 == -1) {
            if (p0.G(view) == 0) {
                return null;
            }
            int iG = p0.G(u(0)) - 1;
            if (iG < 0 || iG >= B()) {
                return u(F0() ? v() - 1 : 0);
            }
            this.f4149q.k();
            throw null;
        }
        if (p0.G(view) == B() - 1) {
            return null;
        }
        int iG2 = p0.G(u(v() - 1)) + 1;
        if (iG2 < 0 || iG2 >= B()) {
            return u(F0() ? 0 : v() - 1);
        }
        this.f4149q.k();
        throw null;
    }

    @Override
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(p0.G(u(0)));
            accessibilityEvent.setToIndex(p0.G(u(v() - 1)));
        }
    }

    @Override
    public final void Y(int i10, int i11) {
        B();
    }

    @Override
    public final void Z() {
        B();
    }

    @Override
    public final PointF a(int i10) {
        return null;
    }

    @Override
    public final void b0(int i10, int i11) {
        B();
    }

    @Override
    public final boolean d() {
        return E0();
    }

    @Override
    public final void d0(v0 v0Var, b1 b1Var) {
        if (b1Var.b() > 0) {
            if ((E0() ? this.f2388n : this.f2389o) > 0.0f) {
                F0();
                v0Var.e(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        j0(v0Var);
    }

    @Override
    public final boolean e() {
        return !E0();
    }

    @Override
    public final void e0(b1 b1Var) {
        if (v() == 0) {
            return;
        }
        p0.G(u(0));
    }

    @Override
    public final int j(b1 b1Var) {
        v();
        return 0;
    }

    @Override
    public final int k(b1 b1Var) {
        return 0;
    }

    @Override
    public final int l(b1 b1Var) {
        return 0;
    }

    @Override
    public final int m(b1 b1Var) {
        v();
        return 0;
    }

    @Override
    public final int n(b1 b1Var) {
        return 0;
    }

    @Override
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override
    public final int o(b1 b1Var) {
        return 0;
    }

    @Override
    public final int p0(int i10, v0 v0Var, b1 b1Var) {
        if (!E0() || v() == 0 || i10 == 0) {
            return 0;
        }
        v0Var.e(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override
    public final void q0(int i10) {
    }

    @Override
    public final q0 r() {
        return new q0(-2, -2);
    }

    @Override
    public final int r0(int i10, v0 v0Var, b1 b1Var) {
        if (!e() || v() == 0 || i10 == 0) {
            return 0;
        }
        v0Var.e(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }
}
