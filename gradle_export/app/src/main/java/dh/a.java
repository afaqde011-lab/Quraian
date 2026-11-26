package dh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.protobuf.RuntimeVersion;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

public final class a extends x {
    public final int B = 0;
    public final Object C;
    public final Object D;

    public a(bh.k kVar, IBinder iBinder) {
        this.C = iBinder;
        this.D = kVar;
    }

    public a(yg.g gVar, xf.g gVar2, Context context) {
        super(gVar2);
        this.C = context;
        this.D = gVar;
    }

    @Override
    public final void b() {
        u sVar;
        int length;
        String strEncodeToString;
        int i10 = this.B;
        int i11 = 0;
        Object obj = this.D;
        Object obj2 = this.C;
        switch (i10) {
            case 0:
                c cVar = (c) ((bh.k) obj).B;
                tf.y yVar = cVar.f4885i;
                ArrayList arrayList = cVar.f4880d;
                w wVar = cVar.f4878b;
                IBinder iBinder = (IBinder) obj2;
                yVar.getClass();
                int i12 = t.f4894f;
                if (iBinder == null) {
                    sVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    sVar = iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new s(iBinder);
                }
                cVar.f4888n = sVar;
                wVar.b("linkToDeath", new Object[0]);
                try {
                    ((s) cVar.f4888n).f4893e.linkToDeath(cVar.f4887k, 0);
                } catch (RemoteException e3) {
                    wVar.a(e3, "linkToDeath failed", new Object[0]);
                }
                cVar.f4883g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                arrayList.clear();
                break;
            default:
                Context context = (Context) obj2;
                xf.g gVar = ((yg.g) obj).f16877c;
                w wVar2 = d.f4889a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        w wVar3 = d.f4889a;
                        if (signatureArr == null || (length = signatureArr.length) == 0) {
                            Object[] objArr = new Object[0];
                            wVar3.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                Log.w("PlayCore", w.c(wVar3.f4895a, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr));
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i13 = 0;
                            while (true) {
                                if (i13 < length) {
                                    byte[] byteArray = signatureArr[i13].toByteArray();
                                    try {
                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                        messageDigest.update(byteArray);
                                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                                    } catch (NoSuchAlgorithmException unused) {
                                        strEncodeToString = RuntimeVersion.SUFFIX;
                                    }
                                    arrayList2.add(strEncodeToString);
                                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                                        String str = Build.TAGS;
                                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                            i13++;
                                        }
                                    }
                                    i11 = packageInfo.versionCode;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    Iterator it2 = arrayList2.iterator();
                                    if (it2.hasNext()) {
                                        while (true) {
                                            sb2.append((CharSequence) it2.next());
                                            if (it2.hasNext()) {
                                                sb2.append((CharSequence) ", ");
                                            }
                                        }
                                    }
                                    String strP = a1.b.p("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "].");
                                    Object[] objArr2 = new Object[0];
                                    wVar3.getClass();
                                    if (Log.isLoggable("PlayCore", 5)) {
                                        Log.w("PlayCore", w.c(wVar3.f4895a, strP, objArr2));
                                    }
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                gVar.d(Integer.valueOf(i11));
                break;
        }
    }
}
