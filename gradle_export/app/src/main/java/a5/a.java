package a5;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {
    public final int A;
    public final g B;
    public final int C;

    public a(int i10, g gVar, int i11) {
        this.A = i10;
        this.B = gVar;
        this.C = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A);
        this.B.f187a.performAction(this.C, bundle);
    }
}
