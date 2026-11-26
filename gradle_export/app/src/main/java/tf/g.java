package tf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.InvocationTargetException;

public final class g extends f5.c {
    public Boolean C;
    public String D;
    public f E;
    public Boolean F;

    public final boolean W0(String str) {
        return "1".equals(this.E.V(str, "gaia_collection_enabled"));
    }

    public final boolean X0(String str) {
        return "1".equals(this.E.V(str, "measurement.event_sampling_enabled"));
    }

    public final boolean Y0() {
        if (this.C == null) {
            Boolean boolH1 = h1("app_measurement_lite");
            this.C = boolH1;
            if (boolH1 == null) {
                this.C = Boolean.FALSE;
            }
        }
        return this.C.booleanValue() || !((h1) this.B).B;
    }

    public final String Z0(String str) {
        h1 h1Var = (h1) this.B;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, RuntimeVersion.SUFFIX);
            com.google.android.gms.common.internal.d0.h(str2);
            return str2;
        } catch (ClassNotFoundException e3) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.c(e3, "Could not find SystemProperties class");
            return RuntimeVersion.SUFFIX;
        } catch (IllegalAccessException e10) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(e10, "Could not access SystemProperties.get()");
            return RuntimeVersion.SUFFIX;
        } catch (NoSuchMethodException e11) {
            q0 q0Var3 = h1Var.F;
            h1.g(q0Var3);
            q0Var3.G.c(e11, "Could not find SystemProperties.get() method");
            return RuntimeVersion.SUFFIX;
        } catch (InvocationTargetException e12) {
            q0 q0Var4 = h1Var.F;
            h1.g(q0Var4);
            q0Var4.G.c(e12, "SystemProperties.get() threw an exception");
            return RuntimeVersion.SUFFIX;
        }
    }

    public final void a1() {
        ((h1) this.B).getClass();
    }

    public final String b1(String str, a0 a0Var) {
        return TextUtils.isEmpty(str) ? (String) a0Var.a(null) : (String) a0Var.a(this.E.V(str, a0Var.f14522a));
    }

    public final long c1(String str, a0 a0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) a0Var.a(null)).longValue();
        }
        String strV = this.E.V(str, a0Var.f14522a);
        if (TextUtils.isEmpty(strV)) {
            return ((Long) a0Var.a(null)).longValue();
        }
        try {
            return ((Long) a0Var.a(Long.valueOf(Long.parseLong(strV)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) a0Var.a(null)).longValue();
        }
    }

    public final int d1(String str, a0 a0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) a0Var.a(null)).intValue();
        }
        String strV = this.E.V(str, a0Var.f14522a);
        if (TextUtils.isEmpty(strV)) {
            return ((Integer) a0Var.a(null)).intValue();
        }
        try {
            return ((Integer) a0Var.a(Integer.valueOf(Integer.parseInt(strV)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) a0Var.a(null)).intValue();
        }
    }

    public final double e1(String str, a0 a0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) a0Var.a(null)).doubleValue();
        }
        String strV = this.E.V(str, a0Var.f14522a);
        if (TextUtils.isEmpty(strV)) {
            return ((Double) a0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) a0Var.a(Double.valueOf(Double.parseDouble(strV)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) a0Var.a(null)).doubleValue();
        }
    }

    public final boolean f1(String str, a0 a0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) a0Var.a(null)).booleanValue();
        }
        String strV = this.E.V(str, a0Var.f14522a);
        return TextUtils.isEmpty(strV) ? ((Boolean) a0Var.a(null)).booleanValue() : ((Boolean) a0Var.a(Boolean.valueOf("1".equals(strV)))).booleanValue();
    }

    public final Bundle g1() {
        h1 h1Var = (h1) this.B;
        try {
            Context context = h1Var.A;
            Context context2 = h1Var.A;
            q0 q0Var = h1Var.F;
            if (context.getPackageManager() == null) {
                h1.g(q0Var);
                q0Var.G.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = xe.b.a(context2).a(Cast.MAX_NAMESPACE_LENGTH, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            h1.g(q0Var);
            q0Var.G.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(e3, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean h1(String str) {
        com.google.android.gms.common.internal.d0.e(str);
        Bundle bundleG1 = g1();
        if (bundleG1 != null) {
            if (bundleG1.containsKey(str)) {
                return Boolean.valueOf(bundleG1.getBoolean(str));
            }
            return null;
        }
        q0 q0Var = ((h1) this.B).F;
        h1.g(q0Var);
        q0Var.G.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean i1() {
        ((h1) this.B).getClass();
        Boolean boolH1 = h1("firebase_analytics_collection_deactivated");
        return boolH1 != null && boolH1.booleanValue();
    }

    public final boolean j1() {
        Boolean boolH1 = h1("google_analytics_automatic_screen_reporting_enabled");
        return boolH1 == null || boolH1.booleanValue();
    }

    public final q1 k1(String str, boolean z10) {
        Object obj;
        com.google.android.gms.common.internal.d0.e(str);
        h1 h1Var = (h1) this.B;
        Bundle bundleG1 = g1();
        if (bundleG1 == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleG1.get(str);
        }
        q1 q1Var = q1.UNINITIALIZED;
        if (obj == null) {
            return q1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return q1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return q1.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return q1.POLICY;
        }
        q0 q0Var2 = h1Var.F;
        h1.g(q0Var2);
        q0Var2.J.c(str, "Invalid manifest metadata for");
        return q1Var;
    }
}
