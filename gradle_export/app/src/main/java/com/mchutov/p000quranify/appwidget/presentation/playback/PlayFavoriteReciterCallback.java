package com.mchutov.p000quranify.appwidget.presentation.playback;

import a10.d;
import c6.f;
import e6.a;
import g00.b0;
import g00.m;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import m00.i;
import nn.c;
import nn.h;
import nn.j;
import ri.t1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/appwidget/presentation/playback/PlayFavoriteReciterCallback;", "Le6/a;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayFavoriteReciterCallback implements a {
    @Override
    public final Object a(f fVar, i iVar) {
        Object objS;
        Integer num = (Integer) fVar.f3750a.get(c.f15395a);
        b0 b0Var = b0.f7770a;
        if (num != null) {
            int iIntValue = num.intValue();
            s50.a aVar = u50.a.f20577b;
            if (aVar == null) {
                objS = null;
            } else {
                try {
                    e60.a aVar2 = aVar.f18919c.f3755d;
                    d dVarB = a0.f13204a.b(j.class);
                    aVar2.getClass();
                    objS = aVar2.f(dVarB, null, null);
                } catch (Throwable th2) {
                    objS = t1.s(th2);
                }
                if (objS instanceof m) {
                    objS = null;
                }
            }
            j jVar = (j) objS;
            if (jVar != null) {
                Object objD = jVar.d(g4.c.f(iIntValue, "favorite "), new h(jVar, iIntValue, null), iVar);
                l00.a aVar3 = l00.a.A;
                if (objD != aVar3) {
                    objD = b0Var;
                }
                if (objD == aVar3) {
                    return objD;
                }
            }
        }
        return b0Var;
    }
}
