package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class s2 implements d1 {

    public final Toolbar f12208a;

    public int f12209b;

    public final View f12210c;

    public Drawable f12211d;

    public Drawable f12212e;

    public Drawable f12213f;

    public boolean f12214g;

    public CharSequence f12215h;

    public CharSequence f12216i;

    public final CharSequence f12217j;

    public Window.Callback f12218k;
    public boolean l;
    public j m;

    public final int f12219n;

    public final Drawable f12220o;

    public s2(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f12219n = 0;
        this.f12208a = toolbar;
        this.f12215h = toolbar.getTitle();
        this.f12216i = toolbar.getSubtitle();
        this.f12214g = this.f12215h != null;
        this.f12213f = toolbar.getNavigationIcon();
        k9.x0 x0VarK = k9.x0.K(toolbar.getContext(), null, j.a.f7716a, 2130968584);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        int i10 = 15;
        this.f12220o = x0VarK.v(15);
        if (z10) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f12214g = true;
                this.f12215h = text;
                if ((this.f12209b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f12214g) {
                        z4.j0.h(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                b(text2);
            }
            Drawable drawableV = x0VarK.v(20);
            if (drawableV != null) {
                this.f12212e = drawableV;
                d();
            }
            Drawable drawableV2 = x0VarK.v(17);
            if (drawableV2 != null) {
                this.f12211d = drawableV2;
                d();
            }
            if (this.f12213f == null && (drawable = this.f12220o) != null) {
                this.f12213f = drawable;
                if ((this.f12209b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f12210c;
                if (view != null && (this.f12209b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f12210c = viewInflate;
                if (viewInflate != null && (this.f12209b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f12209b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.T.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.L = resourceId2;
                v0 v0Var = toolbar.B;
                if (v0Var != null) {
                    v0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.M = resourceId3;
                v0 v0Var2 = toolbar.C;
                if (v0Var2 != null) {
                    v0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f12220o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f12209b = i10;
        }
        x0VarK.O();
        if (2131886081 != this.f12219n) {
            this.f12219n = 2131886081;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i11 = this.f12219n;
                this.f12217j = i11 != 0 ? toolbar.getContext().getString(i11) : null;
                c();
            }
        }
        this.f12217j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new r2(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f12209b ^ i10;
        this.f12209b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f12208a;
            if (i12 != 0) {
                if ((i10 & 4) != 0) {
                    c();
                }
                if ((this.f12209b & 4) != 0) {
                    Drawable drawable = this.f12213f;
                    if (drawable == null) {
                        drawable = this.f12220o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                d();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f12215h);
                    toolbar.setSubtitle(this.f12216i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f12210c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b(CharSequence charSequence) {
        this.f12216i = charSequence;
        if ((this.f12209b & 8) != 0) {
            this.f12208a.setSubtitle(charSequence);
        }
    }

    public final void c() {
        if ((this.f12209b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f12217j);
            Toolbar toolbar = this.f12208a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f12219n);
            } else {
                toolbar.setNavigationContentDescription(this.f12217j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i10 = this.f12209b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f12212e) == null) {
            drawable = this.f12211d;
        }
        this.f12208a.setLogo(drawable);
    }
}
