package com.mchutov.quranify.favoriters.data.source.local.db;

import ab.w;
import ba.y;
import ca.g;
import g00.p;
import h00.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import q0.f2;
import rd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/favoriters/data/source/local/db/FavoritesDatabase_Impl;", "Lcom/mchutov/quranify/favoriters/data/source/local/db/FavoritesDatabase;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FavoritesDatabase_Impl extends FavoritesDatabase {
    public final p n = a.J(new f2(this, 18));

    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final g d() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"favorites_data"});
    }

    public final y e() {
        return new w(this);
    }

    public final Set i() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(a0.a.b(vq.a.class), x.A);
        return linkedHashMap;
    }

    @Override
    public final vq.a r() {
        return (vq.a) this.n.getValue();
    }
}
