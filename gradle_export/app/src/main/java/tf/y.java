package tf;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.z6;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayOutputStream;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import org.json.JSONObject;

public final class y implements t, vb.e, wi.c, zd.b, z9.b, ze.a, ze.b, zh.p {
    public static final y B = new y(0);
    public static final y C = new y(1);
    public static final y D = new y(2);
    public static final y E = new y(3);
    public static final y F = new y(4);
    public static final y G = new y(5);
    public static final y H = new y(6);
    public static final y I = new y(7);
    public static final y J = new y(8);
    public static final y K = new y(9);
    public static final y L = new y(10);
    public static final y M = new y(11);
    public static y N;
    public final int A;

    public y(int i10) {
        this.A = i10;
    }

    public static final float c(float f3, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fAbs = Math.abs(f3);
        float fSignum = Math.signum(f3);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f14 = fArr[fArr.length - 1];
            float f15 = fArr2[fArr.length - 1];
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return (f15 / f14) * f3;
        }
        if (i11 == -1) {
            float f16 = fArr[0];
            f12 = fArr2[0];
            f13 = f16;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f17 = fArr[i11];
            float f18 = fArr[i10];
            f10 = fArr2[i11];
            f11 = f17;
            f12 = fArr2[i10];
            f13 = f18;
        }
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f11 == f13 ? 0.0f : (fAbs - f11) / (f13 - f11)))) + f10) * fSignum;
    }

    public static wi.a e(hb.f fVar) {
        return new wi.a(System.currentTimeMillis() + ((long) 3600000), new com.google.android.gms.internal.cast.o(8), new k7.f(true, false, false), 10.0d, 1.2d, 60);
    }

    public static byte[] k(fh.t0 t0Var, long j9) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(t0Var.size());
        Iterator<E> it = t0Var.iterator();
        while (it.hasNext()) {
            d7.b bVar = (d7.b) it.next();
            Bundle bundleC = bVar.c();
            Bitmap bitmap = bVar.f4750d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ta.c0.A(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(d7.b.f4744x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j9);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Object b(String str, Provider provider) {
        switch (this.A) {
            case 27:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    @Override
    public int d(Context context, String str, boolean z10) {
        return ze.c.d(context, str, z10);
    }

    @Override
    public int f(Context context, String str) {
        return ze.c.a(context, str);
    }

    @Override
    public wi.a g(hb.f fVar, JSONObject jSONObject) {
        return e(fVar);
    }

    public Object get() {
        return new jb.a(Executors.newSingleThreadExecutor(), 3);
    }

    @Override
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void i(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = RuntimeVersion.SUFFIX;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override
    public a8.d j(Context context, String str, ze.a aVar) {
        a8.d dVar = new a8.d();
        dVar.f238a = aVar.f(context, str);
        int i10 = 1;
        int iD = aVar.d(context, str, true);
        dVar.f239b = iD;
        int i11 = dVar.f238a;
        if (i11 == 0) {
            i11 = 0;
            if (iD == 0) {
                i10 = 0;
            } else if (i11 >= iD) {
                i10 = -1;
            }
        } else if (i11 >= iD) {
            i10 = -1;
        }
        dVar.f240c = i10;
        return dVar;
    }

    @Override
    public void shutdown() {
    }

    @Override
    public Object zza() {
        switch (this.A) {
            case 0:
                List list = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.f3718v.b()).longValue());
            case 1:
                List list2 = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.B.b()).longValue());
            case 2:
                List list3 = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.f3695i0.b()).longValue());
            case 3:
                List list4 = b0.f14545a;
                Boolean bool = (Boolean) m9.f3813a.b();
                bool.getClass();
                return bool;
            case 4:
                List list5 = b0.f14545a;
                Boolean bool2 = (Boolean) q7.f3841a.b();
                bool2.getClass();
                return bool2;
            case 5:
                List list6 = b0.f14545a;
                Boolean bool3 = (Boolean) g9.f3771a.b();
                bool3.getClass();
                return bool3;
            case 6:
                List list7 = b0.f14545a;
                m8.B.get();
                Boolean bool4 = (Boolean) o8.f3831a.b();
                bool4.getClass();
                return bool4;
            case 7:
                List list8 = b0.f14545a;
                m8.B.get();
                Boolean bool5 = (Boolean) o8.f3832b.b();
                bool5.getClass();
                return bool5;
            case 8:
                List list9 = b0.f14545a;
                Boolean bool6 = (Boolean) k7.f3801a.b();
                bool6.getClass();
                return bool6;
            case 9:
                List list10 = b0.f14545a;
                Boolean bool7 = (Boolean) u8.f3870a.b();
                bool7.getClass();
                return bool7;
            case 10:
                return new Boolean(((Boolean) c8.f3741a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) d9.f3745a.b()).booleanValue());
        }
    }
}
