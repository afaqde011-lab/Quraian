package av;

import a40.c0;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b3.l0;
import b3.l2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d00.n0;
import d40.l1;
import g00.b0;
import g2.a0;
import g2.y;
import h00.v;
import l9.f0;
import u.j0;
import uu.w;
import vp.x;

public final class k extends kotlin.jvm.internal.j implements u00.a {
    public final int A;

    public k(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.A = i3;
    }

    @Override
    public final Object invoke() throws Exception {
        BottomSheetBehavior bottomSheetBehaviorF;
        a1.n nVar;
        switch (this.A) {
            case 0:
                eg.f dialog = ((l) this.receiver).getDialog();
                eg.f fVar = dialog instanceof eg.f ? dialog : null;
                if (fVar != null && (bottomSheetBehaviorF = fVar.f()) != null) {
                    bottomSheetBehaviorF.K(5);
                }
                return b0.a;
            case 1:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
            case 2:
                View view = (View) this.receiver;
                view.setImportantForContentCapture(1);
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession == null) {
                    return null;
                }
                return new f0(contentCaptureSession, view, 25);
            case 3:
                ca.t tVar = (ca.t) this.receiver;
                f40.c cVar = tVar.a;
                if (cVar == null) {
                    kotlin.jvm.internal.m.k("coroutineScope");
                    throw null;
                }
                c0.i(cVar, null);
                tVar.g();
                ca.p pVar = tVar.e;
                if (pVar == null) {
                    kotlin.jvm.internal.m.k("connectionManager");
                    throw null;
                }
                ((ea.b) pVar.g).close();
                na.c cVar2 = (na.c) pVar.h;
                if (cVar2 != null) {
                    cVar2.close();
                }
                return b0.a;
            case 4:
                ((n0) this.receiver).J1();
                return b0.a;
            case 5:
                ((cq.b) this.receiver).a();
                return b0.a;
            case 6:
                ((zs.b) this.receiver).a();
                return b0.a;
            case 7:
                v.z0(((cu.a) this.receiver).a);
                return b0.a;
            case 8:
                return ((x) this.receiver).k;
            case 9:
                return Boolean.valueOf(((x) this.receiver).k());
            case 10:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
            case 11:
                g2.i iVar = (g2.i) this.receiver;
                j0 j0Var = iVar.c;
                j0 j0Var2 = iVar.d;
                g2.n nVar2 = iVar.a;
                a0 a0VarG = nVar2.g();
                if (a0VarG == null) {
                    Object[] objArr = j0Var2.b;
                    long[] jArr = j0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((j & 255) < 128) {
                                        ((g2.g) objArr[(i << 3) + i3]).F(y.C);
                                    }
                                    j >>= 8;
                                }
                                if (i2 == 8) {
                                    if (i != length) {
                                        i++;
                                    }
                                }
                            } else if (i != length) {
                                i++;
                            }
                        }
                    }
                } else if (((b2.q) a0VarG).N) {
                    if (j0Var.c(a0VarG)) {
                        a0VarG.H1();
                    }
                    y yVarG1 = a0VarG.G1();
                    if (!((b2.q) a0VarG).A.N) {
                        y2.a.c("visitAncestors called on an unattached node");
                    }
                    g2.g gVar = ((b2.q) a0VarG).A;
                    l0 l0VarY = b3.m.y(a0VarG);
                    int i4 = 0;
                    while (l0VarY != null) {
                        if ((((b2.q) l0VarY.g0.G).D & 5120) != 0) {
                            while (gVar != null) {
                                int i5 = ((b2.q) gVar).C;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & 1024) != 0) {
                                        i4++;
                                    }
                                    if ((gVar instanceof g2.g) && j0Var2.c(gVar)) {
                                        if (i4 <= 1) {
                                            gVar.F(yVarG1);
                                        } else {
                                            gVar.F(y.B);
                                        }
                                        j0Var2.l(gVar);
                                    }
                                }
                                gVar = ((b2.q) gVar).E;
                            }
                        }
                        l0VarY = l0VarY.x();
                        gVar = (l0VarY == null || (nVar = l0VarY.g0) == null) ? null : (l2) nVar.F;
                    }
                    Object[] objArr2 = j0Var2.b;
                    long[] jArr2 = j0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((g2.g) objArr2[(i6 << 3) + i8]).F(y.C);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (nVar2.g() == null || nVar2.c.G1() == y.C) {
                    nVar2.d();
                }
                j0Var.b();
                j0Var2.b();
                iVar.e = false;
                return b0.a;
            case 12:
                ((w) ((uu.a) this.receiver)).A();
                return b0.a;
            case 13:
                ((w) ((uu.a) this.receiver)).p();
                return b0.a;
            case 14:
                ((w) ((uu.a) this.receiver)).y();
                return b0.a;
            case 15:
                ((fw.c) this.receiver).a();
                return b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((ey.b) this.receiver).a();
                return b0.a;
            case 17:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
            case 18:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
            case 19:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
            case 20:
                return ((mt.a) this.receiver).a();
            case 21:
                ((w) ((uu.a) this.receiver)).p();
                return b0.a;
            case 22:
                ((w) ((uu.a) this.receiver)).y();
                return b0.a;
            case 23:
                w wVar = (w) ((uu.a) this.receiver);
                wVar.getClass();
                wVar.v(false, new l1(2, null, 15));
                return b0.a;
            case 24:
                ((w) ((uu.a) this.receiver)).A();
                return b0.a;
            case 25:
                ((w) ((uu.a) this.receiver)).p();
                return b0.a;
            case 26:
                ((w) ((uu.a) this.receiver)).y();
                return b0.a;
            case 27:
                w wVar2 = (w) ((uu.a) this.receiver);
                wVar2.getClass();
                wVar2.v(false, new l1(2, null, 14));
                return b0.a;
            case 28:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
            default:
                z0.h.d((z0.g) this.receiver);
                return b0.a;
        }
    }
}
