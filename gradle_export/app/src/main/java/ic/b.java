package ic;

import android.graphics.PointF;
import com.google.android.gms.internal.measurement.x5;
import e4.f;

public final class b {

    public String f7586a;

    public String f7587b;

    public float f7588c;

    public int f7589d;

    public int f7590e;

    public float f7591f;

    public float f7592g;

    public int f7593h;

    public int f7594i;

    public float f7595j;

    public boolean f7596k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int iB = ((f.b(this.f7589d) + (((int) (x5.e(this.f7586a.hashCode() * 31, this.f7587b, 31) + this.f7588c)) * 31)) * 31) + this.f7590e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f7591f);
        return (((iB * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f7593h;
    }
}
