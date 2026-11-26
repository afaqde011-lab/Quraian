package cc;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import oi.s;
import org.json.JSONException;
import org.json.JSONObject;
import s10.w0;
import sd.p1;

public final class b implements Callable {

    public final int f3117a;

    public final Object f3118b;

    public b(Object obj, int i10) {
        this.f3117a = i10;
        this.f3118b = obj;
    }

    @Override
    public final Object call() {
        sj.e eVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        int i10 = this.f3117a;
        Object obj = this.f3118b;
        switch (i10) {
            case 0:
                return new l((a) obj);
            case 1:
                oi.n nVar = ((s) obj).f12039g;
                nVar.getClass();
                pi.e.a();
                h1.l lVar = nVar.f12019c;
                ui.b bVar = (ui.b) lVar.B;
                String str = (String) lVar.A;
                bVar.getClass();
                boolean z10 = true;
                if (new File((File) bVar.D, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ui.b bVar2 = (ui.b) lVar.B;
                    bVar2.getClass();
                    new File((File) bVar2.D, str).delete();
                } else {
                    String strE = nVar.e();
                    if (strE == null || !nVar.f12026j.c(strE)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                return ((rj.e) obj).a();
            case 3:
                sj.m mVar = (sj.m) obj;
                synchronized (mVar) {
                    eVarA = null;
                    try {
                        try {
                            fileInputStreamOpenFileInput = mVar.f14308a.openFileInput(mVar.f14309b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                eVarA = sj.e.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th5) {
                        fileInputStreamOpenFileInput = null;
                        th2 = th5;
                    }
                }
                return eVarA;
            default:
                a30.k kVar = (a30.k) ((w0) obj).C;
                bh.f fVar = (bh.f) kVar.f;
                wi.d dVar = (wi.d) kVar.b;
                String str2 = fVar.A;
                pi.e.b();
                try {
                    HashMap mapD = bh.f.d(dVar);
                    p1 p1Var = new p1(str2, mapD);
                    p1Var.w("User-Agent", "Crashlytics Android SDK/20.0.3");
                    p1Var.w("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    bh.f.b(p1Var, dVar);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + mapD;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return fVar.e(p1Var.n());
                } catch (IOException e3) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e3);
                    return null;
                }
        }
    }
}
