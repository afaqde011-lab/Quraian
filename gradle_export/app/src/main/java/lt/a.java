package lt;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import ht.k;
import i2.s0;
import i2.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.e1;
import l1.f1;
import l1.q;
import l60.q0;
import lu.y;
import m0.w;
import m3.f0;
import m3.g0;
import m3.i0;
import m3.j;
import m3.k0;
import m3.t0;
import m3.v;
import org.koin.core.error.DefinitionParameterException;
import ot.e;
import pm.c;
import q3.u;
import rt.f;
import rt.h;
import ta.c0;
import u00.n;
import x3.d;
import x3.l;
import x3.p;
import y3.o;

public final class a implements n {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        k kVar;
        j jVar;
        Object objA;
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                e60.a single = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it, "it");
                return new ht.b((SharedPreferences) single.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 1:
                e60.a factory = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it2, "it");
                return new mt.a((LocaleManager) factory.f(a0.a.b(LocaleManager.class), null, null));
            case 2:
                e60.a factory2 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it3, "it");
                return new h((mt.a) factory2.f(a0.a.b(mt.a.class), null, null));
            case 3:
                e60.a factory3 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it4, "it");
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                return new rt.b((k) factory3.f(b0Var2.b(k.class), null, null), (h) factory3.f(b0Var2.b(h.class), null, null));
            case 4:
                e60.a factory4 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it5, "it");
                kotlin.jvm.internal.b0 b0Var3 = a0.a;
                ht.b bVar = (ht.b) factory4.f(b0Var3.b(ht.b.class), null, null);
                e eVar = e.TAFSIR;
                return new f(bVar, (k) factory4.f(b0Var3.b(k.class), null, c0.P()), new rt.b((k) factory4.f(b0Var3.b(k.class), null, c0.P()), (h) factory4.f(b0Var3.b(h.class), null, null)), (h) factory4.f(b0Var3.b(h.class), null, null));
            case 5:
                e60.a viewModel = (e60.a) obj;
                a60.a params = (a60.a) obj2;
                m.e(viewModel, "$this$viewModel");
                m.e(params, "params");
                kotlin.jvm.internal.b0 b0Var4 = a0.a;
                Object objB = params.b(b0Var4.b(e.class));
                if (objB == null) {
                    throw new DefinitionParameterException("No value found for type '" + g60.a.a(b0Var4.b(e.class)) + '\'');
                }
                e eVar2 = (e) objB;
                int iOrdinal = eVar2.ordinal();
                if (iOrdinal == 0) {
                    kVar = (k) viewModel.f(b0Var4.b(k.class), null, null);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e eVar3 = e.TAFSIR;
                    kVar = (k) viewModel.f(b0Var4.b(k.class), null, c0.P());
                }
                return new qt.k(eVar2, kVar, (ht.b) viewModel.f(b0Var4.b(ht.b.class), null, null), (c) viewModel.f(b0Var4.b(c.class), null, null), (h) viewModel.f(b0Var4.b(h.class), null, null));
            case 6:
                e60.a single2 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it6, "it");
                Object objB2 = ((q0) single2.f(a0.a.b(q0.class), null, null)).b(kt.b.class);
                m.d(objB2, "create(...)");
                return (kt.b) objB2;
            case 7:
                ((Integer) obj2).getClass();
                y.a((l1.j) obj, q.K(1));
                return b0Var;
            case 8:
                ((Integer) obj2).getClass();
                kh.n.f((l1.j) obj, q.K(1));
                return b0Var;
            case 9:
                m0.b bVar2 = (m0.b) obj2;
                return va.a.S(new Object[]{Integer.valueOf(((f1) ((w) bVar2).d.B).h()), Float.valueOf(ab.a0.x(((e1) ((w) bVar2).d.D).h(), -0.5f, 0.5f)), Integer.valueOf(bVar2.l())});
            case 10:
                m3.h hVar = (m3.h) obj2;
                return va.a.i(new Object[]{hVar.B, g0.a(hVar.A, g0.b, (y1.b) obj)});
            case 11:
                return Integer.valueOf(((l) obj2).a);
            case 12:
                p pVar = (p) obj2;
                return va.a.i(new Float[]{Float.valueOf(pVar.a), Float.valueOf(pVar.b)});
            case 13:
                y1.b bVar3 = (y1.b) obj;
                x3.q qVar = (x3.q) obj2;
                o oVar = new o(qVar.a);
                f0 f0Var = g0.x;
                return va.a.i(new Object[]{g0.a(oVar, f0Var, bVar3), g0.a(new o(qVar.b), f0Var, bVar3)});
            case 14:
                return Integer.valueOf(((u) obj2).A);
            case 15:
                m3.n nVar = (m3.n) obj2;
                return va.a.i(new Object[]{nVar.a, g0.a(nVar.b, g0.j, (y1.b) obj)});
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return Float.valueOf(((x3.a) obj2).a);
            case 17:
                y1.b bVar4 = (y1.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(g0.a((m3.f) list.get(i2), g0.c, bVar4));
                }
                return arrayList;
            case 18:
                m3.q0 q0Var = (m3.q0) obj2;
                return va.a.i(new Integer[]{Integer.valueOf((int) (q0Var.a >> 32)), Integer.valueOf((int) (q0Var.a & 4294967295L))});
            case 19:
                y1.b bVar5 = (y1.b) obj;
                s0 s0Var = (s0) obj2;
                return va.a.i(new Object[]{g0.a(new t(s0Var.a), g0.r, bVar5), g0.a(new h2.b(s0Var.b), g0.z, bVar5), Float.valueOf(s0Var.c)});
            case 20:
                return Integer.valueOf(((x3.k) obj2).a);
            case 21:
                return Integer.valueOf(((x3.m) obj2).a);
            case 22:
                return Integer.valueOf(((d) obj2).a);
            case 23:
                return Integer.valueOf(((q3.o) obj2).a);
            case 24:
                return Integer.valueOf(((q3.p) obj2).a);
            case 25:
                o oVar2 = (o) obj2;
                return oVar2 != null ? o.a(oVar2.a, o.c) : false ? Boolean.FALSE : va.a.i(new Object[]{Float.valueOf(o.c(oVar2.a)), g0.a(new y3.p(o.b(oVar2.a)), g0.y, (y1.b) obj)});
            case 26:
                m3.m mVar = (m3.m) obj2;
                return va.a.i(new Object[]{mVar.a, g0.a(mVar.b, g0.j, (y1.b) obj)});
            case 27:
                long j = ((y3.p) obj2).a;
                if (y3.p.a(j, 8589934592L)) {
                    return 0;
                }
                if (y3.p.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 28:
                h2.b bVar6 = (h2.b) obj2;
                return bVar6 != null ? h2.b.b(bVar6.a, 9205357640488583168L) : false ? Boolean.FALSE : va.a.i(new Float[]{Float.valueOf(Float.intBitsToFloat((int) (bVar6.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar6.a & 4294967295L)))});
            default:
                y1.b bVar7 = (y1.b) obj;
                m3.f fVar = (m3.f) obj2;
                Object obj3 = fVar.a;
                if (obj3 instanceof v) {
                    jVar = j.A;
                } else if (obj3 instanceof i0) {
                    jVar = j.B;
                } else if (obj3 instanceof t0) {
                    jVar = j.C;
                } else if (obj3 instanceof m3.s0) {
                    jVar = j.D;
                } else if (obj3 instanceof m3.n) {
                    jVar = j.E;
                } else if (obj3 instanceof m3.m) {
                    jVar = j.F;
                } else {
                    if (!(obj3 instanceof k0)) {
                        throw new UnsupportedOperationException();
                    }
                    jVar = j.G;
                }
                switch (jVar.ordinal()) {
                    case 0:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = g0.a((v) obj3, g0.h, bVar7);
                        break;
                    case 1:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = g0.a((i0) obj3, g0.i, bVar7);
                        break;
                    case 2:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = g0.a((t0) obj3, g0.d, bVar7);
                        break;
                    case 3:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = g0.a((m3.s0) obj3, g0.e, bVar7);
                        break;
                    case 4:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = g0.a((m3.n) obj3, g0.f, bVar7);
                        break;
                    case 5:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = g0.a((m3.m) obj3, g0.g, bVar7);
                        break;
                    case 6:
                        m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((k0) obj3).a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return va.a.i(new Object[]{jVar, objA, Integer.valueOf(fVar.b), Integer.valueOf(fVar.c), fVar.d});
        }
    }
}
