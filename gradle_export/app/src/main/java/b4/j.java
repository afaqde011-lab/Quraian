package b4;

import a40.c0;
import ab.a0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.u0;
import androidx.media3.common.w0;
import b3.a2;
import b3.b2;
import b3.l0;
import b3.n0;
import c3.m0;
import c3.q3;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.y3;
import l1.e0;
import u.i0;
import v2.b0;
import z4.d0;
import z4.g1;
import z4.j0;
import z4.j1;

public abstract class j extends ViewGroup implements z4.q, l1.f, a2, z4.r {
    public final u2.d A;
    public final View B;
    public final Owner C;
    public u00.a D;
    public boolean E;
    public u00.a F;
    public u00.a G;
    public b2.r H;
    public u00.k I;
    public y3.c J;
    public u00.k K;
    public androidx.lifecycle.w L;
    public ia.g M;
    public final int[] N;
    public long O;
    public j1 P;
    public u00.k Q;
    public final i R;
    public final i S;
    public u00.k T;
    public final int[] U;
    public int V;
    public int W;

    public final w0 f2151a0;

    public boolean f2152b0;

    public final l0 f2153c0;

    public j(Context context, e0 e0Var, int i10, u2.d dVar, View view, Owner owner) {
        super(context);
        this.A = dVar;
        this.B = view;
        this.C = owner;
        i0 i0Var = q3.f2756a;
        setTag(2131361883, e0Var);
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        z zVar = (z) this;
        j0.i(this, new b(zVar, i11));
        d0.b(this, this);
        this.D = h.D;
        this.F = h.C;
        this.G = h.B;
        b2.o oVar = b2.o.A;
        this.H = oVar;
        this.J = b5.d();
        int i12 = 2;
        this.N = new int[2];
        this.O = 0L;
        int i13 = 1;
        this.R = new i(zVar, i13);
        this.S = new i(zVar, i11);
        this.U = new int[2];
        this.V = Integer.MIN_VALUE;
        this.W = Integer.MIN_VALUE;
        this.f2151a0 = new w0();
        l0 l0Var = new l0(3);
        l0Var.P = zVar;
        b2.r rVarC = j3.q.c(u2.f.a(oVar, l.f2154a, dVar), true, c.D);
        v2.y yVar = new v2.y();
        yVar.A = new e(zVar, 2);
        b0 b0Var = new b0();
        b0 b0Var2 = yVar.B;
        if (b0Var2 != null) {
            b0Var2.B = null;
        }
        yVar.B = b0Var;
        b0Var.B = yVar;
        setOnRequestDisallowInterceptTouchEvent$ui(b0Var);
        b2.r rVarV = z2.d0.n(f2.h.e(rVarC.V(yVar), new n0(zVar, l0Var, zVar, 1)), new d(zVar, l0Var, i12)).V(new q(new e(zVar, 1)));
        l0Var.f0(this.H.V(rVarV));
        this.I = new b2.v(l0Var, rVarV, i13);
        l0Var.b0(this.J);
        this.K = new b3.a(l0Var, i12);
        l0Var.f2066n0 = new d(zVar, l0Var, i11);
        l0Var.f2067o0 = new e(zVar, 0);
        l0Var.e0(new f(zVar, l0Var));
        this.f2153c0 = l0Var;
    }

    public final b2 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            y2.a.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((c3.z) this.C).getSnapshotObserver();
    }

    public static final int k(z zVar, int i10, int i11, int i12) {
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(a0.y(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            return (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public static q4.b l(q4.b bVar, int i10, int i11, int i12, int i13) {
        int i14 = bVar.f12755a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f12756b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f12757c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = bVar.f12758d - i13;
        return q4.b.c(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    @Override
    public final j1 B(View view, j1 j1Var) {
        this.P = new j1(j1Var);
        return m(j1Var);
    }

    @Override
    public final void a() {
        this.G.invoke();
    }

    @Override
    public final void b() {
        this.F.invoke();
        removeAllViewsInLayout();
    }

    @Override
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.B.isNestedScrollingEnabled()) {
            float f3 = i10;
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3 * f10)) << 32) | (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i12 * f10)) << 32) | (((long) Float.floatToRawIntBits(i13 * f10)) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            u2.i iVar = this.A.f14921a;
            u2.i iVarC1 = iVar != null ? iVar.C1() : null;
            long jN0 = iVarC1 != null ? iVarC1.N0(i15, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = m0.i(Float.intBitsToFloat((int) (jN0 >> 32)));
            iArr[1] = m0.i(Float.intBitsToFloat((int) (jN0 & 4294967295L)));
        }
    }

    @Override
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.B.isNestedScrollingEnabled()) {
            float f3 = i10;
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3 * f10)) << 32) | (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i12 * f10)) << 32) | (((long) Float.floatToRawIntBits(i13 * f10)) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            u2.i iVar = this.A.f14921a;
            u2.i iVarC1 = iVar != null ? iVar.C1() : null;
            if (iVarC1 != null) {
                iVarC1.N0(i15, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override
    public final boolean e(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override
    public final void f(View view, View view2, int i10, int i11) {
        w0 w0Var = this.f2151a0;
        if (i11 == 1) {
            w0Var.f1664b = i10;
        } else {
            w0Var.f1663a = i10;
        }
    }

    @Override
    public final void g(View view, int i10) {
        w0 w0Var = this.f2151a0;
        if (i10 == 1) {
            w0Var.f1664b = 0;
        } else {
            w0Var.f1663a = 0;
        }
    }

    @Override
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.U;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final y3.c getDensity() {
        return this.J;
    }

    public final View getInteropView() {
        return this.B;
    }

    public final l0 getLayoutNode() {
        return this.f2153c0;
    }

    @Override
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.B.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.w getLifecycleOwner() {
        return this.L;
    }

    public final b2.r getModifier() {
        return this.H;
    }

    @Override
    public int getNestedScrollAxes() {
        w0 w0Var = this.f2151a0;
        return w0Var.f1664b | w0Var.f1663a;
    }

    public final u00.k getOnDensityChanged$ui() {
        return this.K;
    }

    public final u00.k getOnModifierChanged$ui() {
        return this.I;
    }

    public final u00.k getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.T;
    }

    public final u00.a getRelease() {
        return this.G;
    }

    public final u00.a getReset() {
        return this.F;
    }

    public final ia.g getSavedStateRegistryOwner() {
        return this.M;
    }

    public final u00.a getUpdate() {
        return this.D;
    }

    public final View getView() {
        return this.B;
    }

    @Override
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.B.isNestedScrollingEnabled()) {
            float f3 = i10;
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3 * f10)) << 32) | (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            u2.i iVar = this.A.f14921a;
            u2.i iVarC1 = iVar != null ? iVar.C1() : null;
            long jC0 = iVarC1 != null ? iVarC1.c0(i13, jFloatToRawIntBits) : 0L;
            iArr[0] = m0.i(Float.intBitsToFloat((int) (jC0 >> 32)));
            iArr[1] = m0.i(Float.intBitsToFloat((int) (jC0 & 4294967295L)));
        }
    }

    @Override
    public final void i() {
        View view = this.B;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.F.invoke();
        }
    }

    @Override
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f2152b0) {
            this.f2153c0.E();
            return null;
        }
        this.B.postOnAnimation(new a(0, this.S));
        return null;
    }

    @Override
    public final boolean isNestedScrollingEnabled() {
        return this.B.isNestedScrollingEnabled();
    }

    public final j1 m(j1 j1Var) {
        g1 g1Var = j1Var.f17202a;
        q4.b bVarI = g1Var.i(-1);
        q4.b bVar = q4.b.f12754e;
        if (!bVarI.equals(bVar) || !g1Var.j(-9).equals(bVar) || g1Var.h() != null) {
            b3.u uVar = (b3.u) this.f2153c0.f2059g0.D;
            if (uVar.f2133u0.N) {
                long jC = f50.k.C(uVar.d0(0L));
                int i10 = (int) (jC >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jC & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jP = z2.d0.i(uVar).p();
                int i12 = (int) (jP >> 32);
                int i13 = (int) (jP & 4294967295L);
                long j9 = uVar.C;
                long jC2 = f50.k.C(uVar.d0((((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L)));
                int i14 = i12 - ((int) (jC2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jC2));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return j1Var.f17202a.r(i10, i11, i14, i16);
                }
            }
        }
        return j1Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.invoke();
    }

    @Override
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f2152b0) {
            this.f2153c0.E();
        } else {
            this.B.postOnAnimation(new a(0, this.S));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f2003a.b(this);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.B.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.B;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.V = i10;
        this.W = i11;
    }

    @Override
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (!this.B.isNestedScrollingEnabled()) {
            return false;
        }
        c0.y(this.A.c(), (k00.i) null, (a40.a0) null, new g(z10, this, p30.f.U(f3 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        if (!this.B.isNestedScrollingEnabled()) {
            return false;
        }
        c0.y(this.A.c(), (k00.i) null, (a40.a0) null, new b1.f(this, p30.f.U(f3 * (-1.0f), f10 * (-1.0f)), (k00.c) null, 1), 3);
        return false;
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        u00.k kVar = this.Q;
        if (kVar == null) {
            return true;
        }
        kVar.invoke(rect != null ? new h2.c(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        u00.k kVar = this.T;
        if (kVar != null) {
            kVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(y3.c cVar) {
        if (cVar != this.J) {
            this.J = cVar;
            u00.k kVar = this.K;
            if (kVar != null) {
                kVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.w wVar) {
        if (wVar != this.L) {
            this.L = wVar;
            u0.k(this, wVar);
        }
    }

    public final void setModifier(b2.r rVar) {
        if (rVar != this.H) {
            this.H = rVar;
            u00.k kVar = this.I;
            if (kVar != null) {
                kVar.invoke(rVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(u00.k kVar) {
        this.K = kVar;
    }

    public final void setOnModifierChanged$ui(u00.k kVar) {
        this.I = kVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(u00.k kVar) {
        this.T = kVar;
    }

    public final void setRelease(u00.a aVar) {
        this.G = aVar;
    }

    public final void setReset(u00.a aVar) {
        this.F = aVar;
    }

    public final void setSavedStateRegistryOwner(ia.g gVar) {
        if (gVar != this.M) {
            this.M = gVar;
            y3.X(this, gVar);
        }
    }

    public final void setUpdate(u00.a aVar) {
        this.D = aVar;
        this.E = true;
        this.R.invoke();
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override
    public final boolean u() {
        return isAttachedToWindow();
    }
}
