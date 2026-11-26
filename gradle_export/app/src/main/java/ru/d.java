package ru;

import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import h00.n;
import java.util.List;
import v30.g;

public final class d {
    OFF(null),
    MINUTES_3(180000L),
    MINUTES_5(300000L),
    MINUTES_10(Long.valueOf(HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS)),
    MINUTES_15(900000L),
    MINUTES_30(1800000L),
    MINUTES_45(2700000L),
    HOUR_1(3600000L),
    WHEN_SURAH_ENDS(null),
    WHEN_STORY_ENDS(null);

    public static final c B;
    public static final v30.a C;
    public static final v30.a D;
    public final Long A;

    static {
        d dVar = OFF;
        d dVar2 = MINUTES_5;
        d dVar3 = MINUTES_10;
        d dVar4 = MINUTES_15;
        d dVar5 = WHEN_SURAH_ENDS;
        d dVar6 = WHEN_STORY_ENDS;
        f50.c.v(dVarArr);
        B = new c(0);
        List listK0 = n.k0(new d[]{dVar, dVar2, dVar3, dVar4, dVar, dVar, dVar, dVar5});
        g gVar = g.B;
        C = gVar.c(listK0);
        D = gVar.c(n.k0(new d[]{dVar, dVar, dVar2, dVar3, dVar4, dVar6, dVar5}));
    }

    public d(Long l) {
        super(str, i);
        this.A = l;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) H.clone();
    }
}
