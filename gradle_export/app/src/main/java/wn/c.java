package wn;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.AudioStoryAuthorLocalModel;
import com.mchutov.quranify.AudioStoryCatalogLocalModel;
import com.mchutov.quranify.AudioStoryCatalogsModel;
import com.mchutov.quranify.AudioStoryEpisodeLocalModel;
import com.mchutov.quranify.AudioStoryLanguageLocalModel;
import com.mchutov.quranify.AudioStoryLocalModel;
import g00.b0;
import h00.r;
import ho.g;
import ho.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m00.i;
import ri.t1;
import u00.n;
import ym.f;
import ym.l;
import ym.o;

public final class c extends i implements n {
    public Object A;
    public final String B;
    public final d C;
    public final ArrayList D;
    public final long E;

    public c(String str, d dVar, ArrayList arrayList, long j, k00.c cVar) {
        super(2, cVar);
        this.B = str;
        this.C = dVar;
        this.D = arrayList;
        this.E = j;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        c cVar2 = new c(this.B, this.C, this.D, this.E, cVar);
        cVar2.A = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((AudioStoryCatalogsModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        AudioStoryCatalogsModel audioStoryCatalogsModel = (AudioStoryCatalogsModel) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        f fVar = (f) audioStoryCatalogsModel.toBuilder();
        tn.c cVar = this.C.b;
        ym.d dVarNewBuilder = AudioStoryCatalogLocalModel.newBuilder();
        dVarNewBuilder.b(this.E);
        ArrayList arrayList = this.D;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ho.a aVar2 = (ho.a) it.next();
            o oVarNewBuilder = AudioStoryLocalModel.newBuilder();
            oVarNewBuilder.e(aVar2.a);
            oVarNewBuilder.f(aVar2.b);
            oVarNewBuilder.g(aVar2.c);
            List<g> list = aVar2.g;
            ArrayList arrayList3 = new ArrayList(r.q0(list, i));
            for (g gVar : list) {
                ym.i iVarNewBuilder = AudioStoryEpisodeLocalModel.newBuilder();
                iVarNewBuilder.f(gVar.a);
                iVarNewBuilder.j(gVar.b);
                iVarNewBuilder.h(gVar.c);
                iVarNewBuilder.k(gVar.d);
                iVarNewBuilder.b(gVar.e);
                iVarNewBuilder.d(gVar.f);
                iVarNewBuilder.g(gVar.i);
                iVarNewBuilder.n(gVar.m);
                List<m> list2 = gVar.n;
                ArrayList arrayList4 = new ArrayList(r.q0(list2, i));
                for (m mVar : list2) {
                    l lVarNewBuilder = AudioStoryLanguageLocalModel.newBuilder();
                    lVarNewBuilder.a(mVar.a);
                    lVarNewBuilder.b(mVar.b);
                    arrayList4.add((AudioStoryLanguageLocalModel) lVarNewBuilder.build());
                    it = it;
                }
                Iterator it2 = it;
                iVarNewBuilder.a(arrayList4);
                String str = gVar.g;
                if (str != null) {
                    iVarNewBuilder.c(str);
                }
                String str2 = gVar.h;
                if (str2 != null) {
                    iVarNewBuilder.m(str2);
                }
                Long l = gVar.j;
                if (l != null) {
                    iVarNewBuilder.e(l.longValue());
                }
                GeneratedMessageLite generatedMessageLiteBuild = iVarNewBuilder.build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild, "build(...)");
                arrayList3.add((AudioStoryEpisodeLocalModel) generatedMessageLiteBuild);
                it = it2;
                i = 10;
            }
            Iterator it3 = it;
            oVarNewBuilder.a(arrayList3);
            oVarNewBuilder.h(aVar2.h);
            String str3 = aVar2.d;
            if (str3 != null) {
                oVarNewBuilder.d(str3);
            }
            String str4 = aVar2.e;
            if (str4 != null) {
                oVarNewBuilder.c(str4);
            }
            ho.b bVar = aVar2.f;
            if (bVar != null) {
                ym.b bVarNewBuilder = AudioStoryAuthorLocalModel.newBuilder();
                bVarNewBuilder.b(bVar.b);
                Integer num = bVar.a;
                if (num != null) {
                    bVarNewBuilder.a(num.intValue());
                }
                String str5 = bVar.c;
                if (str5 != null) {
                    bVarNewBuilder.c(str5);
                }
                GeneratedMessageLite generatedMessageLiteBuild2 = bVarNewBuilder.build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild2, "build(...)");
                oVarNewBuilder.b((AudioStoryAuthorLocalModel) generatedMessageLiteBuild2);
            }
            GeneratedMessageLite generatedMessageLiteBuild3 = oVarNewBuilder.build();
            kotlin.jvm.internal.m.d(generatedMessageLiteBuild3, "build(...)");
            arrayList2.add((AudioStoryLocalModel) generatedMessageLiteBuild3);
            it = it3;
            i = 10;
        }
        dVarNewBuilder.a(arrayList2);
        GeneratedMessageLite generatedMessageLiteBuild4 = dVarNewBuilder.build();
        kotlin.jvm.internal.m.d(generatedMessageLiteBuild4, "build(...)");
        fVar.a(this.B, (AudioStoryCatalogLocalModel) generatedMessageLiteBuild4);
        GeneratedMessageLite generatedMessageLiteBuild5 = fVar.build();
        kotlin.jvm.internal.m.d(generatedMessageLiteBuild5, "build(...)");
        return generatedMessageLiteBuild5;
    }
}
