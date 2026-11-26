package u3;

import android.text.TextPaint;
import i2.s;
import i2.s0;
import java.util.ArrayList;
import m3.l;
import m3.q;
import m3.r0;
import m3.x;
import m3.z;

public abstract class i {

    public static final j f14937a = new j(false);

    public static final boolean a(r0 r0Var) {
        x xVar;
        z zVar = r0Var.f10524c;
        l lVar = (zVar == null || (xVar = zVar.f10553b) == null) ? null : new l(xVar.f10550b);
        boolean z10 = false;
        if (lVar != null && lVar.f10477a == 1) {
            z10 = true;
        }
        return !z10;
    }

    public static final void b(q qVar, s sVar, i2.q qVar2, float f3, s0 s0Var, x3.l lVar, k2.e eVar) {
        ArrayList arrayList = qVar.f10517h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m3.s sVar2 = (m3.s) arrayList.get(i10);
            sVar2.f10525a.g(sVar, qVar2, f3, s0Var, lVar, eVar);
            sVar.p(0.0f, sVar2.f10525a.b());
        }
    }

    public static final void c(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
