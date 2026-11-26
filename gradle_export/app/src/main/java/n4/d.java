package n4;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.y;
import java.util.WeakHashMap;
import u.s0;
import z4.j0;

public abstract class d extends Activity implements androidx.lifecycle.w, z4.j {
    private final s0 extraDataMap = new s0(0);
    private final y lifecycleRegistry = new y(this, true);

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.m.e(keyEvent, "event");
        kotlin.jvm.internal.m.d(getWindow().getDecorView(), "getDecorView(...)");
        WeakHashMap weakHashMap = j0.f17198a;
        return superDispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.m.e(keyEvent, "event");
        kotlin.jvm.internal.m.d(getWindow().getDecorView(), "getDecorView(...)");
        WeakHashMap weakHashMap = j0.f17198a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @g00.c
    public <T extends c> T getExtraData(Class<T> cls) {
        kotlin.jvm.internal.m.e(cls, "extraDataClass");
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public androidx.lifecycle.q getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = q0.A;
        o0.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.m.e(bundle, "outState");
        this.lifecycleRegistry.i(androidx.lifecycle.p.C);
        super.onSaveInstanceState(bundle);
    }

    @g00.c
    public void putExtraData(c cVar) {
        kotlin.jvm.internal.m.e(cVar, "extraData");
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z10 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        z10 = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        z10 = true;
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        z10 = true;
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        z10 = true;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        z10 = true;
                    }
                    break;
            }
        }
        return !z10;
    }

    @Override
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.m.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
