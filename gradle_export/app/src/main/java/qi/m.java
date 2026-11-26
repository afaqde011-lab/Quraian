package qi;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import qd.j0;

public final class m implements d {
    public static final Charset C = Charset.forName("UTF-8");
    public final File A;
    public l B;

    public m(File file) {
        this.A = file;
    }

    @Override
    public final void B(long j9, String str) {
        b();
        if (this.B == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.B.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j9), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(C));
            while (!this.B.r() && this.B.I() > 65536) {
                this.B.A();
            }
        } catch (IOException e3) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e3);
        }
    }

    @Override
    public final void a() {
        oi.g.b(this.B, "There was a problem closing the Crashlytics log file.");
        this.B = null;
    }

    public final void b() {
        File file = this.A;
        if (this.B == null) {
            try {
                this.B = new l(file);
            } catch (IOException e3) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e3);
            }
        }
    }

    @Override
    public final String f() {
        j0 j0Var;
        byte[] bArr;
        if (this.A.exists()) {
            b();
            l lVar = this.B;
            if (lVar == null) {
                j0Var = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[lVar.I()];
                try {
                    this.B.l(new f(bArr2, iArr));
                } catch (IOException e3) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e3);
                }
                j0Var = new j0(bArr2, iArr[0], 9);
            }
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            bArr = null;
        } else {
            int i10 = j0Var.B;
            bArr = new byte[i10];
            System.arraycopy((byte[]) j0Var.C, 0, bArr, 0, i10);
        }
        if (bArr != null) {
            return new String(bArr, C);
        }
        return null;
    }
}
