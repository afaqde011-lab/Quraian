package b4;

import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import g00.b0;
import kotlin.jvm.internal.d0;

public final class e extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final z B;

    public e(z zVar, int i10) {
        super(1);
        this.A = i10;
        this.B = zVar;
    }

    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.A) {
            case 0:
                Owner owner = (Owner) obj;
                c3.z zVar = owner instanceof c3.z ? (c3.z) owner : null;
                z zVar2 = this.B;
                if (zVar != null) {
                    zVar.getAndroidViewsHandler$ui().removeViewInLayout(zVar2);
                    d0.b(zVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(zVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(zVar2));
                    zVar2.setImportantForAccessibility(0);
                }
                zVar2.removeAllViewsInLayout();
                return b0.a;
            case 1:
                this.B.Q = (u00.k) obj;
                return b0.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                z zVar3 = this.B;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = zVar3.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = zVar3.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
