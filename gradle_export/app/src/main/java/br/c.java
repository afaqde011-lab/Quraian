package br;

import a40.z;
import android.view.Choreographer;
import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.ListeningTimerModel;
import com.mchutov.quranify.RecentReciterModel;
import com.mchutov.quranify.RecitersModel;
import d0.y1;
import g00.b0;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.n;

public final class c extends m00.i implements n {
    public final int A;

    public c(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c(2, cVar, 0);
            case 1:
                return new c(2, cVar, 1);
            case 2:
                return new c(2, cVar, 2);
            case 3:
                return new c(2, cVar, 3);
            case 4:
                return new c(2, cVar, 4);
            case 5:
                return new c(2, cVar, 5);
            case 6:
                return new c(2, cVar, 6);
            default:
                return new c(2, cVar, 7);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((c) create((ListeningTimerModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 1:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 2:
                c cVar = (c) create((y1) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                cVar.invokeSuspend(b0Var);
                return b0Var;
            case 3:
                c cVar2 = (c) create((z) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                cVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 4:
                c cVar3 = (c) create(Float.valueOf(((Number) obj).floatValue()), (k00.c) obj2);
                b0 b0Var3 = b0.a;
                cVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 5:
                c cVar4 = (c) create((b0) obj, (k00.c) obj2);
                b0 b0Var4 = b0.a;
                cVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 6:
                return ((c) create((RecentReciterModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                return ((c) create((RecitersModel) obj, (k00.c) obj2)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ListeningTimerModel.newBuilder().build();
                m.d(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return Choreographer.getInstance();
            case 2:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return b0Var;
            case 3:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                return b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                return b0Var;
            case 5:
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                return b0Var;
            case 6:
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                RecentReciterModel defaultInstance = RecentReciterModel.getDefaultInstance();
                m.d(defaultInstance, "getDefaultInstance(...)");
                return defaultInstance;
            default:
                l00.a aVar8 = l00.a.A;
                t1.O(obj);
                RecitersModel defaultInstance2 = RecitersModel.getDefaultInstance();
                m.d(defaultInstance2, "getDefaultInstance(...)");
                return defaultInstance2;
        }
    }
}
