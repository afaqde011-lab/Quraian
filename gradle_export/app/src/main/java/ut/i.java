package ut;

import com.mchutov.quranify.DownloadedSurahModel;
import g00.b0;
import java.util.ArrayList;
import ri.t1;

public final class i implements d40.j {
    public final int A;
    public final d40.j B;
    public final tt.a C;

    public i(d40.j jVar, tt.a aVar, int i) {
        this.A = i;
        this.B = jVar;
        this.C = aVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        h hVar;
        m mVar;
        switch (this.A) {
            case 0:
                if (cVar instanceof h) {
                    hVar = (h) cVar;
                    int i = hVar.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hVar.B = i - Integer.MIN_VALUE;
                    } else {
                        hVar = new h(this, cVar);
                    }
                } else {
                    hVar = new h(this, cVar);
                }
                Object obj2 = hVar.A;
                l00.a aVar = l00.a.A;
                int i2 = hVar.B;
                if (i2 == 0) {
                    t1.O(obj2);
                    this.C.getClass();
                    ArrayList arrayListX = tt.a.X((DownloadedSurahModel) obj);
                    hVar.B = 1;
                    if (this.B.emit(arrayListX, hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj2);
                }
                return b0.a;
            default:
                if (cVar instanceof m) {
                    mVar = (m) cVar;
                    int i3 = mVar.B;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mVar.B = i3 - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, cVar);
                    }
                } else {
                    mVar = new m(this, cVar);
                }
                Object obj3 = mVar.A;
                l00.a aVar2 = l00.a.A;
                int i4 = mVar.B;
                if (i4 == 0) {
                    t1.O(obj3);
                    this.C.getClass();
                    ArrayList arrayListX2 = tt.a.X((DownloadedSurahModel) obj);
                    mVar.B = 1;
                    if (this.B.emit(arrayListX2, mVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj3);
                }
                return b0.a;
        }
    }
}
