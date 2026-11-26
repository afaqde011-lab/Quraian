package dz;

import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerEffect$CloseScreen;
import com.mchutov.quranify.settings.presentation.screen.downloadmanager.DownloadManagerEffect$CloseScreen;
import com.mchutov.quranify.settings.presentation.screen.notification.NotificationEffect$CloseScreen;
import g00.b0;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class l extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final u00.a C;

    public l(u00.a aVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                l lVar = new l(this.C, cVar, 0);
                lVar.B = obj;
                return lVar;
            case 1:
                l lVar2 = new l(this.C, cVar, 1);
                lVar2.B = obj;
                return lVar2;
            case 2:
                l lVar3 = new l(this.C, cVar, 2);
                lVar3.B = obj;
                return lVar3;
            default:
                l lVar4 = new l(this.C, cVar, 3);
                lVar4.B = obj;
                return lVar4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l lVar = (l) create((h) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                lVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                l lVar2 = (l) create((ev.k) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                lVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                l lVar3 = (l) create((qt.g) obj, (k00.c) obj2);
                b0 b0Var3 = b0.a;
                lVar3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                l lVar4 = (l) create((nz.i) obj, (k00.c) obj2);
                b0 b0Var4 = b0.a;
                lVar4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        u00.a aVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (!kotlin.jvm.internal.m.a((h) obj2, DownloadManagerEffect$CloseScreen.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.invoke();
                return b0Var;
            case 1:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (!(((ev.k) obj2) instanceof ev.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.invoke();
                return b0Var;
            case 2:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                if (!kotlin.jvm.internal.m.a((qt.g) obj2, TafsirPickerEffect$CloseScreen.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.invoke();
                return b0Var;
            default:
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                if (!(((nz.i) obj2) instanceof NotificationEffect$CloseScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.invoke();
                return b0Var;
        }
    }
}
