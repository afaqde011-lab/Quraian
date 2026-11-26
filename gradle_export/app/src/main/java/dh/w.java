package dh;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.x5;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class w {

    public final String f4895a;

    public w(String str) {
        this.f4895a = g4.c.e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e3) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e3);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return x5.m(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", c(this.f4895a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f4895a, str, objArr));
        }
    }
}
