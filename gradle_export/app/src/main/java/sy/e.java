package sy;

import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsTabRoute$InsightsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DebugControlsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DevicesScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DownloadManagerScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$EditDetailsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ManageSubscriptionScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$NotificationScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$SettingsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsTabRoute$SettingsScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import h00.a0;
import h00.d0;
import h00.p;
import h00.r;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l1.q;
import l1.q2;
import l1.t;
import p40.v;
import wr.h0;
import z.f1;
import z.p1;
import z.s0;

public final class e implements u00.a {
    public final int A;

    public e(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return SettingsRoute$DebugControlsScreen._init_$_anonymous_();
            case 1:
                return SettingsRoute$DeleteAccountQuestionnaireScreen._init_$_anonymous_();
            case 2:
                return SettingsRoute$DevicesScreen._init_$_anonymous_();
            case 3:
                return SettingsRoute$DownloadManagerScreen._init_$_anonymous_();
            case 4:
                return SettingsRoute$EditDetailsScreen._init_$_anonymous_();
            case 5:
                return SettingsRoute$ManageSubscriptionScreen._init_$_anonymous_();
            case 6:
                return SettingsRoute$NotificationScreen._init_$_anonymous_();
            case 7:
                return SettingsRoute$SettingsScreen._init_$_anonymous_();
            case 8:
                return SettingsTabRoute$SettingsScreen._init_$_anonymous_();
            case 9:
                t tVar = t9.b.a;
                return null;
            case 10:
                int i = to.b.b;
                return b0.a;
            case 11:
                return AuthRootLauncher._childSerializers$_anonymous_();
            case 12:
                q2 q2Var = tp.h.a;
                return Boolean.FALSE;
            case 13:
                q2 q2Var2 = tp.h.a;
                return null;
            case 14:
                t tVar2 = u6.a.a;
                return null;
            case 15:
                return q.z(Boolean.FALSE);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                p pVarS1 = h00.q.s1(vw.e.a);
                int iP = d0.P(r.q0(pVarS1, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                Iterator it = pVarS1.iterator();
                while (true) {
                    h00.b0 b0Var = (h00.b0) it;
                    if (!b0Var.B.hasNext()) {
                        return linkedHashMap;
                    }
                    a0 a0Var = (a0) b0Var.next();
                    linkedHashMap.put((String) a0Var.b, Integer.valueOf(a0Var.a + 1));
                }
                break;
            case 17:
                q2 q2Var3 = w1.b.a;
                return w1.a.A;
            case 18:
                float f = h0.a;
                return Float.valueOf(0.0f);
            case 19:
                q2 q2Var4 = wy.g.a;
                return null;
            case 20:
                t tVar3 = x0.g.a;
                return null;
            case 21:
                return new y1.d(new LinkedHashMap());
            case 22:
                q2 q2Var5 = y1.h.a;
                return null;
            case 23:
                t tVar4 = s0.a;
                return z.b0.a;
            case 24:
                return new f1();
            case 25:
                return new p1(0);
            case 26:
                return new v("com.mchutov.quranify.insights.presentation.navigation.InsightsRoute.DebugConfiguration", zs.d.INSTANCE, new Annotation[0]);
            case 27:
                return InsightsRoute$InsightsScreen._init_$_anonymous_();
            default:
                return InsightsTabRoute$InsightsScreen._init_$_anonymous_();
        }
    }
}
