package ba;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class l extends n0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a50.d B;

    public final int f2323a;

    public final int f2324b;

    public final StateListDrawable f2325c;

    public final Drawable f2326d;

    public final int f2327e;

    public final int f2328f;

    public final StateListDrawable f2329g;

    public final Drawable f2330h;

    public final int f2331i;

    public final int f2332j;

    public int f2333k;
    public int l;
    public float m;

    public int f2334n;

    public int f2335o;

    public float f2336p;

    public final RecyclerView f2339s;

    public final ValueAnimator f2346z;

    public int f2337q = 0;

    public int f2338r = 0;

    public boolean f2340t = false;

    public boolean f2341u = false;

    public int f2342v = 0;

    public int f2343w = 0;

    public final int[] f2344x = new int[2];

    public final int[] f2345y = new int[2];

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2346z = valueAnimatorOfFloat;
        this.A = 0;
        Runnable dVar = new a50.d(this, 3);
        this.B = dVar;
        i iVar = new i(this);
        this.f2325c = stateListDrawable;
        this.f2326d = drawable;
        this.f2329g = stateListDrawable2;
        this.f2330h = drawable2;
        this.f2327e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2328f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2331i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2332j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2323a = i11;
        this.f2324b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new j(this));
        valueAnimatorOfFloat.addUpdateListener(new k(this, 0 == true ? 1 : 0));
        RecyclerView recyclerView2 = this.f2339s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.P;
            p0 p0Var = recyclerView2.N;
            if (p0Var != null) {
                p0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2339s;
            recyclerView3.Q.remove(this);
            if (recyclerView3.R == this) {
                recyclerView3.R = null;
            }
            ArrayList arrayList2 = this.f2339s.I0;
            if (arrayList2 != null) {
                arrayList2.remove(iVar);
            }
            this.f2339s.removeCallbacks(dVar);
        }
        this.f2339s = recyclerView;
        recyclerView.i(this);
        this.f2339s.Q.add(this);
        this.f2339s.j(iVar);
    }

    public static int e(float f3, float f10, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f10 - f3) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2337q != this.f2339s.getWidth() || this.f2338r != this.f2339s.getHeight()) {
            this.f2337q = this.f2339s.getWidth();
            this.f2338r = this.f2339s.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2340t) {
                int i10 = this.f2337q;
                int i11 = this.f2327e;
                int i12 = i10 - i11;
                int i13 = this.l;
                int i14 = this.f2333k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f2325c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f2328f;
                int i17 = this.f2338r;
                Drawable drawable = this.f2326d;
                drawable.setBounds(0, 0, i16, i17);
                if (this.f2339s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f2341u) {
                int i18 = this.f2338r;
                int i19 = this.f2331i;
                int i20 = i18 - i19;
                int i21 = this.f2335o;
                int i22 = this.f2334n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f2329g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f2337q;
                int i25 = this.f2332j;
                Drawable drawable2 = this.f2330h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    public final boolean c(float f3, float f10) {
        if (f10 < this.f2338r - this.f2331i) {
            return false;
        }
        int i10 = this.f2335o;
        int i11 = this.f2334n;
        return f3 >= ((float) (i10 - (i11 / 2))) && f3 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean d(float f3, float f10) {
        int layoutDirection = this.f2339s.getLayoutDirection();
        int i10 = this.f2327e;
        if (layoutDirection == 1) {
            if (f3 > i10) {
                return false;
            }
        } else if (f3 < this.f2337q - i10) {
            return false;
        }
        int i11 = this.l;
        int i12 = this.f2333k / 2;
        return f10 >= ((float) (i11 - i12)) && f10 <= ((float) (i12 + i11));
    }

    public final void f(int i10) {
        Runnable runnable = this.B;
        StateListDrawable stateListDrawable = this.f2325c;
        if (i10 == 2 && this.f2342v != 2) {
            stateListDrawable.setState(C);
            this.f2339s.removeCallbacks(runnable);
        }
        if (i10 == 0) {
            this.f2339s.invalidate();
        } else {
            g();
        }
        if (this.f2342v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f2339s.removeCallbacks(runnable);
            this.f2339s.postDelayed(runnable, 1200);
        } else if (i10 == 1) {
            this.f2339s.removeCallbacks(runnable);
            this.f2339s.postDelayed(runnable, 1500);
        }
        this.f2342v = i10;
    }

    public final void g() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f2346z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
