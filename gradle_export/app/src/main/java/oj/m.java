package oj;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.Serializable;
import java.util.List;

public final class m {

    public int f12095a;

    public int f12096b;

    public Object f12097c;

    public Serializable f12098d;

    public Serializable f12099e;

    public static String c(bi.g gVar) {
        gVar.a();
        bi.i iVar = gVar.f2533c;
        String str = iVar.f2545e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f2542b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public int a(long j9) {
        int i10 = this.f12095a + 1;
        long[] jArr = (long[]) this.f12097c;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            ?? r4 = new int[i11];
            h00.n.t0(jArr, jArr2, 0, 0, jArr.length);
            h00.n.u0(0, 0, 14, (int[]) this.f12098d, (int[]) r4);
            this.f12097c = jArr2;
            this.f12098d = r4;
        }
        int i12 = this.f12095a;
        this.f12095a = i12 + 1;
        int length2 = ((int[]) this.f12099e).length;
        if (this.f12096b >= length2) {
            int i13 = length2 * 2;
            ?? r7 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                r7[i14] = i15;
                i14 = i15;
            }
            h00.n.u0(0, 0, 14, (int[]) this.f12099e, (int[]) r7);
            this.f12099e = r7;
        }
        int i16 = this.f12096b;
        int[] iArr = (int[]) this.f12099e;
        this.f12096b = iArr[i16];
        long[] jArr3 = (long[]) this.f12097c;
        jArr3[i12] = j9;
        ((int[]) this.f12098d)[i12] = i16;
        iArr[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.m.g(jArr3[i17], j9) <= 0) {
                break;
            }
            g(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public synchronized String b() {
        try {
            if (((String) this.f12098d) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f12098d;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f12097c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Failed to find package " + e3);
            return null;
        }
    }

    public boolean e() {
        int i10;
        synchronized (this) {
            i10 = this.f12096b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f12097c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f12096b = 2;
                    } else {
                        this.f12096b = 2;
                    }
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public synchronized void f() {
        PackageInfo packageInfoD = d(((Context) this.f12097c).getPackageName());
        if (packageInfoD != null) {
            this.f12098d = Integer.toString(packageInfoD.versionCode);
            this.f12099e = packageInfoD.versionName;
        }
    }

    public void g(int i10, int i11) {
        long[] jArr = (long[]) this.f12097c;
        int[] iArr = (int[]) this.f12098d;
        int[] iArr2 = (int[]) this.f12099e;
        long j9 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j9;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
