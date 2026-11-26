package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.q;
import androidx.lifecycle.w;
import dh.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ra.a;
import ra.b;
import v5.g;
import v5.h;
import v5.n;

public class EmojiCompatInitializer implements b {
    @Override
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override
    public final Object b(Context context) {
        Object objB;
        n nVar = new n(new o(context, 5));
        nVar.f2461a = 1;
        if (g.f15462k == null) {
            synchronized (g.f15461j) {
                try {
                    if (g.f15462k == null) {
                        g.f15462k = new g(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f13131e) {
            try {
                objB = aVarC.f13132a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        q lifecycle = ((w) objB).getLifecycle();
        lifecycle.a(new h(this, lifecycle));
        return Boolean.TRUE;
    }
}
