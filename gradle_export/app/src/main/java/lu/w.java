package lu;

import android.content.Context;
import android.graphics.Bitmap;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.PlaylistsModel;
import com.mchutov.quranify.RecitersModel;
import com.mchutov.quranify.SurahModel;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.List;
import k9.b2;
import l1.z0;
import l9.f0;
import nx.i0;
import nx.p0;
import w.j1;
import w.k1;

public final class w extends m00.i implements u00.n {
    public final int A;
    public final Object B;
    public Object C;

    public w(Object obj, Object obj2, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = obj;
        this.B = obj2;
    }

    public w(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = obj;
    }

    public w(e0 e0Var, Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = e0Var;
        this.C = obj;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new w((Context) this.C, (e0) this.B, cVar, 0);
            case 1:
                return new w((e0) this.B, this.C, cVar, 1);
            case 2:
                return new w((zz.a) this.C, (e0) this.B, cVar, 2);
            case 3:
                w wVar = new w((e0) this.B, cVar, 3);
                wVar.C = obj;
                return wVar;
            case 4:
                return new w((e0) this.B, this.C, cVar, 4);
            case 5:
                return new w((Context) this.C, (Bitmap) this.B, cVar, 5);
            case 6:
                w wVar2 = new w((kh.b0) this.B, cVar, 6);
                wVar2.C = obj;
                return wVar2;
            case 7:
                return new w((AudioPlayerService) this.C, (b2) this.B, cVar, 7);
            case 8:
                w wVar3 = new w((p0) this.B, cVar, 8);
                wVar3.C = obj;
                return wVar3;
            case 9:
                return new w((gx.e) this.C, (gx.d) this.B, cVar, 9);
            case 10:
                return new w((r6.a) this.C, (androidx.lifecycle.p) this.B, cVar, 10);
            case 11:
                w wVar4 = new w((rc.q) this.B, cVar, 11);
                wVar4.C = obj;
                return wVar4;
            case 12:
                w wVar5 = new w((ol.b) this.B, cVar, 12);
                wVar5.C = obj;
                return wVar5;
            case 13:
                return new w((sy.c) this.C, (z0) this.B, cVar, 13);
            case 14:
                return new w((sy.c) this.C, (sy.b) this.B, cVar, 14);
            case 15:
                w wVar6 = new w((tm.e) this.B, cVar, 15);
                wVar6.C = obj;
                return wVar6;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                w wVar7 = new w((SurahModel) this.B, cVar, 16);
                wVar7.C = obj;
                return wVar7;
            case 17:
                return new w((uu.w) this.C, (List) this.B, cVar, 17);
            case 18:
                return new w((uz.f) this.C, (String) this.B, cVar, 18);
            case 19:
                return new w((j1) this.C, (k1) this.B, cVar, 19);
            case 20:
                w wVar8 = new w((wy.p) this.B, cVar, 20);
                wVar8.C = obj;
                return wVar8;
            case 21:
                return new w((rr.b) this.C, (rr.a) this.B, cVar, 21);
            case 22:
                return new w((xw.k) this.C, (List) this.B, cVar, 22);
            case 23:
                w wVar9 = new w((xx.c) this.B, cVar, 23);
                wVar9.C = obj;
                return wVar9;
            case 24:
                w wVar10 = new w((y9.c) this.B, cVar, 24);
                wVar10.C = obj;
                return wVar10;
            case 25:
                return new w((yv.c) this.C, this.B, cVar, 25);
            case 26:
                return new w((rc.c) this.C, (f0) this.B, cVar, 26);
            default:
                w wVar11 = new w((g2.t) this.B, cVar, 27);
                wVar11.C = obj;
                return wVar11;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                w wVar = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                wVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                w wVar2 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                wVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                w wVar3 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                wVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                w wVar4 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                wVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                w wVar5 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                wVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                return ((w) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 6:
                w wVar6 = (w) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                wVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 7:
                return ((w) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 8:
                w wVar7 = (w) create((i0) obj, (k00.c) obj2);
                g00.b0 b0Var7 = g00.b0.a;
                wVar7.invokeSuspend(b0Var7);
                return b0Var7;
            case 9:
                w wVar8 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var8 = g00.b0.a;
                wVar8.invokeSuspend(b0Var8);
                return b0Var8;
            case 10:
                w wVar9 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var9 = g00.b0.a;
                wVar9.invokeSuspend(b0Var9);
                return b0Var9;
            case 11:
                if (obj != null) {
                    throw new ClassCastException();
                }
                w wVar10 = (w) create(null, (k00.c) obj2);
                g00.b0 b0Var10 = g00.b0.a;
                wVar10.invokeSuspend(b0Var10);
                return b0Var10;
            case 12:
                w wVar11 = (w) create((rp.f) obj, (k00.c) obj2);
                g00.b0 b0Var11 = g00.b0.a;
                wVar11.invokeSuspend(b0Var11);
                return b0Var11;
            case 13:
                w wVar12 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var12 = g00.b0.a;
                wVar12.invokeSuspend(b0Var12);
                return b0Var12;
            case 14:
                w wVar13 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var13 = g00.b0.a;
                wVar13.invokeSuspend(b0Var13);
                return b0Var13;
            case 15:
                w wVar14 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var14 = g00.b0.a;
                wVar14.invokeSuspend(b0Var14);
                return b0Var14;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return ((w) create((DownloadedSurahModel) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 17:
                w wVar15 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var15 = g00.b0.a;
                wVar15.invokeSuspend(b0Var15);
                return b0Var15;
            case 18:
                w wVar16 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var16 = g00.b0.a;
                wVar16.invokeSuspend(b0Var16);
                return b0Var16;
            case 19:
                w wVar17 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var17 = g00.b0.a;
                wVar17.invokeSuspend(b0Var17);
                return b0Var17;
            case 20:
                w wVar18 = (w) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var18 = g00.b0.a;
                wVar18.invokeSuspend(b0Var18);
                return b0Var18;
            case 21:
                w wVar19 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var19 = g00.b0.a;
                wVar19.invokeSuspend(b0Var19);
                return b0Var19;
            case 22:
                return ((w) create((RecitersModel) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 23:
                return ((w) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 24:
                ((w) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
                throw null;
            case 25:
                return ((w) create((PlaylistsModel) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 26:
                w wVar20 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var20 = g00.b0.a;
                wVar20.invokeSuspend(b0Var20);
                return b0Var20;
            default:
                w wVar21 = (w) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var21 = g00.b0.a;
                wVar21.invokeSuspend(b0Var21);
                return b0Var21;
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: lu.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
