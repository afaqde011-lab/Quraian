package ng;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

public final class h {

    public float f11306c;

    public final WeakReference f11308e;

    public qg.d f11309f;

    public final TextPaint f11304a = new TextPaint(1);

    public final ig.b f11305b = new ig.b(this, 1);

    public boolean f11307d = true;

    public h(ig.f fVar) {
        this.f11308e = new WeakReference(null);
        this.f11308e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f11307d) {
            return this.f11306c;
        }
        TextPaint textPaint = this.f11304a;
        this.f11306c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f11307d = false;
        return this.f11306c;
    }
}
