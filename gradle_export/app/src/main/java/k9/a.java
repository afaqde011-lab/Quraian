package k9;

import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.Objects;

public final class a {

    public final int f9196a;

    public z3 f9197b;

    public int f9198c;

    public int f9199d;

    public Uri f9200e;

    public CharSequence f9201f;

    public Bundle f9202g;

    public boolean f9203h;

    public jh.a f9204i;

    public Object f9205j;

    public a(int i10) {
        int i11;
        String str = b.f9214k;
        switch (i10) {
            case 57369:
                i11 = 2131231456;
                break;
            case 57370:
                i11 = 2131231457;
                break;
            case 57372:
                i11 = 2131231464;
                break;
            case 57375:
                i11 = 2131231466;
                break;
            case 57376:
                i11 = 2131231500;
                break;
            case 57396:
                i11 = 2131231476;
                break;
            case 57399:
                i11 = 2131231477;
                break;
            case 57403:
                i11 = 2131231486;
                break;
            case 57408:
                i11 = 2131231497;
                break;
            case 57409:
                i11 = 2131231499;
                break;
            case 57410:
                i11 = 2131231507;
                break;
            case 57411:
                i11 = 2131231504;
                break;
            case 57412:
                i11 = 2131231475;
                break;
            case 57413:
                i11 = 2131231491;
                break;
            case 57415:
                i11 = 2131231519;
                break;
            case 57416:
                i11 = 2131231520;
                break;
            case 57421:
                i11 = 2131231527;
                break;
            case 57423:
                i11 = 2131231528;
                break;
            case 57424:
                i11 = 2131231529;
                break;
            case 57430:
                i11 = 2131231513;
                break;
            case 57431:
                i11 = 2131231515;
                break;
            case 57432:
                i11 = 2131231516;
                break;
            case 57433:
                i11 = 2131231508;
                break;
            case 57434:
                i11 = 2131231510;
                break;
            case 57435:
                i11 = 2131231511;
                break;
            case 57436:
                i11 = 2131231493;
                break;
            case 57446:
                i11 = 2131231494;
                break;
            case 57447:
                i11 = 2131231495;
                break;
            case 57448:
                i11 = 2131231478;
                break;
            case 57573:
                i11 = 2131231467;
                break;
            case 57669:
                i11 = 2131231488;
                break;
            case 57671:
                i11 = 2131231490;
                break;
            case 57675:
                i11 = 2131231458;
                break;
            case 57683:
                i11 = 2131231469;
                break;
            case 57691:
                i11 = 2131231472;
                break;
            case 58409:
                i11 = 2131231492;
                break;
            case 58654:
                i11 = 2131231496;
                break;
            case 58919:
                i11 = 2131231522;
                break;
            case 59405:
                i11 = 2131231502;
                break;
            case 59448:
                i11 = 2131231518;
                break;
            case 59494:
                i11 = 2131231460;
                break;
            case 59500:
                i11 = 2131231462;
                break;
            case 59517:
                i11 = 2131231471;
                break;
            case 59576:
                i11 = 2131231501;
                break;
            case 59611:
                i11 = 2131231524;
                break;
            case 59612:
                i11 = 2131231526;
                break;
            case 60288:
                i11 = 2131231487;
                break;
            case 61298:
                i11 = 2131231521;
                break;
            case 61389:
                i11 = 2131231481;
                break;
            case 61512:
                i11 = 2131231506;
                break;
            case 61916:
                i11 = 2131231465;
                break;
            case 62688:
                i11 = 2131231483;
                break;
            case 62689:
                i11 = 2131231482;
                break;
            case 62690:
                i11 = 2131231479;
                break;
            case 62699:
                i11 = 2131231485;
                break;
            case 63220:
                i11 = 2131231512;
                break;
            case 1040448:
                i11 = 2131231498;
                break;
            case 1040451:
                i11 = 2131231505;
                break;
            case 1040452:
                i11 = 2131231503;
                break;
            case 1040470:
                i11 = 2131231514;
                break;
            case 1040473:
                i11 = 2131231509;
                break;
            case 1040711:
                i11 = 2131231489;
                break;
            case 1040712:
                i11 = 2131231473;
                break;
            case 1040713:
                i11 = 2131231474;
                break;
            case 1040723:
                i11 = 2131231468;
                break;
            case 1042488:
                i11 = 2131231517;
                break;
            case 1042534:
                i11 = 2131231459;
                break;
            case 1042540:
                i11 = 2131231461;
                break;
            case 1042557:
                i11 = 2131231470;
                break;
            case 1042651:
                i11 = 2131231523;
                break;
            case 1042652:
                i11 = 2131231525;
                break;
            case 1045728:
                i11 = 2131231484;
                break;
            case 1045730:
                i11 = 2131231480;
                break;
            default:
                i11 = 0;
                break;
        }
        this(i10, i11);
    }

    public a(int i10, int i11) {
        this.f9196a = i10;
        this.f9199d = i11;
        this.f9201f = RuntimeVersion.SUFFIX;
        this.f9202g = Bundle.EMPTY;
        this.f9198c = -1;
        this.f9203h = true;
    }

    public final b a() {
        int i10;
        int i11 = 1;
        ta.c0.z("Exactly one of sessionCommand and playerCommand should be set", (this.f9197b == null) != (this.f9198c == -1));
        if (this.f9204i == null) {
            int i12 = this.f9198c;
            String str = b.f9214k;
            if (i12 != 1 && (i10 = this.f9196a) != 57399 && i10 != 57396) {
                if (i12 == 11 || i12 == 7) {
                    i11 = 2;
                } else {
                    i11 = 6;
                    if (i12 == 6 || i10 == 57413 || i10 == 57376 || i10 == 57410 || i10 == 57435 || i10 == 57433 || i10 == 1040473 || i10 == 57434) {
                        i11 = 2;
                    } else if (i12 == 12 || i12 == 9 || i12 == 8 || i10 == 57412 || i10 == 57375 || i10 == 63220 || i10 == 57432 || i10 == 57430 || i10 == 1040470 || i10 == 57431) {
                        i11 = 3;
                    }
                }
            }
            this.f9204i = new jh.a(new int[]{i11});
        }
        return new b(this.f9197b, this.f9198c, this.f9196a, this.f9199d, this.f9200e, this.f9201f, this.f9202g, this.f9203h, this.f9204i, this.f9205j);
    }

    public final void b(Uri uri) {
        ta.c0.r("Only content or resource Uris are supported for CommandButton", Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"));
        this.f9200e = uri;
    }

    public final void c(int i10) {
        ta.c0.r("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", this.f9197b == null);
        this.f9198c = i10;
        this.f9205j = null;
    }

    public final void d(z3 z3Var) {
        ta.c0.w(z3Var, "sessionCommand should not be null.");
        ta.c0.r("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", this.f9198c == -1);
        this.f9197b = z3Var;
        this.f9205j = null;
    }

    public final void e(z3 z3Var, Object obj) {
        ta.c0.r("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", this.f9198c == -1);
        this.f9197b = z3Var;
        int i10 = z3Var.f9578a;
        String str = b.f9214k;
        this.f9205j = b.a(i10 == 40010 ? 5 : 0, obj);
    }

    public final void f(int... iArr) {
        ta.c0.s(iArr.length != 0);
        jh.a aVar = jh.a.C;
        this.f9204i = iArr.length == 0 ? jh.a.C : new jh.a(Arrays.copyOf(iArr, iArr.length));
    }
}
