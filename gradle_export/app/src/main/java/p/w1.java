package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public class w1 implements o.b0 {
    public final Context A;
    public ListAdapter B;
    public j1 C;
    public int F;
    public int G;
    public boolean I;
    public boolean J;
    public boolean K;
    public t1 N;
    public View O;
    public AdapterView.OnItemClickListener P;
    public AdapterView.OnItemSelectedListener Q;
    public final Handler V;
    public Rect X;
    public boolean Y;
    public final y Z;
    public final int D = -2;
    public int E = -2;
    public final int H = 1002;
    public int L = 0;
    public final int M = Integer.MAX_VALUE;
    public final s1 R = new s1(this, 1);
    public final v1 S = new v1(this);
    public final u1 T = new u1(this);
    public final s1 U = new s1(this, 0);
    public final Rect W = new Rect();

    public w1(Context context, AttributeSet attributeSet, int i10, int i11) {
        int resourceId;
        this.A = context;
        this.V = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f7728o, i10, 0);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.G = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.I = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.f7732s, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            yVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : p30.f.f0(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.Z = yVar;
        yVar.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.Z.isShowing();
    }

    public final int b() {
        return this.F;
    }

    public final void d(int i10) {
        this.F = i10;
    }

    @Override
    public final void dismiss() {
        y yVar = this.Z;
        yVar.dismiss();
        yVar.setContentView(null);
        this.C = null;
        this.V.removeCallbacks(this.R);
    }

    public final Drawable f() {
        return this.Z.getBackground();
    }

    @Override
    public final j1 h() {
        return this.C;
    }

    public final void j(Drawable drawable) {
        this.Z.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
        this.G = i10;
        this.I = true;
    }

    public final int n() {
        if (this.I) {
            return this.G;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        t1 t1Var = this.N;
        if (t1Var == null) {
            this.N = new t1(this);
        } else {
            ListAdapter listAdapter2 = this.B;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(t1Var);
            }
        }
        this.B = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.N);
        }
        j1 j1Var = this.C;
        if (j1Var != null) {
            j1Var.setAdapter(this.B);
        }
    }

    public j1 p(Context context, boolean z10) {
        return new j1(context, z10);
    }

    public final void q(int i10) {
        Drawable background = this.Z.getBackground();
        if (background == null) {
            this.E = i10;
            return;
        }
        Rect rect = this.W;
        background.getPadding(rect);
        this.E = rect.left + rect.right + i10;
    }

    @Override
    public final void show() {
        int i10;
        int iMakeMeasureSpec;
        int paddingBottom;
        j1 j1Var;
        j1 j1Var2 = this.C;
        Context context = this.A;
        y yVar = this.Z;
        if (j1Var2 == null) {
            j1 j1VarP = p(context, !this.Y);
            this.C = j1VarP;
            j1VarP.setAdapter(this.B);
            this.C.setOnItemClickListener(this.P);
            this.C.setFocusable(true);
            this.C.setFocusableInTouchMode(true);
            this.C.setOnItemSelectedListener(new p1(this));
            this.C.setOnScrollListener(this.T);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.Q;
            if (onItemSelectedListener != null) {
                this.C.setOnItemSelectedListener(onItemSelectedListener);
            }
            yVar.setContentView(this.C);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.W;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.I) {
                this.G = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = q1.a(yVar, this.O, this.G, yVar.getInputMethodMode() == 2);
        int i12 = this.D;
        if (i12 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i13 = this.E;
            if (i13 != -2) {
                iMakeMeasureSpec = i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.C.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.C.getPaddingBottom() + this.C.getPaddingTop() + i10 : 0);
        }
        boolean z10 = yVar.getInputMethodMode() == 2;
        yVar.setWindowLayoutType(this.H);
        if (yVar.isShowing()) {
            if (this.O.isAttachedToWindow()) {
                int width = this.E;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.O.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        yVar.setWidth(this.E == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.E == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                int i14 = width;
                View view = this.O;
                int i15 = this.F;
                int i16 = this.G;
                int i17 = i14 < 0 ? -1 : i14;
                if (i12 < 0) {
                    i12 = -1;
                }
                yVar.update(view, i15, i16, i17, i12);
                return;
            }
            return;
        }
        int width2 = this.E;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.O.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        yVar.setWidth(width2);
        yVar.setHeight(i12);
        r1.b(yVar, true);
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.S);
        if (this.K) {
            yVar.setOverlapAnchor(this.J);
        }
        r1.a(yVar, this.X);
        yVar.showAsDropDown(this.O, this.F, this.G, this.L);
        this.C.setSelection(-1);
        if ((!this.Y || this.C.isInTouchMode()) && (j1Var = this.C) != null) {
            j1Var.setListSelectionHidden(true);
            j1Var.requestLayout();
        }
        if (this.Y) {
            return;
        }
        this.V.post(this.U);
    }
}
