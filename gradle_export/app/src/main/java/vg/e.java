package vg;

import ab.a0;
import com.google.android.material.internal.CheckableImageButton;

public final class e extends o {

    public final int f15648e;

    public e(n nVar, int i10) {
        super(nVar);
        this.f15648e = i10;
    }

    @Override
    public void q() {
        switch (this.f15648e) {
            case 0:
                n nVar = this.f15667b;
                nVar.O = null;
                CheckableImageButton checkableImageButton = nVar.G;
                checkableImageButton.setOnLongClickListener(null);
                a0.B0(checkableImageButton, null);
                break;
        }
    }
}
