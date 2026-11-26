package h9;

import a8.l0;
import androidx.media3.common.x0;
import b3.i2;
import g1.c3;
import java.util.List;

public final class d0 {

    public final int f6686a;

    public final List f6687b;

    public final l0[] f6688c;

    public final i2 f6689d;

    public d0(int i10, List list) {
        this.f6686a = i10;
        switch (i10) {
            case 1:
                this.f6687b = list;
                this.f6688c = new l0[list.size()];
                i2 i2Var = new i2(new ab.r(this, 17));
                this.f6689d = i2Var;
                i2Var.w(3);
                break;
            default:
                this.f6687b = list;
                this.f6688c = new l0[list.size()];
                this.f6689d = new i2(new ab.r(this, 16));
                break;
        }
    }

    public void a(long j9, e7.u uVar) {
        if (uVar.a() < 9) {
            return;
        }
        int iM = uVar.m();
        int iM2 = uVar.m();
        int iA = uVar.A();
        if (iM == 434 && iM2 == 1195456820 && iA == 3) {
            this.f6689d.a(j9, uVar);
        }
    }

    public final void b(a8.s sVar, c3 c3Var) {
        switch (this.f6686a) {
            case 0:
                int i10 = 0;
                while (true) {
                    l0[] l0VarArr = this.f6688c;
                    if (i10 < l0VarArr.length) {
                        c3Var.a();
                        c3Var.b();
                        l0 l0VarW = sVar.w(c3Var.C, 3);
                        androidx.media3.common.t tVar = (androidx.media3.common.t) this.f6687b.get(i10);
                        String str = tVar.f1594n;
                        ta.c0.t("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = tVar.f1583a;
                        if (str2 == null) {
                            c3Var.b();
                            str2 = (String) c3Var.E;
                        }
                        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                        sVar2.f1491a = str2;
                        sVar2.l = x0.n("video/mp2t");
                        sVar2.m = x0.n(str);
                        sVar2.f1495e = tVar.f1587e;
                        sVar2.f1494d = tVar.f1586d;
                        sVar2.J = tVar.K;
                        sVar2.f1504p = tVar.f1597q;
                        oi.k.w(sVar2, l0VarW);
                        l0VarArr[i10] = l0VarW;
                        i10++;
                    }
                    break;
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    l0[] l0VarArr2 = this.f6688c;
                    if (i11 < l0VarArr2.length) {
                        c3Var.a();
                        c3Var.b();
                        l0 l0VarW2 = sVar.w(c3Var.C, 3);
                        androidx.media3.common.t tVar2 = (androidx.media3.common.t) this.f6687b.get(i11);
                        String str3 = tVar2.f1594n;
                        ta.c0.t("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                        c3Var.b();
                        sVar3.f1491a = (String) c3Var.E;
                        sVar3.l = x0.n("video/mp2t");
                        sVar3.m = x0.n(str3);
                        sVar3.f1495e = tVar2.f1587e;
                        sVar3.f1494d = tVar2.f1586d;
                        sVar3.J = tVar2.K;
                        sVar3.f1504p = tVar2.f1597q;
                        oi.k.w(sVar3, l0VarW2);
                        l0VarArr2[i11] = l0VarW2;
                        i11++;
                    }
                    break;
                }
                break;
        }
    }
}
