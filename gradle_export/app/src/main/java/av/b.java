package av;

import a40.c0;
import android.content.Context;
import androidx.fragment.app.o0;
import b3.k0;
import b3.p1;
import b4.w;
import bv.h1;
import bv.i1;
import bv.j1;
import com.mchutov.quranify.deeplink.presentation.share.ShareLauncher;
import com.mchutov.quranify.player.presentation.screen.fullscreen.FullScreenEffect$CloseScreen;
import g00.b0;
import g2.x;
import g2.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import l0.r0;
import z.f0;
import z.g0;
import z.h0;
import z.l1;

public final class b extends kotlin.jvm.internal.j implements u00.n {
    public final int A;

    public b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.A = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        switch (this.A) {
            case 0:
                j1 j1Var = (j1) obj;
                k00.c<? super b0> cVar = (k00.c) obj2;
                i iVar = (i) this.receiver;
                boolean z = j1Var instanceof FullScreenEffect$CloseScreen;
                b0 b0Var = b0.a;
                if (z) {
                    iVar.dismiss();
                    return b0Var;
                }
                if (j1Var instanceof i1) {
                    if (!iVar.isAdded()) {
                        return b0Var;
                    }
                    gq.a aVar = (gq.a) iVar.E.getValue();
                    o0 o0VarRequireActivity = iVar.requireActivity();
                    kotlin.jvm.internal.m.d(o0VarRequireActivity, "requireActivity(...)");
                    ((hq.b) aVar).d(o0VarRequireActivity);
                    return b0Var;
                }
                if (!(j1Var instanceof h1)) {
                    iVar.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                if (!iVar.isAdded()) {
                    return b0Var;
                }
                ShareLauncher shareLauncher = ShareLauncher.INSTANCE;
                Context contextRequireContext = iVar.requireContext();
                kotlin.jvm.internal.m.d(contextRequireContext, "requireContext(...)");
                Object objShare = shareLauncher.share(contextRequireContext, ((h1) j1Var).a, cVar);
                return objShare == l00.a.A ? objShare : b0Var;
            case 1:
                y yVar = (x) obj;
                y yVar2 = (x) obj2;
                w wVar = (w) this.receiver;
                if (((b2.q) wVar).N && (zA = yVar2.a()) != yVar.a()) {
                    r0 r0Var = null;
                    if (zA) {
                        z zVar = new z();
                        b3.m.t(wVar, new k0(zVar, wVar, 2));
                        r0 r0Var2 = (r0) zVar.A;
                        if (r0Var2 != null) {
                            r0Var2.a();
                            r0Var = r0Var2;
                        }
                        wVar.R = r0Var;
                    } else {
                        r0 r0Var3 = wVar.R;
                        if (r0Var3 != null) {
                            r0Var3.b();
                        }
                        wVar.R = null;
                    }
                }
                return b0.a;
            case 2:
                return c7.i.t((ca.t) this.receiver, (u00.k) obj, (k00.c) obj2);
            case 3:
                return c7.i.t((ca.t) this.receiver, (u00.k) obj, (k00.c) obj2);
            case 4:
                e30.w p0 = (e30.w) obj;
                e30.w p1 = (e30.w) obj2;
                kotlin.jvm.internal.m.e(p0, "p0");
                kotlin.jvm.internal.m.e(p1, "p1");
                ((f30.t) this.receiver).getClass();
                f30.k.b.getClass();
                f30.l lVar = f30.j.b;
                return Boolean.valueOf(lVar.b(p0, p1) && !lVar.b(p1, p0));
            case 5:
                e30.w p2 = (e30.w) obj;
                e30.w p3 = (e30.w) obj2;
                kotlin.jvm.internal.m.e(p2, "p0");
                kotlin.jvm.internal.m.e(p3, "p1");
                return Boolean.valueOf(((f30.l) this.receiver).a(p2, p3));
            case 6:
                ((j5.a) this.receiver).getClass();
                return j5.a.a((String) obj, (String) obj2);
            case 7:
                ((j5.a) this.receiver).getClass();
                return j5.a.a((String) obj, (String) obj2);
            case 8:
                n40.e p4 = (n40.e) obj;
                int iIntValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.e(p4, "p0");
                r40.i iVar2 = (r40.i) this.receiver;
                iVar2.getClass();
                boolean z2 = !p4.i(iIntValue) && p4.h(iIntValue).c();
                iVar2.b = z2;
                return Boolean.valueOf(z2);
            default:
                y yVar3 = (x) obj;
                y yVar4 = (x) obj2;
                g0 g0Var = (g0) this.receiver;
                if (((b2.q) g0Var).N && (zA2 = yVar4.a()) != yVar3.a()) {
                    u00.k kVar = g0Var.R;
                    if (kVar != null) {
                        kVar.invoke(Boolean.valueOf(zA2));
                    }
                    l1 l1Var = h0.O;
                    if (zA2) {
                        c0.y(g0Var.p1(), null, null, new l6.d(g0Var, (k00.c) null, 26), 3);
                        z zVar2 = new z();
                        b3.m.t(g0Var, new f0(0, zVar2, g0Var));
                        r0 r0Var4 = (r0) zVar2.A;
                        if (r0Var4 != null) {
                            r0Var4.a();
                        } else {
                            r0Var4 = null;
                        }
                        g0Var.T = r0Var4;
                        p1 p1Var = g0Var.U;
                        if (p1Var != null && p1Var.z1().N && ((b2.q) g0Var).N) {
                            b3.m.j(g0Var, l1Var);
                        }
                    } else {
                        r0 r0Var5 = g0Var.T;
                        if (r0Var5 != null) {
                            r0Var5.b();
                        }
                        g0Var.T = null;
                        if (((b2.q) g0Var).N) {
                            b3.m.j(g0Var, l1Var);
                        }
                    }
                    b3.m.o(g0Var);
                    f0.i iVar3 = g0Var.Q;
                    if (iVar3 != null) {
                        if (zA2) {
                            f0.d dVar = g0Var.S;
                            if (dVar != null) {
                                g0Var.E1(iVar3, new f0.e(dVar));
                                g0Var.S = null;
                            }
                            f0.d dVar2 = new f0.d();
                            g0Var.E1(iVar3, dVar2);
                            g0Var.S = dVar2;
                        } else {
                            f0.d dVar3 = g0Var.S;
                            if (dVar3 != null) {
                                g0Var.E1(iVar3, new f0.e(dVar3));
                                g0Var.S = null;
                            }
                        }
                    }
                }
                return b0.a;
        }
    }
}
