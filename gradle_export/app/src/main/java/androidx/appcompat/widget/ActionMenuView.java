package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.media3.common.q;
import o.k;
import o.l;
import o.n;
import o.w;
import o.z;
import o10.b;
import p.i;
import p.j;
import p.m;
import p.n1;
import p.o1;
import sg.f;

public class ActionMenuView extends o1 implements k, z {
    public l P;
    public Context Q;
    public int R;
    public boolean S;
    public j T;
    public q U;
    public o.j V;
    public boolean W;

    public int f533a0;

    public final int f534b0;

    public final int f535c0;

    public m f536d0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f534b0 = (int) (56.0f * f3);
        this.f535c0 = (int) (f3 * 4.0f);
        this.Q = context;
        this.R = 0;
    }

    public static p.l j() {
        p.l lVar = new p.l(-2, -2);
        lVar.f12181a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static p.l k(ViewGroup.LayoutParams layoutParams) {
        p.l lVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof p.l) {
            p.l lVar2 = (p.l) layoutParams;
            lVar = new p.l(lVar2);
            lVar.f12181a = lVar2.f12181a;
        } else {
            lVar = new p.l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override
    public final void b(l lVar) {
        this.P = lVar;
    }

    @Override
    public final boolean c(n nVar) {
        return this.P.q(nVar, null, 0);
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.l;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override
    public final n1 generateDefaultLayoutParams() {
        return j();
    }

    @Override
    public final n1 generateLayoutParams(AttributeSet attributeSet) {
        return new p.l(getContext(), attributeSet);
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p.l(getContext(), attributeSet);
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.P == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.P = lVar;
            lVar.f11406e = new b(this, 6);
            j jVar = new j(context);
            this.T = jVar;
            jVar.L = true;
            jVar.M = true;
            w fVar = this.U;
            if (fVar == null) {
                fVar = new f();
            }
            jVar.E = fVar;
            this.P.b(jVar, this.Q);
            j jVar2 = this.T;
            jVar2.H = this;
            this.P = jVar2.C;
        }
        return this.P;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.T;
        i iVar = jVar.I;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.K) {
            return jVar.J;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.R;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override
    public final n1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof p.k)) {
            zB = ((p.k) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof p.k)) ? zB : ((p.k) childAt2).c() | zB;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.T;
        if (jVar != null) {
            jVar.f();
            if (this.T.k()) {
                this.T.h();
                this.T.l();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.T;
        if (jVar != null) {
            jVar.h();
            p.f fVar = jVar.T;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f11464i.dismiss();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.W) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                p.l lVar = (p.l) childAt.getLayoutParams();
                if (lVar.f12181a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                p.l lVar2 = (p.l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f12181a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            p.l lVar3 = (p.l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f12181a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + iMax + i27;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        l lVar;
        boolean z10 = this.W;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.W = z11;
        if (z10 != z11) {
            this.f533a0 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.W && (lVar = this.P) != null && size != this.f533a0) {
            this.f533a0 = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.W || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                p.l lVar2 = (p.l) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f534b0;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z12 = false;
        int i24 = 0;
        long j9 = 0;
        while (true) {
            i12 = this.f535c0;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                p.l lVar3 = (p.l) childAt.getLayoutParams();
                lVar3.f12186f = false;
                lVar3.f12183c = 0;
                lVar3.f12182b = 0;
                lVar3.f12184d = false;
                ((LinearLayout.LayoutParams) lVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar3).rightMargin = 0;
                lVar3.f12185e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = lVar3.f12181a ? 1 : i19;
                p.l lVar4 = (p.l) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i27 <= 0 || (z14 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                lVar4.f12184d = !lVar4.f12181a && z15;
                lVar4.f12182b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (lVar3.f12184d) {
                    i24++;
                }
                if (lVar3.f12181a) {
                    z12 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j9 |= (long) (1 << i23);
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z16 = z12 && i22 == 2;
        int i32 = i30;
        boolean z17 = false;
        while (true) {
            if (i24 <= 0 || i32 <= 0) {
                i13 = iMax;
                break;
            }
            int i33 = Integer.MAX_VALUE;
            long j10 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                int i36 = iMax;
                p.l lVar5 = (p.l) getChildAt(i35).getLayoutParams();
                boolean z18 = z16;
                if (lVar5.f12184d) {
                    int i37 = lVar5.f12182b;
                    if (i37 < i33) {
                        j10 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j10 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                z16 = z18;
                iMax = i36;
            }
            i13 = iMax;
            boolean z19 = z16;
            j9 |= j10;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                p.l lVar6 = (p.l) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j11 = 1 << i39;
                if ((j10 & j11) != 0) {
                    if (z19 && lVar6.f12185e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar6.f12182b += r11;
                    lVar6.f12186f = r11;
                    i32--;
                } else if (lVar6.f12182b == i38) {
                    j9 |= j11;
                }
                i39++;
                z12 = z20;
            }
            z16 = z19;
            iMax = i13;
            z17 = true;
        }
        boolean z21 = !z12 && i22 == 1;
        if (i32 > 0 && j9 != 0 && (i32 < i22 - 1 || z21 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j9);
            if (!z21) {
                if ((j9 & 1) != 0 && !((p.l) getChildAt(0).getLayoutParams()).f12185e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j9 & ((long) (1 << i40))) != 0 && !((p.l) getChildAt(i40).getLayoutParams()).f12185e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z22 = z17;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j9 & ((long) (1 << i42))) != 0) {
                    View childAt3 = getChildAt(i42);
                    p.l lVar7 = (p.l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar7.f12183c = i41;
                        lVar7.f12186f = true;
                        if (i42 == 0 && !lVar7.f12185e) {
                            ((LinearLayout.LayoutParams) lVar7).leftMargin = (-i41) / 2;
                        }
                        z22 = true;
                    } else if (lVar7.f12181a) {
                        lVar7.f12183c = i41;
                        lVar7.f12186f = true;
                        ((LinearLayout.LayoutParams) lVar7).rightMargin = (-i41) / 2;
                        z22 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) lVar7).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar7).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                p.l lVar8 = (p.l) childAt4.getLayoutParams();
                if (lVar8.f12186f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar8.f12182b * i31) + lVar8.f12183c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.T.Q = z10;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.f536d0 = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.T;
        i iVar = jVar.I;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.K = true;
            jVar.J = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.S = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.R != i10) {
            this.R = i10;
            if (i10 == 0) {
                this.Q = getContext();
            } else {
                this.Q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.T = jVar;
        jVar.H = this;
        this.P = jVar.C;
    }
}
