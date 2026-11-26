package d6;

import android.R;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.Map;

public abstract class o1 {

    public static final Object f4679a = h00.d0.R(new g00.k[]{new g00.k(s1.D, 2131558971), new g00.k(s1.E, 2131558906), new g00.k(s1.F, 2131558767), new g00.k(s1.G, 2131558768), new g00.k(s1.H, 2131558755), new g00.k(s1.R, 2131558947), new g00.k(s1.S, 2131558948), new g00.k(s1.I, 2131558809), new g00.k(s1.T, 2131558821), new g00.k(s1.W, 2131558825), new g00.k(s1.U, 2131558869), new g00.k(s1.X, 2131558873), new g00.k(s1.V, 2131558845), new g00.k(s1.Y, 2131558849), new g00.k(s1.J, 2131558894), new g00.k(s1.K, 2131558794), new g00.k(s1.L, 2131559019), new g00.k(s1.M, 2131559043), new g00.k(s1.N, 2131559031), new g00.k(s1.O, 2131559007), new g00.k(s1.P, 2131558995), new g00.k(s1.Q, 2131558983), new g00.k(s1.Z, 2131558918), new g00.k(s1.f4695a0, 2131558919)});

    public static final int f4680b;

    static {
        k0.f4664f.size();
        f4680b = k0.f4666h;
    }

    public static final w1 a(i2 i2Var, b6.m mVar, int i10) {
        int i11 = k0.f4666h;
        if (i10 >= i11) {
            throw new IllegalArgumentException(w.c.h(i11, i10, "Index of the root view cannot be more than ", ", currently ").toString());
        }
        p1 p1Var = p1.A;
        RemoteViews remoteViews = new RemoteViews(i2Var.f4640a.getPackageName(), k0.f4665g + i10);
        j6.s sVar = (j6.s) mVar.a(null, n1.B);
        if (sVar != null) {
            w.f(remoteViews, sVar, 2131362974);
        }
        j6.m mVar2 = (j6.m) mVar.a(null, n1.C);
        if (mVar2 != null) {
            w.e(remoteViews, mVar2, 2131362974);
        }
        remoteViews.removeAllViews(2131362974);
        return new w1(remoteViews, new j1(2131362974, 2));
    }

    public static final j1 b(RemoteViews remoteViews, i2 i2Var, s1 s1Var, int i10, b6.m mVar, j6.a aVar, j6.b bVar) {
        int iIntValue;
        if (i10 > 10) {
            Log.e("GlanceAppWidget", "Truncated " + s1Var + " container from " + i10 + " to 10 elements", new IllegalArgumentException(s1Var + " container cannot have more than 10 elements"));
        }
        int i11 = i10 <= 10 ? i10 : 10;
        Integer numE = e(s1Var, mVar);
        if (numE != null) {
            iIntValue = numE.intValue();
        } else {
            y yVar = (y) k0.f4659a.get(new z(s1Var, i11, aVar, bVar));
            Integer numValueOf = yVar != null ? Integer.valueOf(yVar.f4715a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + s1Var + " with " + i10 + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) k0.f4660b.get(s1Var);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + s1Var);
        }
        int i12 = d(remoteViews, i2Var, iIntValue, mVar).f4655a;
        j1 j1Var = new j1(i12, -1, map);
        remoteViews.removeAllViews(i12);
        return j1Var;
    }

    public static final j1 c(RemoteViews remoteViews, i2 i2Var, s1 s1Var, b6.m mVar) {
        Integer numE = e(s1Var, mVar);
        if (numE != null || (numE = (Integer) f4679a.get(s1Var)) != null) {
            return d(remoteViews, i2Var, numE.intValue(), mVar);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + s1Var);
    }

    public static final j1 d(RemoteViews remoteViews, i2 i2Var, int i10, b6.m mVar) {
        int iIntValue;
        int i11 = i2Var.f4644e;
        Integer numValueOf = null;
        if (!mVar.b(new bw.b(19))) {
            if (i2Var.f4648i.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(R.id.background);
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            int iIncrementAndGet = i2Var.f4646g.incrementAndGet();
            if (iIncrementAndGet >= k0.f4668j) {
                throw new IllegalStateException("There are too many views");
            }
            iIntValue = iIncrementAndGet + k0.f4667i;
        }
        remoteViews.addStableView(i2Var.f4647h.f4655a, new RemoteViews(i2Var.f4640a.getPackageName(), i10, iIntValue), i11);
        return new j1(iIntValue, 6);
    }

    public static final Integer e(s1 s1Var, b6.m mVar) {
        a aVar = (a) mVar.a(null, n1.F);
        j6.s sVar = (j6.s) mVar.a(null, n1.G);
        o6.c cVar = o6.c.f11662a;
        boolean zEquals = sVar != null ? sVar.f8197a.equals(cVar) : false;
        j6.m mVar2 = (j6.m) mVar.a(null, n1.H);
        boolean zEquals2 = mVar2 != null ? mVar2.f8187a.equals(cVar) : false;
        if (aVar != null) {
            j6.c cVar2 = aVar.f4613a;
            m1 m1Var = (m1) k0.f4661c.get(new v(s1Var, cVar2.f8174a, cVar2.f8175b));
            if (m1Var != null) {
                return Integer.valueOf(m1Var.f4678a);
            }
            throw new IllegalArgumentException("Cannot find " + s1Var + " with alignment " + cVar2);
        }
        if (!zEquals && !zEquals2) {
            return null;
        }
        m1 m1Var2 = (m1) k0.f4662d.get(new y1(s1Var, zEquals, zEquals2));
        if (m1Var2 != null) {
            return Integer.valueOf(m1Var2.f4678a);
        }
        throw new IllegalArgumentException("Cannot find " + s1Var + " with defaultWeight set");
    }
}
