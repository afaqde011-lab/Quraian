package c3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public final class o3 extends m00.i implements u00.n {
    public final int A = 0;
    public Object B;
    public int C;
    public Object D;
    public Object E;
    public Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public o3(ContentResolver contentResolver, Uri uri, p3 p3Var, c40.h hVar, Context context, k00.c cVar) {
        super(2, cVar);
        this.E = contentResolver;
        this.F = uri;
        this.G = p3Var;
        this.H = hVar;
        this.I = context;
    }

    public o3(bt.a2 a2Var, cq.a aVar, Context context, xo.a aVar2, u00.k kVar, ol.b bVar, xo.e eVar, k00.c cVar) {
        super(2, cVar);
        this.D = a2Var;
        this.B = aVar;
        this.I = context;
        this.E = aVar2;
        this.F = kVar;
        this.G = bVar;
        this.H = eVar;
    }

    public o3(cq.a aVar, Context context, xo.a aVar2, u00.k kVar, ol.b bVar, xo.e eVar, k00.c cVar) {
        super(2, cVar);
        this.D = aVar;
        this.I = context;
        this.E = aVar2;
        this.F = kVar;
        this.G = bVar;
        this.H = eVar;
    }

    public o3(rb.g gVar, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.z zVar2, wb.i iVar, Object obj, kotlin.jvm.internal.z zVar3, lb.c cVar, k00.c cVar2) {
        super(2, cVar2);
        this.D = gVar;
        this.E = zVar;
        this.F = zVar2;
        this.G = iVar;
        this.B = obj;
        this.H = zVar3;
        this.I = cVar;
    }

    public o3(rb.g gVar, wb.i iVar, Object obj, wb.l lVar, lb.c cVar, ub.b bVar, rb.i iVar2, k00.c cVar2) {
        super(2, cVar2);
        this.D = gVar;
        this.E = iVar;
        this.B = obj;
        this.F = lVar;
        this.G = cVar;
        this.H = bVar;
        this.I = iVar2;
    }

    public o3(u00.a aVar, sy.c cVar, Context context, ol.b bVar, jz.d0 d0Var, vp.x xVar, k00.c cVar2) {
        super(2, cVar2);
        this.D = aVar;
        this.E = cVar;
        this.I = context;
        this.F = bVar;
        this.G = d0Var;
        this.H = xVar;
    }

    public o3(uu.h hVar, pz.k kVar, u00.a aVar, u00.k kVar2, k00.c cVar) {
        super(2, cVar);
        this.F = hVar;
        this.G = kVar;
        this.H = aVar;
        this.I = kVar2;
    }

    public o3(z.b1 b1Var, h1.j0 j0Var, u00.k kVar, k00.c cVar) {
        super(2, cVar);
        this.G = b1Var;
        this.H = j0Var;
        this.I = (m00.i) kVar;
    }

    public o3(z.b1 b1Var, z.e1 e1Var, u00.k kVar, k00.c cVar) {
        super(2, cVar);
        this.G = b1Var;
        this.H = e1Var;
        this.I = (m00.i) kVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                o3 o3Var = new o3((ContentResolver) this.E, (Uri) this.F, (p3) this.G, (c40.h) this.H, (Context) this.I, cVar);
                o3Var.B = obj;
                return o3Var;
            case 1:
                o3 o3Var2 = new o3((z.b1) this.G, (h1.j0) this.H, (u00.k) this.I, cVar);
                o3Var2.F = obj;
                return o3Var2;
            case 2:
                o3 o3Var3 = new o3((u00.a) this.D, (sy.c) this.E, (Context) this.I, (ol.b) this.F, (jz.d0) this.G, (vp.x) this.H, cVar);
                o3Var3.B = obj;
                return o3Var3;
            case 3:
                return new o3((rb.g) this.D, (kotlin.jvm.internal.z) this.E, (kotlin.jvm.internal.z) this.F, (wb.i) this.G, this.B, (kotlin.jvm.internal.z) this.H, (lb.c) this.I, cVar);
            case 4:
                return new o3((rb.g) this.D, (wb.i) this.E, this.B, (wb.l) this.F, (lb.c) this.G, (ub.b) this.H, (rb.i) this.I, cVar);
            case 5:
                o3 o3Var4 = new o3((uu.h) this.F, (pz.k) this.G, (u00.a) this.H, (u00.k) this.I, cVar);
                o3Var4.E = obj;
                return o3Var4;
            case 6:
                o3 o3Var5 = new o3((cq.a) this.D, (Context) this.I, (xo.a) this.E, (u00.k) this.F, (ol.b) this.G, (xo.e) this.H, cVar);
                o3Var5.B = obj;
                return o3Var5;
            case 7:
                return new o3((bt.a2) this.D, (cq.a) this.B, (Context) this.I, (xo.a) this.E, (u00.k) this.F, (ol.b) this.G, (xo.e) this.H, cVar);
            default:
                o3 o3Var6 = new o3((z.b1) this.G, (z.e1) this.H, (u00.k) this.I, cVar);
                o3Var6.F = obj;
                return o3Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((d40.j) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((jz.r) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((ur.x0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: c3.o3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
