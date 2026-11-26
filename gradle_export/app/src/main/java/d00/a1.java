package d00;

import a1.e1;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

public final class a1 implements ComponentCallbacks2 {
    public final int A;
    public final Object B;

    public a1(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    private final void a(Configuration configuration) {
    }

    private final void b() {
    }

    @Override
    public final void onConfigurationChanged(Configuration newConfig) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(newConfig, "newConfig");
                break;
        }
    }

    @Override
    public final void onLowMemory() {
        switch (this.A) {
            case 0:
                ((e1) this.B).invoke(b1.COMPLETE);
                break;
        }
    }

    @Override
    public final void onTrimMemory(int i) {
        b1 b1Var;
        switch (this.A) {
            case 0:
                e1 e1Var = (e1) this.B;
                if (i >= 80) {
                    b1Var = b1.COMPLETE;
                } else if (i >= 60) {
                    b1Var = b1.MODERATE;
                } else if (i >= 40) {
                    b1Var = b1.BACKGROUND;
                } else if (i >= 20) {
                    b1Var = b1.UI_HIDDEN;
                } else if (i >= 15) {
                    b1Var = b1.COMPLETE;
                } else if (i >= 10) {
                    b1Var = b1.MODERATE;
                } else {
                    b1Var = i >= 5 ? b1.BACKGROUND : b1.UI_HIDDEN;
                }
                e1Var.invoke(b1Var);
                return;
            default:
                if (i >= 40) {
                    i2.c cVar = (i2.c) this.B;
                    h1.l lVar = cVar.d;
                    if (lVar != null) {
                        synchronized (lVar) {
                            try {
                                u.i0 i0Var = (u.i0) lVar.A;
                                if (i0Var != null) {
                                    i0Var.a();
                                }
                                lVar.B = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    cVar.d = null;
                    return;
                }
                return;
        }
    }
}
