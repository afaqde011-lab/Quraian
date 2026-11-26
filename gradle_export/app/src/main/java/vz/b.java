package vz;

import a40.z;
import android.content.Context;
import c3.g1;
import com.mchutov.quranify.settings.presentation.screen.debug.DebugControlsEffect$CloseScreen;
import g00.b0;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import l6.v;
import m00.i;
import ri.t1;
import ta.c0;
import u00.n;
import xy.k;
import xy.l;
import xy.m;

public final class b extends i implements n {
    public final int A = 0;
    public Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public b(String str, String str2, String str3, c cVar, String str4, zz.b bVar, k00.c cVar2) {
        super(2, cVar2);
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.F = cVar;
        this.E = str4;
        this.G = bVar;
    }

    public b(u00.a aVar, ol.b bVar, z zVar, g1 g1Var, Context context, k00.c cVar) {
        super(2, cVar);
        this.C = aVar;
        this.D = bVar;
        this.E = zVar;
        this.F = g1Var;
        this.G = context;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b((String) this.B, (String) this.C, (String) this.D, (c) this.F, (String) this.E, (zz.b) this.G, cVar);
            default:
                b bVar = new b((u00.a) this.C, (ol.b) this.D, (z) this.E, (g1) this.F, (Context) this.G, cVar);
                bVar.B = obj;
                return bVar;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((b) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                b bVar = (b) create((m) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                bVar.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        switch (i) {
            case 0:
                String str = (String) obj4;
                c cVar = (c) obj3;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                try {
                    String str2 = (String) this.B;
                    if (str2 != null) {
                        c.a(cVar, str2, cVar.d(str));
                    }
                    String str3 = (String) obj6;
                    if (str3 != null) {
                        c.a(cVar, str3, cVar.e(str, (zz.b) obj2));
                    }
                    String str4 = (String) obj5;
                    if (str4 != null) {
                        c.a(cVar, str4, c.b(cVar, str));
                        break;
                    }
                    return new g00.n(b0Var);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return new g00.n(t1.s(th));
                }
            default:
                m mVar = (m) this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                u00.a aVar3 = (u00.a) obj6;
                ol.b bVar = (ol.b) obj5;
                z zVar = (z) obj4;
                g1 g1Var = (g1) obj3;
                Context context = (Context) obj2;
                if (mVar instanceof DebugControlsEffect$CloseScreen) {
                    aVar3.invoke();
                } else if (mVar instanceof l) {
                    ol.b.a(bVar, "Restarting application ...", null, 6);
                } else {
                    if (!(mVar instanceof k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0.M(zVar, (k00.i) null, (n) null, (u00.k) null, new v(g1Var, ((k) mVar).a, bVar, context, (k00.c) null), 31);
                }
                return b0Var;
        }
    }
}
