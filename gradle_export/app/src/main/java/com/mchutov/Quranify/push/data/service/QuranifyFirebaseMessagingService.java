package com.mchutov.quranify.push.data.service;

import a1.f;
import a40.c0;
import android.os.Bundle;
import android.provider.Settings;
import com.google.firebase.messaging.FirebaseMessagingService;
import eo.p;
import g00.i;
import gc.n;
import java.time.Instant;
import java.time.OffsetDateTime;
import jw.b;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import os.x;
import r30.k;
import rd.a;
import u.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/push/data/service/QuranifyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QuranifyFirebaseMessagingService extends FirebaseMessagingService {
    public final Object H = a.I(i.A, new p(this, 13));

    public final void c(oj.p pVar) {
        String str;
        String str2;
        Instant instant;
        String str3;
        mw.a aVar = (mw.a) this.H.getValue();
        if (pVar.B == null) {
            Bundle bundle = pVar.A;
            e eVar = new e(0);
            for (String str4 : bundle.keySet()) {
                Object obj = bundle.get(str4);
                if (obj instanceof String) {
                    String str5 = (String) obj;
                    if (!str4.startsWith("google.") && !str4.startsWith("gcm.") && !str4.equals("from") && !str4.equals("message_type") && !str4.equals("collapse_key")) {
                        eVar.put(str4, str5);
                    }
                }
            }
            pVar.B = eVar;
        }
        e eVar2 = pVar.B;
        m.d(eVar2, "getData(...)");
        aVar.getClass();
        if (eVar2.isEmpty()) {
            return;
        }
        b bVar = aVar.a;
        bVar.getClass();
        if (m.a(eVar2.get("type"), "session.revoked")) {
            String str6 = (String) eVar2.get("device_id");
            str = str6 != null ? str6 : "";
            if (!k.L0(str)) {
                String string = Settings.Secure.getString(bVar.a.getContentResolver(), "android_id");
                m.d(string, "getString(...)");
                if (!str.equals(string)) {
                    return;
                }
            }
            if (bVar.b.a.isAuthorized()) {
                gj.e eVar3 = ep.k.A;
                String str7 = (String) eVar2.get("reason");
                eVar3.getClass();
                ep.k kVarH = gj.e.h(str7);
                bVar.c.a(kVarH);
                c0.y(bVar.e, null, null, new ev.p(bVar, kVarH, null, 16), 3);
                return;
            }
            return;
        }
        jw.a aVar2 = aVar.b;
        aVar2.getClass();
        if (m.a(eVar2.get("type"), "listening.cleared")) {
            if (aVar2.a.a.isAuthorized() && (str2 = (String) eVar2.get("cleared_at")) != null) {
                try {
                    instant = OffsetDateTime.parse(str2).toInstant();
                } catch (Throwable unused) {
                    instant = null;
                }
                if (instant != null) {
                    x xVar = aVar2.b;
                    c0.y(xVar.p, null, null, new n(xVar, instant, (c) null, 3), 3);
                    return;
                }
                return;
            }
            return;
        }
        String str8 = (String) eVar2.get("title");
        String str9 = str8 == null ? "" : str8;
        String str10 = (String) eVar2.get("body");
        str = str10 != null ? str10 : "";
        if (k.L0(str9) && k.L0(str)) {
            return;
        }
        String str11 = (String) eVar2.get("imageUrl");
        if (str11 == null) {
            str11 = (String) eVar2.get("image");
            if (str11 != null || k.L0(str11)) {
                str3 = null;
            } else {
                str3 = str11;
            }
        } else {
            if (k.L0(str11)) {
                str11 = null;
            }
            if (str11 == null) {
                str11 = (String) eVar2.get("image");
                if (str11 != null) {
                }
                str3 = null;
            } else {
                str3 = str11;
            }
        }
        c0.y(aVar.e, null, null, new f(aVar, str9, str, str3, (c) null, 8), 3);
    }

    public final void d(String token) {
        m.e(token, "token");
        mw.a aVar = (mw.a) this.H.getValue();
        aVar.getClass();
        if (k.L0(token)) {
            return;
        }
        aVar.d.a();
    }
}
