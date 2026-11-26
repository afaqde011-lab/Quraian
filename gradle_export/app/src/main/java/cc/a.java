package cc;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.q;
import u.t0;

public final class a {

    public HashMap f3108c;

    public HashMap f3109d;

    public HashMap f3110e;

    public t0 f3111f;

    public q f3112g;

    public ArrayList f3113h;

    public Rect f3114i;

    public float f3115j;

    public float f3116k;
    public float l;

    public final qj.c f3106a = new qj.c(14, (byte) 0);

    public final HashSet f3107b = new HashSet();
    public int m = 0;

    public final void a(String str) {
        oc.b.a(str);
        this.f3107b.add(str);
    }

    public final float b() {
        return (long) (((this.f3116k - this.f3115j) / this.l) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f3113h.iterator();
        while (it.hasNext()) {
            sb2.append(((lc.e) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
