package q2;

import android.os.Build;
import android.view.View;
import com.google.android.gms.common.api.k;
import com.google.protobuf.RuntimeVersion;
import java.util.WeakHashMap;
import z4.j0;

public final class c implements a {

    public final View f12722a;

    public c(View view) {
        this.f12722a = view;
    }

    public final void a(int i10) {
        int i11 = 0;
        int i12 = 16;
        if (i10 != 16) {
            if (i10 == 6) {
                i12 = 6;
            } else {
                i12 = 13;
                if (i10 != 13) {
                    i12 = 23;
                    if (i10 != 23) {
                        i12 = 3;
                        if (i10 != 3) {
                            if (i10 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 17;
                                if (i10 != 17) {
                                    i12 = 27;
                                    if (i10 != 27) {
                                        i12 = 26;
                                        if (i10 != 26) {
                                            i12 = 9;
                                            if (i10 != 9) {
                                                i12 = 22;
                                                if (i10 != 22) {
                                                    i12 = 21;
                                                    if (i10 != 21) {
                                                        i12 = 1;
                                                        if (i10 != 1) {
                                                            i12 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = j0.f17198a;
        if (i12 == -1) {
            i11 = -1;
        } else if (Build.VERSION.SDK_INT < 34) {
            switch (i12) {
                case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case 23:
                case RuntimeVersion.MINOR:
                    i11 = 6;
                    break;
                case k.RECONNECTION_TIMED_OUT:
                case 24:
                case 27:
                    i11 = 4;
                    break;
                case 25:
                    break;
                default:
                    i11 = i12;
                    break;
            }
        } else {
            i11 = i12;
        }
        if (i11 == -1) {
            return;
        }
        this.f12722a.performHapticFeedback(i11);
    }
}
