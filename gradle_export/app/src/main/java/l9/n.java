package l9;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k9.m1;

public abstract class n {

    public final Object f10171a;

    public Object f10172b;

    public Object f10173c;

    public Object f10174d;

    public n() {
        this.f10171a = new Object();
        this.f10172b = new a0(this);
        this.f10173c = new WeakReference(null);
    }

    public n(m1 m1Var) {
        this.f10174d = m1Var;
        this.f10171a = new ArrayList();
    }

    public void A() {
    }

    public void B(long j9) {
    }

    public void C() {
    }

    public void a(l lVar, String str, Bundle bundle) {
        int i10;
        int i11;
        List<y4.b> list = (List) lVar.f10165f.get(str);
        if (list != null) {
            for (y4.b bVar : list) {
                Bundle bundle2 = (Bundle) bVar.f16604b;
                int i12 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i13 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
                int i14 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i15 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i16 = Integer.MAX_VALUE;
                int i17 = 0;
                if (i12 == -1 || i14 == -1) {
                    i10 = Integer.MAX_VALUE;
                    i11 = 0;
                } else {
                    i11 = i12 * i14;
                    i10 = (i14 + i11) - 1;
                }
                if (i13 != -1 && i15 != -1) {
                    i17 = i15 * i13;
                    i16 = (i15 + i17) - 1;
                }
                if (i10 >= i17 && i16 >= i11) {
                    ((m1) this.f10174d).g(str, lVar, (Bundle) bVar.f16604b, bundle);
                }
            }
        }
    }

    public void b(String str, Bundle bundle) {
        o oVar = (o) this.f10172b;
        oVar.getClass();
        oVar.notifyChildrenChanged(str);
    }

    public void c(x xVar) {
    }

    public void d(x xVar, int i10) {
    }

    public void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void f(String str, Bundle bundle) {
    }

    public void g() {
    }

    public boolean h(Intent intent) {
        return false;
    }

    public void i() {
    }

    public void j() {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(String str, Bundle bundle) {
    }

    public void m(Uri uri, Bundle bundle) {
    }

    public void n() {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(String str, Bundle bundle) {
    }

    public void q(Uri uri, Bundle bundle) {
    }

    public void r(x xVar) {
    }

    public void s() {
    }

    public void t(long j9) {
    }

    public void u(float f3) {
    }

    public void v(k0 k0Var) {
    }

    public void w(k0 k0Var) {
    }

    public void x(int i10) {
    }

    public void y(int i10) {
    }

    public void z() {
    }
}
