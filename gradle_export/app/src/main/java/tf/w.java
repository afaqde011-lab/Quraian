package tf;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.v6;
import com.google.android.gms.internal.measurement.z6;
import com.google.protobuf.RuntimeVersion;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class w implements t, ub.h, wi.c, w7.j, x8.i, xi.a, dh.n, z4.v, ze.b, zh.p {
    public static final w B = new w(0);
    public static final w C = new w(1);
    public static final w D = new w(2);
    public static final w E = new w(3);
    public static final w F = new w(4);
    public static final w G = new w(5);
    public static final w H = new w(6);
    public static final w I = new w(7);
    public static final w J = new w(8);
    public static final w K = new w(9);
    public static final w L = new w(10);
    public static final w M = new w(11);
    public final int A;

    public w(int i10) {
        this.A = i10;
    }

    public w(d30.l lVar) {
        this.A = 16;
        String str = d30.l.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public w(dh.o oVar) {
        this.A = 22;
    }

    @Override
    public ub.c a(ub.b bVar) {
        return null;
    }

    @Override
    public Object b(String str, Provider provider) {
        switch (this.A) {
            case 28:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override
    public int c(androidx.media3.common.t tVar) {
        String str = tVar.f1594n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(a1.b.o("Unsupported MIME type: ", str));
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public Object e() {
        return new y(21);
    }

    @Override
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public wi.a g(hb.f fVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.o oVar = jSONObject.has("session") ? new com.google.android.gms.internal.cast.o(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.o(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        k7.f fVar2 = new k7.f(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j9 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j9 * 1000) + System.currentTimeMillis();
        }
        return new wi.a(jCurrentTimeMillis, oVar, fVar2, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override
    public void h() {
        synchronized (x7.b.f16472a) {
            Object obj = x7.b.f16473b;
            synchronized (obj) {
                if (x7.b.f16474c) {
                    return;
                }
                long jA = x7.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    x7.b.f16475d = jA;
                    x7.b.f16474c = true;
                }
            }
        }
    }

    @Override
    public void i(ub.b bVar, Bitmap bitmap, Map map, int i10) {
    }

    @Override
    public a8.d j(Context context, String str, ze.a aVar) {
        int iD;
        switch (this.A) {
            case RuntimeVersion.MINOR:
                a8.d dVar = new a8.d();
                int iD2 = aVar.d(context, str, true);
                dVar.f239b = iD2;
                if (iD2 != 0) {
                    dVar.f240c = 1;
                } else {
                    int iF = aVar.f(context, str);
                    dVar.f238a = iF;
                    if (iF != 0) {
                        dVar.f240c = -1;
                    }
                }
                return dVar;
            default:
                a8.d dVar2 = new a8.d();
                int iF2 = aVar.f(context, str);
                dVar2.f238a = iF2;
                int i10 = 1;
                int i11 = 0;
                if (iF2 != 0) {
                    iD = aVar.d(context, str, false);
                    dVar2.f239b = iD;
                } else {
                    iD = aVar.d(context, str, true);
                    dVar2.f239b = iD;
                }
                int i12 = dVar2.f238a;
                if (i12 == 0) {
                    if (iD == 0) {
                        i10 = 0;
                    }
                    dVar2.f240c = i10;
                    return dVar2;
                }
                i11 = i12;
                if (i11 >= iD) {
                    i10 = -1;
                }
                dVar2.f240c = i10;
                return dVar2;
        }
    }

    @Override
    public x8.k k(androidx.media3.common.t tVar) {
        String str = tVar.f1594n;
        List list = tVar.f1597q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new z8.g(list);
                case "application/pgs":
                    return new oj.q(3);
                case "application/x-mp4-vtt":
                    return new qj.c(28, (byte) 0);
                case "text/vtt":
                    return new a1.u0(28);
                case "application/x-quicktime-tx3g":
                    return new e9.a(list);
                case "text/x-ssa":
                    return new b9.b(list);
                case "application/vobsub":
                    return new oj.q(list);
                case "application/x-subrip":
                    return new c9.a();
                case "application/ttml+xml":
                    return new d9.e();
            }
        }
        throw new IllegalArgumentException(a1.b.o("Unsupported MIME type: ", str));
    }

    @Override
    public void l() {
    }

    @Override
    public boolean m(androidx.media3.common.t tVar) {
        String str = tVar.f1594n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public int n(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public Object zza() {
        switch (this.A) {
            case 0:
                List list = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.X.b()).longValue());
            case 1:
                List list2 = b0.f14545a;
                z6.B.get();
                Boolean bool = (Boolean) b7.f3682c.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = b0.f14545a;
                Boolean bool2 = (Boolean) t7.f3867b.b();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = b0.f14545a;
                Boolean bool3 = (Boolean) t7.f3868c.b();
                bool3.getClass();
                return bool3;
            case 4:
                List list5 = b0.f14545a;
                Boolean bool4 = (Boolean) p9.f3839a.b();
                bool4.getClass();
                return bool4;
            case 5:
                List list6 = b0.f14545a;
                Boolean bool5 = (Boolean) q7.f3842b.b();
                bool5.getClass();
                return bool5;
            case 6:
                List list7 = b0.f14545a;
                m8.B.get();
                Boolean bool6 = (Boolean) o8.f3836f.b();
                bool6.getClass();
                return bool6;
            case 7:
                List list8 = b0.f14545a;
                m8.B.get();
                Boolean bool7 = (Boolean) o8.f3838h.b();
                bool7.getClass();
                return bool7;
            case 8:
                List list9 = b0.f14545a;
                m8.B.get();
                Boolean bool8 = (Boolean) o8.f3835e.b();
                bool8.getClass();
                return bool8;
            case 9:
                List list10 = b0.f14545a;
                Boolean bool9 = (Boolean) v6.f3874a.b();
                bool9.getClass();
                return bool9;
            case 10:
                List list11 = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.f3703n0.b()).longValue());
            default:
                return new Boolean(((Boolean) f8.f3758a.b()).booleanValue());
        }
    }
}
