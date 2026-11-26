package br;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.ListeningTimerModel;
import g00.b0;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.n;
import ym.v;

public final class f extends m00.i implements n {
    public Object A;
    public final String B;
    public final long C;

    public f(String str, long j, k00.c cVar) {
        super(2, cVar);
        this.B = str;
        this.C = j;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        f fVar = new f(this.B, this.C, cVar);
        fVar.A = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ListeningTimerModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ListeningTimerModel listeningTimerModel = (ListeningTimerModel) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        String todaysDate = listeningTimerModel.getTodaysDate();
        String str = this.B;
        if (todaysDate.compareTo(str) > 0) {
            return listeningTimerModel;
        }
        v vVar = (v) listeningTimerModel.toBuilder();
        vVar.c(str);
        vVar.a(this.C);
        vVar.b();
        GeneratedMessageLite generatedMessageLiteBuild = vVar.build();
        m.b(generatedMessageLiteBuild);
        return (ListeningTimerModel) generatedMessageLiteBuild;
    }
}
