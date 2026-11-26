package com.mchutov.quranify.search.presentation.navigation;

import e00.g;
import ey.f;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import p40.v;
import rd.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/mchutov/quranify/search/presentation/navigation/SearchRoute$SearchScreen", "Ley/f;", "<init>", "()V", "Ll40/a;", "Lcom/mchutov/quranify/search/presentation/navigation/SearchRoute$SearchScreen;", "serializer", "()Ll40/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SearchRoute$SearchScreen implements f {
    public static final int $stable = 0;
    public static final SearchRoute$SearchScreen INSTANCE = new SearchRoute$SearchScreen();
    private static final h $cachedSerializer$delegate = a.I(i.B, new g(8));

    private SearchRoute$SearchScreen() {
    }

    public static final l40.a _init_$_anonymous_() {
        return new v("com.mchutov.quranify.search.presentation.navigation.SearchRoute.SearchScreen", INSTANCE, new Annotation[0]);
    }

    private final l40.a get$cachedSerializer() {
        return (l40.a) $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof SearchRoute$SearchScreen);
    }

    public int hashCode() {
        return 459934563;
    }

    public final l40.a serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "SearchScreen";
    }
}
