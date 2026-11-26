package jv;

import bv.o1;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.Iterator;
import kotlin.jvm.internal.m;

public final class i implements u00.a {
    public final int A;
    public final o1 B;
    public final PlayerItem C;

    public i(o1 o1Var, PlayerItem playerItem, int i) {
        this.A = i;
        this.B = o1Var;
        this.C = playerItem;
    }

    public i(PlayerItem playerItem, o1 o1Var, int i) {
        this.A = i;
        this.C = playerItem;
        this.B = o1Var;
    }

    @Override
    public final Object invoke() {
        Object next;
        switch (this.A) {
            case 0:
                Iterator<E> it = this.B.r.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    yt.a aVar = (yt.a) next;
                    int i = aVar.b;
                    PlayerItem playerItem = this.C;
                    if (i == playerItem.getReciterId() && aVar.c == playerItem.getSurahId()) {
                        return (yt.a) next;
                    }
                }
                next = null;
                return (yt.a) next;
            case 1:
                u30.b<g00.k> bVar = this.B.q;
                boolean z = false;
                if (bVar == null || !bVar.isEmpty()) {
                    for (g00.k kVar : bVar) {
                        int iIntValue = ((Number) kVar.A).intValue();
                        PlayerItem playerItem2 = this.C;
                        if (iIntValue == playerItem2.getReciterId() && ((Number) kVar.B).longValue() == playerItem2.getSurahId()) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                u30.b bVar2 = this.B.p;
                boolean z2 = false;
                if (bVar2 == null || !bVar2.isEmpty()) {
                    Iterator<E> it2 = bVar2.iterator();
                    while (it2.hasNext()) {
                        if (((zq.a) it2.next()).a == this.C.getSurahId()) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 3:
                o1 o1Var = this.B;
                return Boolean.valueOf(o1Var.g && m.a(this.C, o1Var.f));
            case 4:
                return Boolean.valueOf(m.a(this.C, this.B.f));
            case 5:
                o1 o1Var2 = this.B;
                return Boolean.valueOf(o1Var2.g && m.a(this.C, o1Var2.f));
            default:
                return Boolean.valueOf(m.a(this.C, this.B.f));
        }
    }
}
