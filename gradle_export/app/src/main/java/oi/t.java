package oi;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import q3.e0;
import ri.a1;
import ri.b1;
import ri.s0;
import ri.t0;
import ri.u0;
import ri.w0;

public final class t {

    public static final HashMap f12046f;

    public static final String f12047g;

    public final Context f12048a;

    public final x f12049b;

    public final a f12050c;

    public final e0 f12051d;

    public final a30.k f12052e;

    static {
        HashMap map = new HashMap();
        f12046f = map;
        x5.t(5, map, "armeabi", 6, "armeabi-v7a");
        x5.t(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f12047g = "Crashlytics Android SDK/20.0.3";
    }

    public t(Context context, x xVar, a aVar, e0 e0Var, a30.k kVar) {
        this.f12048a = context;
        this.f12049b = xVar;
        this.f12050c = aVar;
        this.f12051d = e0Var;
        this.f12052e = kVar;
    }

    public static t0 c(p10.a aVar, int i10) {
        String str = (String) aVar.B;
        String str2 = (String) aVar.A;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aVar.C;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        p10.a aVar2 = (p10.a) aVar.D;
        if (i10 >= 8) {
            p10.a aVar3 = aVar2;
            while (aVar3 != null) {
                aVar3 = (p10.a) aVar3.D;
                i11++;
            }
        }
        int i12 = i11;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b7 = (byte) (0 | 1);
        t0 t0VarC = null;
        if (aVar2 != null && i12 == 0) {
            t0VarC = c(aVar2, i10 + 1);
        }
        if (b7 == 1) {
            return new t0(str, str2, listD, t0VarC, i12);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(k.j("Missing required properties:", sb2));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f13560e = i10;
            w0Var.f13561f = (byte) (w0Var.f13561f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f13556a = jMax;
            byte b7 = (byte) (w0Var.f13561f | 1);
            w0Var.f13561f = b7;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            w0Var.f13557b = str;
            w0Var.f13558c = fileName;
            w0Var.f13559d = lineNumber;
            w0Var.f13561f = (byte) (b7 | 2);
            arrayList.add(w0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b7 = (byte) 1;
        if (b7 == 1) {
            return new u0("0", 0L, "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b7 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(k.j("Missing required properties:", sb2));
    }

    public final List a() {
        byte b7 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f12050c;
        String str = aVar.f11983e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = aVar.f11980b;
        if (b7 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b7 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(k.j("Missing required properties:", sb2));
    }

    public final b1 b(int i10) {
        boolean z10;
        Float fValueOf;
        int i11;
        long j9;
        Context context = this.f12048a;
        boolean z11 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z10 || fValueOf == null) {
                    i11 = 1;
                } else {
                    i11 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!g.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z11 = true;
                }
                long jA = g.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j9 = jA - memoryInfo.availMem;
                if (j9 <= 0) {
                    j9 = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                a1 a1Var = new a1();
                a1Var.f13250a = dValueOf;
                a1Var.f13251b = i11;
                byte b7 = (byte) (a1Var.f13256g | 1);
                a1Var.f13252c = z11;
                a1Var.f13253d = i10;
                a1Var.f13254e = j9;
                a1Var.f13255f = blockCount;
                a1Var.f13256g = (byte) (((byte) (((byte) (((byte) (b7 | 2)) | 4)) | 8)) | 16);
                return a1Var.a();
            }
            z10 = false;
        } catch (IllegalStateException e10) {
            e = e10;
            z10 = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z10) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (!g.f()) {
            z11 = true;
        }
        long jA2 = g.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j9 = jA2 - memoryInfo2.availMem;
        if (j9 <= 0) {
            j9 = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        a1 a1Var2 = new a1();
        a1Var2.f13250a = dValueOf;
        a1Var2.f13251b = i11;
        byte b10 = (byte) (a1Var2.f13256g | 1);
        a1Var2.f13252c = z11;
        a1Var2.f13253d = i10;
        a1Var2.f13254e = j9;
        a1Var2.f13255f = blockCount2;
        a1Var2.f13256g = (byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16);
        return a1Var2.a();
    }
}
