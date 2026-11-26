package ez;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.regex.Pattern;
import wo.b0;
import wo.c0;

public final class u extends vm.a {
    public final b0 d;
    public final pm.c e;

    public u(b0 b0Var, c0 c0Var, pm.c cVar) {
        LocalDate localDate;
        super(new t("", null, null, 0, null, null, false, false));
        this.d = b0Var;
        this.e = cVar;
        ep.g session = c0Var.a.getSession();
        if (session != null) {
            ep.h hVar = session.e;
            String str = hVar.d;
            String str2 = hVar.f;
            ep.f fVar = null;
            if (r30.k.L0(str2)) {
                localDate = null;
            } else {
                try {
                    localDate = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                } catch (DateTimeParseException unused) {
                    localDate = null;
                }
            }
            String lowerCase = hVar.e.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1278174388) {
                if (iHashCode != 3343885) {
                    if (iHashCode == 106069776 && lowerCase.equals("other")) {
                        fVar = ep.f.C;
                    }
                } else if (lowerCase.equals("male")) {
                    fVar = ep.f.A;
                }
            } else if (lowerCase.equals("female")) {
                fVar = ep.f.B;
            }
            i(t.a((t) this.c.d.getValue(), hVar.d, null, null, 0, fVar, localDate, false, false, 462));
            if (r30.k.L0(str)) {
                return;
            }
            j(str);
        }
    }

    public final void j(String value) {
        t tVar = (t) this.c.d.getValue();
        kotlin.jvm.internal.m.e(value, "value");
        pm.c resourceManager = this.e;
        kotlin.jvm.internal.m.e(resourceManager, "resourceManager");
        String strA = null;
        if (value.length() != 0) {
            if (value.length() < 2) {
                strA = resourceManager.a(2131886192, new Object[0]);
            } else if (value.length() > 30) {
                strA = resourceManager.a(2131886191, new Object[0]);
            } else if (r30.k.Y0(value, ' ') || r30.k.D0(value, ' ')) {
                strA = resourceManager.a(2131886194, new Object[0]);
            } else {
                Pattern patternCompile = Pattern.compile("^[A-Za-z!.,_'-]+$");
                kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
                if (!patternCompile.matcher(value).matches()) {
                    strA = resourceManager.a(2131886193, new Object[0]);
                }
            }
        }
        i(t.a(tVar, value, strA, null, 0, null, null, false, false, 504));
    }
}
