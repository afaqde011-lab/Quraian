package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class d2 {

    public static d2 f12147g;

    public WeakHashMap f12149a;

    public final WeakHashMap f12150b = new WeakHashMap(0);

    public TypedValue f12151c;

    public boolean f12152d;

    public th.o f12153e;

    public static final PorterDuff.Mode f12146f = PorterDuff.Mode.SRC_IN;

    public static final c2 f12148h = new c2(6);

    public static synchronized d2 b() {
        try {
            if (f12147g == null) {
                f12147g = new d2();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12147g;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        c2 c2Var = f12148h;
        c2Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c2Var.c(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f12151c == null) {
            this.f12151c = new TypedValue();
        }
        TypedValue typedValue = this.f12151c;
        context.getResources().getValue(i10, typedValue, true);
        long j9 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            u.q qVar = (u.q) this.f12150b.get(context);
            drawableNewDrawable = null;
            if (qVar != null && (weakReference = (WeakReference) qVar.b(j9)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    qVar.f(j9);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableA = null;
        if (this.f12153e != null) {
            if (i10 == 2131230779) {
                layerDrawableA = new LayerDrawable(new Drawable[]{c(context, 2131230778), c(context, 2131230780)});
            } else if (i10 == 2131230814) {
                layerDrawableA = th.o.A(this, context, 2131165243);
            } else if (i10 == 2131230813) {
                layerDrawableA = th.o.A(this, context, 2131165244);
            } else if (i10 == 2131230815) {
                layerDrawableA = th.o.A(this, context, 2131165245);
            }
        }
        if (layerDrawableA == null) {
            return layerDrawableA;
        }
        layerDrawableA.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableA.getConstantState();
                if (constantState2 != null) {
                    u.q qVar2 = (u.q) this.f12150b.get(context);
                    if (qVar2 == null) {
                        qVar2 = new u.q((Object) null);
                        this.f12150b.put(context, qVar2);
                    }
                    qVar2.e(new WeakReference(constantState2), j9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableA;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10, false);
    }

    public final synchronized Drawable d(Context context, int i10, boolean z10) {
        Drawable drawableA;
        try {
            if (!this.f12152d) {
                this.f12152d = true;
                Drawable drawableC = c(context, 2131230841);
                if (drawableC == null || (!(drawableC instanceof ua.o) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f12152d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = context.getDrawable(i10);
            }
            if (drawableA != null) {
                drawableA = g(context, i10, z10, drawableA);
            }
            if (drawableA != null) {
                int i11 = e1.f12154a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateList;
        u.t0 t0Var;
        WeakHashMap weakHashMap = this.f12149a;
        ColorStateList colorStateListB = null;
        colorStateList = (weakHashMap == null || (t0Var = (u.t0) weakHashMap.get(context)) == null) ? null : (ColorStateList) t0Var.c(i10);
        if (colorStateList == null) {
            th.o oVar = this.f12153e;
            if (oVar != null) {
                colorStateListB = oVar.B(context, i10);
            }
            if (colorStateListB != null) {
                if (this.f12149a == null) {
                    this.f12149a = new WeakHashMap();
                }
                u.t0 t0Var2 = (u.t0) this.f12149a.get(context);
                if (t0Var2 == null) {
                    t0Var2 = new u.t0(0);
                    this.f12149a.put(context, t0Var2);
                }
                t0Var2.a(i10, colorStateListB);
            }
            colorStateList = colorStateListB;
        }
        return colorStateList;
    }

    public final Drawable g(Context context, int i10, boolean z10, Drawable drawable) {
        int i11;
        boolean z11;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.f12153e != null && i10 == 2131230828) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f12153e != null) {
            if (i10 == 2131230823) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iC = i2.c(context, 2130968896);
                PorterDuff.Mode mode2 = r.f12193b;
                th.o.P(drawableFindDrawableByLayerId, iC, mode2);
                th.o.P(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), i2.c(context, 2130968896), mode2);
                th.o.P(layerDrawable.findDrawableByLayerId(R.id.progress), i2.c(context, 2130968894), mode2);
                return drawable;
            }
            if (i10 == 2131230814 || i10 == 2131230813 || i10 == 2131230815) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iB = i2.b(context, 2130968896);
                PorterDuff.Mode mode3 = r.f12193b;
                th.o.P(drawableFindDrawableByLayerId2, iB, mode3);
                th.o.P(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), i2.c(context, 2130968894), mode3);
                th.o.P(layerDrawable2.findDrawableByLayerId(R.id.progress), i2.c(context, 2130968894), mode3);
                return drawable;
            }
        }
        th.o oVar = this.f12153e;
        boolean z12 = false;
        if (oVar != null) {
            PorterDuff.Mode mode4 = r.f12193b;
            if (th.o.o((int[]) oVar.B, i10)) {
                i11 = 2130968896;
            } else if (th.o.o((int[]) oVar.D, i10)) {
                i11 = 2130968894;
            } else {
                if (th.o.o((int[]) oVar.E, i10)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == 2131230800) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        z11 = true;
                    } else {
                        if (i10 != 2131230782) {
                            i11 = 0;
                            z11 = false;
                        }
                        iRound = -1;
                    }
                    if (z11) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(r.c(i2.c(context, i11), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z12 = true;
                    }
                }
                i11 = 16842801;
            }
            z11 = true;
            iRound = -1;
            if (z11) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(r.c(i2.c(context, i11), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z12 = true;
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
