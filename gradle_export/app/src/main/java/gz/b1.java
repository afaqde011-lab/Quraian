package gz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import bt.a2;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ChangePasswordScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DebugControlsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DevicesScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DownloadManagerScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$EditDetailsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ManageSubscriptionScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$NotificationScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenChangePasswordScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenDebugControlsScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenDevicesScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenDownloadManagerScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenEditDetailsScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenManageSubscriptionScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenNotificationScreen;
import com.revenuecat.purchases.PurchasesException;
import d40.p1;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import l1.v1;
import l1.x1;
import ri.t1;

public final class b1 extends m00.i implements u00.n {
    public final int A = 1;
    public int B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Context F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public Object L;

    public b1(a2 a2Var, sy.c cVar, l1.z0 z0Var, u00.k kVar, Context context, xo.a aVar, ol.b bVar, xo.e eVar, vp.x xVar, ah.e eVar2, k00.c cVar2) {
        super(2, cVar2);
        this.L = a2Var;
        this.C = cVar;
        this.D = z0Var;
        this.E = kVar;
        this.F = context;
        this.G = aVar;
        this.H = bVar;
        this.I = eVar;
        this.J = xVar;
        this.K = eVar2;
    }

    public b1(d6.r rVar, x1 x1Var, kotlin.jvm.internal.y yVar, p1 p1Var, Context context, d6.x1 x1Var2, l6.y yVar2, l6.x xVar, a40.z zVar, k00.c cVar) {
        super(2, cVar);
        this.C = rVar;
        this.D = x1Var;
        this.E = yVar;
        this.G = p1Var;
        this.F = context;
        this.H = x1Var2;
        this.I = yVar2;
        this.J = xVar;
        this.K = zVar;
    }

    public b1(sy.c cVar, l1.z0 z0Var, u00.k kVar, Context context, xo.a aVar, ol.b bVar, xo.e eVar, vp.x xVar, ah.e eVar2, k00.c cVar2) {
        super(2, cVar2);
        this.C = cVar;
        this.D = z0Var;
        this.E = kVar;
        this.F = context;
        this.G = aVar;
        this.H = bVar;
        this.I = eVar;
        this.J = xVar;
        this.K = eVar2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                b1 b1Var = new b1((sy.c) this.C, (l1.z0) this.D, (u00.k) this.E, this.F, (xo.a) this.G, (ol.b) this.H, (xo.e) this.I, (vp.x) this.J, (ah.e) this.K, cVar);
                b1Var.L = obj;
                return b1Var;
            case 1:
                return new b1((a2) this.L, (sy.c) this.C, (l1.z0) this.D, (u00.k) this.E, this.F, (xo.a) this.G, (ol.b) this.H, (xo.e) this.I, (vp.x) this.J, (ah.e) this.K, cVar);
            default:
                b1 b1Var2 = new b1((d6.r) this.C, (x1) this.D, (kotlin.jvm.internal.y) this.E, (p1) this.G, this.F, (d6.x1) this.H, (l6.y) this.I, (l6.x) this.J, (a40.z) this.K, cVar);
                b1Var2.L = obj;
                return b1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((b1) create((v0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((b1) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((b1) create((v1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws IOException, PurchasesException {
        Object objW;
        Object objC;
        Object objA;
        ep.a aVar;
        ep.m mVar;
        Object objB;
        switch (this.A) {
            case 0:
                ol.b bVar = (ol.b) this.H;
                l1.z0 z0Var = (l1.z0) this.D;
                u00.k kVar = (u00.k) this.E;
                sy.c cVar = (sy.c) this.C;
                v0 v0Var = (v0) this.L;
                l00.a aVar2 = l00.a.A;
                int i = this.B;
                k kVar2 = k.a;
                g00.b0 b0Var = g00.b0.a;
                k.k context = this.F;
                try {
                    try {
                        if (i == 0) {
                            t1.O(obj);
                            if (v0Var instanceof o0) {
                                cVar.getClass();
                                Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
                                intent.setData(Uri.fromParts("package", "com.mchutov.Quranify", null));
                                intent.setFlags(268435456);
                                cVar.a.startActivity(intent);
                            } else if (v0Var instanceof SettingsEffect$OpenNotificationScreen) {
                                cVar.b.add(SettingsRoute$NotificationScreen.INSTANCE);
                            } else if (v0Var instanceof SettingsEffect$OpenDownloadManagerScreen) {
                                cVar.b.add(SettingsRoute$DownloadManagerScreen.INSTANCE);
                            } else if (v0Var instanceof SettingsEffect$OpenDebugControlsScreen) {
                                cVar.b.add(SettingsRoute$DebugControlsScreen.INSTANCE);
                            } else if (v0Var instanceof SettingsEffect$OpenEditDetailsScreen) {
                                if (!((Boolean) z0Var.getValue()).booleanValue()) {
                                    kVar.invoke(p.a);
                                    cVar.b.add(SettingsRoute$EditDetailsScreen.INSTANCE);
                                }
                            } else if (v0Var instanceof SettingsEffect$OpenManageSubscriptionScreen) {
                                cVar.b.add(SettingsRoute$ManageSubscriptionScreen.INSTANCE);
                            } else if (v0Var instanceof SettingsEffect$OpenDevicesScreen) {
                                cVar.b.add(SettingsRoute$DevicesScreen.INSTANCE);
                            } else if (v0Var instanceof SettingsEffect$OpenChangePasswordScreen) {
                                if (!((Boolean) z0Var.getValue()).booleanValue()) {
                                    kVar.invoke(n.a);
                                    cVar.b.add(SettingsRoute$ChangePasswordScreen.INSTANCE);
                                }
                            } else if (v0Var instanceof t0) {
                                k.k kVar3 = context instanceof MainActivity ? (MainActivity) context : null;
                                if (kVar3 != null) {
                                    xo.a aVar3 = (xo.a) this.G;
                                    this.L = null;
                                    this.B = 1;
                                    objA = aVar3.a(kVar3, this);
                                    if (objA == aVar2) {
                                        return aVar2;
                                    }
                                    aVar = (ep.a) objA;
                                    if (aVar != null) {
                                        kVar.invoke(new a(aVar));
                                    } else {
                                        kVar.invoke(kVar2);
                                    }
                                }
                            } else if (v0Var instanceof u0) {
                                k.k kVar4 = context instanceof MainActivity ? (MainActivity) context : null;
                                if (kVar4 != null) {
                                    xo.e eVar = (xo.e) this.I;
                                    this.L = null;
                                    this.B = 2;
                                    objC = eVar.c(kVar4, this);
                                    if (objC == aVar2) {
                                        return aVar2;
                                    }
                                    mVar = (ep.m) objC;
                                    if (mVar != null) {
                                        kVar.invoke(new w(mVar));
                                    } else {
                                        kVar.invoke(kVar2);
                                    }
                                }
                            } else if (v0Var instanceof s0) {
                                ol.b.a(bVar, ((s0) v0Var).a, null, 6);
                            } else if (v0Var instanceof p0) {
                                String str = ((p0) v0Var).a;
                                cVar.getClass();
                                kotlin.jvm.internal.m.e(context, "context");
                                context.startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(str)), null));
                            } else if (v0Var instanceof q0) {
                                q0 q0Var = (q0) v0Var;
                                cVar.d(context, q0Var.a, q0Var.b);
                            } else if (v0Var instanceof r0) {
                                cVar.getClass();
                                sy.c.e(context);
                            } else {
                                if (!(v0Var instanceof n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                MainActivity mainActivity = context instanceof MainActivity ? (MainActivity) context : null;
                                if (mainActivity != null) {
                                    vp.x xVar = (vp.x) this.J;
                                    String str2 = ((n0) v0Var).a;
                                    this.L = v0Var;
                                    this.B = 3;
                                    objW = xVar.w(mainActivity, str2, this);
                                    if (objW == aVar2) {
                                        return aVar2;
                                    }
                                    kVar.invoke(new c0(((n0) v0Var).b, !(objW instanceof g00.m)));
                                }
                            }
                        } else if (i == 1) {
                            t1.O(obj);
                            objA = obj;
                            aVar = (ep.a) objA;
                            if (aVar != null) {
                                kVar.invoke(new a(aVar));
                            } else {
                                kVar.invoke(kVar2);
                            }
                        } else if (i == 2) {
                            t1.O(obj);
                            objC = obj;
                            mVar = (ep.m) objC;
                            if (mVar != null) {
                                kVar.invoke(new w(mVar));
                            } else {
                                kVar.invoke(kVar2);
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t1.O(obj);
                            objW = ((g00.n) obj).A;
                            kVar.invoke(new c0(((n0) v0Var).b, !(objW instanceof g00.m)));
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                        String string = context.getString(2131886174);
                        kotlin.jvm.internal.m.d(string, "getString(...)");
                        ol.b.a(bVar, string, ol.c.B, 4);
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                    String string2 = context.getString(2131886156);
                    kotlin.jvm.internal.m.d(string2, "getString(...)");
                    ol.b.a(bVar, string2, ol.c.B, 4);
                }
                return b0Var;
            case 1:
                l00.a aVar4 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    a2 a2Var = (a2) this.L;
                    b1 b1Var = new b1((sy.c) this.C, (l1.z0) this.D, (u00.k) this.E, this.F, (xo.a) this.G, (ol.b) this.H, (xo.e) this.I, (vp.x) this.J, (ah.e) this.K, (k00.c) null);
                    this.B = 1;
                    if (d40.o.i(a2Var, b1Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.E;
                x1 x1Var = (x1) this.D;
                p1 p1Var = (p1) this.G;
                l00.a aVar5 = l00.a.A;
                int i3 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        t1.O(obj);
                        objB = obj;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    ((l6.y) this.I).b(((l6.x) this.J).a);
                    yVar.A = x1Var.a;
                    return b0Var2;
                }
                t1.O(obj);
                int iOrdinal = ((v1) this.L).ordinal();
                if (iOrdinal == 0) {
                    a40.c0.i((a40.z) this.K, null);
                } else if (iOrdinal == 4) {
                    if (x1Var.a > yVar.A || !((Boolean) p1Var.getValue()).booleanValue()) {
                        d6.r rVar = (d6.r) this.C;
                        b6.j jVarA = ((d6.x1) this.H).a();
                        this.B = 1;
                        rVar.getClass();
                        objB = d6.r.b(rVar, this.F, jVarA, this);
                        if (objB == aVar5) {
                            return aVar5;
                        }
                    }
                    yVar.A = x1Var.a;
                }
                return b0Var2;
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                if (!((Boolean) p1Var.getValue()).booleanValue() && zBooleanValue) {
                    Boolean bool = Boolean.TRUE;
                    this.B = 2;
                    p1Var.emit(bool, this);
                    if (b0Var2 == aVar5) {
                        return aVar5;
                    }
                    ((l6.y) this.I).b(((l6.x) this.J).a);
                }
                yVar.A = x1Var.a;
                return b0Var2;
        }
    }
}
