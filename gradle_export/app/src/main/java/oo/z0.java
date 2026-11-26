package oo;

import com.google.android.gms.internal.measurement.x5;
import d40.n1;

public final class z0 {
    public final lo.e a;
    public final int b;
    public final String c;
    public final boolean d;
    public final n1 e;
    public final Long f;
    public final float g;
    public final ru.d h;
    public final u30.b i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final u30.b n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final lo.z u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final lo.i y;
    public final boolean z;

    public z0(lo.e eVar, int i, String str, boolean z, n1 n1Var, Long l, float f, ru.d sleepTimer, u30.b episodes, boolean z2, boolean z3, boolean z4, boolean z5, u30.b languages, boolean z6, boolean z7, String str2, boolean z8, boolean z9, boolean z11, lo.z readAlong, boolean z12, boolean z13, boolean z14, lo.i download, boolean z15) {
        kotlin.jvm.internal.m.e(sleepTimer, "sleepTimer");
        kotlin.jvm.internal.m.e(episodes, "episodes");
        kotlin.jvm.internal.m.e(languages, "languages");
        kotlin.jvm.internal.m.e(readAlong, "readAlong");
        kotlin.jvm.internal.m.e(download, "download");
        this.a = eVar;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = n1Var;
        this.f = l;
        this.g = f;
        this.h = sleepTimer;
        this.i = episodes;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = languages;
        this.o = z6;
        this.p = z7;
        this.q = str2;
        this.r = z8;
        this.s = z9;
        this.t = z11;
        this.u = readAlong;
        this.v = z12;
        this.w = z13;
        this.x = z14;
        this.y = download;
        this.z = z15;
    }

    public static z0 a(z0 z0Var, lo.e eVar, int i, String str, boolean z, Long l, float f, ru.d dVar, u30.b bVar, boolean z2, boolean z3, boolean z4, boolean z5, u30.b bVar2, boolean z6, boolean z7, String str2, boolean z8, boolean z9, boolean z11, lo.z zVar, boolean z12, boolean z13, boolean z14, lo.i iVar, boolean z15, int i2) {
        lo.e eVar2 = (i2 & 1) != 0 ? z0Var.a : eVar;
        int i3 = (i2 & 2) != 0 ? z0Var.b : i;
        String str3 = (i2 & 4) != 0 ? z0Var.c : str;
        boolean z16 = (i2 & 8) != 0 ? z0Var.d : z;
        n1 n1Var = z0Var.e;
        Long l2 = (i2 & 32) != 0 ? z0Var.f : l;
        float f2 = (i2 & 64) != 0 ? z0Var.g : f;
        ru.d sleepTimer = (i2 & 128) != 0 ? z0Var.h : dVar;
        u30.b episodes = (i2 & 256) != 0 ? z0Var.i : bVar;
        boolean z17 = (i2 & 512) != 0 ? z0Var.j : z2;
        boolean z18 = (i2 & 1024) != 0 ? z0Var.k : z3;
        boolean z19 = (i2 & 2048) != 0 ? z0Var.l : z4;
        boolean z21 = (i2 & 4096) != 0 ? z0Var.m : z5;
        u30.b languages = (i2 & 8192) != 0 ? z0Var.n : bVar2;
        lo.e eVar3 = eVar2;
        boolean z22 = (i2 & 16384) != 0 ? z0Var.o : z6;
        boolean z23 = (i2 & 32768) != 0 ? z0Var.p : z7;
        String str4 = (i2 & 65536) != 0 ? z0Var.q : str2;
        boolean z24 = (i2 & 131072) != 0 ? z0Var.r : z8;
        boolean z25 = (i2 & 262144) != 0 ? z0Var.s : z9;
        boolean z26 = (i2 & 524288) != 0 ? z0Var.t : z11;
        lo.z readAlong = (i2 & 1048576) != 0 ? z0Var.u : zVar;
        boolean z27 = z22;
        boolean z28 = (i2 & 2097152) != 0 ? z0Var.v : z12;
        boolean z29 = (i2 & 4194304) != 0 ? z0Var.w : z13;
        boolean z31 = (i2 & 8388608) != 0 ? z0Var.x : z14;
        lo.i download = (i2 & 16777216) != 0 ? z0Var.y : iVar;
        boolean z32 = (i2 & 33554432) != 0 ? z0Var.z : z15;
        z0Var.getClass();
        kotlin.jvm.internal.m.e(sleepTimer, "sleepTimer");
        kotlin.jvm.internal.m.e(episodes, "episodes");
        kotlin.jvm.internal.m.e(languages, "languages");
        kotlin.jvm.internal.m.e(readAlong, "readAlong");
        kotlin.jvm.internal.m.e(download, "download");
        return new z0(eVar3, i3, str3, z16, n1Var, l2, f2, sleepTimer, episodes, z17, z18, z19, z21, languages, z27, z23, str4, z24, z25, z26, readAlong, z28, z29, z31, download, z32);
    }

    public final boolean b() {
        return this.r && this.s && !this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.m.a(this.a, z0Var.a) && this.b == z0Var.b && kotlin.jvm.internal.m.a(this.c, z0Var.c) && this.d == z0Var.d && kotlin.jvm.internal.m.a(this.e, z0Var.e) && kotlin.jvm.internal.m.a(this.f, z0Var.f) && Float.compare(this.g, z0Var.g) == 0 && this.h == z0Var.h && kotlin.jvm.internal.m.a(this.i, z0Var.i) && this.j == z0Var.j && this.k == z0Var.k && this.l == z0Var.l && this.m == z0Var.m && kotlin.jvm.internal.m.a(this.n, z0Var.n) && this.o == z0Var.o && this.p == z0Var.p && kotlin.jvm.internal.m.a(this.q, z0Var.q) && this.r == z0Var.r && this.s == z0Var.s && this.t == z0Var.t && kotlin.jvm.internal.m.a(this.u, z0Var.u) && this.v == z0Var.v && this.w == z0Var.w && this.x == z0Var.x && kotlin.jvm.internal.m.a(this.y, z0Var.y) && this.z == z0Var.z;
    }

    public final int hashCode() {
        lo.e eVar = this.a;
        int iHashCode = (this.e.hashCode() + w.c.e(x5.e(w.c.d(this.b, (eVar == null ? 0 : eVar.hashCode()) * 31, 31), this.c, 31), 31, this.d)) * 31;
        Long l = this.f;
        int iE = w.c.e(w.c.e(g4.c.c(this.n, w.c.e(w.c.e(w.c.e(w.c.e(g4.c.c(this.i, (this.h.hashCode() + w.c.c(this.g, (iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31)) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o), 31, this.p);
        String str = this.q;
        return Boolean.hashCode(this.z) + ((this.y.hashCode() + w.c.e(w.c.e(w.c.e((this.u.hashCode() + w.c.e(w.c.e(w.c.e((iE + (str != null ? str.hashCode() : 0)) * 31, 31, this.r), 31, this.s), 31, this.t)) * 31, 31, this.v), 31, this.w), 31, this.x)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStoryPlayerUiState(cover=");
        sb.append(this.a);
        sb.append(", episodeOrder=");
        sb.append(this.b);
        sb.append(", storyTitle=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append(", freeLimitMs=");
        sb.append(this.f);
        sb.append(", speed=");
        sb.append(this.g);
        sb.append(", sleepTimer=");
        sb.append(this.h);
        sb.append(", episodes=");
        sb.append(this.i);
        sb.append(", isSpeedMenuVisible=");
        sb.append(this.j);
        sb.append(", isSleepTimerMenuVisible=");
        oi.k.y(sb, this.k, ", isOptionsMenuVisible=", this.l, ", isEpisodesVisible=");
        sb.append(this.m);
        sb.append(", languages=");
        sb.append(this.n);
        sb.append(", isLanguageMenuVisible=");
        oi.k.y(sb, this.o, ", isLanguageLoading=", this.p, ", loadingLanguageCode=");
        sb.append(this.q);
        sb.append(", isTextShown=");
        sb.append(this.r);
        sb.append(", hasText=");
        oi.k.y(sb, this.s, ", isTextLocked=", this.t, ", readAlong=");
        sb.append(this.u);
        sb.append(", isPlayerHidden=");
        sb.append(this.v);
        sb.append(", isCasting=");
        oi.k.y(sb, this.w, ", isCastEnabled=", this.x, ", download=");
        sb.append(this.y);
        sb.append(", isRecordingBlocked=");
        sb.append(this.z);
        sb.append(")");
        return sb.toString();
    }
}
