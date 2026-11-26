package tq;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.FavoriteReciterModel;
import com.mchutov.quranify.RecentReciterModel;
import g00.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.n;
import ym.l0;
import ym.t;

public final class b extends m00.i implements n {
    public final int A;
    public Object B;
    public final ArrayList C;
    public final int D;

    public b(ArrayList arrayList, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.C = arrayList;
        this.D = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                b bVar = new b(this.C, this.D, cVar, 0);
                bVar.B = obj;
                return bVar;
            case 1:
                b bVar2 = new b(this.C, this.D, cVar, 1);
                bVar2.B = obj;
                return bVar2;
            default:
                b bVar3 = new b(this.C, this.D, cVar, 2);
                bVar3.B = obj;
                return bVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((b) create((FavoriteReciterModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 1:
                return ((b) create((FavoriteReciterModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                return ((b) create((RecentReciterModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        int i2 = this.D;
        ArrayList arrayList = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                arrayList.remove(new Integer(i2));
                arrayList.add(0, new Integer(i2));
                t tVar = (t) ((FavoriteReciterModel) obj2).toBuilder();
                tVar.b();
                tVar.a(arrayList);
                GeneratedMessageLite generatedMessageLiteBuild = tVar.build();
                m.d(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            case 1:
                FavoriteReciterModel favoriteReciterModel = (FavoriteReciterModel) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (arrayList.contains(new Integer(i2))) {
                    arrayList.remove(new Integer(i2));
                } else {
                    arrayList.add(0, new Integer(i2));
                }
                t tVar2 = (t) favoriteReciterModel.toBuilder();
                tVar2.b();
                tVar2.a(arrayList);
                GeneratedMessageLite generatedMessageLiteBuild2 = tVar2.build();
                m.d(generatedMessageLiteBuild2, "build(...)");
                return generatedMessageLiteBuild2;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                arrayList.remove(new Integer(i2));
                arrayList.add(0, new Integer(i2));
                l0 l0Var = (l0) ((RecentReciterModel) obj2).toBuilder();
                l0Var.b();
                l0Var.a(arrayList);
                GeneratedMessageLite generatedMessageLiteBuild3 = l0Var.build();
                m.d(generatedMessageLiteBuild3, "build(...)");
                return generatedMessageLiteBuild3;
        }
    }
}
