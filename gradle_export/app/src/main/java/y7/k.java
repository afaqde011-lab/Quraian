package y7;

import android.content.Context;
import android.util.Range;

public final class k {

    public final Context f16695a;

    public final u f16696b;

    public n f16697c;

    public boolean f16698d;

    public e7.b0 f16699e;

    public boolean f16700f;

    public long f16701g = 15000;

    public final v f16702h;

    public k(Context context, u uVar) {
        this.f16695a = context.getApplicationContext();
        this.f16696b = uVar;
        v vVar = new v();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) 1.0f)));
        vVar.f16740d = range;
        vVar.f16739c = ((Double) range.getUpper()).doubleValue();
        vVar.f16737a = -9223372036854775807L;
        vVar.f16738b = -9223372036854775807L;
        this.f16702h = vVar;
        this.f16699e = e7.b0.f5117a;
    }
}
