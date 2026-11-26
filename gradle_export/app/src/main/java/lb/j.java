package lb;

import a10.h0;
import a40.c0;
import a40.m0;
import a40.w1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import f40.m;
import g00.k;
import g00.p;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import wb.o;
import x40.q;

public final class j implements f {

    public final Context f10206a;

    public final wb.c f10207b;

    public final p f10208c;

    public final bc.e f10209d;

    public final f40.c f10210e;

    public final o f10211f;

    public final b f10212g;

    public final ArrayList f10213h;

    public j(Context context, wb.c cVar, p pVar, p pVar2, p pVar3, b bVar, bc.e eVar) {
        this.f10206a = context;
        this.f10207b = cVar;
        this.f10208c = pVar;
        this.f10209d = eVar;
        w1 w1VarE = c0.e();
        h40.e eVar2 = m0.a;
        this.f10210e = c0.c(rd.a.P(w1VarE, m.a.F).plus(new i(this)));
        bc.g gVar = new bc.g(this);
        o oVar = new o(this, gVar);
        this.f10211f = oVar;
        ce.c cVar2 = new ce.c(bVar);
        cVar2.o(new tb.a(2), q.class);
        int i10 = 5;
        cVar2.o(new tb.a(i10), String.class);
        cVar2.o(new tb.a(1), Uri.class);
        int i11 = 4;
        cVar2.o(new tb.a(i11), Uri.class);
        int i12 = 3;
        cVar2.o(new tb.a(i12), Integer.class);
        int i13 = 0;
        cVar2.o(new tb.a(i13), byte[].class);
        sb.c cVar3 = new sb.c();
        ArrayList arrayList = (ArrayList) cVar2.D;
        arrayList.add(new k(cVar3, Uri.class));
        arrayList.add(new k(new sb.a(eVar.f2483a), File.class));
        cVar2.m(new qb.i(pVar3, pVar2, eVar.f2485c), Uri.class);
        cVar2.m(new qb.a(i10), File.class);
        cVar2.m(new qb.a(i13), Uri.class);
        cVar2.m(new qb.a(i12), Uri.class);
        cVar2.m(new qb.a(6), Uri.class);
        cVar2.m(new qb.a(i11), Drawable.class);
        cVar2.m(new qb.a(1), Bitmap.class);
        cVar2.m(new qb.a(2), ByteBuffer.class);
        nb.b bVar2 = new nb.b(eVar.f2486d, eVar.f2487e);
        ArrayList arrayList2 = (ArrayList) cVar2.F;
        arrayList2.add(bVar2);
        List listP = h0.P((ArrayList) cVar2.B);
        this.f10212g = new b(listP, h0.P((ArrayList) cVar2.C), h0.P(arrayList), h0.P((ArrayList) cVar2.E), h0.P(arrayList2));
        this.f10213h = h00.q.Z0(new rb.g(this, gVar, oVar), listP);
        new AtomicBoolean(false);
    }

    public static final java.lang.Object a(lb.j r20, wb.i r21, int r22, m00.c r23) {
        throw new UnsupportedOperationException("Method not decompiled: lb.j.a(lb.j, wb.i, int, m00.c):java.lang.Object");
    }

    public static void b(wb.e eVar, yb.a aVar, c cVar) {
        wb.i iVar = eVar.f15912b;
        if (aVar instanceof mb.k) {
            ac.f fVarA = iVar.f15943i.a((mb.k) aVar, eVar);
            if (!(fVarA instanceof ac.d)) {
                cVar.getClass();
                fVarA.a();
            }
        }
        cVar.getClass();
        iVar.getClass();
    }
}
