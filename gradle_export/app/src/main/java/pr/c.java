package pr;

import ab.a0;
import h00.d0;
import h00.r;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import mr.d;
import mr.e;
import mr.g;
import qr.u;
import qr.v;
import rs.f;

public final class c {
    public static ArrayList a(List streaks, g timerState, int i) {
        u uVar;
        int i2;
        m.e(streaks, "streaks");
        m.e(timerState, "timerState");
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateWith = localDateNow.with((TemporalAdjuster) DayOfWeek.MONDAY);
        int iP = d0.P(r.q0(streaks, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj : streaks) {
            linkedHashMap.put(Instant.ofEpochSecond(((f) obj).b).atZone(ZoneId.systemDefault()).toLocalDate(), obj);
        }
        boolean z = timerState instanceof d;
        boolean z2 = true;
        if (!z) {
            if (timerState instanceof mr.f) {
                mr.f fVar = (mr.f) timerState;
                if (fVar.a < fVar.b) {
                    z2 = false;
                }
            } else {
                if (!(timerState instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                f fVar2 = (f) linkedHashMap.get(localDateNow);
                if (fVar2 == null) {
                    z2 = false;
                } else if (fVar2.c < fVar2.d * 60) {
                    z2 = false;
                }
            }
        }
        float fX = 1.0f;
        if (!z) {
            if (timerState instanceof mr.f) {
                mr.f fVar3 = (mr.f) timerState;
                int i3 = fVar3.b;
                if (i3 <= 0) {
                    fX = 0.0f;
                } else {
                    fX = a0.x(fVar3.a / i3, 0.0f, 1.0f);
                }
            } else {
                if (!(timerState instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                f fVar4 = (f) linkedHashMap.get(localDateNow);
                if (fVar4 != null && (i2 = fVar4.d * 60) > 0) {
                    fX = a0.x(fVar4.c / i2, 0.0f, 1.0f);
                } else {
                    fX = 0.0f;
                }
            }
        }
        z00.e eVarI0 = a0.I0(0, 7);
        ArrayList arrayList = new ArrayList(r.q0(eVarI0, 10));
        Iterator it = eVarI0.iterator();
        while (true) {
            z00.d dVar = (z00.d) it;
            if (!dVar.C) {
                return arrayList;
            }
            LocalDate localDatePlusDays = localDateWith.plusDays(dVar.nextInt());
            String displayName = localDatePlusDays.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
            boolean zEquals = localDatePlusDays.equals(localDateNow);
            if (zEquals) {
                uVar = z2 ? u.A : u.C;
            } else if (localDatePlusDays.isAfter(localDateNow)) {
                uVar = u.D;
            } else {
                f fVar5 = (f) linkedHashMap.get(localDatePlusDays);
                uVar = (fVar5 == null || fVar5.c < ((long) ((fVar5 != null ? fVar5.d : i) * 60))) ? u.B : u.A;
            }
            m.b(displayName);
            arrayList.add(new v(displayName, uVar, zEquals, uVar == u.C ? Math.max(0.02f, fX) : 0.0f));
        }
    }
}
