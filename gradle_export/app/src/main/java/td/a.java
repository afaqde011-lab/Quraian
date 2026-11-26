package td;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import ca.v;
import h2.e;
import kotlin.jvm.internal.m;
import l1.i1;

public final class a implements Drawable.Callback {
    public final int A;
    public final Object B;

    public a(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                m.e(drawable, "d");
                b bVar = (b) obj;
                i1 i1Var = bVar.F;
                i1Var.setValue(Integer.valueOf(((Number) i1Var.getValue()).intValue() + 1));
                Drawable drawable2 = bVar.E;
                Object obj2 = d.f14520a;
                bVar.G.setValue(new e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : v.i(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
            default:
                ((ua.e) obj).invalidateSelf();
                break;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        switch (this.A) {
            case 0:
                m.e(drawable, "d");
                m.e(runnable, "what");
                ((Handler) d.f14520a.getValue()).postAtTime(runnable, j9);
                break;
            default:
                ((ua.e) this.B).scheduleSelf(runnable, j9);
                break;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.A) {
            case 0:
                m.e(drawable, "d");
                m.e(runnable, "what");
                ((Handler) d.f14520a.getValue()).removeCallbacks(runnable);
                break;
            default:
                ((ua.e) this.B).unscheduleSelf(runnable);
                break;
        }
    }
}
