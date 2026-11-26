package ut;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.SurahModel;
import g00.b0;
import h00.q;
import java.util.List;
import ri.t1;
import ym.r;
import ym.y0;

public final class o extends m00.i implements u00.n {
    public Object A;
    public final int B;
    public final long C;
    public final String D;
    public final Integer E;
    public final long F;

    public o(int i, long j, String str, Integer num, long j2, k00.c cVar) {
        super(2, cVar);
        this.B = i;
        this.C = j;
        this.D = str;
        this.E = num;
        this.F = j2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        o oVar = new o(this.B, this.C, this.D, this.E, this.F, cVar);
        oVar.A = obj;
        return oVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((DownloadedSurahModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        List<SurahModel> surahsList = downloadedSurahModel.getSurahsList();
        kotlin.jvm.internal.m.d(surahsList, "getSurahsList(...)");
        List listN1 = q.n1(surahsList);
        y0 y0VarNewBuilder = SurahModel.newBuilder();
        y0VarNewBuilder.d(this.B);
        y0VarNewBuilder.e(this.C);
        y0VarNewBuilder.g(this.D);
        y0VarNewBuilder.c();
        Integer num = this.E;
        y0VarNewBuilder.b(num != null ? num.intValue() : -1);
        y0VarNewBuilder.f(this.F);
        SurahModel surahModel = (SurahModel) y0VarNewBuilder.build();
        int iIndexOf = listN1.indexOf(surahModel);
        if (!listN1.contains(surahModel)) {
            r rVar = (r) downloadedSurahModel.toBuilder();
            rVar.b(surahModel);
            GeneratedMessageLite generatedMessageLiteBuild = rVar.build();
            kotlin.jvm.internal.m.b(generatedMessageLiteBuild);
            return (DownloadedSurahModel) generatedMessageLiteBuild;
        }
        r rVar2 = (r) downloadedSurahModel.toBuilder();
        rVar2.d(iIndexOf);
        rVar2.b(surahModel);
        GeneratedMessageLite generatedMessageLiteBuild2 = rVar2.build();
        kotlin.jvm.internal.m.b(generatedMessageLiteBuild2);
        return (DownloadedSurahModel) generatedMessageLiteBuild2;
    }
}
