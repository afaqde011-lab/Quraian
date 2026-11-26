package tf;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.util.Map;

public final class o0 implements Runnable {
    public final int A = 1;
    public final int B;
    public final String C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public o0(String str, r0 r0Var, int i10, IOException iOException, byte[] bArr, Map map) {
        com.google.android.gms.common.internal.d0.h(r0Var);
        this.D = r0Var;
        this.B = i10;
        this.E = iOException;
        this.F = bArr;
        this.C = str;
        this.G = map;
    }

    public o0(q0 q0Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.B = i10;
        this.C = str;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = q0Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                q0 q0Var = (q0) this.G;
                w0 w0Var = ((h1) q0Var.B).E;
                h1.e(w0Var);
                if (!w0Var.C) {
                    Log.println(6, q0Var.f1(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (q0Var.D == 0) {
                    g gVar = ((h1) q0Var.B).D;
                    if (gVar.F == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.F == null) {
                                    h1 h1Var = (h1) gVar.B;
                                    ApplicationInfo applicationInfo = h1Var.A.getApplicationInfo();
                                    if (ve.c.f15626g == null) {
                                        ve.c.f15626g = Application.getProcessName();
                                    }
                                    String str = ve.c.f15626g;
                                    if (applicationInfo != null) {
                                        String str2 = applicationInfo.processName;
                                        gVar.F = Boolean.valueOf(str2 != null && str2.equals(str));
                                    }
                                    if (gVar.F == null) {
                                        gVar.F = Boolean.TRUE;
                                        q0 q0Var2 = h1Var.F;
                                        h1.g(q0Var2);
                                        q0Var2.G.b("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (gVar.F.booleanValue()) {
                        q0Var.D = 'C';
                    } else {
                        q0Var.D = 'c';
                    }
                    break;
                }
                if (q0Var.E < 0) {
                    ((h1) q0Var.B).D.a1();
                    q0Var.E = 133005L;
                }
                int i10 = this.B;
                char c10 = q0Var.D;
                long j9 = q0Var.E;
                String str3 = this.C;
                Object obj = this.D;
                Object obj2 = this.E;
                Object obj3 = this.F;
                char cCharAt = "01VDIWEA?".charAt(i10);
                String strG1 = q0.g1(true, str3, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c10).length() + String.valueOf(j9).length() + 1 + strG1.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c10);
                sb2.append(j9);
                sb2.append(":");
                sb2.append(strG1);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str3.substring(0, 1024);
                }
                bb.d dVar = w0Var.F;
                if (dVar != null) {
                    String str4 = (String) dVar.D;
                    w0 w0Var2 = (w0) dVar.E;
                    w0Var2.V0();
                    if (((w0) dVar.E).Z0().getLong((String) dVar.B, 0L) == 0) {
                        dVar.A();
                    }
                    if (string == null) {
                        string = RuntimeVersion.SUFFIX;
                    }
                    SharedPreferences sharedPreferencesZ0 = w0Var2.Z0();
                    String str5 = (String) dVar.C;
                    long j10 = sharedPreferencesZ0.getLong(str5, 0L);
                    if (j10 <= 0) {
                        SharedPreferences.Editor editorEdit = w0Var2.Z0().edit();
                        editorEdit.putString(str4, string);
                        editorEdit.putLong(str5, 1L);
                        editorEdit.apply();
                        return;
                    }
                    e4 e4Var = ((h1) w0Var2.B).I;
                    h1.e(e4Var);
                    long jNextLong = e4Var.S1().nextLong() & Long.MAX_VALUE;
                    long j11 = j10 + 1;
                    long j12 = Long.MAX_VALUE / j11;
                    SharedPreferences.Editor editorEdit2 = w0Var2.Z0().edit();
                    if (jNextLong < j12) {
                        editorEdit2.putString(str4, string);
                    }
                    editorEdit2.putLong(str5, j11);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((r0) this.D).r(this.C, this.B, (Throwable) this.E, (byte[]) this.F, (Map) this.G);
                return;
        }
    }
}
