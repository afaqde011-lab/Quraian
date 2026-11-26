package com.mchutov.quranify.audiostories.presentation.analytics;

import com.google.android.gms.internal.measurement.x5;
import i00.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import r30.k;
import w.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "", "storyId", "", "storySlug", "", "episodeId", "episodeOrder", "audioLanguage", "<init>", "(ILjava/lang/String;IILjava/lang/String;)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "getEpisodeId", "getEpisodeOrder", "getAudioLanguage", "params", "", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoryEpisodeParams {
    public static final int $stable = 0;
    private final String audioLanguage;
    private final int episodeId;
    private final int episodeOrder;
    private final int storyId;
    private final String storySlug;

    public AudioStoryEpisodeParams(int i, String storySlug, int i2, int i3, String audioLanguage) {
        m.e(storySlug, "storySlug");
        m.e(audioLanguage, "audioLanguage");
        this.storyId = i;
        this.storySlug = storySlug;
        this.episodeId = i2;
        this.episodeOrder = i3;
        this.audioLanguage = audioLanguage;
    }

    public static AudioStoryEpisodeParams copy$default(AudioStoryEpisodeParams audioStoryEpisodeParams, int i, String str, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = audioStoryEpisodeParams.storyId;
        }
        if ((i4 & 2) != 0) {
            str = audioStoryEpisodeParams.storySlug;
        }
        if ((i4 & 4) != 0) {
            i2 = audioStoryEpisodeParams.episodeId;
        }
        if ((i4 & 8) != 0) {
            i3 = audioStoryEpisodeParams.episodeOrder;
        }
        if ((i4 & 16) != 0) {
            str2 = audioStoryEpisodeParams.audioLanguage;
        }
        String str3 = str2;
        int i5 = i2;
        return audioStoryEpisodeParams.copy(i, str, i5, i3, str3);
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public final String getStorySlug() {
        return this.storySlug;
    }

    public final int getEpisodeId() {
        return this.episodeId;
    }

    public final int getEpisodeOrder() {
        return this.episodeOrder;
    }

    public final String getAudioLanguage() {
        return this.audioLanguage;
    }

    public final AudioStoryEpisodeParams copy(int storyId, String storySlug, int episodeId, int episodeOrder, String audioLanguage) {
        m.e(storySlug, "storySlug");
        m.e(audioLanguage, "audioLanguage");
        return new AudioStoryEpisodeParams(storyId, storySlug, episodeId, episodeOrder, audioLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioStoryEpisodeParams)) {
            return false;
        }
        AudioStoryEpisodeParams audioStoryEpisodeParams = (AudioStoryEpisodeParams) other;
        return this.storyId == audioStoryEpisodeParams.storyId && m.a(this.storySlug, audioStoryEpisodeParams.storySlug) && this.episodeId == audioStoryEpisodeParams.episodeId && this.episodeOrder == audioStoryEpisodeParams.episodeOrder && m.a(this.audioLanguage, audioStoryEpisodeParams.audioLanguage);
    }

    public final String getAudioLanguage() {
        return this.audioLanguage;
    }

    public final int getEpisodeId() {
        return this.episodeId;
    }

    public final int getEpisodeOrder() {
        return this.episodeOrder;
    }

    public final Map<String, Object> getParams() {
        f fVar = new f();
        fVar.put("story_id", Integer.valueOf(this.storyId));
        if (!k.L0(this.storySlug)) {
            fVar.put("story_slug", this.storySlug);
        }
        fVar.put("episode_id", Integer.valueOf(this.episodeId));
        fVar.put("episode_order", Integer.valueOf(this.episodeOrder));
        if (!k.L0(this.audioLanguage)) {
            fVar.put("audio_language", this.audioLanguage);
        }
        return fVar.c();
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public final String getStorySlug() {
        return this.storySlug;
    }

    public int hashCode() {
        return this.audioLanguage.hashCode() + c.d(this.episodeOrder, c.d(this.episodeId, x5.e(Integer.hashCode(this.storyId) * 31, this.storySlug, 31), 31), 31);
    }

    public String toString() {
        int i = this.storyId;
        String str = this.storySlug;
        int i2 = this.episodeId;
        int i3 = this.episodeOrder;
        String str2 = this.audioLanguage;
        StringBuilder sbM = g4.c.m("AudioStoryEpisodeParams(storyId=", i, ", storySlug=", str, ", episodeId=");
        c.u(sbM, i2, ", episodeOrder=", i3, ", audioLanguage=");
        return x5.n(sbM, str2, ")");
    }
}
