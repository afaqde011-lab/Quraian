package lu;

public final class z {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final u30.b d;
    public final u30.b e;
    public final u30.b f;
    public final u30.b g;
    public final zz.a h;
    public final u30.b i;
    public final ju.i j;
    public final int k;
    public final String l;

    public z(u30.b bVar, u30.b bVar2, u30.b bVar3, u30.b bVar4, ju.i iVar, int i) {
        int i2 = i & 8;
        h00.x xVar = h00.x.A;
        this(false, false, false, i2 != 0 ? ze.d.E(xVar) : bVar, (i & 16) != 0 ? ze.d.E(xVar) : bVar2, ze.d.E(xVar), (i & 64) != 0 ? ze.d.E(xVar) : bVar3, null, (i & 256) != 0 ? ze.d.E(xVar) : bVar4, (i & 512) != 0 ? new ju.i("", "", ze.d.E(xVar)) : iVar, 900, "");
    }

    public z(boolean z, boolean z2, boolean z3, u30.b allReciters, u30.b reciters, u30.b selectedReciters, u30.b soundEffects, zz.a aVar, u30.b playlists, ju.i socialProof, int i, String str) {
        kotlin.jvm.internal.m.e(allReciters, "allReciters");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(selectedReciters, "selectedReciters");
        kotlin.jvm.internal.m.e(soundEffects, "soundEffects");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        kotlin.jvm.internal.m.e(socialProof, "socialProof");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = allReciters;
        this.e = reciters;
        this.f = selectedReciters;
        this.g = soundEffects;
        this.h = aVar;
        this.i = playlists;
        this.j = socialProof;
        this.k = i;
        this.l = str;
    }

    public static z a(z zVar, boolean z, boolean z2, boolean z3, u30.b bVar, u30.b bVar2, u30.b bVar3, u30.b bVar4, zz.a aVar, int i, String str, int i2) {
        boolean z4 = (i2 & 1) != 0 ? zVar.a : z;
        boolean z5 = (i2 & 2) != 0 ? zVar.b : z2;
        boolean z6 = (i2 & 4) != 0 ? zVar.c : z3;
        u30.b allReciters = (i2 & 8) != 0 ? zVar.d : bVar;
        u30.b reciters = (i2 & 16) != 0 ? zVar.e : bVar2;
        u30.b selectedReciters = (i2 & 32) != 0 ? zVar.f : bVar3;
        u30.b soundEffects = (i2 & 64) != 0 ? zVar.g : bVar4;
        zz.a aVar2 = (i2 & 128) != 0 ? zVar.h : aVar;
        u30.b playlists = zVar.i;
        ju.i socialProof = zVar.j;
        int i3 = (i2 & 1024) != 0 ? zVar.k : i;
        String searchValue = (i2 & 2048) != 0 ? zVar.l : str;
        kotlin.jvm.internal.m.e(allReciters, "allReciters");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(selectedReciters, "selectedReciters");
        kotlin.jvm.internal.m.e(soundEffects, "soundEffects");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        kotlin.jvm.internal.m.e(socialProof, "socialProof");
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        return new z(z4, z5, z6, allReciters, reciters, selectedReciters, soundEffects, aVar2, playlists, socialProof, i3, searchValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && this.b == zVar.b && this.c == zVar.c && kotlin.jvm.internal.m.a(this.d, zVar.d) && kotlin.jvm.internal.m.a(this.e, zVar.e) && kotlin.jvm.internal.m.a(this.f, zVar.f) && kotlin.jvm.internal.m.a(this.g, zVar.g) && kotlin.jvm.internal.m.a(this.h, zVar.h) && kotlin.jvm.internal.m.a(this.i, zVar.i) && kotlin.jvm.internal.m.a(this.j, zVar.j) && this.k == zVar.k && kotlin.jvm.internal.m.a(this.l, zVar.l);
    }

    public final int hashCode() {
        int iC = g4.c.c(this.g, g4.c.c(this.f, g4.c.c(this.e, g4.c.c(this.d, w.c.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31), 31);
        zz.a aVar = this.h;
        return this.l.hashCode() + w.c.d(this.k, (this.j.hashCode() + g4.c.c(this.i, (iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "OnboardingStepUiState(isLoading=" + this.a + ", stepLoadFailed=" + this.b + ", isIntegrityFailed=" + this.c + ", allReciters=" + this.d + ", reciters=" + this.e + ", selectedReciters=" + this.f + ", soundEffects=" + this.g + ", selectedSoundEffect=" + this.h + ", playlists=" + this.i + ", socialProof=" + this.j + ", dailyMinimumTotalSeconds=" + this.k + ", searchValue=" + this.l + ")";
    }
}
