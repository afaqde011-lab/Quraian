package sd;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

public final class w1 {

    public final q0 f14108a;

    public boolean f14109b;

    public boolean f14110c;

    public final Paint f14111d;

    public final Paint f14112e;

    public h2.a f14113f;

    public h2.a f14114g;

    public boolean f14115h;

    public w1() {
        Paint paint = new Paint();
        this.f14111d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f14112e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f14108a = q0.a();
    }

    public w1(w1 w1Var) {
        this.f14109b = w1Var.f14109b;
        this.f14110c = w1Var.f14110c;
        this.f14111d = new Paint(w1Var.f14111d);
        this.f14112e = new Paint(w1Var.f14112e);
        h2.a aVar = w1Var.f14113f;
        if (aVar != null) {
            this.f14113f = new h2.a(aVar);
        }
        h2.a aVar2 = w1Var.f14114g;
        if (aVar2 != null) {
            this.f14114g = new h2.a(aVar2);
        }
        this.f14115h = w1Var.f14115h;
        try {
            this.f14108a = (q0) w1Var.f14108a.clone();
        } catch (CloneNotSupportedException e3) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e3);
            this.f14108a = q0.a();
        }
    }
}
