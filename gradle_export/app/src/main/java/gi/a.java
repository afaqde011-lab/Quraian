package gi;

import android.os.Bundle;
import fh.d2;
import fh.e1;
import fh.q0;
import fh.t0;
import fh.w;
import tf.u1;

public abstract class a {

    public static final e1 f6336a = e1.p("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    public static final d2 f6337b;

    public static final d2 f6338c;

    public static final d2 f6339d;

    public static final d2 f6340e;

    public static final d2 f6341f;

    static {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        w.e(7, objArr);
        f6337b = t0.l(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        w.e(3, objArr2);
        f6338c = t0.l(3, objArr2);
        f6339d = t0.t("_r", "_dbg");
        q0 q0Var = new q0(4);
        q0Var.d(u1.f14735i);
        q0Var.d(u1.f14736j);
        f6340e = q0Var.g();
        f6341f = t0.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !f6338c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (!f6337b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            d2 d2Var = f6339d;
            int i10 = d2Var.D;
            int i11 = 0;
            while (i11 < i10) {
                boolean zContainsKey = bundle.containsKey((String) d2Var.get(i11));
                i11++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f6340e.contains(str2)) {
            d2 d2Var = f6341f;
            int i10 = d2Var.D;
            int i11 = 0;
            while (i11 < i10) {
                boolean zMatches = str2.matches((String) d2Var.get(i11));
                i11++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            d2 d2Var = f6339d;
            int i10 = d2Var.D;
            int i11 = 0;
            while (i11 < i10) {
                boolean zContainsKey = bundle.containsKey((String) d2Var.get(i11));
                i11++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
