package ab;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.g4;
import h1.v0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;

public final class i0 implements Callable {

    public final int f382a;

    public final Object f383b;

    public final Object f384c;

    public i0(Object obj, Object obj2, int i10) {
        this.f382a = i10;
        this.f383b = obj;
        this.f384c = obj2;
    }

    @Override
    public final Object call() throws NoWhenBranchMatchedException, IOException {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        ComponentName componentNameStartService;
        switch (this.f382a) {
            case 0:
                h0 h0Var = (h0) this.f383b;
                l0 l0Var = (l0) this.f384c;
                String str3 = l0Var.l;
                String str4 = l0Var.f388c;
                hb.x xVar = l0Var.f394i;
                hb.p pVar = l0Var.f386a;
                boolean z10 = true;
                boolean z11 = false;
                if (h0Var instanceof f0) {
                    za.t tVar = ((f0) h0Var).f367a;
                    za.g0 g0VarD = xVar.d(str4);
                    hb.m mVarV = l0Var.f393h.v();
                    mVarV.getClass();
                    rd.a.M(mVarV.f6984a, false, true, new b6.o(str4, 24));
                    if (g0VarD == null) {
                        z10 = false;
                    } else if (g0VarD == za.g0.B) {
                        if (tVar instanceof za.s) {
                            String str5 = m0.f398a;
                            za.v.d().e(str5, "Worker result SUCCESS for " + str3);
                            if (pVar.c()) {
                                l0Var.c();
                            } else {
                                xVar.j(za.g0.C, str4);
                                za.g gVar = ((za.s) tVar).f17396a;
                                kotlin.jvm.internal.m.d(gVar, "getOutputData(...)");
                                rd.a.M(xVar.f7028a, false, true, new v0(gVar, str4, 7));
                                l0Var.f391f.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                hb.c cVar = l0Var.f395j;
                                for (String str6 : cVar.a(str4)) {
                                    if (xVar.d(str6) == za.g0.E && ((Boolean) rd.a.M(cVar.f6965a, true, false, new b6.o(str6, 20))).booleanValue()) {
                                        za.v.d().e(m0.f398a, "Setting status to enqueued for ".concat(str6));
                                        xVar.j(za.g0.A, str6);
                                        xVar.i(jCurrentTimeMillis, str6);
                                    }
                                }
                            }
                        } else if (tVar instanceof za.r) {
                            String str7 = m0.f398a;
                            za.v.d().e(str7, "Worker result RETRY for " + str3);
                            l0Var.b(-256);
                        } else {
                            String str8 = m0.f398a;
                            za.v.d().e(str8, "Worker result FAILURE for " + str3);
                            if (pVar.c()) {
                                l0Var.c();
                            } else {
                                l0Var.d(tVar);
                            }
                        }
                        z10 = false;
                    } else if (g0VarD.a()) {
                        z10 = false;
                    } else {
                        l0Var.b(-512);
                    }
                    z11 = z10;
                } else if (h0Var instanceof e0) {
                    za.t tVar2 = ((e0) h0Var).f366a;
                    String str9 = m0.f398a;
                    za.v.d().e(str9, "Worker result FAILURE for " + str3);
                    if (pVar.c()) {
                        l0Var.c();
                    } else {
                        l0Var.d(tVar2);
                    }
                } else {
                    if (!(h0Var instanceof g0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i11 = ((g0) h0Var).f379a;
                    if (kotlin.jvm.internal.m.a(pVar.f7026y, Boolean.TRUE)) {
                        String str10 = m0.f398a;
                        za.v.d().a(str10, "Worker " + pVar.f7006c + " was interrupted. Backing off.");
                        l0Var.b(i11);
                    } else {
                        za.g0 g0VarD2 = xVar.d(str4);
                        if (g0VarD2 == null || g0VarD2.a()) {
                            String str11 = m0.f398a;
                            za.v.d().a(str11, "Status for " + str4 + " is " + g0VarD2 + " ; not doing any work");
                            z10 = false;
                        } else {
                            String str12 = m0.f398a;
                            za.v.d().a(str12, "Status for " + str4 + " is " + g0VarD2 + "; not doing any work and rescheduling for later execution");
                            xVar.j(za.g0.A, str4);
                            xVar.k(i11, str4);
                            xVar.g(-1L, str4);
                        }
                    }
                    z11 = z10;
                }
                return Boolean.valueOf(z11);
            case 1:
                g7.g gVar2 = (g7.g) this.f383b;
                byte[] bArr = (byte[]) this.f384c;
                boolean z12 = gVar2.D;
                Bitmap bitmapZ = g4.z(bArr.length, gVar2.C, bArr);
                return z12 ? bitmapZ.asShared() : bitmapZ;
            case 2:
                g7.g gVar3 = (g7.g) this.f383b;
                Uri uri = (Uri) this.f384c;
                g7.f fVarT = gVar3.B.t();
                int i12 = gVar3.C;
                boolean z13 = gVar3.D;
                try {
                    g7.j jVar = new g7.j(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
                    g7.k kVar = (g7.k) fVarT;
                    kVar.p(jVar);
                    byte[] bArrCopyOf = new byte[1024];
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 != -1) {
                        if (i14 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i13 = kVar.read(bArrCopyOf, i14, bArrCopyOf.length - i14);
                        if (i13 != -1) {
                            i14 += i13;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i14);
                    Bitmap bitmapZ2 = g4.z(bArrCopyOf2.length, i12, bArrCopyOf2);
                    if (z13) {
                        bitmapZ2 = bitmapZ2.asShared();
                        break;
                    }
                    return bitmapZ2;
                } finally {
                    ((g7.k) fVarT).close();
                }
            case 3:
                Context context = (Context) this.f383b;
                Intent intent = (Intent) this.f384c;
                oj.q qVarF = oj.q.F();
                qVarF.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) qVarF.E).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (qVarF) {
                    try {
                        str = (String) qVarF.B;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    qVarF.B = context.getPackageName() + serviceInfo.name;
                                } else {
                                    qVarF.B = serviceInfo.name;
                                }
                                str = (String) qVarF.B;
                            }
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (qVarF.K(context)) {
                        componentNameStartService = oj.z.c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e3) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e3);
                    i10 = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 4:
                rj.b bVar = (rj.b) this.f383b;
                a8.u uVar = (a8.u) this.f384c;
                sj.l lVar = bVar.f13592h;
                synchronized (lVar.f14304b) {
                    SharedPreferences.Editor editorEdit = lVar.f14303a.edit();
                    uVar.getClass();
                    editorEdit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", uVar.f307a).commit();
                    break;
                }
                return null;
            default:
                sj.c cVar2 = (sj.c) this.f383b;
                sj.e eVar = (sj.e) this.f384c;
                sj.m mVar = cVar2.f14245b;
                synchronized (mVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = mVar.f14308a.openFileOutput(mVar.f14309b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(eVar.f14254a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th3) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th3;
                    }
                }
                return null;
        }
    }
}
