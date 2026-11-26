package com.mchutov.quranify.home.presentation.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import n40.e;
import o40.b;
import p40.e0;
import p40.o0;
import p40.x0;
import rr.c;
import rr.d;
import rr.j;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"com/mchutov/quranify/home/presentation/navigation/HomeRoute$AudioStoryScreen", "Lrr/j;", "", "storyId", "sharedEpisodeId", "<init>", "(ILjava/lang/Integer;)V", "seen0", "Lp40/x0;", "serializationConstructorMarker", "(IILjava/lang/Integer;Lp40/x0;)V", "Lcom/mchutov/quranify/home/presentation/navigation/HomeRoute$AudioStoryScreen;", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$app_release", "(Lcom/mchutov/quranify/home/presentation/navigation/HomeRoute$AudioStoryScreen;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/mchutov/quranify/home/presentation/navigation/HomeRoute$AudioStoryScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStoryId", "Ljava/lang/Integer;", "getSharedEpisodeId", "Companion", "rr/c", "rr/d", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HomeRoute$AudioStoryScreen implements j {
    public static final int $stable = 0;
    public static final d Companion = new d();
    private final Integer sharedEpisodeId;
    private final int storyId;

    public HomeRoute$AudioStoryScreen(int i, int i2, Integer num, x0 x0Var) {
        if (1 != (i & 1)) {
            o0.g(i, 1, c.a.getDescriptor());
            throw null;
        }
        this.storyId = i2;
        if ((i & 2) == 0) {
            this.sharedEpisodeId = null;
        } else {
            this.sharedEpisodeId = num;
        }
    }

    public HomeRoute$AudioStoryScreen(int i, Integer num) {
        this.storyId = i;
        this.sharedEpisodeId = num;
    }

    public HomeRoute$AudioStoryScreen(int i, Integer num, int i2, f fVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }

    public static HomeRoute$AudioStoryScreen copy$default(HomeRoute$AudioStoryScreen homeRoute$AudioStoryScreen, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = homeRoute$AudioStoryScreen.storyId;
        }
        if ((i2 & 2) != 0) {
            num = homeRoute$AudioStoryScreen.sharedEpisodeId;
        }
        return homeRoute$AudioStoryScreen.copy(i, num);
    }

    public static final void write$Self$app_release(HomeRoute$AudioStoryScreen self, b output, e serialDesc) {
        output.w(0, self.storyId, serialDesc);
        if (!output.k(serialDesc) && self.sharedEpisodeId == null) {
            return;
        }
        output.x(serialDesc, 1, e0.a, self.sharedEpisodeId);
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public final Integer getSharedEpisodeId() {
        return this.sharedEpisodeId;
    }

    public final HomeRoute$AudioStoryScreen copy(int storyId, Integer sharedEpisodeId) {
        return new HomeRoute$AudioStoryScreen(storyId, sharedEpisodeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeRoute$AudioStoryScreen)) {
            return false;
        }
        HomeRoute$AudioStoryScreen homeRoute$AudioStoryScreen = (HomeRoute$AudioStoryScreen) other;
        return this.storyId == homeRoute$AudioStoryScreen.storyId && m.a(this.sharedEpisodeId, homeRoute$AudioStoryScreen.sharedEpisodeId);
    }

    public final Integer getSharedEpisodeId() {
        return this.sharedEpisodeId;
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storyId) * 31;
        Integer num = this.sharedEpisodeId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "AudioStoryScreen(storyId=" + this.storyId + ", sharedEpisodeId=" + this.sharedEpisodeId + ")";
    }
}
