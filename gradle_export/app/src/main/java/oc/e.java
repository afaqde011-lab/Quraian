package oc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import c3.s0;
import com.google.android.gms.internal.measurement.y3;
import java.io.Closeable;

public abstract class e {

    public static final s0 f11922a = new s0(4);

    public static final s0 f11923b = new s0(5);

    public static final s0 f11924c = new s0(6);

    public static final s0 f11925d = new s0(7);

    public static final float f11926e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f3, float f10, float f11) {
        PathMeasure pathMeasure = (PathMeasure) f11922a.get();
        Path path2 = (Path) f11923b.get();
        Path path3 = (Path) f11924c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f3 == 1.0f && f10 == 0.0f) {
            y3.D();
            return;
        }
        if (length < 1.0f || Math.abs((f10 - f3) - 1.0f) < 0.01d) {
            y3.D();
            return;
        }
        float f12 = f3 * length;
        float f13 = f10 * length;
        float f14 = f11 * length;
        float fMin = Math.min(f12, f13) + f14;
        float fMax = Math.max(f12, f13) + f14;
        if (fMin >= length && fMax >= length) {
            fMin = d.c(fMin, length);
            fMax = d.c(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = d.c(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = d.c(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            y3.D();
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        y3.D();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f11925d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f3 = f11926e;
        fArr[2] = f3;
        fArr[3] = f3;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
