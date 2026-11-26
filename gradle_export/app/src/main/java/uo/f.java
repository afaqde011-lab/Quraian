package uo;

import a10.h0;
import bk.q;
import bk.s;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import h00.x;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.k;
import vo.r;
import vo.t;

public final class f extends h0 {
    public static String X(String... strArr) {
        String str;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = strArr[i];
            if (str != null && !k.L0(str)) {
                break;
            }
            i++;
        }
        String string = str != null ? k.j1(str).toString() : null;
        return string == null ? "" : string;
    }

    public static ep.g Y(r rVar) {
        Integer expiresIn;
        String accessToken = rVar != null ? rVar.getAccessToken() : null;
        if (accessToken == null) {
            accessToken = "";
        }
        String refreshToken = rVar != null ? rVar.getRefreshToken() : null;
        if (refreshToken == null) {
            refreshToken = "";
        }
        String tokenType = rVar != null ? rVar.getTokenType() : null;
        return new ep.g(accessToken, refreshToken, tokenType != null ? tokenType : "", (rVar == null || (expiresIn = rVar.getExpiresIn()) == null) ? 0 : expiresIn.intValue(), Z(rVar != null ? rVar.getUser() : null));
    }

    public static ep.h Z(t tVar) {
        s sVarB;
        String str;
        q purchaseDevice = tVar != null ? tVar.getPurchaseDevice() : null;
        if (purchaseDevice == null) {
            sVarB = null;
        } else {
            q qVar = purchaseDevice instanceof s ? purchaseDevice : null;
            if (qVar != null) {
                sVarB = qVar.b();
            } else {
                sVarB = null;
            }
        }
        String strA0 = a0(sVarB, "device_name");
        String strA1 = a0(sVarB, DiagnosticsEntry.NAME_KEY);
        String strA2 = a0(sVarB, "model");
        if (purchaseDevice != null && (purchaseDevice instanceof bk.t) && (purchaseDevice.c().A instanceof String)) {
            String strE = purchaseDevice.e();
            m.d(strE, "getAsString(...)");
            str = strE;
        } else {
            str = "";
        }
        String strX = X(strA0, strA1, strA2, str, tVar != null ? tVar.getPurchaseDeviceName() : null, tVar != null ? tVar.getPurchaseDeviceModel() : null);
        String strX2 = X(a0(sVarB, "city"), tVar != null ? tVar.getPurchaseDeviceCity() : null);
        String strX3 = X(a0(sVarB, "country"), tVar != null ? tVar.getPurchaseDeviceCountry() : null);
        String str2 = tVar != null ? tVar.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String() : null;
        String str3 = str2 == null ? "" : str2;
        String email = tVar != null ? tVar.getEmail() : null;
        String str4 = email == null ? "" : email;
        String emailVerifiedAt = tVar != null ? tVar.getEmailVerifiedAt() : null;
        String str5 = emailVerifiedAt == null ? "" : emailVerifiedAt;
        String username = tVar != null ? tVar.getUsername() : null;
        String str6 = username == null ? "" : username;
        String sex = tVar != null ? tVar.getSex() : null;
        String str7 = sex == null ? "" : sex;
        String birthDate = tVar != null ? tVar.getBirthDate() : null;
        String str8 = birthDate == null ? "" : birthDate;
        List providers = tVar != null ? tVar.getProviders() : null;
        if (providers == null) {
            providers = x.A;
        }
        return new ep.h(str3, str4, str5, str6, str7, str8, h00.q.J0(providers), strX, strX2, strX3, tVar != null ? tVar.getHasData() : null);
    }

    public static String a0(s sVar, String str) {
        q qVar;
        if (sVar == null || (qVar = (q) sVar.A.get(str)) == null || !(qVar instanceof bk.t) || !(qVar.c().A instanceof String)) {
            return "";
        }
        String strE = qVar.e();
        m.d(strE, "getAsString(...)");
        return strE;
    }
}
