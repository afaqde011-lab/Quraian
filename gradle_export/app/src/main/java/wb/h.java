package wb;

import a10.h0;
import a40.v;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.w;
import h00.d0;
import h00.x;
import java.util.LinkedHashMap;
import java.util.List;

public final class h {

    public final Context f15916a;

    public c f15917b;

    public Object f15918c;

    public yb.a f15919d;

    public ub.b f15920e;

    public String f15921f;

    public xb.d f15922g;

    public List f15923h;

    public ac.e f15924i;

    public final db.g f15925j;

    public final LinkedHashMap f15926k;
    public final boolean l;
    public Boolean m;

    public final boolean f15927n;

    public b f15928o;

    public a8.l f15929p;

    public xb.h f15930q;

    public xb.f f15931r;

    public androidx.lifecycle.q f15932s;

    public xb.h f15933t;

    public xb.f f15934u;

    public h(Context context) {
        this.f15916a = context;
        this.f15917b = bc.c.f2479a;
        this.f15918c = null;
        this.f15919d = null;
        this.f15920e = null;
        this.f15921f = null;
        this.f15922g = null;
        this.f15923h = x.A;
        this.f15924i = null;
        this.f15925j = null;
        this.f15926k = null;
        this.l = true;
        this.m = null;
        this.f15927n = true;
        this.f15928o = null;
        this.f15929p = null;
        this.f15930q = null;
        this.f15931r = null;
        this.f15932s = null;
        this.f15933t = null;
        this.f15934u = null;
    }

    public h(i iVar, Context context) {
        this.f15916a = context;
        this.f15917b = iVar.B;
        this.f15918c = iVar.f15936b;
        this.f15919d = iVar.f15937c;
        this.f15920e = iVar.f15938d;
        this.f15921f = iVar.f15939e;
        d dVar = iVar.A;
        this.f15922g = dVar.f15908d;
        this.f15923h = iVar.f15942h;
        this.f15924i = dVar.f15907c;
        this.f15925j = iVar.f15944j.e();
        this.f15926k = d0.b0(iVar.f15945k.f15983a);
        this.l = iVar.l;
        this.m = dVar.f15909e;
        this.f15927n = iVar.f15947o;
        this.f15928o = dVar.f15910f;
        this.f15929p = new a8.l(iVar.f15958z);
        this.f15930q = dVar.f15905a;
        this.f15931r = dVar.f15906b;
        if (iVar.f15935a == context) {
            this.f15932s = iVar.f15955w;
            this.f15933t = iVar.f15956x;
            this.f15934u = iVar.f15957y;
        } else {
            this.f15932s = null;
            this.f15933t = null;
            this.f15934u = null;
        }
    }

    public final i a() {
        xb.h hVar;
        Object obj = this.f15918c;
        if (obj == null) {
            obj = k.f15959a;
        }
        Object obj2 = obj;
        yb.a aVar = this.f15919d;
        ub.b bVar = this.f15920e;
        String str = this.f15921f;
        c cVar = this.f15917b;
        Bitmap.Config config = cVar.f15900g;
        xb.d dVar = this.f15922g;
        if (dVar == null) {
            dVar = cVar.f15899f;
        }
        xb.d dVar2 = dVar;
        List list = this.f15923h;
        ac.e eVar = this.f15924i;
        if (eVar == null) {
            eVar = cVar.f15898e;
        }
        ac.e eVar2 = eVar;
        db.g gVar = this.f15925j;
        x40.p pVarJ = gVar != null ? gVar.j() : null;
        if (pVarJ == null) {
            pVarJ = bc.d.f2482c;
        } else {
            Bitmap.Config[] configArr = bc.d.f2480a;
        }
        x40.p pVar = pVarJ;
        LinkedHashMap linkedHashMap = this.f15926k;
        q qVar = linkedHashMap != null ? new q(h0.Q(linkedHashMap)) : null;
        if (qVar == null) {
            qVar = q.f15982b;
        }
        q qVar2 = qVar;
        Boolean bool = this.m;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f15917b.f15901h;
        this.f15917b.getClass();
        c cVar2 = this.f15917b;
        b bVar2 = cVar2.f15902i;
        b bVar3 = cVar2.f15903j;
        b bVar4 = this.f15928o;
        if (bVar4 == null) {
            bVar4 = cVar2.f15904k;
        }
        b bVar5 = bVar4;
        v vVar = cVar2.f15894a;
        v vVar2 = cVar2.f15895b;
        v vVar3 = cVar2.f15896c;
        v vVar4 = cVar2.f15897d;
        androidx.lifecycle.q lifecycle = this.f15932s;
        Context context = this.f15916a;
        if (lifecycle == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof w) {
                    lifecycle = ((w) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = g.f15914b;
            }
        }
        androidx.lifecycle.q qVar3 = lifecycle;
        xb.h hVar2 = this.f15930q;
        if (hVar2 == null) {
            xb.h cVar3 = this.f15933t;
            if (cVar3 == null) {
                cVar3 = new xb.c(context);
            }
            hVar = cVar3;
        } else {
            hVar = hVar2;
        }
        xb.f fVar = this.f15931r;
        if (fVar == null && (fVar = this.f15934u) == null) {
            if ((hVar2 instanceof xb.i ? (xb.i) hVar2 : null) != null) {
                throw null;
            }
            fVar = xb.f.B;
        }
        xb.f fVar2 = fVar;
        a8.l lVar = this.f15929p;
        n nVar = lVar != null ? new n(h0.Q(lVar.A)) : null;
        if (nVar == null) {
            nVar = n.B;
        }
        return new i(context, obj2, aVar, bVar, str, config, dVar2, list, eVar2, pVar, qVar2, this.l, zBooleanValue, false, this.f15927n, bVar2, bVar3, bVar5, vVar, vVar2, vVar3, vVar4, qVar3, hVar, fVar2, nVar, new d(this.f15930q, this.f15931r, this.f15924i, this.f15922g, this.m, this.f15928o), this.f15917b);
    }

    public final void b() {
        this.f15924i = new ac.a(100);
    }

    public final void c(int i10) {
        this.f15930q = new xb.e(new xb.g(new xb.a(i10), new xb.a(i10)));
        this.f15932s = null;
        this.f15933t = null;
        this.f15934u = null;
    }
}
