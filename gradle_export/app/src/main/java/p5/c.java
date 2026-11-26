package p5;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ba.c0;
import com.google.android.gms.cast.MediaError;
import java.util.Arrays;
import java.util.WeakHashMap;
import z4.j0;
import ze.d;

public final class c {

    public static final c0 f12349v = new c0(1);

    public int f12350a;

    public final int f12351b;

    public float[] f12353d;

    public float[] f12354e;

    public float[] f12355f;

    public float[] f12356g;

    public int[] f12357h;

    public int[] f12358i;

    public int[] f12359j;

    public int f12360k;
    public VelocityTracker l;
    public final float m;

    public final float f12361n;

    public final int f12362o;

    public final OverScroller f12363p;

    public final d f12364q;

    public View f12365r;

    public boolean f12366s;

    public final CoordinatorLayout f12367t;

    public int f12352c = -1;

    public final a50.d f12368u = new a50.d(this, 17);

    public c(Context context, CoordinatorLayout coordinatorLayout, d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f12367t = coordinatorLayout;
        this.f12364q = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12362o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f12351b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12361n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12363p = new OverScroller(context, f12349v);
    }

    public final void a() {
        this.f12352c = -1;
        float[] fArr = this.f12353d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f12354e, 0.0f);
            Arrays.fill(this.f12355f, 0.0f);
            Arrays.fill(this.f12356g, 0.0f);
            Arrays.fill(this.f12357h, 0);
            Arrays.fill(this.f12358i, 0);
            Arrays.fill(this.f12359j, 0);
            this.f12360k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f12367t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f12365r = view;
        this.f12352c = i10;
        this.f12364q.I(view, i10);
        n(1);
    }

    public final boolean c(View view, float f3, float f10) {
        if (view != null) {
            d dVar = this.f12364q;
            boolean z10 = dVar.B(view) > 0;
            boolean z11 = dVar.C() > 0;
            if (z10 && z11) {
                float f11 = (f10 * f10) + (f3 * f3);
                int i10 = this.f12351b;
                if (f11 > i10 * i10) {
                    return true;
                }
            } else if (!z10 ? !(!z11 || Math.abs(f10) <= this.f12351b) : Math.abs(f3) > this.f12351b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10) {
        float[] fArr = this.f12353d;
        if (fArr != null) {
            int i11 = this.f12360k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f12354e[i10] = 0.0f;
                this.f12355f[i10] = 0.0f;
                this.f12356g[i10] = 0.0f;
                this.f12357h[i10] = 0;
                this.f12358i[i10] = 0;
                this.f12359j[i10] = 0;
                this.f12360k = (~i12) & i11;
            }
        }
    }

    public final int e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f12367t.getWidth();
        float f3 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f3) + f3;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), MediaError.DetailedErrorCode.TEXT_UNKNOWN);
    }

    public final boolean f() {
        if (this.f12350a == 2) {
            OverScroller overScroller = this.f12363p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f12365r.getLeft();
            int top = currY - this.f12365r.getTop();
            if (left != 0) {
                View view = this.f12365r;
                WeakHashMap weakHashMap = j0.f17198a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f12365r;
                WeakHashMap weakHashMap2 = j0.f17198a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f12364q.K(this.f12365r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f12367t.post(this.f12368u);
            }
        }
        return this.f12350a == 2;
    }

    public final View g(int i10, int i11) {
        CoordinatorLayout coordinatorLayout = this.f12367t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f12364q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        float f3;
        float f10;
        float f11;
        float f12;
        int left = this.f12365r.getLeft();
        int top = this.f12365r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f12363p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f12365r;
        int i16 = (int) this.f12361n;
        int i17 = (int) this.m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i16) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f3 = iAbs5;
            f10 = i18;
        } else {
            f3 = iAbs3;
            f10 = i19;
        }
        float f13 = f3 / f10;
        if (i13 != 0) {
            f11 = iAbs6;
            f12 = i18;
        } else {
            f11 = iAbs4;
            f12 = i19;
        }
        float f14 = f11 / f12;
        d dVar = this.f12364q;
        overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, dVar.C()) * f14) + (e(i14, i12, dVar.B(view)) * f13)));
        n(2);
        return true;
    }

    public final boolean i(int i10) {
        if ((this.f12360k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x2, (int) y10);
            l(x2, y10, pointerId);
            q(viewG, pointerId);
            int i12 = this.f12357h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f12350a == 1) {
                k();
            }
            a();
            return;
        }
        d dVar = this.f12364q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f12350a == 1) {
                    this.f12366s = true;
                    dVar.L(this.f12365r, 0.0f, 0.0f);
                    this.f12366s = false;
                    if (this.f12350a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(x10, y11, pointerId2);
                if (this.f12350a == 0) {
                    q(g((int) x10, (int) y11), pointerId2);
                    int i13 = this.f12357h[pointerId2];
                    return;
                }
                int i14 = (int) x10;
                int i15 = (int) y11;
                View view = this.f12365r;
                if (view != null && i14 >= view.getLeft() && i14 < view.getRight() && i15 >= view.getTop() && i15 < view.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    q(this.f12365r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f12350a == 1 && pointerId3 == this.f12352c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount) {
                        i10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (pointerId4 != this.f12352c) {
                        View viewG2 = g((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view2 = this.f12365r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i10 = this.f12352c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f12350a == 1) {
            if (i(this.f12352c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12352c);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f12355f;
                int i16 = this.f12352c;
                int i17 = (int) (x11 - fArr[i16]);
                int i18 = (int) (y12 - this.f12356g[i16]);
                int left = this.f12365r.getLeft() + i17;
                int top = this.f12365r.getTop() + i18;
                int left2 = this.f12365r.getLeft();
                int top2 = this.f12365r.getTop();
                if (i17 != 0) {
                    left = dVar.k(this.f12365r, left);
                    WeakHashMap weakHashMap = j0.f17198a;
                    this.f12365r.offsetLeftAndRight(left - left2);
                }
                if (i18 != 0) {
                    top = dVar.l(this.f12365r, top);
                    WeakHashMap weakHashMap2 = j0.f17198a;
                    this.f12365r.offsetTopAndBottom(top - top2);
                }
                if (i17 != 0 || i18 != 0) {
                    dVar.K(this.f12365r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i11 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if (i(pointerId5)) {
                float x12 = motionEvent.getX(i11);
                float y13 = motionEvent.getY(i11);
                float f3 = x12 - this.f12353d[pointerId5];
                float f10 = y13 - this.f12354e[pointerId5];
                Math.abs(f3);
                Math.abs(f10);
                int i19 = this.f12357h[pointerId5];
                Math.abs(f10);
                Math.abs(f3);
                int i20 = this.f12357h[pointerId5];
                Math.abs(f3);
                Math.abs(f10);
                int i21 = this.f12357h[pointerId5];
                Math.abs(f10);
                Math.abs(f3);
                int i22 = this.f12357h[pointerId5];
                if (this.f12350a != 1) {
                    View viewG3 = g((int) x12, (int) y13);
                    if (c(viewG3, f3, f10) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i11++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.l;
        float f3 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.l.getXVelocity(this.f12352c);
        float fAbs = Math.abs(xVelocity);
        float f10 = this.f12361n;
        if (fAbs < f10) {
            xVelocity = 0.0f;
        } else if (fAbs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.l.getYVelocity(this.f12352c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f10) {
            f3 = 0.0f;
        } else if (fAbs2 <= f3) {
            f3 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f3 = -f3;
        }
        this.f12366s = true;
        this.f12364q.L(this.f12365r, xVelocity, f3);
        this.f12366s = false;
        if (this.f12350a == 1) {
            n(0);
        }
    }

    public final void l(float f3, float f10, int i10) {
        float[] fArr = this.f12353d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f12354e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f12355f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f12356g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f12357h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f12358i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f12359j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f12353d = fArr2;
            this.f12354e = fArr3;
            this.f12355f = fArr4;
            this.f12356g = fArr5;
            this.f12357h = iArr;
            this.f12358i = iArr2;
            this.f12359j = iArr3;
        }
        float[] fArr9 = this.f12353d;
        this.f12355f[i10] = f3;
        fArr9[i10] = f3;
        float[] fArr10 = this.f12354e;
        this.f12356g[i10] = f10;
        fArr10[i10] = f10;
        int[] iArr7 = this.f12357h;
        int i12 = (int) f3;
        int i13 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f12367t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f12362o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < coordinatorLayout.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f12360k |= 1 << i10;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f12355f[pointerId] = x2;
                this.f12356g[pointerId] = y10;
            }
        }
    }

    public final void n(int i10) {
        this.f12367t.removeCallbacks(this.f12368u);
        if (this.f12350a != i10) {
            this.f12350a = i10;
            this.f12364q.J(i10);
            if (this.f12350a == 0) {
                this.f12365r = null;
            }
        }
    }

    public final boolean o(int i10, int i11) {
        if (this.f12366s) {
            return h(i10, i11, (int) this.l.getXVelocity(this.f12352c), (int) this.l.getYVelocity(this.f12352c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean p(MotionEvent motionEvent) {
        View viewG;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            l(x2, y10, pointerId);
            View viewG2 = g((int) x2, (int) y10);
            if (viewG2 == this.f12365r && this.f12350a == 2) {
                q(viewG2, pointerId);
            }
            int i10 = this.f12357h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(x10, y11, pointerId2);
                int i11 = this.f12350a;
                if (i11 == 0) {
                    int i12 = this.f12357h[pointerId2];
                } else if (i11 == 2 && (viewG = g((int) x10, (int) y11)) == this.f12365r) {
                    q(viewG, pointerId2);
                }
            } else if (actionMasked == 6) {
                d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f12353d != null && this.f12354e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount; i13++) {
                int pointerId3 = motionEvent.getPointerId(i13);
                if (i(pointerId3)) {
                    float x11 = motionEvent.getX(i13);
                    float y12 = motionEvent.getY(i13);
                    float f3 = x11 - this.f12353d[pointerId3];
                    float f10 = y12 - this.f12354e[pointerId3];
                    View viewG3 = g((int) x11, (int) y12);
                    boolean z10 = viewG3 != null && c(viewG3, f3, f10);
                    if (!z10) {
                        Math.abs(f3);
                        Math.abs(f10);
                        int i14 = this.f12357h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i15 = this.f12357h[pointerId3];
                        Math.abs(f3);
                        Math.abs(f10);
                        int i16 = this.f12357h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i17 = this.f12357h[pointerId3];
                        if (this.f12350a != 1) {
                            break;
                        }
                    } else {
                        int left = viewG3.getLeft();
                        d dVar = this.f12364q;
                        int iK = dVar.k(viewG3, ((int) f3) + left);
                        int top = viewG3.getTop();
                        int iL = dVar.l(viewG3, ((int) f10) + top);
                        int iB = dVar.B(viewG3);
                        int iC = dVar.C();
                        if ((iB == 0 || (iB > 0 && iK == left)) && (iC == 0 || (iC > 0 && iL == top))) {
                            break;
                        }
                        Math.abs(f3);
                        Math.abs(f10);
                        int i18 = this.f12357h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i19 = this.f12357h[pointerId3];
                        Math.abs(f3);
                        Math.abs(f10);
                        int i110 = this.f12357h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i111 = this.f12357h[pointerId3];
                        if (this.f12350a != 1 || (z10 && q(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m(motionEvent);
        }
        return this.f12350a == 1;
    }

    public final boolean q(View view, int i10) {
        if (view == this.f12365r && this.f12352c == i10) {
            return true;
        }
        if (view == null || !this.f12364q.T(view, i10)) {
            return false;
        }
        this.f12352c = i10;
        b(view, i10);
        return true;
    }
}
