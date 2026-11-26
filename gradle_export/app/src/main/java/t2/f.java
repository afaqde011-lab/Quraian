package t2;

import android.view.KeyEvent;
import b2.q;
import u00.k;

public final class f extends q implements e {
    public k O;
    public k P;

    @Override
    public final boolean O(KeyEvent keyEvent) {
        k kVar = this.O;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override
    public final boolean k(KeyEvent keyEvent) {
        k kVar = this.P;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
