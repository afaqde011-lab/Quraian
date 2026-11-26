package x5;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import sd.p1;
import tf.y;

public final class e implements KeyListener {

    public final KeyListener f16460a;

    public final y f16461b;

    public e(KeyListener keyListener) {
        y yVar = new y(18);
        this.f16460a = keyListener;
        this.f16461b = yVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f16460a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f16460a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zL;
        boolean z10;
        this.f16461b.getClass();
        if (i10 != 67) {
            zL = i10 != 112 ? false : p1.l(editable, keyEvent, true);
        } else {
            zL = p1.l(editable, keyEvent, false);
        }
        if (zL) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f16460a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f16460a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f16460a.onKeyUp(view, editable, i10, keyEvent);
    }
}
