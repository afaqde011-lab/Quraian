package d40;

import android.util.Log;
import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.RecitersModel;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.List;
import l1.v1;
import ri.t1;

public final class l1 extends m00.i implements u00.n {
    public final int A;
    public Object B;

    public l1(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                l1 l1Var = new l1(2, cVar, 0);
                l1Var.B = obj;
                return l1Var;
            case 1:
                l1 l1Var2 = new l1(2, cVar, 1);
                l1Var2.B = obj;
                return l1Var2;
            case 2:
                l1 l1Var3 = new l1(2, cVar, 2);
                l1Var3.B = obj;
                return l1Var3;
            case 3:
                l1 l1Var4 = new l1(2, cVar, 3);
                l1Var4.B = obj;
                return l1Var4;
            case 4:
                l1 l1Var5 = new l1(2, cVar, 4);
                l1Var5.B = obj;
                return l1Var5;
            case 5:
                l1 l1Var6 = new l1(2, cVar, 5);
                l1Var6.B = obj;
                return l1Var6;
            case 6:
                l1 l1Var7 = new l1(2, cVar, 6);
                l1Var7.B = obj;
                return l1Var7;
            case 7:
                l1 l1Var8 = new l1(2, cVar, 7);
                l1Var8.B = obj;
                return l1Var8;
            case 8:
                l1 l1Var9 = new l1(2, cVar, 8);
                l1Var9.B = obj;
                return l1Var9;
            case 9:
                l1 l1Var10 = new l1(2, cVar, 9);
                l1Var10.B = obj;
                return l1Var10;
            case 10:
                l1 l1Var11 = new l1(2, cVar, 10);
                l1Var11.B = obj;
                return l1Var11;
            case 11:
                l1 l1Var12 = new l1(2, cVar, 11);
                l1Var12.B = obj;
                return l1Var12;
            case 12:
                l1 l1Var13 = new l1(2, cVar, 12);
                l1Var13.B = obj;
                return l1Var13;
            case 13:
                l1 l1Var14 = new l1(2, cVar, 13);
                l1Var14.B = obj;
                return l1Var14;
            case 14:
                l1 l1Var15 = new l1(2, cVar, 14);
                l1Var15.B = obj;
                return l1Var15;
            case 15:
                l1 l1Var16 = new l1(2, cVar, 15);
                l1Var16.B = obj;
                return l1Var16;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                l1 l1Var17 = new l1(2, cVar, 16);
                l1Var17.B = obj;
                return l1Var17;
            default:
                l1 l1Var18 = new l1(2, cVar, 17);
                l1Var18.B = obj;
                return l1Var18;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((l1) create((f1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((l1) create((v1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((l1) create((List) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                l1 l1Var = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                l1Var.invokeSuspend(b0Var);
                return b0Var;
            case 4:
                l1 l1Var2 = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                l1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 5:
                l1 l1Var3 = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                l1Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 6:
                l1 l1Var4 = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                l1Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 7:
                l1 l1Var5 = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                l1Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 8:
                l1 l1Var6 = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                l1Var6.invokeSuspend(b0Var6);
                return b0Var6;
            case 9:
                l1 l1Var7 = (l1) create((t5.b) obj, (k00.c) obj2);
                g00.b0 b0Var7 = g00.b0.a;
                l1Var7.invokeSuspend(b0Var7);
                return b0Var7;
            case 10:
                l1 l1Var8 = (l1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var8 = g00.b0.a;
                l1Var8.invokeSuspend(b0Var8);
                return b0Var8;
            case 11:
                return ((l1) create((DownloadedSurahModel) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 12:
                l1 l1Var9 = (l1) create((k9.u) obj, (k00.c) obj2);
                g00.b0 b0Var9 = g00.b0.a;
                l1Var9.invokeSuspend(b0Var9);
                return b0Var9;
            case 13:
                l1 l1Var10 = (l1) create((k9.u) obj, (k00.c) obj2);
                g00.b0 b0Var10 = g00.b0.a;
                l1Var10.invokeSuspend(b0Var10);
                return b0Var10;
            case 14:
                return ((l1) create((k9.u) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 15:
                l1 l1Var11 = (l1) create((k9.u) obj, (k00.c) obj2);
                g00.b0 b0Var11 = g00.b0.a;
                l1Var11.invokeSuspend(b0Var11);
                return b0Var11;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return ((l1) create((RecitersModel) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                l1 l1Var12 = (l1) create((String) obj, (k00.c) obj2);
                g00.b0 b0Var12 = g00.b0.a;
                l1Var12.invokeSuspend(b0Var12);
                return b0Var12;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        int i2 = 0;
        g00.b0 b0Var = g00.b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(((f1) this.B) != f1.A);
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(((v1) this.B) == v1.A);
            case 2:
                List list = (List) this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(!list.isEmpty());
            case 3:
                Throwable th = (Throwable) this.B;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                Log.e("AudioPlayerService", "media notification buttons observer failed", th);
                return b0Var;
            case 4:
                Throwable th2 = (Throwable) this.B;
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                Log.e("AudioPlayerService", "memorization commands observer failed", th2);
                return b0Var;
            case 5:
                Throwable th3 = (Throwable) this.B;
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                Log.e("AudioPlayerService", "widget insights observer failed", th3);
                return b0Var;
            case 6:
                Throwable th4 = (Throwable) this.B;
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                Log.e("AudioPlayerService", "widget playback observer failed", th4);
                return b0Var;
            case 7:
                Throwable th5 = (Throwable) this.B;
                l00.a aVar8 = l00.a.A;
                t1.O(obj);
                Log.e("AppWidgetUpdater", "update failed", th5);
                return b0Var;
            case 8:
                Throwable th6 = (Throwable) this.B;
                l00.a aVar9 = l00.a.A;
                t1.O(obj);
                Log.e("WidgetPreviewPublisher", "widget previews publish failed", th6);
                return b0Var;
            case 9:
                t5.b bVar = (t5.b) this.B;
                l00.a aVar10 = l00.a.A;
                t1.O(obj);
                bVar.e(sn.k.a, new Long(System.currentTimeMillis()));
                return b0Var;
            case 10:
                Throwable th7 = (Throwable) this.B;
                l00.a aVar11 = l00.a.A;
                t1.O(obj);
                Log.e("WidgetUpdateReceiver", "widget update failed", th7);
                return b0Var;
            case 11:
                DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) this.B;
                l00.a aVar12 = l00.a.A;
                t1.O(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ((ym.r) ((ym.r) downloadedSurahModel.toBuilder()).clear()).build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            case 12:
                k9.u uVar = (k9.u) this.B;
                l00.a aVar13 = l00.a.A;
                t1.O(obj);
                uVar.seekToNext();
                return b0Var;
            case 13:
                k9.u uVar2 = (k9.u) this.B;
                l00.a aVar14 = l00.a.A;
                t1.O(obj);
                uVar2.seekToPrevious();
                return b0Var;
            case 14:
                k9.u uVar3 = (k9.u) this.B;
                l00.a aVar15 = l00.a.A;
                t1.O(obj);
                int repeatMode = uVar3.getRepeatMode();
                if (repeatMode != 0) {
                    if (repeatMode != 1) {
                        if (repeatMode == 2) {
                            i2 = 1;
                        }
                    }
                    return b0Var;
                }
                i2 = 2;
                uVar3.setRepeatMode(i2);
                return b0Var;
            case 15:
                k9.u uVar4 = (k9.u) this.B;
                l00.a aVar16 = l00.a.A;
                t1.O(obj);
                uVar4.setShuffleModeEnabled(!uVar4.getShuffleModeEnabled());
                return b0Var;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                RecitersModel recitersModel = (RecitersModel) this.B;
                l00.a aVar17 = l00.a.A;
                t1.O(obj);
                return recitersModel;
            default:
                l00.a aVar18 = l00.a.A;
                t1.O(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.B));
                return b0Var;
        }
    }
}
