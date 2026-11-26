package w3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h2.e;
import i2.r0;
import l1.i1;
import l1.q;
import l1.w;
import q0.f2;
import u3.i;

public final class b extends CharacterStyle implements UpdateAppearance {
    public final r0 A;
    public final float B;
    public final i1 C = q.z(new e(9205357640488583168L));
    public final w D = q.r(new f2(this, 12));

    public b(r0 r0Var, float f3) {
        this.A = r0Var;
        this.B = f3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        i.c(textPaint, this.B);
        textPaint.setShader((Shader) this.D.getValue());
    }
}
