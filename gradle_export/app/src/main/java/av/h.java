package av;

import android.view.View;

public final class h extends eg.b {
    public final int a;
    public final Object b;

    public h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    public final void b(View view) {
        int i = this.a;
    }

    public final void c(View view, int i) {
        switch (this.a) {
            case 0:
                if (i == 5) {
                    ((i) this.b).o();
                }
                break;
            default:
                if (i == 5) {
                    ((eg.f) this.b).cancel();
                }
                break;
        }
    }
}
