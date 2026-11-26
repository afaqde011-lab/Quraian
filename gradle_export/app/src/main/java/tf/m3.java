package tf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.p4;
import com.google.protobuf.RuntimeVersion;

public abstract class m3 {

    public static final fh.d2 f14668a = fh.t0.u("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, RuntimeVersion.SUFFIX);
        } catch (ClassCastException unused) {
            return RuntimeVersion.SUFFIX;
        }
    }

    public static final boolean b(o4 o4Var, fh.i2 i2Var, fh.i2 i2Var2, fh.q2 q2Var, char[] cArr, int i10, int i11, int i12, String str, String str2, String str3, boolean z10, boolean z11) {
        l3 l3Var;
        char c10;
        int iC = c(o4Var);
        if (iC > 0 && (i11 != 1 || i10 != 1)) {
            cArr[iC] = '2';
        }
        if (g(o4Var, i2Var2) == p4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            if (o4Var == o4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i12 == 1 && q2Var.D.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (i2Var.containsKey(o4Var) && (l3Var = (l3) i2Var.get(o4Var)) != null) {
                int iOrdinal = l3Var.ordinal();
                p4 p4Var = p4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    p4 p4Var2 = p4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(o4Var, i2Var2) == p4Var ? f(o4Var, cArr, str3, z11) : e(o4Var, cArr, str2, z10);
                        }
                        if (iOrdinal == 3) {
                            return g(o4Var, i2Var2) == p4Var2 ? e(o4Var, cArr, str2, z10) : f(o4Var, cArr, str3, z11);
                        }
                        c10 = '0';
                    } else if (g(o4Var, i2Var2) != p4Var2) {
                        return f(o4Var, cArr, str3, z11);
                    }
                } else if (g(o4Var, i2Var2) != p4Var) {
                    return e(o4Var, cArr, str2, z10);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c10;
        return false;
    }

    public static final int c(o4 o4Var) {
        if (o4Var == o4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (o4Var == o4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (o4Var == o4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return o4Var == o4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(o4 o4Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < o4Var.zza()) ? "0" : String.valueOf(str.charAt(o4Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= o4Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(o4Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(o4 o4Var, char[] cArr, String str, boolean z10) {
        char c10;
        int iC = c(o4Var);
        if (!z10) {
            c10 = '4';
        } else {
            if (str.length() >= o4Var.zza()) {
                char cCharAt = str.charAt(o4Var.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z11;
            }
            c10 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c10;
        }
        return false;
    }

    public static final boolean f(o4 o4Var, char[] cArr, String str, boolean z10) {
        char c10;
        int iC = c(o4Var);
        if (!z10) {
            c10 = '5';
        } else {
            if (str.length() >= o4Var.zza()) {
                char cCharAt = str.charAt(o4Var.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z11;
            }
            c10 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c10;
        }
        return false;
    }

    public static final p4 g(o4 o4Var, fh.i2 i2Var) {
        Object obj = i2Var.get(o4Var);
        if (obj == null) {
            obj = p4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (p4) obj;
    }
}
