package wi;

import a50.e;
import android.content.Context;
import android.util.Log;
import android.widget.EditText;
import android.widget.Magnifier;
import b50.n;
import bi.g;
import com.google.protobuf.RuntimeVersion;
import hb.f;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import q3.e0;
import s10.w0;
import tf.w;
import u.y;
import wj.l0;
import wj.s0;
import wj.x0;
import x.b0;
import x.o;
import x.p;
import x.z;

public final class b implements yj.b, p {
    public final int A;
    public final Object B;

    public b(float f3, float f10, o oVar) {
        this.A = 3;
        int iB = oVar.b();
        b0[] b0VarArr = new b0[iB];
        for (int i10 = 0; i10 < iB; i10++) {
            b0VarArr[i10] = new b0(f3, f10, oVar.a(i10));
        }
        this.B = b0VarArr;
    }

    public b(int i10) {
        this.A = i10;
        switch (i10) {
            case 7:
                this.B = new wb.o();
                break;
            default:
                m.e(TimeUnit.MINUTES, "timeUnit");
                this.B = new n(e.h);
                break;
        }
    }

    public b(Context context) {
        this.A = 9;
        dh.o oVar = new dh.o(context, (char) 0);
        dh.m mVarA = dh.m.a(new w0(oVar, dh.m.a(yg.a.f16867b), new w(oVar)));
        this.B = dh.m.a(new e0(mVarA, dh.m.a(new wb.o(mVarA)), 21));
    }

    public b(EditText editText) {
        this.A = 6;
        this.B = new w0(editText);
    }

    public b(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public b(long[] jArr) {
        y yVar;
        this.A = 11;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            yVar = new y(jArrCopyOf.length);
            int i10 = yVar.f14912b;
            if (i10 < 0) {
                v.a.d(RuntimeVersion.SUFFIX);
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i10;
                long[] jArr2 = yVar.f14911a;
                if (jArr2.length < length) {
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    m.d(jArrCopyOf2, "copyOf(...)");
                    yVar.f14911a = jArrCopyOf2;
                }
                long[] jArr3 = yVar.f14911a;
                int i11 = yVar.f14912b;
                if (i10 != i11) {
                    h00.n.t0(jArr3, jArr3, jArrCopyOf.length + i10, i10, i11);
                }
                h00.n.t0(jArrCopyOf, jArr3, i10, 0, jArrCopyOf.length);
                yVar.f14912b += jArrCopyOf.length;
            }
        } else {
            yVar = new y();
        }
        this.B = yVar;
    }

    public long a() {
        Magnifier magnifier = (Magnifier) this.B;
        return (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
    }

    public a b(JSONObject jSONObject) throws JSONException {
        c wVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            wVar = new tf.y(17);
        } else {
            wVar = new w(18);
        }
        return wVar.g((f) this.B, jSONObject);
    }

    public Object get() {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 1:
                g gVar = (g) ((nf.c) obj).A;
                m.e(gVar, "firebaseApp");
                l0 l0Var = l0.f16190a;
                return l0.a(gVar);
            default:
                return new s0((x0) ((yj.c) obj).get());
        }
    }

    @Override
    public z get(int i10) {
        switch (this.A) {
            case 3:
                return ((b0[]) this.B)[i10];
            default:
                return (z) this.B;
        }
    }
}
