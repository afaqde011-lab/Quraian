package c5;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import l9.f0;

public final class a {

    public final int f2859a;

    public final b f2860b;

    public q4.b f2861c;

    public q4.b f2862d;

    public c f2863e;

    public final ColorDrawable f2864f;

    public boolean f2865g;

    public int f2866h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public a(int i10, int i11) {
        b bVar = new b();
        bVar.f2867a = -1;
        bVar.f2868b = -1;
        q4.b bVar2 = q4.b.f12754e;
        bVar.f2869c = bVar2;
        bVar.f2870d = false;
        bVar.f2871e = null;
        bVar.f2872f = 0.0f;
        bVar.f2873g = 0.0f;
        bVar.f2874h = 1.0f;
        this.f2860b = bVar;
        this.f2861c = bVar2;
        this.f2862d = bVar2;
        this.f2863e = null;
        if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException(g4.c.f(i10, "Unexpected side: "));
        }
        this.f2859a = i10;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f2864f = colorDrawable;
        this.f2866h = 0;
        this.f2865g = true;
        if (i11 != 0) {
            this.f2866h = i11;
            colorDrawable.setColor(i11);
            bVar.f2871e = colorDrawable;
            f0 f0Var = bVar.f2875i;
            if (f0Var != null) {
                ((View) f0Var.C).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f3) {
        float f10 = f3 * 1.0f;
        b bVar = this.f2860b;
        if (bVar.f2874h != f10) {
            bVar.f2874h = f10;
            f0 f0Var = bVar.f2875i;
            if (f0Var != null) {
                ((View) f0Var.C).setAlpha(f10);
            }
        }
    }

    public final void b(float f3) {
        float f10 = f3 * 1.0f;
        b bVar = this.f2860b;
        int i10 = this.f2859a;
        if (i10 == 1) {
            float f11 = (-(1.0f - f10)) * bVar.f2867a;
            if (bVar.f2872f != f11) {
                bVar.f2872f = f11;
                f0 f0Var = bVar.f2875i;
                if (f0Var != null) {
                    ((View) f0Var.C).setTranslationX(f11);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            float f12 = (-(1.0f - f10)) * bVar.f2868b;
            if (bVar.f2873g != f12) {
                bVar.f2873g = f12;
                f0 f0Var2 = bVar.f2875i;
                if (f0Var2 != null) {
                    ((View) f0Var2.C).setTranslationY(f12);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            float f13 = (1.0f - f10) * bVar.f2867a;
            if (bVar.f2872f != f13) {
                bVar.f2872f = f13;
                f0 f0Var3 = bVar.f2875i;
                if (f0Var3 != null) {
                    ((View) f0Var3.C).setTranslationX(f13);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 8) {
            return;
        }
        float f14 = (1.0f - f10) * bVar.f2868b;
        if (bVar.f2873g != f14) {
            bVar.f2873g = f14;
            f0 f0Var4 = bVar.f2875i;
            if (f0Var4 != null) {
                ((View) f0Var4.C).setTranslationY(f14);
            }
        }
    }
}
