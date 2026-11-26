package vd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.g4;
import com.google.protobuf.RuntimeVersion;
import dj.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import me.i;
import wd.a0;
import wd.b0;
import wd.c;
import wd.c0;
import wd.d0;
import wd.e0;
import wd.f;
import wd.f0;
import wd.g;
import wd.g0;
import wd.h;
import wd.h0;
import wd.i0;
import wd.j;
import wd.k;
import wd.l;
import wd.m;
import wd.n;
import wd.o;
import wd.p;
import wd.q;
import wd.r;
import wd.s;
import wd.t;
import wd.v;
import wd.w;
import wd.y;
import yd.e;

public final class b implements e {

    public final i f15612a;

    public final ConnectivityManager f15613b;

    public final Context f15614c;

    public final URL f15615d;

    public final ge.a f15616e;

    public final ge.a f15617f;

    public final int f15618g;

    public b(Context context, ge.a aVar, ge.a aVar2) {
        d dVar = new d();
        c cVar = c.f15995a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f16020a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        wd.d dVar2 = wd.d.f15997a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        wd.b bVar = wd.b.f15984a;
        dVar.a(wd.a.class, bVar);
        dVar.a(l.class, bVar);
        wd.i iVar = wd.i.f16010a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        wd.e eVar = wd.e.f16000a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        h hVar = h.f16008a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.f16006a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f16028a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.f16003a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f4908d = true;
        this.f15612a = new i(dVar, 19);
        this.f15614c = context;
        this.f15613b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15615d = b(a.f15606c);
        this.f15616e = aVar2;
        this.f15617f = aVar;
        this.f15618g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException(a1.b.o("Invalid url: ", str), e3);
        }
    }

    public final xd.h a(xd.h hVar) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f15613b.getActiveNetworkInfo();
        a1.n nVarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) nVarC.G;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        nVarC.e("model", Build.MODEL);
        nVarC.e("hardware", Build.HARDWARE);
        nVarC.e("device", Build.DEVICE);
        nVarC.e("product", Build.PRODUCT);
        nVarC.e("os-uild", Build.ID);
        nVarC.e("manufacturer", Build.MANUFACTURER);
        nVarC.e("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) nVarC.G;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = h0.A;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) nVarC.G;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = g0.A;
                subtype = 100;
            } else if (((g0) g0.A.get(subtype)) == null) {
            }
            map = (HashMap) nVarC.G;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            nVarC.e("country", Locale.getDefault().getCountry());
            nVarC.e("locale", Locale.getDefault().getLanguage());
            Context context = this.f15614c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = RuntimeVersion.SUFFIX;
            }
            nVarC.e("mcc_mnc", simOperator);
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                g4.E("CctTransportBackend", "Unable to find version code for package", e3);
            }
            nVarC.e("application_build", Integer.toString(i11));
            return nVarC.f();
        }
        SparseArray sparseArray3 = g0.A;
        subtype = 0;
        map = (HashMap) nVarC.G;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        nVarC.e("country", Locale.getDefault().getCountry());
        nVarC.e("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f15614c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = RuntimeVersion.SUFFIX;
        }
        nVarC.e("mcc_mnc", simOperator);
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        nVarC.e("application_build", Integer.toString(i11));
        return nVarC.f();
    }
}
