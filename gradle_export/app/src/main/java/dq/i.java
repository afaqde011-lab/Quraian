package dq;

import a40.z;
import android.content.Context;
import b3.k0;
import b3.p1;
import com.mchutov.quranify.home.presentation.navigation.HomeTabRoute$HomeRootScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsTabRoute$InsightsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsTabRoute$PlaylistsRootScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterTabRoute$ReciterRootScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchTabRoute$SearchScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationBenefitsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsTabRoute$SettingsScreen;
import com.mchutov.quranify.settings.presentation.screen.questionnaire.CancellationQuestionnaireEffect$CloseScreen;
import g00.b0;
import g1.f1;
import gv.c0;
import h1.a0;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import l1.e1;
import l1.z0;
import m3.h0;
import m3.q0;
import r3.w;
import ri.t1;

public final class i extends m00.i implements u00.n {
    public final int A;
    public final Object B;
    public Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public i(gm.a aVar, p9.g gVar, z0 z0Var, z0 z0Var2, z0 z0Var3, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.C = aVar;
        this.D = gVar;
        this.B = z0Var;
        this.E = z0Var2;
        this.F = z0Var3;
    }

    public i(Long l, h1.t tVar, a0 a0Var, Locale locale, z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.C = l;
        this.D = tVar;
        this.E = a0Var;
        this.F = locale;
        this.B = z0Var;
    }

    public i(Object obj, Object obj2, Object obj3, Object obj4, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.B = obj2;
        this.E = obj3;
        this.F = obj4;
    }

    public i(su.t tVar, z0 z0Var, z0 z0Var2, z0 z0Var3, e1 e1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.C = tVar;
        this.B = z0Var;
        this.E = z0Var2;
        this.F = z0Var3;
        this.D = e1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new i((gm.a) this.C, (p9.g) this.D, (z0) this.B, (z0) this.E, (z0) this.F, cVar);
            case 1:
                return new i((Long) this.C, (h1.t) this.D, (a0) this.E, (Locale) this.F, (z0) this.B, cVar);
            case 2:
                return new i((su.t) this.C, (z0) this.B, (z0) this.E, (z0) this.F, (e1) this.D, cVar);
            case 3:
                i iVar = new i((n0.g) this.D, (p1) this.B, (k0) this.E, (d0.g) this.F, cVar, 3);
                iVar.C = obj;
                return iVar;
            default:
                i iVar2 = new i((u00.a) this.D, (sy.c) this.B, (ol.b) this.E, (Context) this.F, cVar, 4);
                iVar2.C = obj;
                return iVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                i iVar = (i) create((z) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                iVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                i iVar2 = (i) create((z) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                iVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                i iVar3 = (i) create((z) obj, (k00.c) obj2);
                b0 b0Var3 = b0.a;
                iVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                return ((i) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                i iVar4 = (i) create((pz.i) obj, (k00.c) obj2);
                b0 b0Var4 = b0.a;
                iVar4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        int i = this.A;
        b0 b0Var = b0.a;
        Object obj2 = this.F;
        Object obj3 = this.E;
        Object obj4 = this.B;
        Object obj5 = this.D;
        switch (i) {
            case 0:
                p9.g gVar = (p9.g) obj5;
                z0 z0Var = (z0) obj4;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                z0 z0Var2 = (z0) obj3;
                gm.a aVar2 = (gm.a) this.C;
                gm.a aVar3 = gm.a.A;
                boolean zBooleanValue2 = true;
                if (aVar2 != aVar3) {
                    zBooleanValue = true;
                } else if ((gVar instanceof HomeTabRoute$HomeRootScreen) || (gVar instanceof ReciterTabRoute$ReciterRootScreen) || (gVar instanceof PlaylistsTabRoute$PlaylistsRootScreen) || (gVar instanceof InsightsTabRoute$InsightsScreen) || (gVar instanceof SettingsTabRoute$SettingsScreen) || (gVar instanceof SearchTabRoute$SearchScreen)) {
                    l1.t tVar = l.a;
                    zBooleanValue = ((Boolean) ((cq.i) z0Var.getValue()).b().c().getValue()).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                l1.t tVar2 = l.a;
                z0Var2.setValue(Boolean.valueOf(zBooleanValue));
                z0 z0Var3 = (z0) obj2;
                if (aVar2 == aVar3 && ((gVar instanceof HomeTabRoute$HomeRootScreen) || (gVar instanceof ReciterTabRoute$ReciterRootScreen) || (gVar instanceof PlaylistsTabRoute$PlaylistsRootScreen) || (gVar instanceof InsightsTabRoute$InsightsScreen) || (gVar instanceof SettingsTabRoute$SettingsScreen) || (gVar instanceof SearchTabRoute$SearchScreen))) {
                    zBooleanValue2 = ((Boolean) ((cq.i) z0Var.getValue()).b().d().getValue()).booleanValue();
                }
                z0Var3.setValue(Boolean.valueOf(zBooleanValue2));
                return b0Var;
            case 1:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                Long l = (Long) this.C;
                if (l != null) {
                    z0 z0Var4 = (z0) obj4;
                    long jLongValue = l.longValue();
                    String str = ((a0) obj3).c;
                    ZoneId zoneId = h1.v.e;
                    String str2 = Instant.ofEpochMilli(jLongValue).atZone(h1.v.e).toLocalDate().format(h1.f.j(str, (Locale) obj2, ((h1.t) ((h1.t) obj5)).b));
                    w wVar = new w(str2, str2.length() == 0 ? q0.b : h0.b(str2.length(), str2.length()), 4);
                    h0.p1 p1Var = f1.a;
                    z0Var4.setValue(wVar);
                }
                return b0Var;
            case 2:
                z0 z0Var5 = (z0) obj2;
                z0 z0Var6 = (z0) obj3;
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                float f = c0.a;
                if (!((Boolean) ((z0) obj4).getValue()).booleanValue()) {
                    e1 e1Var = (e1) obj5;
                    su.t tVar3 = (su.t) this.C;
                    float fLongValue = 0.0f;
                    if (tVar3 != null) {
                        long jLongValue2 = ((Number) z0Var6.getValue()).longValue();
                        long j = tVar3.a;
                        fLongValue = ab.a0.x((jLongValue2 - j) / (tVar3.b - j), 0.0f, 1.0f);
                    } else if (((Number) z0Var5.getValue()).longValue() != 0) {
                        fLongValue = (float) (((Number) z0Var6.getValue()).longValue() / ((Number) z0Var5.getValue()).longValue());
                    }
                    e1Var.i(fLongValue);
                }
                return b0Var;
            case 3:
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                z zVar = (z) this.C;
                n0.g gVar2 = (n0.g) obj5;
                a40.c0.y(zVar, null, null, new ev.p(gVar2, (p1) obj4, (k0) obj3, null, 26), 3);
                return a40.c0.y(zVar, null, null, new g6.a(gVar2, (d0.g) obj2, (k00.c) null, 18), 3);
            default:
                pz.i iVar = (pz.i) this.C;
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                if (kotlin.jvm.internal.m.a(iVar, CancellationQuestionnaireEffect$CloseScreen.INSTANCE)) {
                    ((u00.a) obj5).invoke();
                } else if (kotlin.jvm.internal.m.a(iVar, pz.g.a)) {
                    z1.p pVar = ((sy.c) obj4).b;
                    while (true) {
                        if ((h00.q.U0(pVar) instanceof SettingsRoute$CancellationQuestionnaireScreen) || (h00.q.U0(pVar) instanceof SettingsRoute$CancellationBenefitsScreen)) {
                            h00.v.z0(pVar);
                        }
                    }
                } else {
                    if (!(iVar instanceof pz.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string = ((Context) obj2).getString(2131886272);
                    kotlin.jvm.internal.m.d(string, "getString(...)");
                    ol.b.a((ol.b) obj3, string, ol.c.B, 4);
                }
                return b0Var;
        }
    }
}
