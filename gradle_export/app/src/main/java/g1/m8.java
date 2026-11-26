package g1;

import com.google.protobuf.RuntimeVersion;
import kotlin.NoWhenBranchMatchedException;

public abstract class m8 {

    public static final l1.q2 f5890a = new l1.q2(new e00.g(27));

    public static final m3.r0 a(k1.g0 g0Var, l1.j jVar) throws NoWhenBranchMatchedException {
        l8 l8Var = (l8) ((l1.g0) jVar).k(f5890a);
        switch (g0Var.ordinal()) {
            case 0:
                return l8Var.f5868j;
            case 1:
                return l8Var.f5869k;
            case 2:
                return l8Var.l;
            case 3:
                return l8Var.f5859a;
            case 4:
                return l8Var.f5860b;
            case 5:
                return l8Var.f5861c;
            case 6:
                return l8Var.f5862d;
            case 7:
                return l8Var.f5863e;
            case 8:
                return l8Var.f5864f;
            case 9:
                return l8Var.m;
            case 10:
                return l8Var.f5870n;
            case 11:
                return l8Var.f5871o;
            case 12:
                return l8Var.f5865g;
            case 13:
                return l8Var.f5866h;
            case 14:
                return l8Var.f5867i;
            case 15:
                return l8Var.f5881y;
            case 16:
                return l8Var.f5882z;
            case 17:
                return l8Var.A;
            case TYPE_SINT64_VALUE:
                return l8Var.f5872p;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return l8Var.f5873q;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return l8Var.f5874r;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return l8Var.f5875s;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return l8Var.f5876t;
            case 23:
                return l8Var.f5877u;
            case 24:
                return l8Var.B;
            case 25:
                return l8Var.C;
            case RuntimeVersion.MINOR:
                return l8Var.D;
            case 27:
                return l8Var.f5878v;
            case 28:
                return l8Var.f5879w;
            case 29:
                return l8Var.f5880x;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
