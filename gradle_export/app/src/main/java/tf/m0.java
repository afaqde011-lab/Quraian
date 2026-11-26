package tf;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class m0 {

    public static final AtomicReference f14660b = new AtomicReference();

    public static final AtomicReference f14661c = new AtomicReference();

    public static final AtomicReference f14662d = new AtomicReference();

    public final y0 f14663a;

    public m0(y0 y0Var) {
        this.f14663a = y0Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.d0.h(atomicReference);
        com.google.android.gms.common.internal.d0.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f14663a.a() ? str : g(str, u1.f14729c, u1.f14727a, f14660b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f14663a.a() ? str : g(str, u1.f14732f, u1.f14731e, f14661c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f14663a.a()) {
            return str.startsWith("_exp_") ? a1.b.p("experiment_id(", str, ")") : g(str, u1.f14736j, u1.f14735i, f14662d);
        }
        return str;
    }

    public final String d(s sVar) {
        String string;
        y0 y0Var = this.f14663a;
        if (!y0Var.a()) {
            return sVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(sVar.C);
        sb2.append(",name=");
        sb2.append(a(sVar.A));
        sb2.append(",params=");
        r rVar = sVar.B;
        if (rVar == null) {
            string = null;
        } else {
            string = !y0Var.a() ? rVar.A.toString() : e(rVar.e());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f14663a.a()) {
            return bundle.toString();
        }
        StringBuilder sbQ = x5.q("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbQ.length() != 8) {
                sbQ.append(", ");
            }
            sbQ.append(b(str));
            sbQ.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbQ.append(strF);
        }
        sbQ.append("}]");
        return sbQ.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbQ = x5.q("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbQ.length() != 1) {
                    sbQ.append(", ");
                }
                sbQ.append(strE);
            }
        }
        sbQ.append("]");
        return sbQ.toString();
    }
}
