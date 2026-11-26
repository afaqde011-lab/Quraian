package q50;

import com.mchutov.quranify.home.presentation.navigation.HomeRoute$HomeScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeTabRoute$HomeRootScreen;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationBenefitsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ChangePasswordScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import i2.b0;
import i2.t;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import l1.q2;
import ok.e;
import p40.v;
import rr.f;
import rr.i;
import sm.k0;

public final class b implements u00.a {
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("should not be used in favor of getKoin()");
            case 1:
                s50.a aVar = u50.a.b;
                if (aVar != null) {
                    return new a(aVar.c.d, new b(3));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 2:
                s50.a aVar2 = u50.a.b;
                if (aVar2 != null) {
                    return new a(aVar2, new b(4));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 3:
                s50.a aVar3 = u50.a.b;
                if (aVar3 != null) {
                    return aVar3.c.d;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 4:
                s50.a aVar4 = u50.a.b;
                if (aVar4 != null) {
                    return aVar4;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 5:
                return new HashSet();
            case 6:
                return SearchReciterLauncher._childSerializers$_anonymous_();
            case 7:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 8:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay.");
            case 9:
                return new fm.a();
            case 10:
                return new fm.a();
            case 11:
                return HomeRoute$HomeScreen._init_$_anonymous_();
            case 12:
                return new v("com.mchutov.quranify.home.presentation.navigation.HomeRoute.ListeningTimer", f.INSTANCE, new Annotation[0]);
            case 13:
                return new v("com.mchutov.quranify.home.presentation.navigation.HomeRoute.StreakDetail", i.INSTANCE, new Annotation[0]);
            case 14:
                return HomeTabRoute$HomeRootScreen._init_$_anonymous_();
            case 15:
                return p0.f.a(32);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return p0.f.a(32);
            case 17:
                return p0.f.a(32);
            case 18:
                return mk.a.g;
            case 19:
                return new nk.f(16, 0.0f, 26, t.b(0.25f, t.b));
            case 20:
                return e.b;
            case 21:
                return new nk.f(4.0f, 0.0f, 26, t.b(0.05f, t.b));
            case 22:
                return e.b;
            case 23:
                return new nk.f(4.0f, 0.0f, 26, t.b(0.05f, t.b));
            case 24:
                return b0.b;
            case 25:
                q2 q2Var = k0.a;
                return Float.valueOf(1.0f);
            case 26:
                return new b(25);
            case 27:
                return SettingsRoute$CancellationBenefitsScreen._init_$_anonymous_();
            case 28:
                return SettingsRoute$CancellationQuestionnaireScreen._init_$_anonymous_();
            default:
                return SettingsRoute$ChangePasswordScreen._init_$_anonymous_();
        }
    }
}
