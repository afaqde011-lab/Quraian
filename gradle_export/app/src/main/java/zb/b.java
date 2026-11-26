package zb;

import a10.h0;
import ab.a0;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import g00.k;
import kotlin.jvm.internal.m;
import xb.f;
import xb.g;

public final class b implements c {

    public final float f17406a;

    public final float f17407b;

    public final float f17408c;

    public final float f17409d;

    public final String f17410e;

    public b(float f3) {
        this.f17406a = f3;
        this.f17407b = f3;
        this.f17408c = f3;
        this.f17409d = f3;
        if (f3 < 0.0f || f3 < 0.0f || f3 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.f17410e = b.class.getName() + '-' + f3 + ',' + f3 + ',' + f3 + ',' + f3;
    }

    @Override
    public final Bitmap a(Bitmap bitmap, g gVar) {
        k kVar;
        Paint paint = new Paint(3);
        if (m.a(gVar, g.f16512c)) {
            kVar = new k(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            a0 a0Var = gVar.f16513a;
            a0 a0Var2 = gVar.f16514b;
            if ((a0Var instanceof xb.a) && (a0Var2 instanceof xb.a)) {
                kVar = new k(Integer.valueOf(((xb.a) a0Var).f16510a), Integer.valueOf(((xb.a) a0Var2).f16510a));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                a0 a0Var3 = gVar.f16513a;
                double dO = h0.o(width, height, a0Var3 instanceof xb.a ? ((xb.a) a0Var3).f16510a : Integer.MIN_VALUE, a0Var2 instanceof xb.a ? ((xb.a) a0Var2).f16510a : Integer.MIN_VALUE, f.A);
                kVar = new k(Integer.valueOf(w00.a.E(((double) bitmap.getWidth()) * dO)), Integer.valueOf(w00.a.E(dO * ((double) bitmap.getHeight()))));
            }
        }
        int iIntValue = ((Number) kVar.A).intValue();
        int iIntValue2 = ((Number) kVar.B).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fO = (float) h0.o(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, f.A);
        float f3 = 2;
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fO)) / f3, (iIntValue2 - (bitmap.getHeight() * fO)) / f3);
        matrix.preScale(fO, fO);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f10 = this.f17406a;
        float f11 = this.f17407b;
        float f12 = this.f17409d;
        float f13 = this.f17408c;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    @Override
    public final String b() {
        return this.f17410e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17406a == bVar.f17406a && this.f17407b == bVar.f17407b && this.f17408c == bVar.f17408c && this.f17409d == bVar.f17409d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17409d) + w.c.c(this.f17408c, w.c.c(this.f17407b, Float.hashCode(this.f17406a) * 31, 31), 31);
    }
}
