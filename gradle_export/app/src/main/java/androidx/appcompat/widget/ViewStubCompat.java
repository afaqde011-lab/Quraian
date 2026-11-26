package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j.a;
import java.lang.ref.WeakReference;
import p.v2;

public final class ViewStubCompat extends View {
    public int A;
    public int B;
    public WeakReference C;
    public LayoutInflater D;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7739z, 0, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.A = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.A == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.D;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.A, viewGroup, false);
        int i10 = this.B;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.C = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.B;
    }

    public LayoutInflater getLayoutInflater() {
        return this.D;
    }

    public int getLayoutResource() {
        return this.A;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.B = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.D = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.A = i10;
    }

    public void setOnInflateListener(v2 v2Var) {
    }

    @Override
    public void setVisibility(int i10) {
        WeakReference weakReference = this.C;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }
}
