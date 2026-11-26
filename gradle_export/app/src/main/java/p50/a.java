package p50;

import android.util.Log;
import f5.c;
import kotlin.jvm.internal.m;

public final class a extends c {
    public final int C;

    public a(int i) {
        super(12, false);
        this.C = i;
    }

    public final void F0(x50.a aVar, String msg) {
        switch (this.C) {
            case 0:
                m.e(msg, "msg");
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    Log.d("[Koin]", msg);
                } else if (iOrdinal == 1) {
                    Log.i("[Koin]", msg);
                } else if (iOrdinal == 2) {
                    Log.w("[Koin]", msg);
                } else if (iOrdinal == 3) {
                    Log.e("[Koin]", msg);
                } else {
                    Log.e("[Koin]", msg);
                }
                break;
            default:
                m.e(msg, "msg");
                break;
        }
    }
}
