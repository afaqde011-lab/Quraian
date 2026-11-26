package com.mchutov.p000quranify.home.presentation.screen.home;

import com.google.protobuf.RuntimeVersion;
import g4.c;
import kotlin.Metadata;
import ur.x0;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"com/mchutov/quranify/home/presentation/screen/home/HomeEffect$OpenAudioStoryScreen", "Lur/x0;", RuntimeVersion.SUFFIX, "storyId", "<init>", "(I)V", "component1", "()I", "Lcom/mchutov/quranify/home/presentation/screen/home/HomeEffect$OpenAudioStoryScreen;", "copy", "(I)Lcom/mchutov/quranify/home/presentation/screen/home/HomeEffect$OpenAudioStoryScreen;", RuntimeVersion.SUFFIX, "toString", "()Ljava/lang/String;", "hashCode", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "equals", "(Ljava/lang/Object;)Z", "I", "getStoryId", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HomeEffect$OpenAudioStoryScreen implements x0 {
    public static final int $stable = 0;
    private final int storyId;

    public HomeEffect$OpenAudioStoryScreen(int i11) {
        this.storyId = i11;
    }

    public static HomeEffect$OpenAudioStoryScreen copy$default(HomeEffect$OpenAudioStoryScreen homeEffect$OpenAudioStoryScreen, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = homeEffect$OpenAudioStoryScreen.storyId;
        }
        return homeEffect$OpenAudioStoryScreen.copy(i11);
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public final HomeEffect$OpenAudioStoryScreen copy(int storyId) {
        return new HomeEffect$OpenAudioStoryScreen(storyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeEffect$OpenAudioStoryScreen) && this.storyId == ((HomeEffect$OpenAudioStoryScreen) other).storyId;
    }

    @Override
    public long getDebounce() {
        return 300L;
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public int hashCode() {
        return Integer.hashCode(this.storyId);
    }

    public String toString() {
        return c.i("OpenAudioStoryScreen(storyId=", this.storyId, ")");
    }
}
