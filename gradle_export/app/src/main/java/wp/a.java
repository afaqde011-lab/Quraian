package wp;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import h00.q;
import i2.c0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import u00.k;
import v50.c;
import vp.x;
import w50.e;
import x.l;
import x.n;
import x.r0;
import x.y0;
import y3.f;
import y3.g;
import y3.j;
import z1.u;

public final class a implements k {
    public final int A;

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                y50.a module = (y50.a) obj;
                m.e(module, "$this$module");
                module.a(new e(new v50.a(c60.a.e, a0.a.b(x.class), null, new sw.a(16), c.A)));
                return b0.a;
            case 1:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 2:
                lo.b it = (lo.b) obj;
                m.e(it, "it");
                return Integer.valueOf(it.a);
            case 3:
                c0 graphicsLayer = (c0) obj;
                m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.L0(false);
                return b0.a;
            case 4:
                c0 graphicsLayer2 = (c0) obj;
                m.e(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.s0(0.8f);
                return b0.a;
            case 5:
                qr.b it2 = (qr.b) obj;
                m.e(it2, "it");
                return it2;
            case 6:
                u30.b it3 = (u30.b) obj;
                m.e(it3, "it");
                PlayerItem playerItem = (PlayerItem) q.N0(it3);
                return String.valueOf(playerItem != null ? Long.valueOf(playerItem.getSurahId()) : null);
            case 7:
                dw.a it4 = (dw.a) obj;
                m.e(it4, "it");
                return Integer.valueOf(it4.a);
            case 8:
                bx.c it5 = (bx.c) obj;
                m.e(it5, "it");
                return Integer.valueOf(it5.a);
            case 9:
                return b0.a;
            case 10:
                y0 y0Var = (y0) obj;
                long j = y0Var.G;
                u uVar = y0Var.I;
                if (uVar != null) {
                    uVar.d(y0Var, x.c.j, y0Var.H);
                }
                long j2 = y0Var.G;
                if (j != j2) {
                    r0 r0Var = y0Var.P;
                    if (r0Var != null) {
                        if (r0Var.a > j2) {
                            y0Var.b1();
                        } else {
                            r0Var.g = j2;
                            if (r0Var.b == null) {
                                r0Var.h = w00.a.G((1.0d - ((double) r0Var.e.a(0))) * y0Var.G);
                            }
                        }
                    } else if (j2 != 0) {
                        y0Var.e1();
                    }
                }
                return b0.a;
            case 11:
                return new x.k(((Float) obj).floatValue());
            case 12:
                return new x.k(((Integer) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((x.k) obj).a);
            case 14:
                return new x.k(((f) obj).A);
            case 15:
                return new f(((x.k) obj).a);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                g gVar = (g) obj;
                return new l(g.a(gVar.a), g.b(gVar.a));
            case 17:
                l lVar = (l) obj;
                return new g((((long) Float.floatToRawIntBits(lVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(lVar.a)) << 32));
            case 18:
                h2.e eVar = (h2.e) obj;
                return new l(Float.intBitsToFloat((int) (eVar.a >> 32)), Float.intBitsToFloat((int) (eVar.a & 4294967295L)));
            case 19:
                l lVar2 = (l) obj;
                return new h2.e((((long) Float.floatToRawIntBits(lVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(lVar2.a)) << 32));
            case 20:
                h2.b bVar = (h2.b) obj;
                return new l(Float.intBitsToFloat((int) (bVar.a >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L)));
            case 21:
                l lVar3 = (l) obj;
                return new h2.b((((long) Float.floatToRawIntBits(lVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(lVar3.a)) << 32));
            case 22:
                long j3 = ((j) obj).a;
                return new l((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 23:
                l lVar4 = (l) obj;
                return new j((((long) Math.round(lVar4.b)) & 4294967295L) | (((long) Math.round(lVar4.a)) << 32));
            case 24:
                long j4 = ((y3.l) obj).a;
                return new l((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 25:
                l lVar5 = (l) obj;
                int iRound = Math.round(lVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(lVar5.b);
                return new y3.l((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 26:
                h2.c cVar = (h2.c) obj;
                return new n(cVar.a, cVar.b, cVar.c, cVar.d);
            case 27:
                n nVar = (n) obj;
                return new h2.c(nVar.a, nVar.b, nVar.c, nVar.d);
            case 28:
                return Float.valueOf(((x.k) obj).a);
            default:
                xa.c it6 = (xa.c) obj;
                m.e(it6, "it");
                return it6;
        }
    }
}
