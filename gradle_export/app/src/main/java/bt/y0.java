package bt;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import bv.e3;
import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g1.k8;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

public final class y0 extends m00.i implements u00.n {
    public final int A;
    public final Object B;

    public y0(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = obj;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y0((j2) this.B, cVar, 0);
            case 1:
                return new y0((e3) this.B, cVar, 1);
            case 2:
                return new y0((dq.u) this.B, cVar, 2);
            case 3:
                return new y0((e1.q) this.B, cVar, 3);
            case 4:
                return new y0((l1.z0) this.B, cVar, 4);
            case 5:
                return new y0((ev.c0) this.B, cVar, 5);
            case 6:
                return new y0((k8) this.B, cVar, 6);
            case 7:
                return new y0((ob.e) this.B, cVar, 7);
            case 8:
                return new y0((pz.l) this.B, cVar, 8);
            case 9:
                return new y0((View) this.B, cVar, 9);
            case 10:
                return new y0((ut.p) this.B, cVar, 10);
            case 11:
                return new y0((ArrayList) this.B, cVar, 11);
            case 12:
                return new y0((uu.w) this.B, cVar, 12);
            case 13:
                return new y0((u00.a) this.B, cVar, 13);
            case 14:
                return new y0((xx.c) this.B, cVar, 14);
            default:
                return new y0((zj.g) this.B, cVar, 15);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                y0 y0Var = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                y0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                y0 y0Var2 = (y0) create((g00.b0) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                y0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                y0 y0Var3 = (y0) create((g00.b0) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                y0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                y0 y0Var4 = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                y0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 5:
                y0 y0Var5 = (y0) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                y0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 6:
                y0 y0Var6 = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                y0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            case 7:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 8:
                y0 y0Var7 = (y0) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var7 = g00.b0.a;
                y0Var7.invokeSuspend(b0Var7);
                return b0Var7;
            case 9:
                y0 y0Var8 = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var8 = g00.b0.a;
                y0Var8.invokeSuspend(b0Var8);
                return b0Var8;
            case 10:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 11:
                return ((y0) create((DownloadedSurahModel) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 12:
                y0 y0Var9 = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var9 = g00.b0.a;
                y0Var9.invokeSuspend(b0Var9);
                return b0Var9;
            case 13:
                y0 y0Var10 = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var10 = g00.b0.a;
                y0Var10.invokeSuspend(b0Var10);
                return b0Var10;
            case 14:
                y0 y0Var11 = (y0) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var11 = g00.b0.a;
                y0Var11.invokeSuspend(b0Var11);
                return b0Var11;
            default:
                return ((y0) create((zj.g) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer num;
        Window window;
        k9.u uVar;
        int i = -1;
        int iIntValue = 0;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                ((j2) this.B).n(s.a);
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                e3 e3Var = (e3) this.B;
                if (((bv.o1) e3Var.c.d.getValue()).B == ru.d.WHEN_SURAH_ENDS) {
                    e3Var.q();
                    e3.k(e3Var);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                uu.w wVar = (uu.w) ((dq.u) this.B).h;
                wVar.getClass();
                uu.w.m(wVar, false, 1);
                return g00.b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                e1.q qVar = (e1.q) this.B;
                Context context = qVar.b;
                e1.s sVar = qVar.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = sVar.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                qVar.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 4:
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                ((l1.z0) this.B).setValue(Boolean.TRUE);
                return g00.b0.a;
            case 5:
                l00.a aVar6 = l00.a.A;
                ri.t1.O(obj);
                ev.c0 c0Var = (ev.c0) this.B;
                c0Var.i(ev.t.a((ev.t) c0Var.c.d.getValue(), null, false, null, 0, 0, null, null, false, true, false, null, false, 3711));
                return g00.b0.a;
            case 6:
                l00.a aVar7 = l00.a.A;
                ri.t1.O(obj);
                ((k8) this.B).a();
                return g00.b0.a;
            case 7:
                l00.a aVar8 = l00.a.A;
                ri.t1.O(obj);
                ob.e eVar = (ob.e) this.B;
                synchronized (eVar) {
                    if (!eVar.L || eVar.M) {
                        return g00.b0.a;
                    }
                    try {
                        eVar.O();
                        break;
                    } catch (IOException unused) {
                        eVar.N = true;
                    }
                    try {
                        if ((eVar.I >= 2000 ? 1 : 0) != 0) {
                            eVar.Z();
                        }
                        break;
                    } catch (IOException unused2) {
                        eVar.O = true;
                        eVar.J = bi.b.q(new k50.f());
                    }
                    return g00.b0.a;
                }
            case 8:
                l00.a aVar9 = l00.a.A;
                ri.t1.O(obj);
                pz.l lVar = (pz.l) this.B;
                lVar.i(pz.j.a((pz.j) lVar.c.d.getValue(), false, null, null, false, false, false, 126));
                ol.c cVar = ol.c.A;
                ab.a0.A0(lVar, new pz.h());
                return g00.b0.a;
            case 9:
                g00.b0 b0Var = g00.b0.a;
                l00.a aVar10 = l00.a.A;
                ri.t1.O(obj);
                ViewParent parent = ((View) this.B).getParent();
                num = parent instanceof c4.w ? (c4.w) parent : null;
                if (num != null && (window = num.getWindow()) != null) {
                    window.setLayout(-1, -1);
                }
                return b0Var;
            case 10:
                l00.a aVar11 = l00.a.A;
                ri.t1.O(obj);
                ut.p pVar = (ut.p) this.B;
                File filesDir = pVar.a.getFilesDir();
                File externalFilesDir = pVar.a.getExternalFilesDir(null);
                kotlin.jvm.internal.m.b(filesDir);
                r00.i.Y(filesDir);
                if (externalFilesDir != null) {
                    return Boolean.valueOf(r00.i.Y(externalFilesDir));
                }
                return null;
            case 11:
                l00.a aVar12 = l00.a.A;
                ri.t1.O(obj);
                ym.r rVarNewBuilder = DownloadedSurahModel.newBuilder();
                rVarNewBuilder.a((ArrayList) this.B);
                GeneratedMessageLite generatedMessageLiteBuild = rVarNewBuilder.build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            case 12:
                g00.b0 b0Var2 = g00.b0.a;
                l00.a aVar13 = l00.a.A;
                ri.t1.O(obj);
                if (((uu.w) this.B).m.a() && (uVar = ((uu.w) this.B).r) != null) {
                    u30.b<PlayerItem> bVar = (u30.b) ((uu.w) this.B).T.A.getValue();
                    if (!((h00.b) bVar).isEmpty()) {
                        PlayerItem playerItem = (PlayerItem) ((uu.w) this.B).C.getValue();
                        if (playerItem != null) {
                            int i2 = 0;
                            for (PlayerItem playerItem2 : bVar) {
                                if (playerItem2.getSurahNumber() == playerItem.getSurahNumber() && playerItem2.getReciterId() == playerItem.getReciterId()) {
                                    i = i2;
                                    Integer num2 = new Integer(i);
                                    num = num2.intValue() >= 0 ? num2 : null;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    }
                                } else {
                                    i2++;
                                }
                            }
                            Integer num3 = new Integer(i);
                            if (num3.intValue() >= 0) {
                            }
                            if (num != null) {
                                iIntValue = num.intValue();
                            }
                        }
                        long jLongValue = ((Number) ((uu.w) this.B).E.getValue()).longValue();
                        if (jLongValue < 0) {
                            jLongValue = 0;
                        }
                        boolean zBooleanValue = ((Boolean) ((uu.w) this.B).G.getValue()).booleanValue();
                        ((uu.w) this.B).Q = true;
                        uu.w wVar2 = (uu.w) this.B;
                        long jLongValue2 = ((Number) wVar2.D.getValue()).longValue();
                        wVar2.R = jLongValue2 >= 0 ? jLongValue2 : 0L;
                        uVar.setMediaItems(((uu.w) this.B).f.X(bVar), iIntValue, jLongValue);
                        uVar.setVolume(((Number) ((uu.w) this.B).F.getValue()).floatValue());
                        uVar.setPlaybackParameters(new androidx.media3.common.z0(((Number) ((uu.w) this.B).M.getValue()).floatValue()));
                        uVar.setRepeatMode(((Number) ((uu.w) this.B).J.getValue()).intValue());
                        uVar.setShuffleModeEnabled(((Boolean) ((uu.w) this.B).I.getValue()).booleanValue());
                        uVar.prepare();
                        uVar.setPlayWhenReady(zBooleanValue);
                    }
                }
                return b0Var2;
            case 13:
                l00.a aVar14 = l00.a.A;
                ri.t1.O(obj);
                ((u00.a) this.B).invoke();
                return g00.b0.a;
            case 14:
                l00.a aVar15 = l00.a.A;
                ri.t1.O(obj);
                ((xx.c) this.B).a.edit().remove("globalSearch.recentItems").apply();
                return g00.b0.a;
            default:
                l00.a aVar16 = l00.a.A;
                ri.t1.O(obj);
                return (zj.g) this.B;
        }
    }
}
