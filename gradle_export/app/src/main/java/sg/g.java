package sg;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class g extends Drawable.ConstantState {

    public m f14150a;

    public y f14151b;

    public mg.a f14152c;

    public ColorStateList f14153d;

    public ColorStateList f14154e;

    public ColorStateList f14155f;

    public PorterDuff.Mode f14156g;

    public Rect f14157h;

    public final float f14158i;

    public float f14159j;

    public float f14160k;
    public int l;
    public float m;

    public float f14161n;

    public int f14162o;

    public int f14163p;

    public final Paint.Style f14164q;

    public g(g gVar) {
        this.f14153d = null;
        this.f14154e = null;
        this.f14155f = null;
        this.f14156g = PorterDuff.Mode.SRC_IN;
        this.f14157h = null;
        this.f14158i = 1.0f;
        this.f14159j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.f14161n = 0.0f;
        this.f14162o = 0;
        this.f14163p = 0;
        this.f14164q = Paint.Style.FILL_AND_STROKE;
        this.f14150a = gVar.f14150a;
        this.f14151b = gVar.f14151b;
        this.f14152c = gVar.f14152c;
        this.f14160k = gVar.f14160k;
        this.f14153d = gVar.f14153d;
        this.f14154e = gVar.f14154e;
        this.f14156g = gVar.f14156g;
        this.f14155f = gVar.f14155f;
        this.l = gVar.l;
        this.f14158i = gVar.f14158i;
        this.f14163p = gVar.f14163p;
        this.f14159j = gVar.f14159j;
        this.m = gVar.m;
        this.f14161n = gVar.f14161n;
        this.f14162o = gVar.f14162o;
        this.f14164q = gVar.f14164q;
        if (gVar.f14157h != null) {
            this.f14157h = new Rect(gVar.f14157h);
        }
    }

    public g(m mVar) {
        this.f14153d = null;
        this.f14154e = null;
        this.f14155f = null;
        this.f14156g = PorterDuff.Mode.SRC_IN;
        this.f14157h = null;
        this.f14158i = 1.0f;
        this.f14159j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.f14161n = 0.0f;
        this.f14162o = 0;
        this.f14163p = 0;
        this.f14164q = Paint.Style.FILL_AND_STROKE;
        this.f14150a = mVar;
        this.f14152c = null;
    }

    @Override
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.F = true;
        iVar.G = true;
        return iVar;
    }
}
