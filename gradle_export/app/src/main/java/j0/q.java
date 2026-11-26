package j0;

import com.google.android.gms.cast.MediaError;
import l0.q0;
import l1.f1;

public final class q {

    public final int f7807a;

    public final f1 f7808b;

    public final f1 f7809c;

    public boolean f7810d;

    public Object f7811e;

    public final q0 f7812f;

    public q(int i10, int i11, int i12) {
        this.f7807a = i12;
        switch (i12) {
            case 1:
                this.f7808b = new f1(i10);
                this.f7809c = new f1(i11);
                this.f7812f = new q0(i10, 90, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                break;
            default:
                this.f7808b = new f1(i10);
                this.f7809c = new f1(i11);
                this.f7812f = new q0(i10, 30, 100);
                break;
        }
    }

    public final void a(int i10, int i11) {
        switch (this.f7807a) {
            case 0:
                if (i10 < 0.0f) {
                    g0.a.a("Index should be non-negative (" + i10 + ')');
                }
                this.f7808b.i(i10);
                this.f7812f.a(i10);
                this.f7809c.i(i11);
                break;
            default:
                if (i10 < 0.0f) {
                    g0.a.a("Index should be non-negative");
                }
                this.f7808b.i(i10);
                this.f7812f.a(i10);
                this.f7809c.i(i11);
                break;
        }
    }
}
