package ig;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.material.chip.Chip;
import ng.g;
import ng.h;

public final class b extends b5 {

    public final int f7627b;

    public final Object f7628c;

    public b(Object obj, int i10) {
        this.f7627b = i10;
        this.f7628c = obj;
    }

    private final void U(int i10) {
    }

    @Override
    public final void E(int i10) {
        switch (this.f7627b) {
            case 0:
                break;
            default:
                h hVar = (h) this.f7628c;
                hVar.f11307d = true;
                g gVar = (g) hVar.f11308e.get();
                if (gVar != null) {
                    f fVar = (f) gVar;
                    fVar.z();
                    fVar.invalidateSelf();
                }
                break;
        }
    }

    @Override
    public final void F(Typeface typeface, boolean z10) {
        switch (this.f7627b) {
            case 0:
                Chip chip = (Chip) this.f7628c;
                f fVar = chip.E;
                chip.setText(fVar.f7646i1 ? fVar.f7649k0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z10) {
                    h hVar = (h) this.f7628c;
                    hVar.f11307d = true;
                    g gVar = (g) hVar.f11308e.get();
                    if (gVar != null) {
                        f fVar2 = (f) gVar;
                        fVar2.z();
                        fVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }
}
