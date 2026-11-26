package d6;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.DownloadedSurahModel;
import java.util.ArrayList;
import java.util.Iterator;

public final class v0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final ArrayList C;

    public v0(ArrayList arrayList, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = arrayList;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                v0 v0Var = new v0(this.C, cVar, 0);
                v0Var.B = obj;
                return v0Var;
            case 1:
                v0 v0Var2 = new v0(this.C, cVar, 1);
                v0Var2.B = obj;
                return v0Var2;
            default:
                v0 v0Var3 = new v0(this.C, cVar, 2);
                v0Var3.B = obj;
                return v0Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((t5.b) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((DownloadedSurahModel) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((DownloadedSurahModel) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        ArrayList<f1> arrayList = this.C;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                t5.b bVarG = ((t5.b) this.B).g();
                t5.d dVar = a1.f4617g;
                ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((f1) it.next()).getClass().getName());
                }
                bVarG.e(dVar, h00.q.r1(arrayList2));
                for (f1 f1Var : arrayList) {
                    t0 t0Var = a1.f4614d;
                    t0Var.getClass();
                    String canonicalName = f1Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        throw new IllegalArgumentException("no receiver name");
                    }
                    t5.d dVarA = t0.a(t0Var, canonicalName);
                    String canonicalName2 = f1Var.e().getClass().getCanonicalName();
                    if (canonicalName2 == null) {
                        throw new IllegalArgumentException("no provider name");
                    }
                    bVarG.f(dVarA, canonicalName2);
                }
                return bVarG.h();
            case 1:
                DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) this.B;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                ym.r builder = downloadedSurahModel.toBuilder();
                builder.c();
                builder.a(arrayList);
                GeneratedMessageLite generatedMessageLiteBuild = builder.build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            default:
                DownloadedSurahModel downloadedSurahModel2 = (DownloadedSurahModel) this.B;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                ym.r builder2 = downloadedSurahModel2.toBuilder();
                builder2.c();
                builder2.a(arrayList);
                GeneratedMessageLite generatedMessageLiteBuild2 = builder2.build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild2, "build(...)");
                return generatedMessageLiteBuild2;
        }
    }
}
