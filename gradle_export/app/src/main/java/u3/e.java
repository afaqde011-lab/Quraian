package u3;

import android.text.style.ClickableSpan;
import android.view.View;
import m3.o;
import m3.p;

public final class e extends ClickableSpan {
    public final o A;

    public e(o oVar) {
        this.A = oVar;
    }

    @Override
    public final void onClick(View view) {
        o oVar = this.A;
        p pVarA = oVar.a();
        if (pVarA != null) {
            pVarA.l(oVar);
        }
    }
}
