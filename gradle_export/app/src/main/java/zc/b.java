package zc;

import a2.o;
import android.content.Context;
import b3.j0;
import bd.f;
import com.google.android.gms.cast.CredentialsData;
import com.google.protobuf.RuntimeVersion;
import h00.n;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.m;
import r30.r;
import rc.b0;
import rc.g;

public abstract class b implements hd.c {
    public static final Set D = n.X0(new String[]{RuntimeVersion.SUFFIX, "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000"});
    public final hd.b A = hd.b.A;
    public rc.c B;
    public f C;

    @Override
    public final void a(rc.c cVar) {
        this.B = cVar;
        g gVar = cVar.f13151a;
        Context context = gVar.f13173b;
        b0 b0Var = gVar.f13181j;
        boolean zA = b0Var.a("adid");
        boolean zA2 = b0Var.a("app_set_id");
        m.e(context, "context");
        f fVar = new f();
        fVar.C = context;
        fVar.A = zA;
        fVar.B = zA2;
        fVar.D = rd.a.J(new j0(fVar, 9));
        this.C = fVar;
        String str = (String) c().f13152b.C;
        if (str != null) {
            m.e(str, "deviceId");
            if (((str.length() == 0 || D.contains(str)) ? false : true) && !r.p0(str, "S", false)) {
                return;
            }
        }
        String string = UUID.randomUUID().toString();
        m.d(string, "toString(...)");
        String strConcat = string.concat("R");
        m.e(strConcat, "deviceId");
        o oVar = ((rc.b) this).E.c().f11937a;
        oVar.f(new od.a(oVar.b().f11927a, strConcat), od.d.B);
    }

    @Override
    public final gd.a b(gd.a aVar) {
        g gVar = c().f13151a;
        if (aVar.f6291c == null) {
            aVar.f6291c = Long.valueOf(System.currentTimeMillis());
        }
        if (aVar.f6294f == null) {
            aVar.f6294f = UUID.randomUUID().toString();
        }
        if (aVar.B == null) {
            aVar.B = "amplitude-analytics-android/1.22.4";
        }
        if (aVar.f6289a == null) {
            aVar.f6289a = (String) c().f13152b.B;
        }
        if (aVar.f6290b == null) {
            aVar.f6290b = (String) c().f13152b.C;
        }
        b0 b0Var = gVar.f13181j;
        if (b0Var.a("version_name")) {
            f fVar = this.C;
            if (fVar == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.f6298j = fVar.e().f4857c;
        }
        if (b0Var.a("os_name")) {
            f fVar2 = this.C;
            if (fVar2 == null) {
                m.k("contextProvider");
                throw null;
            }
            fVar2.e().getClass();
            aVar.l = CredentialsData.CREDENTIALS_TYPE_ANDROID;
        }
        if (b0Var.a("os_version")) {
            f fVar3 = this.C;
            if (fVar3 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.m = fVar3.e().f4858d;
        }
        if (b0Var.a("device_brand")) {
            f fVar4 = this.C;
            if (fVar4 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.f6300n = fVar4.e().f4859e;
        }
        if (b0Var.a("device_manufacturer")) {
            f fVar5 = this.C;
            if (fVar5 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.f6301o = fVar5.e().f4860f;
        }
        if (b0Var.a("device_model")) {
            f fVar6 = this.C;
            if (fVar6 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.f6302p = fVar6.e().f4861g;
        }
        if (b0Var.a("carrier")) {
            f fVar7 = this.C;
            if (fVar7 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.f6303q = fVar7.e().f4862h;
        }
        if (b0Var.a("ip_address") && aVar.C == null) {
            aVar.C = "$remote";
        }
        if (b0Var.a("country") && aVar.C != "$remote") {
            f fVar8 = this.C;
            if (fVar8 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.f6304r = fVar8.e().f4856b;
        }
        if (b0Var.a("language")) {
            f fVar9 = this.C;
            if (fVar9 == null) {
                m.k("contextProvider");
                throw null;
            }
            aVar.A = fVar9.e().f4863i;
        }
        if (b0Var.a("platform")) {
            aVar.f6299k = "Android";
        }
        if (b0Var.a("lat_lng") && this.C == null) {
            m.k("contextProvider");
            throw null;
        }
        if (b0Var.a("adid")) {
            f fVar10 = this.C;
            if (fVar10 == null) {
                m.k("contextProvider");
                throw null;
            }
            String str = fVar10.e().f4855a;
            if (str != null) {
                aVar.f6310x = str;
            }
        }
        if (b0Var.a("app_set_id")) {
            f fVar11 = this.C;
            if (fVar11 == null) {
                m.k("contextProvider");
                throw null;
            }
            String str2 = fVar11.e().f4864j;
            if (str2 != null) {
                aVar.f6311y = str2;
            }
        }
        if (aVar.K == null) {
            c();
        }
        if (aVar.D == null) {
            c();
        }
        if (aVar.E == null) {
            c();
        }
        return aVar;
    }

    public final rc.c c() {
        rc.c cVar = this.B;
        if (cVar != null) {
            return cVar;
        }
        m.k("amplitude");
        throw null;
    }

    @Override
    public final hd.b getType() {
        return this.A;
    }
}
