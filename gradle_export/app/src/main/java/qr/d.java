package qr;

public final class d {
    public final u30.b a;
    public final u30.b b;
    public final u30.b c;

    public d(u30.b overAllFavorites, u30.b favoriteReciterIds, u30.b selectedReciterFavoritesIds) {
        kotlin.jvm.internal.m.e(overAllFavorites, "overAllFavorites");
        kotlin.jvm.internal.m.e(favoriteReciterIds, "favoriteReciterIds");
        kotlin.jvm.internal.m.e(selectedReciterFavoritesIds, "selectedReciterFavoritesIds");
        this.a = overAllFavorites;
        this.b = favoriteReciterIds;
        this.c = selectedReciterFavoritesIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.a, dVar.a) && kotlin.jvm.internal.m.a(this.b, dVar.b) && kotlin.jvm.internal.m.a(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g4.c.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HomeFavoritesDataDvo(overAllFavorites=" + this.a + ", favoriteReciterIds=" + this.b + ", selectedReciterFavoritesIds=" + this.c + ")";
    }
}
