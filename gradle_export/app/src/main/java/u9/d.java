package u9;

import android.graphics.Color;
import java.util.Arrays;

public final class d {

    public final int f15151a;

    public final int f15152b;

    public final int f15153c;

    public final int f15154d;

    public final int f15155e;

    public boolean f15156f;

    public int f15157g;

    public int f15158h;

    public float[] f15159i;

    public d(int i10, int i11) {
        this.f15151a = Color.red(i10);
        this.f15152b = Color.green(i10);
        this.f15153c = Color.blue(i10);
        this.f15154d = i10;
        this.f15155e = i11;
    }

    public final void a() {
        if (this.f15156f) {
            return;
        }
        int i10 = this.f15154d;
        int iE = q4.a.e(4.5f, -1, i10);
        int iE2 = q4.a.e(3.0f, -1, i10);
        if (iE != -1 && iE2 != -1) {
            this.f15158h = q4.a.h(-1, iE);
            this.f15157g = q4.a.h(-1, iE2);
            this.f15156f = true;
            return;
        }
        int iE3 = q4.a.e(4.5f, -16777216, i10);
        int iE4 = q4.a.e(3.0f, -16777216, i10);
        if (iE3 == -1 || iE4 == -1) {
            this.f15158h = iE != -1 ? q4.a.h(-1, iE) : q4.a.h(-16777216, iE3);
            this.f15157g = iE2 != -1 ? q4.a.h(-1, iE2) : q4.a.h(-16777216, iE4);
            this.f15156f = true;
        } else {
            this.f15158h = q4.a.h(-16777216, iE3);
            this.f15157g = q4.a.h(-16777216, iE4);
            this.f15156f = true;
        }
    }

    public final float[] b() {
        if (this.f15159i == null) {
            this.f15159i = new float[3];
        }
        q4.a.a(this.f15151a, this.f15152b, this.f15153c, this.f15159i);
        return this.f15159i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f15155e == dVar.f15155e && this.f15154d == dVar.f15154d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15154d * 31) + this.f15155e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.f15154d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f15155e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f15157g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.f15158h));
        sb2.append(']');
        return sb2.toString();
    }
}
