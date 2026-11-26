package ig;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class c extends ViewOutlineProvider {

    public final Chip f7629a;

    public c(Chip chip) {
        this.f7629a = chip;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        f fVar = this.f7629a.E;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
