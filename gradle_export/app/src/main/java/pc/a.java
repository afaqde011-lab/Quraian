package pc;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import kc.c;

public class a {

    public final cc.a f12474a;

    public final Object f12475b;

    public Object f12476c;

    public final Interpolator f12477d;

    public final Interpolator f12478e;

    public final Interpolator f12479f;

    public final float f12480g;

    public Float f12481h;

    public float f12482i;

    public float f12483j;

    public int f12484k;
    public int l;
    public float m;

    public float f12485n;

    public PointF f12486o;

    public PointF f12487p;

    public a(cc.a aVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f3, Float f10) {
        this.f12482i = -3987645.8f;
        this.f12483j = -3987645.8f;
        this.f12484k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f12485n = Float.MIN_VALUE;
        this.f12486o = null;
        this.f12487p = null;
        this.f12474a = aVar;
        this.f12475b = obj;
        this.f12476c = obj2;
        this.f12477d = baseInterpolator;
        this.f12478e = null;
        this.f12479f = null;
        this.f12480g = f3;
        this.f12481h = f10;
    }

    public a(cc.a aVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f3) {
        this.f12482i = -3987645.8f;
        this.f12483j = -3987645.8f;
        this.f12484k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f12485n = Float.MIN_VALUE;
        this.f12486o = null;
        this.f12487p = null;
        this.f12474a = aVar;
        this.f12475b = obj;
        this.f12476c = obj2;
        this.f12477d = null;
        this.f12478e = baseInterpolator;
        this.f12479f = baseInterpolator2;
        this.f12480g = f3;
        this.f12481h = null;
    }

    public a(cc.a aVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f3, Float f10) {
        this.f12482i = -3987645.8f;
        this.f12483j = -3987645.8f;
        this.f12484k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f12485n = Float.MIN_VALUE;
        this.f12486o = null;
        this.f12487p = null;
        this.f12474a = aVar;
        this.f12475b = obj;
        this.f12476c = obj2;
        this.f12477d = interpolator;
        this.f12478e = interpolator2;
        this.f12479f = interpolator3;
        this.f12480g = f3;
        this.f12481h = f10;
    }

    public a(Object obj) {
        this.f12482i = -3987645.8f;
        this.f12483j = -3987645.8f;
        this.f12484k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f12485n = Float.MIN_VALUE;
        this.f12486o = null;
        this.f12487p = null;
        this.f12474a = null;
        this.f12475b = obj;
        this.f12476c = obj;
        this.f12477d = null;
        this.f12478e = null;
        this.f12479f = null;
        this.f12480g = Float.MIN_VALUE;
        this.f12481h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(c cVar, c cVar2) {
        this.f12482i = -3987645.8f;
        this.f12483j = -3987645.8f;
        this.f12484k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f12485n = Float.MIN_VALUE;
        this.f12486o = null;
        this.f12487p = null;
        this.f12474a = null;
        this.f12475b = cVar;
        this.f12476c = cVar2;
        this.f12477d = null;
        this.f12478e = null;
        this.f12479f = null;
        this.f12480g = Float.MIN_VALUE;
        this.f12481h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        cc.a aVar = this.f12474a;
        if (aVar == null) {
            return 1.0f;
        }
        if (this.f12485n == Float.MIN_VALUE) {
            if (this.f12481h == null) {
                this.f12485n = 1.0f;
            } else {
                this.f12485n = ((this.f12481h.floatValue() - this.f12480g) / (aVar.f3116k - aVar.f3115j)) + b();
            }
        }
        return this.f12485n;
    }

    public final float b() {
        cc.a aVar = this.f12474a;
        if (aVar == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            float f3 = aVar.f3115j;
            this.m = (this.f12480g - f3) / (aVar.f3116k - f3);
        }
        return this.m;
    }

    public final boolean c() {
        return this.f12477d == null && this.f12478e == null && this.f12479f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f12475b + ", endValue=" + this.f12476c + ", startFrame=" + this.f12480g + ", endFrame=" + this.f12481h + ", interpolator=" + this.f12477d + '}';
    }
}
