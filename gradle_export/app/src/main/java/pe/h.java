package pe;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import ca.v;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.y3;
import java.util.Arrays;
import ri.t1;

public final class h {

    public static h f12499c;

    public final Context f12500a;

    public volatile String f12501b;

    public h(Context context) {
        this.f12500a = context.getApplicationContext();
    }

    public static h a(Context context) {
        d0.h(context);
        synchronized (h.class) {
            if (f12499c == null) {
                k kVar = p.f12515a;
                synchronized (p.class) {
                    if (p.f12519e == null) {
                        p.f12519e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f12499c = new h(context);
            }
        }
        return f12499c;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z10) {
        mf.f fVar;
        int i10;
        if (packageInfo != null) {
            if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                mf.f fVar2 = z10 ? o.f12514c : o.f12513b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    mf.b bVar = mf.e.B;
                    fVar = mf.f.E;
                } else {
                    mf.b bVar2 = mf.e.B;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        byte[] byteArray = signingCertificateHistory[i11].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i13 = i12 + 1;
                        if (i13 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i13 <= length2) {
                            i10 = length2;
                        } else {
                            i10 = (length2 >> 1) + length2 + 1;
                            if (i10 < i13) {
                                int iHighestOneBit = Integer.highestOneBit(i12);
                                i10 = iHighestOneBit + iHighestOneBit;
                            }
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                        if (i10 > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                        }
                        objArrCopyOf[i12] = byteArray;
                        i11++;
                        i12 = i13;
                    }
                    fVar = i12 == 0 ? mf.f.E : new mf.f(i12, objArrCopyOf);
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                mf.e eVarH = fVar.h();
                int size = eVarH.size();
                int i14 = 0;
                while (i14 < size) {
                    byte[] bArr = (byte[]) eVarH.get(i14);
                    mf.b bVarK = fVar2.listIterator(0);
                    do {
                        int i15 = i14 + 1;
                        if (!bVarK.hasNext()) {
                            i14 = i15;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarK.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z10 ? d(packageInfo, o.f12512a) : d(packageInfo, o.f12512a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static l d(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public final boolean b(int i10) {
        s sVarB;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.f12500a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            sVarB = s.b("no pkgs");
        } else {
            sVarB = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    d0.h(sVarB);
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    sVarB = s.b("null pkg");
                } else if (str.equals(this.f12501b)) {
                    sVarB = s.f12521d;
                } else {
                    k kVar = p.f12515a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            p.a();
                            boolean zP2 = ((a0) p.f12517c).p2();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zP2) {
                                boolean zA = g.a(this.f12500a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    d0.h(p.f12519e);
                                    try {
                                        p.a();
                                        d0.h(p.f12519e);
                                        Context context = (Context) ye.b.l2(ye.b.k2(new ye.b(p.f12519e)));
                                        try {
                                            a0 a0Var = (a0) p.f12517c;
                                            Parcel parcelI2 = a0Var.i2();
                                            int i12 = mf.g.f10896a;
                                            parcelI2.writeInt(1);
                                            int iG0 = t1.g0(20293, parcelI2);
                                            t1.b0(parcelI2, 1, str);
                                            t1.f0(parcelI2, 2, 4);
                                            parcelI2.writeInt(zA ? 1 : 0);
                                            t1.f0(parcelI2, 3, 4);
                                            parcelI2.writeInt(0);
                                            t1.V(parcelI2, 4, new ye.b(context));
                                            t1.f0(parcelI2, 5, 4);
                                            parcelI2.writeInt(0);
                                            t1.f0(parcelI2, 6, 4);
                                            parcelI2.writeInt(1);
                                            t1.f0(parcelI2, 8, 4);
                                            parcelI2.writeInt(0);
                                            t1.h0(iG0, parcelI2);
                                            Parcel parcelG2 = a0Var.g2(6, parcelI2);
                                            q qVar = (q) mf.g.a(parcelG2, q.CREATOR);
                                            parcelG2.recycle();
                                            if (qVar.A) {
                                                v.J(qVar.D);
                                                sVarB = new s(true, null, null);
                                            } else {
                                                String str2 = qVar.B;
                                                PackageManager.NameNotFoundException nameNotFoundException = y3.Z(qVar.C) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                v.J(qVar.D);
                                                y3.Z(qVar.C);
                                                sVarB = new s(false, str2, nameNotFoundException);
                                            }
                                        } catch (RemoteException e3) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                            sVarB = s.c("module call", e3);
                                        }
                                    } catch (DynamiteModule$LoadingException e10) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                        sVarB = s.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th2) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th2;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = this.f12500a.getPackageManager().getPackageInfo(str, 134217792);
                                    boolean zA2 = g.a(this.f12500a);
                                    if (packageInfo == null) {
                                        sVarB = s.b("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            sVarB = s.b("single cert required");
                                        } else {
                                            m mVar = new m(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                s sVarB2 = p.b(str3, mVar, zA2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (sVarB2.f12522a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        s sVarB3 = p.b(str3, mVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (sVarB3.f12522a) {
                                                            sVarB = s.b("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th3) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th3;
                                                    }
                                                }
                                                sVarB = sVarB2;
                                            } catch (Throwable th4) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th4;
                                            }
                                        }
                                    }
                                    if (sVarB.f12522a) {
                                        this.f12501b = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e11) {
                                    sVarB = s.c("no pkg ".concat(str), e11);
                                }
                            }
                        } catch (RemoteException | DynamiteModule$LoadingException e12) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (sVarB.f12522a) {
                            this.f12501b = str;
                        }
                    } catch (Throwable th5) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th5;
                    }
                }
                if (sVarB.f12522a) {
                    break;
                }
                i11++;
            }
        }
        if (!sVarB.f12522a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th6 = sVarB.f12524c;
            if (th6 != null) {
                Log.d("GoogleCertificatesRslt", sVarB.a(), th6);
            } else {
                Log.d("GoogleCertificatesRslt", sVarB.a());
            }
        }
        return sVarB.f12522a;
    }
}
