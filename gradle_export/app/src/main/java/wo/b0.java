package wo;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.Purchases;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import ri.t1;

public final class b0 {
    public final Context a;
    public final ap.a b;
    public final c0 c;
    public final uo.b d;
    public final uo.g e;
    public final uo.f f;
    public final uo.e g;
    public final uo.h h;
    public final uo.d i;
    public final vp.x j;
    public final bp.a k;
    public final rw.a l;
    public final AtomicReference m = new AtomicReference(null);

    public b0(Context context, ap.a aVar, c0 c0Var, uo.b bVar, uo.c cVar, uo.g gVar, uo.f fVar, uo.e eVar, uo.h hVar, uo.d dVar, vp.x xVar, bp.a aVar2, rw.a aVar3) {
        this.a = context;
        this.b = aVar;
        this.c = c0Var;
        this.d = bVar;
        this.e = gVar;
        this.f = fVar;
        this.g = eVar;
        this.h = hVar;
        this.i = dVar;
        this.j = xVar;
        this.k = aVar2;
        this.l = aVar3;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!z3.J(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public final Object A(String str, String str2, m00.c cVar) {
        z zVar;
        uo.g gVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.D = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objS = zVar.B;
        l00.a aVar = l00.a.A;
        int i2 = zVar.D;
        if (i2 == 0) {
            t1.O(objS);
            vo.a0 a0Var = new vo.a0(str, str2);
            uo.g gVar2 = this.e;
            zVar.A = gVar2;
            zVar.D = 1;
            objS = this.b.s(a0Var, zVar);
            if (objS == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = zVar.A;
            t1.O(objS);
        }
        gVar.getClass();
        return uo.g.X((vo.z) objS);
    }

    public final Object B(String str, String str2, m00.c cVar) {
        a0 a0Var;
        uo.h hVar;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.D = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objE = a0Var.B;
        l00.a aVar = l00.a.A;
        int i2 = a0Var.D;
        if (i2 == 0) {
            t1.O(objE);
            vo.c0 c0Var = new vo.c0(str, str2);
            uo.h hVar2 = this.h;
            a0Var.A = hVar2;
            a0Var.D = 1;
            objE = this.b.e(c0Var, a0Var);
            if (objE == aVar) {
                return aVar;
            }
            hVar = hVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = a0Var.A;
            t1.O(objE);
        }
        vo.b0 b0Var = (vo.b0) objE;
        hVar.getClass();
        String resetToken = b0Var != null ? b0Var.getResetToken() : null;
        String stage = b0Var != null ? b0Var.getStage() : null;
        if (stage == null) {
            stage = "";
        }
        return new ep.t(resetToken, stage, b0Var != null ? b0Var.getResetExpiresIn() : null, b0Var != null ? b0Var.getResendIn() : null);
    }

    public final Object a(String str, m00.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objI = bVar.A;
        l00.a aVar = l00.a.A;
        int i2 = bVar.C;
        if (i2 == 0) {
            t1.O(objI);
            vo.x xVar = new vo.x(str);
            bVar.C = 1;
            objI = this.b.i(xVar, bVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objI);
        }
        vo.d dVar = (vo.d) objI;
        String next = dVar != null ? dVar.getNext() : null;
        if (next == null) {
            next = "";
        }
        return new ep.i(next, dVar != null ? dVar.getSignupToken() : null, dVar != null ? dVar.getSignupExpiresIn() : null, dVar != null ? dVar.getResendIn() : null);
    }

    public final Object c(String str, String str2, String str3, m00.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.C = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.A;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.C;
        g00.b0 b0Var = g00.b0.a;
        bp.a aVar2 = this.k;
        if (i2 == 0) {
            t1.O(obj);
            this.m.set(null);
            ep.g session = this.c.a.getSession();
            String str4 = session != null ? session.a : null;
            if (str4 == null || str4.length() == 0) {
                aVar2.a();
                return b0Var;
            }
            vo.f fVar = new vo.f(str, str2, str3);
            cVar2.C = 1;
            if (this.b.x(fVar, cVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        aVar2.a();
        return b0Var;
    }

    public final String d() {
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        kotlin.jvm.internal.m.d(string, "getString(...)");
        return string;
    }

    public final Object e(m00.c cVar) {
        d dVar;
        uo.f fVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.D = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.B;
        l00.a aVar = l00.a.A;
        int i2 = dVar.D;
        if (i2 == 0) {
            t1.O(obj);
            uo.f fVar2 = this.f;
            dVar.A = fVar2;
            dVar.D = 1;
            Object objK = this.b.k(dVar);
            if (objK == aVar) {
                return aVar;
            }
            obj = objK;
            fVar = fVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = dVar.A;
            t1.O(obj);
        }
        fVar.getClass();
        return uo.f.Z((vo.t) obj);
    }

    public final Object f(m00.c cVar) throws IOException {
        e eVar;
        uo.b bVar;
        Integer maxDevices;
        vo.b bVar2;
        Locale locale;
        String displayCountry;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.D = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objH = eVar.B;
        l00.a aVar = l00.a.A;
        int i2 = eVar.D;
        if (i2 == 0) {
            t1.O(objH);
            String strD = d();
            uo.b bVar3 = this.d;
            eVar.A = bVar3;
            eVar.D = 1;
            objH = this.b.h(strD, eVar);
            if (objH == aVar) {
                return aVar;
            }
            bVar = bVar3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = eVar.A;
            t1.O(objH);
        }
        vo.b bVar4 = (vo.b) objH;
        bVar.getClass();
        List<vo.a> devices = bVar4 != null ? bVar4.getDevices() : null;
        if (devices == null) {
            devices = h00.x.A;
        }
        uo.a aVar2 = bVar.f;
        ArrayList arrayList = new ArrayList(h00.r.q0(devices, 10));
        for (vo.a aVar3 : devices) {
            String deviceId = aVar3 != null ? aVar3.getDeviceId() : null;
            if (deviceId == null) {
                deviceId = "";
            }
            String deviceType = aVar3 != null ? aVar3.getDeviceType() : null;
            if (deviceType == null) {
                deviceType = "";
            }
            String deviceName = aVar3 != null ? aVar3.getDeviceName() : null;
            if (deviceName == null) {
                deviceName = "";
            }
            String createdAt = aVar3 != null ? aVar3.getCreatedAt() : null;
            if (createdAt == null) {
                createdAt = "";
            }
            String lastSeenAt = aVar3 != null ? aVar3.getLastSeenAt() : null;
            if (lastSeenAt == null) {
                lastSeenAt = "";
            }
            boolean zA = aVar3 != null ? kotlin.jvm.internal.m.a(aVar3.getIsCurrent(), Boolean.TRUE) : false;
            String city = aVar3 != null ? aVar3.getCity() : null;
            if (city == null) {
                city = "";
            }
            String country = aVar3 != null ? aVar3.getCountry() : null;
            String string = country != null ? r30.k.j1(country).toString() : null;
            String str = string == null ? "" : string;
            if (str.length() != 2) {
                aVar2 = aVar2;
                displayCountry = str;
                bVar2 = bVar4;
            } else {
                String str2 = str;
                Locale localeBuild = new Locale.Builder().setRegion(str2).build();
                bVar2 = bVar4;
                LocaleManager localeManager = aVar2.f;
                if (localeManager.getApplicationLocales().isEmpty()) {
                    locale = Locale.getDefault();
                    kotlin.jvm.internal.m.b(locale);
                } else {
                    locale = localeManager.getApplicationLocales().get(0);
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    kotlin.jvm.internal.m.b(locale);
                }
                displayCountry = localeBuild.getDisplayCountry(locale);
                if (r30.k.L0(displayCountry)) {
                    displayCountry = str2;
                }
            }
            List listS = va.a.S(new String[]{city, displayCountry});
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listS) {
                if (!r30.k.L0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            String strR0 = h00.q.R0(arrayList2, ", ", null, null, null, 62);
            if (r30.k.L0(strR0)) {
                strR0 = aVar3 != null ? aVar3.getLocation() : null;
                if (strR0 == null) {
                    strR0 = "";
                }
            }
            String application = aVar3 != null ? aVar3.getApplication() : null;
            arrayList.add(new ep.b(deviceId, deviceType, deviceName, createdAt, lastSeenAt, zA, strR0, application == null ? "" : application));
            bVar4 = bVar2;
            aVar2 = aVar2;
        }
        vo.b bVar5 = bVar4;
        return new ep.c((bVar5 == null || (maxDevices = bVar5.getMaxDevices()) == null) ? 0 : maxDevices.intValue(), arrayList);
    }

    public final Object g(String str, m00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.C = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objV = fVar.A;
        l00.a aVar = l00.a.A;
        int i2 = fVar.C;
        if (i2 == 0) {
            t1.O(objV);
            vo.n nVar = new vo.n(str);
            fVar.C = 1;
            objV = this.b.v(nVar, fVar);
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objV);
        }
        vo.m mVar = (vo.m) objV;
        String next = mVar != null ? mVar.getNext() : null;
        return next == null ? "" : next;
    }

    public final Object h(String str, m00.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.C = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objW = gVar.A;
        l00.a aVar = l00.a.A;
        int i2 = gVar.C;
        if (i2 == 0) {
            t1.O(objW);
            vo.n nVar = new vo.n(str);
            gVar.C = 1;
            objW = this.b.w(nVar, gVar);
            if (objW == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objW);
        }
        vo.m mVar = (vo.m) objW;
        String next = mVar != null ? mVar.getNext() : null;
        return next == null ? "" : next;
    }

    public final Object i(ep.f fVar, Boolean bool, String str, String str2, String str3, LocalDate localDate, m00.c cVar) {
        h hVar;
        String strD;
        String MODEL;
        String strB;
        String lowerCase;
        String str4;
        String str5;
        Boolean bool2;
        String str6;
        String str7;
        String str8;
        String strName;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.L;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.L = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.J;
        Object obj2 = l00.a.A;
        int i2 = hVar.L;
        if (i2 == 0) {
            t1.O(obj);
            strD = d();
            MODEL = Build.MODEL;
            kotlin.jvm.internal.m.d(MODEL, "MODEL");
            strB = b(str2 == null ? "" : str2);
            if (fVar == null || (strName = fVar.name()) == null) {
                lowerCase = null;
            } else {
                lowerCase = strName.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            str4 = localDate != null ? localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
            if (str4 == null) {
                str4 = "";
            }
            hVar.A = bool;
            str5 = str3;
            hVar.B = str5;
            hVar.C = strD;
            hVar.D = "android";
            hVar.E = MODEL;
            hVar.F = str;
            hVar.G = strB;
            hVar.H = lowerCase;
            hVar.I = str4;
            hVar.L = 1;
            Object objM = m(hVar);
            if (objM == obj2) {
                return obj2;
            }
            bool2 = bool;
            obj = objM;
            str6 = lowerCase;
            str7 = "android";
            str8 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = hVar.I;
            String str9 = hVar.H;
            strB = hVar.G;
            String str10 = hVar.F;
            MODEL = hVar.E;
            String str11 = hVar.D;
            strD = hVar.C;
            str5 = hVar.B;
            Boolean bool3 = hVar.A;
            t1.O(obj);
            bool2 = bool3;
            str6 = str9;
            str8 = str10;
            str7 = str11;
        }
        String str12 = str4;
        String str13 = strB;
        String str14 = MODEL;
        String str15 = strD;
        String str16 = (String) obj;
        String str17 = (str5 == null || r30.k.L0(str5)) ? null : str5;
        boolean zM = this.j.m();
        return new vo.j(str15, str7, str14, str8, str13, str6, str12, str16, bool2, str17, zM ? Boolean.valueOf(zM) : null);
    }

    public final Object j(ep.g gVar, m00.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.D = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.B;
        l00.a aVar = l00.a.A;
        int i2 = iVar.D;
        if (i2 == 0) {
            t1.O(obj);
            this.c.b(gVar);
            String str = gVar.e.a;
            iVar.A = gVar;
            iVar.D = 1;
            if (this.j.n(str, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = iVar.A;
            t1.O(obj);
            ((g00.n) obj).getClass();
        }
        this.l.a();
        return gVar;
    }

    public final Object k(ep.h hVar, m00.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.C = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.A;
        l00.a aVar = l00.a.A;
        int i2 = jVar.C;
        g00.b0 b0Var = g00.b0.a;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            ((g00.n) obj).getClass();
            return b0Var;
        }
        t1.O(obj);
        boolean zL0 = r30.k.L0(hVar.a);
        vp.x xVar = this.j;
        if (zL0) {
            jVar.C = 2;
            if (xVar.y(jVar) == aVar) {
                return aVar;
            }
            return b0Var;
        }
        String str = hVar.a;
        jVar.C = 1;
        if (xVar.n(str, jVar) == aVar) {
            return aVar;
        }
        return b0Var;
    }

    public final Object l(String str, ep.r rVar, m00.c cVar) {
        k kVar;
        String strD;
        String MODEL;
        String str2;
        String lowerCase;
        ap.a aVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String strName;
        Object objJ;
        ep.r rVar2 = rVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.M;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.M = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objC = kVar.K;
        Object obj = l00.a.A;
        int i2 = kVar.M;
        if (i2 != 0) {
            if (i2 == 1) {
                String str7 = kVar.J;
                lowerCase = kVar.I;
                String str8 = kVar.H;
                str2 = kVar.G;
                str4 = kVar.F;
                MODEL = kVar.E;
                str3 = kVar.D;
                strD = kVar.C;
                aVar = kVar.B;
                ep.r rVar3 = kVar.A;
                t1.O(objC);
                str6 = str7;
                rVar2 = rVar3;
                str5 = str8;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(objC);
                    return objC;
                }
                t1.O(objC);
            }
            ep.g gVarY = uo.f.Y((vo.r) objC);
            kVar.A = null;
            kVar.B = null;
            kVar.M = 3;
            objJ = j(gVarY, kVar);
            if (objJ != obj) {
                return obj;
            }
            return objJ;
        }
        t1.O(objC);
        strD = d();
        MODEL = Build.MODEL;
        kotlin.jvm.internal.m.d(MODEL, "MODEL");
        str2 = rVar2.b;
        String strB = b(rVar2.c);
        ep.f fVar = rVar2.d;
        if (fVar == null || (strName = fVar.name()) == null) {
            lowerCase = null;
        } else {
            lowerCase = strName.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        LocalDate localDate = rVar2.e;
        String str9 = localDate != null ? localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
        String str10 = str9 != null ? str9 : "";
        kVar.A = rVar2;
        aVar = this.b;
        kVar.B = aVar;
        kVar.C = strD;
        str3 = "android";
        kVar.D = "android";
        kVar.E = MODEL;
        str4 = str;
        kVar.F = str4;
        kVar.G = str2;
        kVar.H = strB;
        kVar.I = lowerCase;
        kVar.J = str10;
        kVar.M = 1;
        Object objM = m(kVar);
        if (objM != obj) {
            str5 = strB;
            str6 = str10;
            objC = objM;
        }
        return obj;
        String str11 = lowerCase;
        String str12 = str2;
        String str13 = str4;
        String str14 = MODEL;
        String str15 = str3;
        String str16 = strD;
        String str17 = (String) objC;
        boolean z = rVar2.f;
        boolean zM = this.j.m();
        vo.s sVar = new vo.s(str16, str15, str14, str13, str12, str5, str11, str6, str17, z, zM ? Boolean.valueOf(zM) : null);
        kVar.A = null;
        kVar.B = null;
        kVar.C = null;
        kVar.D = null;
        kVar.E = null;
        kVar.F = null;
        kVar.G = null;
        kVar.H = null;
        kVar.I = null;
        kVar.J = null;
        kVar.M = 2;
        objC = aVar.c(sVar, kVar);
        if (objC != obj) {
            ep.g gVarY2 = uo.f.Y((vo.r) objC);
            kVar.A = null;
            kVar.B = null;
            kVar.M = 3;
            objJ = j(gVarY2, kVar);
            if (objJ != obj) {
                return objJ;
            }
        }
        return obj;
    }

    public final Object m(m00.c cVar) {
        l lVar;
        Object objE;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.C = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.A;
        l00.a aVar = l00.a.A;
        int i2 = lVar.C;
        if (i2 == 0) {
            t1.O(obj);
            vp.x xVar = this.j;
            String storefrontCountryCode = (String) xVar.h.getValue();
            if (storefrontCountryCode == null) {
                storefrontCountryCode = Purchases.INSTANCE.getSharedInstance().getStorefrontCountryCode();
            }
            if (storefrontCountryCode != null) {
                String upperCase = storefrontCountryCode.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                return upperCase;
            }
            lVar.C = 1;
            objE = xVar.e(lVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objE = ((g00.n) obj).A;
        }
        if (objE instanceof g00.m) {
            objE = null;
        }
        String str = (String) objE;
        if (str == null) {
            return null;
        }
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
        return upperCase2;
    }

    public final Object n(ep.q qVar, m00.c cVar) {
        m mVar;
        String country;
        String city;
        String name;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.C = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objT = mVar.A;
        l00.a aVar = l00.a.A;
        int i2 = mVar.C;
        c0 c0Var = this.c;
        g00.b0 b0Var = g00.b0.a;
        String string = null;
        if (i2 == 0) {
            t1.O(objT);
            ep.g session = c0Var.a.getSession();
            String str = session != null ? session.a : null;
            if (str != null && !r30.k.L0(str) && this.j.m()) {
                String str2 = qVar.A;
                String MODEL = Build.MODEL;
                kotlin.jvm.internal.m.d(MODEL, "MODEL");
                vo.o oVar = new vo.o(str2);
                mVar.C = 1;
                objT = this.b.t(oVar, mVar);
                if (objT == aVar) {
                    return aVar;
                }
            }
            return b0Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(objT);
        vo.p pVar = (vo.p) objT;
        String string2 = (pVar == null || (name = pVar.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String()) == null) ? null : r30.k.j1(name).toString();
        String str3 = string2 == null ? "" : string2;
        if (!r30.k.L0(str3)) {
            String string3 = (pVar == null || (city = pVar.getCity()) == null) ? null : r30.k.j1(city).toString();
            String str4 = string3 == null ? "" : string3;
            if (pVar != null && (country = pVar.getCountry()) != null) {
                string = r30.k.j1(country).toString();
            }
            String str5 = string == null ? "" : string;
            ep.g session2 = c0Var.a.getSession();
            if (session2 != null) {
                AtomicReference atomicReference = this.m;
                ep.h hVar = (ep.h) atomicReference.get();
                if (hVar == null) {
                    hVar = session2.e;
                }
                ep.h hVarA = ep.h.a(hVar, null, null, null, str3, str4, str5, null, 1151);
                atomicReference.set(hVarA);
                c0Var.b(ep.g.a(session2, hVarA));
            }
        }
        return b0Var;
    }

    public final Object o(m00.c cVar) {
        n nVar;
        uo.d dVar;
        Integer resendIn;
        Integer expiresIn;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.D = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.B;
        l00.a aVar = l00.a.A;
        int i2 = nVar.D;
        if (i2 == 0) {
            t1.O(obj);
            uo.d dVar2 = this.i;
            nVar.A = dVar2;
            nVar.D = 1;
            Object objJ = this.b.j(nVar);
            if (objJ == aVar) {
                return aVar;
            }
            obj = objJ;
            dVar = dVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = nVar.A;
            t1.O(obj);
        }
        vo.e eVar = (vo.e) obj;
        dVar.getClass();
        int iIntValue = 0;
        int iIntValue2 = (eVar == null || (expiresIn = eVar.getExpiresIn()) == null) ? 0 : expiresIn.intValue();
        if (eVar != null && (resendIn = eVar.getResendIn()) != null) {
            iIntValue = resendIn.intValue();
        }
        return new ep.j(iIntValue2, iIntValue);
    }

    public final Object p(String str, m00.c cVar) {
        o oVar;
        uo.e eVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i = oVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.D = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objM = oVar.B;
        l00.a aVar = l00.a.A;
        int i2 = oVar.D;
        if (i2 == 0) {
            t1.O(objM);
            vo.i iVar = new vo.i(str);
            uo.e eVar2 = this.g;
            oVar.A = eVar2;
            oVar.D = 1;
            objM = this.b.m(iVar, oVar);
            if (objM == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = oVar.A;
            t1.O(objM);
        }
        eVar.getClass();
        return uo.e.X((vo.g) objM);
    }

    public final Object q(String str, m00.c cVar) {
        p pVar;
        uo.g gVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i = pVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.D = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objF = pVar.B;
        l00.a aVar = l00.a.A;
        int i2 = pVar.D;
        if (i2 == 0) {
            t1.O(objF);
            vo.u uVar = new vo.u(str);
            uo.g gVar2 = this.e;
            pVar.A = gVar2;
            pVar.D = 1;
            objF = this.b.f(uVar, pVar);
            if (objF == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = pVar.A;
            t1.O(objF);
        }
        gVar.getClass();
        return uo.g.X((vo.z) objF);
    }

    public final java.lang.Object r(java.lang.String r8, java.lang.String r9, m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: wo.b0.r(java.lang.String, java.lang.String, m00.c):java.lang.Object");
    }

    public final Object s(String str, m00.c cVar) {
        r rVar;
        uo.e eVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.D = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objA = rVar.B;
        l00.a aVar = l00.a.A;
        int i2 = rVar.D;
        if (i2 == 0) {
            t1.O(objA);
            vo.h hVar = new vo.h(str);
            uo.e eVar2 = this.g;
            rVar.A = eVar2;
            rVar.D = 1;
            objA = this.b.a(hVar, rVar);
            if (objA == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = rVar.A;
            t1.O(objA);
        }
        eVar.getClass();
        return uo.e.X((vo.g) objA);
    }

    public final Object t(String str, String str2, m00.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i = sVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.C = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objB = sVar.A;
        Object obj = l00.a.A;
        int i2 = sVar.C;
        if (i2 == 0) {
            t1.O(objB);
            String strD = d();
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.m.d(MODEL, "MODEL");
            boolean zM = this.j.m();
            Boolean boolValueOf = Boolean.valueOf(zM);
            if (!zM) {
                boolValueOf = null;
            }
            vo.k kVar = new vo.k(boolValueOf, strD, str, str2);
            sVar.C = 1;
            objB = this.b.b(kVar, sVar);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
            return objB;
        }
        t1.O(objB);
        ep.g gVarY = uo.f.Y((vo.r) objB);
        sVar.C = 2;
        Object objJ = j(gVarY, sVar);
        return objJ == obj ? obj : objJ;
    }

    public final java.lang.Object u(ep.f r9, java.lang.Boolean r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.time.LocalDate r14, m00.c r15) {
        throw new UnsupportedOperationException("Method not decompiled: wo.b0.u(ep.f, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.time.LocalDate, m00.c):java.lang.Object");
    }

    public final java.lang.Object v(java.lang.String r14, java.lang.String r15, ep.f r16, java.time.LocalDate r17, java.lang.Boolean r18, m00.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: wo.b0.v(java.lang.String, java.lang.String, ep.f, java.time.LocalDate, java.lang.Boolean, m00.c):java.lang.Object");
    }

    public final Object w(m00.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.C = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.A;
        l00.a aVar = l00.a.A;
        int i2 = vVar.C;
        try {
            if (i2 == 0) {
                t1.O(obj);
                this.m.set(null);
                ep.g session = this.c.a.getSession();
                String str = session != null ? session.b : null;
                if (str == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    ap.a aVar2 = this.b;
                    vo.l lVar = new vo.l(str);
                    vVar.C = 1;
                    if (aVar2.q(lVar, vVar) == aVar) {
                        return aVar;
                    }
                }
                this.k.a();
                return g00.b0.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        } catch (Throwable th) {
            t1.s(th);
        }
        this.k.a();
        return g00.b0.a;
    }

    public final Object x(m00.c cVar) {
        w wVar;
        ep.h hVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.D = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objE = wVar.B;
        Object obj = l00.a.A;
        int i2 = wVar.D;
        c0 c0Var = this.c;
        try {
            if (i2 == 0) {
                t1.O(objE);
                ep.g session = c0Var.a.getSession();
                if (session != null && !r30.k.L0(session.a)) {
                    wVar.D = 1;
                    objE = e(wVar);
                    if (objE == obj) {
                    }
                }
                return null;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ep.h hVar2 = wVar.A;
                t1.O(objE);
                return hVar2;
            }
            t1.O(objE);
            hVar = (ep.h) objE;
        } catch (Throwable unused) {
            hVar = null;
        }
        if (hVar != null) {
            this.m.set(hVar);
            ep.g session2 = c0Var.a.getSession();
            if (session2 != null) {
                Boolean bool = hVar.k;
                if (bool == null) {
                    bool = session2.e.k;
                }
                c0Var.b(ep.g.a(session2, ep.h.a(hVar, null, null, null, null, null, null, bool, 1023)));
                this.j.B(hVar);
            }
            wVar.A = hVar;
            wVar.D = 2;
            return k(hVar, wVar) == obj ? obj : hVar;
        }
        return null;
    }

    public final Object y(m00.c cVar) throws IOException {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.C = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objF = xVar.A;
        Object obj = l00.a.A;
        int i2 = xVar.C;
        g00.b0 b0Var = g00.b0.a;
        if (i2 == 0) {
            t1.O(objF);
            xVar.C = 1;
            objF = f(xVar);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objF);
            return b0Var;
        }
        t1.O(objF);
        ArrayList arrayList = ((ep.c) objF).a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            ep.b bVar = (ep.b) obj2;
            if (!bVar.f && !r30.k.L0(bVar.a)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ep.b) it.next()).a);
        }
        if (!arrayList3.isEmpty()) {
            String strD = d();
            vo.w wVar = new vo.w(arrayList3);
            xVar.C = 2;
            if (this.b.r(strD, wVar, xVar) == obj) {
                return obj;
            }
        }
        return b0Var;
    }

    public final Object z(String str, ep.f fVar, LocalDate localDate, m00.c cVar) {
        y yVar;
        ep.g gVar;
        uo.f fVar2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i = yVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.E = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.C;
        l00.a aVar = l00.a.A;
        int i2 = yVar.E;
        c0 c0Var = this.c;
        if (i2 == 0) {
            t1.O(obj);
            ep.g session = c0Var.a.getSession();
            if (session == null) {
                return new ep.h(null, null, null, null, null, null, null, null, 2047);
            }
            String strB = b(str);
            String lowerCase = fVar.name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            String str2 = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            kotlin.jvm.internal.m.d(str2, "format(...)");
            vo.y yVar2 = new vo.y(strB, lowerCase, str2);
            yVar.A = session;
            uo.f fVar3 = this.f;
            yVar.B = fVar3;
            yVar.E = 1;
            Object objP = this.b.p(yVar2, yVar);
            if (objP == aVar) {
                return aVar;
            }
            gVar = session;
            obj = objP;
            fVar2 = fVar3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar2 = yVar.B;
            gVar = yVar.A;
            t1.O(obj);
        }
        fVar2.getClass();
        final ep.h hVarZ = uo.f.Z((vo.t) obj);
        this.m.updateAndGet(new UnaryOperator() {
            @Override
            public final Object apply(Object obj2) {
                ep.h hVar = (ep.h) obj2;
                ep.h hVar2 = hVarZ;
                return hVar != null ? ep.h.a(hVar, hVar2.d, hVar2.e, hVar2.f, null, null, null, null, 1991) : hVar2;
            }
        });
        c0Var.b(ep.g.a(gVar, hVarZ));
        this.j.B(hVarZ);
        return hVarZ;
    }
}
