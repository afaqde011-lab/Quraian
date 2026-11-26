package qr;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class c {
    public final q a;
    public final boolean b;
    public final bx.c c;
    public final boolean d;
    public final u30.b e;
    public final u30.b f;
    public final u30.b g;
    public final u30.b h;
    public final PlayerItem i;
    public final boolean j;
    public final u30.b k;
    public final u30.b l;
    public final boolean m;
    public final u30.b n;
    public final u30.b o;
    public final mr.g p;
    public final u30.b q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;

    public c(q loadingState, boolean z, bx.c cVar, boolean z2, u30.b allReciters, u30.b favoriteReciters, u30.b newlyAddedReciters, u30.b playerItems, PlayerItem playerItem, boolean z3, u30.b playlists, u30.b favoriteIds, boolean z4, u30.b downloadedSurahIds, u30.b downloadedReciters, mr.g timerState, u30.b weeklyStreaks, int i, int i2, int i3, int i4, boolean z5, boolean z6) {
        kotlin.jvm.internal.m.e(loadingState, "loadingState");
        kotlin.jvm.internal.m.e(allReciters, "allReciters");
        kotlin.jvm.internal.m.e(favoriteReciters, "favoriteReciters");
        kotlin.jvm.internal.m.e(newlyAddedReciters, "newlyAddedReciters");
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        kotlin.jvm.internal.m.e(favoriteIds, "favoriteIds");
        kotlin.jvm.internal.m.e(downloadedSurahIds, "downloadedSurahIds");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(timerState, "timerState");
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        this.a = loadingState;
        this.b = z;
        this.c = cVar;
        this.d = z2;
        this.e = allReciters;
        this.f = favoriteReciters;
        this.g = newlyAddedReciters;
        this.h = playerItems;
        this.i = playerItem;
        this.j = z3;
        this.k = playlists;
        this.l = favoriteIds;
        this.m = z4;
        this.n = downloadedSurahIds;
        this.o = downloadedReciters;
        this.p = timerState;
        this.q = weeklyStreaks;
        this.r = i;
        this.s = i2;
        this.t = i3;
        this.u = i4;
        this.v = z5;
        this.w = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.a, cVar.a) && this.b == cVar.b && kotlin.jvm.internal.m.a(this.c, cVar.c) && this.d == cVar.d && kotlin.jvm.internal.m.a(this.e, cVar.e) && kotlin.jvm.internal.m.a(this.f, cVar.f) && kotlin.jvm.internal.m.a(this.g, cVar.g) && kotlin.jvm.internal.m.a(this.h, cVar.h) && kotlin.jvm.internal.m.a(this.i, cVar.i) && this.j == cVar.j && kotlin.jvm.internal.m.a(this.k, cVar.k) && kotlin.jvm.internal.m.a(this.l, cVar.l) && this.m == cVar.m && kotlin.jvm.internal.m.a(this.n, cVar.n) && kotlin.jvm.internal.m.a(this.o, cVar.o) && kotlin.jvm.internal.m.a(this.p, cVar.p) && kotlin.jvm.internal.m.a(this.q, cVar.q) && this.r == cVar.r && this.s == cVar.s && this.t == cVar.t && this.u == cVar.u && this.v == cVar.v && this.w == cVar.w;
    }

    public final int hashCode() {
        int iE = w.c.e(this.a.hashCode() * 31, 31, this.b);
        bx.c cVar = this.c;
        int iC = g4.c.c(this.h, g4.c.c(this.g, g4.c.c(this.f, g4.c.c(this.e, w.c.e((iE + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.d), 31), 31), 31), 31);
        PlayerItem playerItem = this.i;
        return Boolean.hashCode(this.w) + w.c.e(w.c.d(this.u, w.c.d(this.t, w.c.d(this.s, w.c.d(this.r, g4.c.c(this.q, (this.p.hashCode() + g4.c.c(this.o, g4.c.c(this.n, w.c.e(g4.c.c(this.l, g4.c.c(this.k, w.c.e((iC + (playerItem != null ? playerItem.hashCode() : 0)) * 31, 31, this.j), 31), 31), 31, this.m), 31), 31)) * 31, 31), 31), 31), 31), 31), 31, this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeDataDvo(loadingState=");
        sb.append(this.a);
        sb.append(", isRefreshing=");
        sb.append(this.b);
        sb.append(", selectedReciter=");
        sb.append(this.c);
        sb.append(", isRecentlyPlayed=");
        sb.append(this.d);
        sb.append(", allReciters=");
        sb.append(this.e);
        sb.append(", favoriteReciters=");
        sb.append(this.f);
        sb.append(", newlyAddedReciters=");
        sb.append(this.g);
        sb.append(", playerItems=");
        sb.append(this.h);
        sb.append(", selectedItem=");
        sb.append(this.i);
        sb.append(", isPlaying=");
        sb.append(this.j);
        sb.append(", playlists=");
        sb.append(this.k);
        sb.append(", favoriteIds=");
        sb.append(this.l);
        sb.append(", isOverallFavoritesEmpty=");
        sb.append(this.m);
        sb.append(", downloadedSurahIds=");
        sb.append(this.n);
        sb.append(", downloadedReciters=");
        sb.append(this.o);
        sb.append(", timerState=");
        sb.append(this.p);
        sb.append(", weeklyStreaks=");
        sb.append(this.q);
        sb.append(", weekListeningMinutes=");
        sb.append(this.r);
        sb.append(", streakValue=");
        w.c.u(sb, this.s, ", recordStreakValue=", this.t, ", dailyGoalMinute=");
        sb.append(this.u);
        sb.append(", isPremium=");
        sb.append(this.v);
        sb.append(", isListeningSyncing=");
        return g4.c.l(sb, this.w, ")");
    }
}
