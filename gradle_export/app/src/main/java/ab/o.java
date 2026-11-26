package ab;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.media3.common.f1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import bt.a1;
import bt.j2;
import bv.e3;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import g1.k8;
import gz.m1;
import q0.n1;
import ri.t1;

public final class o extends m00.i implements u00.n {
    public final int A;
    public boolean B;
    public final Object C;

    public o(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
    }

    public o(Object obj, boolean z10, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.B = z10;
    }

    public o(boolean z10, Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.B = z10;
        this.C = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                o oVar = new o((Context) this.C, cVar, 0);
                oVar.B = ((Boolean) obj).booleanValue();
                return oVar;
            case 1:
                return new o((av.i) this.C, this.B, cVar, 1);
            case 2:
                o oVar2 = new o((b00.c) this.C, cVar, 2);
                oVar2.B = ((Boolean) obj).booleanValue();
                return oVar2;
            case 3:
                o oVar3 = new o((j2) this.C, cVar, 3);
                oVar3.B = ((Boolean) obj).booleanValue();
                return oVar3;
            case 4:
                o oVar4 = new o((e3) this.C, cVar, 4);
                oVar4.B = ((Boolean) obj).booleanValue();
                return oVar4;
            case 5:
                return new o(this.B, (m1) this.C, cVar, 5);
            case 6:
                o oVar5 = new o((k8) this.C, cVar, 6);
                oVar5.B = ((Boolean) obj).booleanValue();
                return oVar5;
            case 7:
                return new o(this.B, (n1) this.C, cVar, 7);
            default:
                return new o((uu.w) this.C, this.B, cVar, 8);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                o oVar = (o) create(bool, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                oVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                o oVar2 = (o) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                oVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                Object obj3 = (Boolean) obj;
                obj3.getClass();
                o oVar3 = (o) create(obj3, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                oVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                o oVar4 = (o) create(bool2, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                oVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                o oVar5 = (o) create(bool3, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                oVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                o oVar6 = (o) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                oVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                o oVar7 = (o) create(bool4, (k00.c) obj2);
                g00.b0 b0Var7 = g00.b0.a;
                oVar7.invokeSuspend(b0Var7);
                return b0Var7;
            case 7:
                o oVar8 = (o) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var8 = g00.b0.a;
                oVar8.invokeSuspend(b0Var8);
                return b0Var8;
            default:
                o oVar9 = (o) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var9 = g00.b0.a;
                oVar9.invokeSuspend(b0Var9);
                return b0Var9;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Window window;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.C;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                ib.h.a((Context) obj2, RescheduleReceiver.class, this.B);
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                boolean z10 = this.B;
                Dialog dialog = ((av.i) obj2).getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null) {
                    a.a.d0(window, z10);
                }
                break;
            case 2:
                boolean z11 = this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                f1 f1Var = (ExoPlayer) ((b00.c) obj2).g.getValue();
                if (f1Var != null) {
                    i7.z zVar = (i7.z) f1Var;
                    zVar.A();
                    if (zVar.f7489l0) {
                        f1Var = null;
                    }
                    if (f1Var != null) {
                        if (!z11) {
                            ((androidx.media3.common.f) f1Var).pause();
                        } else {
                            ((androidx.media3.common.f) f1Var).play();
                        }
                    }
                }
                break;
            case 3:
                j2 j2Var = (j2) obj2;
                wo.c0 c0Var = j2Var.l;
                boolean z12 = this.B;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                if (z12) {
                    c0Var.a.setAuthBannerDismissed(false);
                }
                j2Var.i(a1.a((a1) ((vm.a) j2Var).c.d.getValue(), (ys.c) null, false, false, (bx.c) null, false, false, (z12 || c0Var.a.isAuthBannerDismissed()) ? false : true, false, (AuthRootLauncher) null, (ys.b) null, (ys.f) null, (u30.b) null, (ys.m) null, (ys.a) null, (mr.g) null, 0, (u30.b) null, false, false, false, false, false, false, 16777023));
                break;
            case 4:
                boolean z13 = this.B;
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                ht.b bVar = ((e3) obj2).g;
                if (!z13) {
                    bVar.f("playerNew.showTafsirInLyrics", false);
                    boolean zC = bVar.c("playerNew.showQuranInLyrics", true);
                    boolean zC2 = bVar.c("playerNew.showTafsirInLyrics", false);
                    if (!zC && !zC2) {
                        bVar.f("playerNew.showQuranInLyrics", true);
                    }
                }
                bVar.a();
                break;
            case 5:
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                if (this.B) {
                    ((m1) obj2).l(gz.f0.a);
                }
                break;
            case 6:
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                if (!this.B) {
                    ((k8) obj2).a();
                }
                break;
            case 7:
                l00.a aVar8 = l00.a.A;
                t1.O(obj);
                if (!this.B) {
                    ((n1) obj2).f12667b.Z0(-1);
                }
                break;
            default:
                l00.a aVar9 = l00.a.A;
                t1.O(obj);
                uu.w.b((uu.w) obj2, this.B);
                break;
        }
        return b0Var;
    }
}
