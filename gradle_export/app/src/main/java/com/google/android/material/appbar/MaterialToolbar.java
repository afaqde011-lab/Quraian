package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ba.m;
import java.util.ArrayList;
import java.util.Collections;
import ng.j;
import sg.i;
import xg.a;

public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] C0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public ImageView.ScaleType A0;
    public Boolean B0;

    public Integer f4074x0;

    public boolean f4075y0;

    public boolean f4076z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130970053, 2131952958), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, zf.a.f17446v, 2130970053, 2131952958, new int[0]);
        if (typedArrayE.hasValue(2)) {
            setNavigationIconTint(typedArrayE.getColor(2, -1));
        }
        this.f4075y0 = typedArrayE.getBoolean(4, false);
        this.f4076z0 = typedArrayE.getBoolean(3, false);
        int i10 = typedArrayE.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = C0;
            if (i10 < scaleTypeArr.length) {
                this.A0 = scaleTypeArr[i10];
            }
        }
        if (typedArrayE.hasValue(0)) {
            this.B0 = Boolean.valueOf(typedArrayE.getBoolean(0, false));
        }
        typedArrayE.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : background instanceof ColorStateListDrawable ? ((ColorStateListDrawable) background).getColorStateList() : null;
        if (colorStateListValueOf != null) {
            i iVar = new i();
            iVar.m(colorStateListValueOf);
            iVar.j(context2);
            iVar.l(getElevation());
            setBackground(iVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.A0;
    }

    public Integer getNavigationIconTint() {
        return this.f4074x0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            rd.a.e0(this, (i) background);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        m mVar = j.f11312c;
        ImageView imageView2 = null;
        if (this.f4075y0 || this.f4076z0) {
            ArrayList arrayListD = j.d(this, getTitle());
            TextView textView = arrayListD.isEmpty() ? null : (TextView) Collections.min(arrayListD, mVar);
            ArrayList arrayListD2 = j.d(this, getSubtitle());
            TextView textView2 = arrayListD2.isEmpty() ? null : (TextView) Collections.max(arrayListD2, mVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f4075y0 && textView != null) {
                    w(textView, pair);
                }
                if (this.f4076z0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.B0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.A0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof i) {
            ((i) background).l(f3);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.B0;
        if (bool == null || bool.booleanValue() != z10) {
            this.B0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.A0 != scaleType) {
            this.A0 = scaleType;
            requestLayout();
        }
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f4074x0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f4074x0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f4074x0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f4076z0 != z10) {
            this.f4076z0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f4075y0 != z10) {
            this.f4075y0 = z10;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
