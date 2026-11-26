package c3;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

public final class q extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final z B;

    public q(z zVar, int i10) {
        super(0);
        this.A = i10;
        this.B = zVar;
    }

    public final Object invoke() {
        int actionMasked;
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) this.B.Q.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = this.B.getConfiguration().getLocales();
                u4.d dVar = new u4.d(new u4.e(locales));
                if (locales.isEmpty()) {
                    dVar = new u4.d(new u4.e(LocaleList.getDefault()));
                }
                u4.e eVar = dVar.f14943a;
                int size = eVar.f14944a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Locale locale = eVar.f14944a.get(i10);
                    kotlin.jvm.internal.m.b(locale);
                    arrayList.add(new t3.a(locale));
                }
                return new t3.b(arrayList);
            case 2:
                z zVar = this.B;
                MotionEvent motionEvent = zVar.V0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    zVar.W0 = SystemClock.uptimeMillis();
                    zVar.post(zVar.f2786b1);
                }
                return g00.b0.a;
            default:
                this.B.get_viewTreeOwners();
                return null;
        }
    }
}
