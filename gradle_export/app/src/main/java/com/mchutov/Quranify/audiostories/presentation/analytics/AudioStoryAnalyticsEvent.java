package com.mchutov.quranify.audiostories.presentation.analytics;

import a1.b;
import a10.t;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g4.c;
import h00.d0;
import h00.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import oi.k;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0017%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "params", "", "", "", "getParams", "()Ljava/util/Map;", "AudioStoryCardTapped", "AudioStoryPreviewScreenViewed", "AudioStoryPreviewCtaTapped", "AudioStoryScreenViewed", "AudioStoryEpisodeStarted", "AudioStoryEpisodeCompleted", "AudioStoryCompleted", "AudioStoryPaywallRequested", "AudioStoryPaywallClosed", "AudioStorySpeedChanged", "AudioStorySleepTimerSet", "AudioStoryLanguageChanged", "AudioStoryTextToggled", "AudioStoryPlayerScreenViewed", "AudioStoryEpisodesSheetViewed", "AudioStoryInfoSheetViewed", "AudioStoryRecordingBlocked", "AudioStoryRecordingRestarted", "AudioStoryDownloadStarted", "AudioStoryDownloadCompleted", "AudioStoryDownloadFailed", "AudioStoryDownloadCancelled", "AudioStoryDownloadDeleted", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCardTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCancelled;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadDeleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadFailed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodesSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryInfoSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryLanguageChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallClosed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallRequested;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPlayerScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewCtaTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingBlocked;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingRestarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySleepTimerSet;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySpeedChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryTextToggled;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AudioStoryAnalyticsEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCardTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "storySlug", "", "button", "opensPreview", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "getButton", "getOpensPreview", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryCardTapped extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final String button;
        private final boolean opensPreview;
        private final int storyId;
        private final String storySlug;

        public AudioStoryCardTapped(int i, String storySlug, String button, boolean z) {
            super(null);
            m.e(storySlug, "storySlug");
            m.e(button, "button");
            this.storyId = i;
            this.storySlug = storySlug;
            this.button = button;
            this.opensPreview = z;
        }

        public static AudioStoryCardTapped copy$default(AudioStoryCardTapped audioStoryCardTapped, int i, String str, String str2, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = audioStoryCardTapped.storyId;
            }
            if ((i2 & 2) != 0) {
                str = audioStoryCardTapped.storySlug;
            }
            if ((i2 & 4) != 0) {
                str2 = audioStoryCardTapped.button;
            }
            if ((i2 & 8) != 0) {
                z = audioStoryCardTapped.opensPreview;
            }
            return audioStoryCardTapped.copy(i, str, str2, z);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public final String getButton() {
            return this.button;
        }

        public final boolean getOpensPreview() {
            return this.opensPreview;
        }

        public final AudioStoryCardTapped copy(int storyId, String storySlug, String button, boolean opensPreview) {
            m.e(storySlug, "storySlug");
            m.e(button, "button");
            return new AudioStoryCardTapped(storyId, storySlug, button, opensPreview);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryCardTapped)) {
                return false;
            }
            AudioStoryCardTapped audioStoryCardTapped = (AudioStoryCardTapped) other;
            return this.storyId == audioStoryCardTapped.storyId && m.a(this.storySlug, audioStoryCardTapped.storySlug) && m.a(this.button, audioStoryCardTapped.button) && this.opensPreview == audioStoryCardTapped.opensPreview;
        }

        public final String getButton() {
            return this.button;
        }

        public final boolean getOpensPreview() {
            return this.opensPreview;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public int hashCode() {
            return Boolean.hashCode(this.opensPreview) + x5.e(x5.e(Integer.hashCode(this.storyId) * 31, this.storySlug, 31), this.button, 31);
        }

        public String toString() {
            int i = this.storyId;
            String str = this.storySlug;
            String str2 = this.button;
            boolean z = this.opensPreview;
            StringBuilder sbM = c.m("AudioStoryCardTapped(storyId=", i, ", storySlug=", str, ", button=");
            sbM.append(str2);
            sbM.append(", opensPreview=");
            sbM.append(z);
            sbM.append(")");
            return sbM.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "storySlug", "", "episodeCount", "<init>", "(ILjava/lang/String;I)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "getEpisodeCount", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryCompleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeCount;
        private final int storyId;
        private final String storySlug;

        public AudioStoryCompleted(int i, String storySlug, int i2) {
            super(null);
            m.e(storySlug, "storySlug");
            this.storyId = i;
            this.storySlug = storySlug;
            this.episodeCount = i2;
        }

        public static AudioStoryCompleted copy$default(AudioStoryCompleted audioStoryCompleted, int i, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = audioStoryCompleted.storyId;
            }
            if ((i3 & 2) != 0) {
                str = audioStoryCompleted.storySlug;
            }
            if ((i3 & 4) != 0) {
                i2 = audioStoryCompleted.episodeCount;
            }
            return audioStoryCompleted.copy(i, str, i2);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public final int getEpisodeCount() {
            return this.episodeCount;
        }

        public final AudioStoryCompleted copy(int storyId, String storySlug, int episodeCount) {
            m.e(storySlug, "storySlug");
            return new AudioStoryCompleted(storyId, storySlug, episodeCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryCompleted)) {
                return false;
            }
            AudioStoryCompleted audioStoryCompleted = (AudioStoryCompleted) other;
            return this.storyId == audioStoryCompleted.storyId && m.a(this.storySlug, audioStoryCompleted.storySlug) && this.episodeCount == audioStoryCompleted.episodeCount;
        }

        public final int getEpisodeCount() {
            return this.episodeCount;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public int hashCode() {
            return Integer.hashCode(this.episodeCount) + x5.e(Integer.hashCode(this.storyId) * 31, this.storySlug, 31);
        }

        public String toString() {
            return c.g(this.episodeCount, ")", c.m("AudioStoryCompleted(storyId=", this.storyId, ", storySlug=", this.storySlug, ", episodeCount="));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCancelled;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "episodeId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getStoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeId", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCancelled;", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadCancelled extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final Integer episodeId;
        private final Integer storyId;

        public AudioStoryDownloadCancelled(Integer num, Integer num2) {
            super(null);
            this.storyId = num;
            this.episodeId = num2;
        }

        public static AudioStoryDownloadCancelled copy$default(AudioStoryDownloadCancelled audioStoryDownloadCancelled, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = audioStoryDownloadCancelled.storyId;
            }
            if ((i & 2) != 0) {
                num2 = audioStoryDownloadCancelled.episodeId;
            }
            return audioStoryDownloadCancelled.copy(num, num2);
        }

        public final Integer getStoryId() {
            return this.storyId;
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final AudioStoryDownloadCancelled copy(Integer storyId, Integer episodeId) {
            return new AudioStoryDownloadCancelled(storyId, episodeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryDownloadCancelled)) {
                return false;
            }
            AudioStoryDownloadCancelled audioStoryDownloadCancelled = (AudioStoryDownloadCancelled) other;
            return m.a(this.storyId, audioStoryDownloadCancelled.storyId) && m.a(this.episodeId, audioStoryDownloadCancelled.episodeId);
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final Integer getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            Integer num = this.storyId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.episodeId;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "AudioStoryDownloadCancelled(storyId=" + this.storyId + ", episodeId=" + this.episodeId + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "episodeId", "<init>", "(II)V", "getStoryId", "()I", "getEpisodeId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadCompleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeId;
        private final int storyId;

        public AudioStoryDownloadCompleted(int i, int i2) {
            super(null);
            this.storyId = i;
            this.episodeId = i2;
        }

        public static AudioStoryDownloadCompleted copy$default(AudioStoryDownloadCompleted audioStoryDownloadCompleted, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = audioStoryDownloadCompleted.storyId;
            }
            if ((i3 & 2) != 0) {
                i2 = audioStoryDownloadCompleted.episodeId;
            }
            return audioStoryDownloadCompleted.copy(i, i2);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final int getEpisodeId() {
            return this.episodeId;
        }

        public final AudioStoryDownloadCompleted copy(int storyId, int episodeId) {
            return new AudioStoryDownloadCompleted(storyId, episodeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryDownloadCompleted)) {
                return false;
            }
            AudioStoryDownloadCompleted audioStoryDownloadCompleted = (AudioStoryDownloadCompleted) other;
            return this.storyId == audioStoryDownloadCompleted.storyId && this.episodeId == audioStoryDownloadCompleted.episodeId;
        }

        public final int getEpisodeId() {
            return this.episodeId;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            return Integer.hashCode(this.episodeId) + (Integer.hashCode(this.storyId) * 31);
        }

        public String toString() {
            return c.e(this.storyId, this.episodeId, "AudioStoryDownloadCompleted(storyId=", ", episodeId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadDeleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "episodeId", "<init>", "(ILjava/lang/Integer;)V", "getStoryId", "()I", "getEpisodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadDeleted;", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadDeleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final Integer episodeId;
        private final int storyId;

        public AudioStoryDownloadDeleted(int i, Integer num) {
            super(null);
            this.storyId = i;
            this.episodeId = num;
        }

        public static AudioStoryDownloadDeleted copy$default(AudioStoryDownloadDeleted audioStoryDownloadDeleted, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = audioStoryDownloadDeleted.storyId;
            }
            if ((i2 & 2) != 0) {
                num = audioStoryDownloadDeleted.episodeId;
            }
            return audioStoryDownloadDeleted.copy(i, num);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final AudioStoryDownloadDeleted copy(int storyId, Integer episodeId) {
            return new AudioStoryDownloadDeleted(storyId, episodeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryDownloadDeleted)) {
                return false;
            }
            AudioStoryDownloadDeleted audioStoryDownloadDeleted = (AudioStoryDownloadDeleted) other;
            return this.storyId == audioStoryDownloadDeleted.storyId && m.a(this.episodeId, audioStoryDownloadDeleted.episodeId);
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.storyId) * 31;
            Integer num = this.episodeId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "AudioStoryDownloadDeleted(storyId=" + this.storyId + ", episodeId=" + this.episodeId + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadFailed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "episodeId", "error", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getStoryId", "()I", "getEpisodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadFailed;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadFailed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final Integer episodeId;
        private final String error;
        private final int storyId;

        public AudioStoryDownloadFailed(int i, Integer num, String error) {
            super(null);
            m.e(error, "error");
            this.storyId = i;
            this.episodeId = num;
            this.error = error;
        }

        public static AudioStoryDownloadFailed copy$default(AudioStoryDownloadFailed audioStoryDownloadFailed, int i, Integer num, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = audioStoryDownloadFailed.storyId;
            }
            if ((i2 & 2) != 0) {
                num = audioStoryDownloadFailed.episodeId;
            }
            if ((i2 & 4) != 0) {
                str = audioStoryDownloadFailed.error;
            }
            return audioStoryDownloadFailed.copy(i, num, str);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final String getError() {
            return this.error;
        }

        public final AudioStoryDownloadFailed copy(int storyId, Integer episodeId, String error) {
            m.e(error, "error");
            return new AudioStoryDownloadFailed(storyId, episodeId, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryDownloadFailed)) {
                return false;
            }
            AudioStoryDownloadFailed audioStoryDownloadFailed = (AudioStoryDownloadFailed) other;
            return this.storyId == audioStoryDownloadFailed.storyId && m.a(this.episodeId, audioStoryDownloadFailed.episodeId) && m.a(this.error, audioStoryDownloadFailed.error);
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final String getError() {
            return this.error;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.storyId) * 31;
            Integer num = this.episodeId;
            return this.error.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public String toString() {
            int i = this.storyId;
            Integer num = this.episodeId;
            String str = this.error;
            StringBuilder sb = new StringBuilder("AudioStoryDownloadFailed(storyId=");
            sb.append(i);
            sb.append(", episodeId=");
            sb.append(num);
            sb.append(", error=");
            return x5.n(sb, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "episodeId", "episodeCount", "<init>", "(ILjava/lang/Integer;I)V", "getStoryId", "()I", "getEpisodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeCount", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;I)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadStarted;", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadStarted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeCount;
        private final Integer episodeId;
        private final int storyId;

        public AudioStoryDownloadStarted(int i, Integer num, int i2) {
            super(null);
            this.storyId = i;
            this.episodeId = num;
            this.episodeCount = i2;
        }

        public static AudioStoryDownloadStarted copy$default(AudioStoryDownloadStarted audioStoryDownloadStarted, int i, Integer num, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = audioStoryDownloadStarted.storyId;
            }
            if ((i3 & 2) != 0) {
                num = audioStoryDownloadStarted.episodeId;
            }
            if ((i3 & 4) != 0) {
                i2 = audioStoryDownloadStarted.episodeCount;
            }
            return audioStoryDownloadStarted.copy(i, num, i2);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final int getEpisodeCount() {
            return this.episodeCount;
        }

        public final AudioStoryDownloadStarted copy(int storyId, Integer episodeId, int episodeCount) {
            return new AudioStoryDownloadStarted(storyId, episodeId, episodeCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryDownloadStarted)) {
                return false;
            }
            AudioStoryDownloadStarted audioStoryDownloadStarted = (AudioStoryDownloadStarted) other;
            return this.storyId == audioStoryDownloadStarted.storyId && m.a(this.episodeId, audioStoryDownloadStarted.episodeId) && this.episodeCount == audioStoryDownloadStarted.episodeCount;
        }

        public final int getEpisodeCount() {
            return this.episodeCount;
        }

        public final Integer getEpisodeId() {
            return this.episodeId;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.storyId) * 31;
            Integer num = this.episodeId;
            return Integer.hashCode(this.episodeCount) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public String toString() {
            int i = this.storyId;
            Integer num = this.episodeId;
            int i2 = this.episodeCount;
            StringBuilder sb = new StringBuilder("AudioStoryDownloadStarted(storyId=");
            sb.append(i);
            sb.append(", episodeId=");
            sb.append(num);
            sb.append(", episodeCount=");
            return c.g(i2, ")", sb);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryEpisodeCompleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;

        public AudioStoryEpisodeCompleted(AudioStoryEpisodeParams episode) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
        }

        public static AudioStoryEpisodeCompleted copy$default(AudioStoryEpisodeCompleted audioStoryEpisodeCompleted, AudioStoryEpisodeParams audioStoryEpisodeParams, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryEpisodeCompleted.episode;
            }
            return audioStoryEpisodeCompleted.copy(audioStoryEpisodeParams);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final AudioStoryEpisodeCompleted copy(AudioStoryEpisodeParams episode) {
            m.e(episode, "episode");
            return new AudioStoryEpisodeCompleted(episode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioStoryEpisodeCompleted) && m.a(this.episode, ((AudioStoryEpisodeCompleted) other).episode);
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public int hashCode() {
            return this.episode.hashCode();
        }

        public String toString() {
            return "AudioStoryEpisodeCompleted(episode=" + this.episode + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "isOffline", "", "isPremium", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;ZZ)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryEpisodeStarted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final boolean isOffline;
        private final boolean isPremium;

        public AudioStoryEpisodeStarted(AudioStoryEpisodeParams episode, boolean z, boolean z2) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
            this.isOffline = z;
            this.isPremium = z2;
        }

        public static AudioStoryEpisodeStarted copy$default(AudioStoryEpisodeStarted audioStoryEpisodeStarted, AudioStoryEpisodeParams audioStoryEpisodeParams, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryEpisodeStarted.episode;
            }
            if ((i & 2) != 0) {
                z = audioStoryEpisodeStarted.isOffline;
            }
            if ((i & 4) != 0) {
                z2 = audioStoryEpisodeStarted.isPremium;
            }
            return audioStoryEpisodeStarted.copy(audioStoryEpisodeParams, z, z2);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final boolean getIsOffline() {
            return this.isOffline;
        }

        public final boolean getIsPremium() {
            return this.isPremium;
        }

        public final AudioStoryEpisodeStarted copy(AudioStoryEpisodeParams episode, boolean isOffline, boolean isPremium) {
            m.e(episode, "episode");
            return new AudioStoryEpisodeStarted(episode, isOffline, isPremium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryEpisodeStarted)) {
                return false;
            }
            AudioStoryEpisodeStarted audioStoryEpisodeStarted = (AudioStoryEpisodeStarted) other;
            return m.a(this.episode, audioStoryEpisodeStarted.episode) && this.isOffline == audioStoryEpisodeStarted.isOffline && this.isPremium == audioStoryEpisodeStarted.isPremium;
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isPremium) + w.c.e(this.episode.hashCode() * 31, 31, this.isOffline);
        }

        public final boolean isOffline() {
            return this.isOffline;
        }

        public final boolean isPremium() {
            return this.isPremium;
        }

        public String toString() {
            AudioStoryEpisodeParams audioStoryEpisodeParams = this.episode;
            boolean z = this.isOffline;
            boolean z2 = this.isPremium;
            StringBuilder sb = new StringBuilder("AudioStoryEpisodeStarted(episode=");
            sb.append(audioStoryEpisodeParams);
            sb.append(", isOffline=");
            sb.append(z);
            sb.append(", isPremium=");
            return c.l(sb, z2, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodesSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryEpisodesSheetViewed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        public static final AudioStoryEpisodesSheetViewed INSTANCE = new AudioStoryEpisodesSheetViewed();

        private AudioStoryEpisodesSheetViewed() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AudioStoryEpisodesSheetViewed);
        }

        public int hashCode() {
            return 396203494;
        }

        public String toString() {
            return "AudioStoryEpisodesSheetViewed";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryInfoSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryInfoSheetViewed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        public static final AudioStoryInfoSheetViewed INSTANCE = new AudioStoryInfoSheetViewed();

        private AudioStoryInfoSheetViewed() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AudioStoryInfoSheetViewed);
        }

        public int hashCode() {
            return -1733380400;
        }

        public String toString() {
            return "AudioStoryInfoSheetViewed";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryLanguageChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "episodeId", "from", "", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getStoryId", "()I", "getEpisodeId", "getFrom", "()Ljava/lang/String;", "getTo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryLanguageChanged extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeId;
        private final String from;
        private final int storyId;
        private final String to;

        public AudioStoryLanguageChanged(int i, int i2, String from, String to2) {
            super(null);
            m.e(from, "from");
            m.e(to2, "to");
            this.storyId = i;
            this.episodeId = i2;
            this.from = from;
            this.to = to2;
        }

        public static AudioStoryLanguageChanged copy$default(AudioStoryLanguageChanged audioStoryLanguageChanged, int i, int i2, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = audioStoryLanguageChanged.storyId;
            }
            if ((i3 & 2) != 0) {
                i2 = audioStoryLanguageChanged.episodeId;
            }
            if ((i3 & 4) != 0) {
                str = audioStoryLanguageChanged.from;
            }
            if ((i3 & 8) != 0) {
                str2 = audioStoryLanguageChanged.to;
            }
            return audioStoryLanguageChanged.copy(i, i2, str, str2);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final int getEpisodeId() {
            return this.episodeId;
        }

        public final String getFrom() {
            return this.from;
        }

        public final String getTo() {
            return this.to;
        }

        public final AudioStoryLanguageChanged copy(int storyId, int episodeId, String from, String to2) {
            m.e(from, "from");
            m.e(to2, "to");
            return new AudioStoryLanguageChanged(storyId, episodeId, from, to2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryLanguageChanged)) {
                return false;
            }
            AudioStoryLanguageChanged audioStoryLanguageChanged = (AudioStoryLanguageChanged) other;
            return this.storyId == audioStoryLanguageChanged.storyId && this.episodeId == audioStoryLanguageChanged.episodeId && m.a(this.from, audioStoryLanguageChanged.from) && m.a(this.to, audioStoryLanguageChanged.to);
        }

        public final int getEpisodeId() {
            return this.episodeId;
        }

        public final String getFrom() {
            return this.from;
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            return this.to.hashCode() + x5.e(w.c.d(this.episodeId, Integer.hashCode(this.storyId) * 31, 31), this.from, 31);
        }

        public String toString() {
            int i = this.storyId;
            int i2 = this.episodeId;
            return k.m(k.p(i, i2, "AudioStoryLanguageChanged(storyId=", ", episodeId=", ", from="), this.from, ", to=", this.to, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallClosed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "purchased", "", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;Z)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "getPurchased", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPaywallClosed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final boolean purchased;

        public AudioStoryPaywallClosed(AudioStoryEpisodeParams episode, boolean z) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
            this.purchased = z;
        }

        public static AudioStoryPaywallClosed copy$default(AudioStoryPaywallClosed audioStoryPaywallClosed, AudioStoryEpisodeParams audioStoryEpisodeParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryPaywallClosed.episode;
            }
            if ((i & 2) != 0) {
                z = audioStoryPaywallClosed.purchased;
            }
            return audioStoryPaywallClosed.copy(audioStoryEpisodeParams, z);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final boolean getPurchased() {
            return this.purchased;
        }

        public final AudioStoryPaywallClosed copy(AudioStoryEpisodeParams episode, boolean purchased) {
            m.e(episode, "episode");
            return new AudioStoryPaywallClosed(episode, purchased);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryPaywallClosed)) {
                return false;
            }
            AudioStoryPaywallClosed audioStoryPaywallClosed = (AudioStoryPaywallClosed) other;
            return m.a(this.episode, audioStoryPaywallClosed.episode) && this.purchased == audioStoryPaywallClosed.purchased;
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final boolean getPurchased() {
            return this.purchased;
        }

        public int hashCode() {
            return Boolean.hashCode(this.purchased) + (this.episode.hashCode() * 31);
        }

        public String toString() {
            return "AudioStoryPaywallClosed(episode=" + this.episode + ", purchased=" + this.purchased + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallRequested;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "trigger", "", "positionMs", "", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;Ljava/lang/String;J)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "getTrigger", "()Ljava/lang/String;", "getPositionMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPaywallRequested extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final long positionMs;
        private final String trigger;

        public AudioStoryPaywallRequested(AudioStoryEpisodeParams episode, String trigger, long j) {
            super(null);
            m.e(episode, "episode");
            m.e(trigger, "trigger");
            this.episode = episode;
            this.trigger = trigger;
            this.positionMs = j;
        }

        public static AudioStoryPaywallRequested copy$default(AudioStoryPaywallRequested audioStoryPaywallRequested, AudioStoryEpisodeParams audioStoryEpisodeParams, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryPaywallRequested.episode;
            }
            if ((i & 2) != 0) {
                str = audioStoryPaywallRequested.trigger;
            }
            if ((i & 4) != 0) {
                j = audioStoryPaywallRequested.positionMs;
            }
            return audioStoryPaywallRequested.copy(audioStoryEpisodeParams, str, j);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final String getTrigger() {
            return this.trigger;
        }

        public final long getPositionMs() {
            return this.positionMs;
        }

        public final AudioStoryPaywallRequested copy(AudioStoryEpisodeParams episode, String trigger, long positionMs) {
            m.e(episode, "episode");
            m.e(trigger, "trigger");
            return new AudioStoryPaywallRequested(episode, trigger, positionMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryPaywallRequested)) {
                return false;
            }
            AudioStoryPaywallRequested audioStoryPaywallRequested = (AudioStoryPaywallRequested) other;
            return m.a(this.episode, audioStoryPaywallRequested.episode) && m.a(this.trigger, audioStoryPaywallRequested.trigger) && this.positionMs == audioStoryPaywallRequested.positionMs;
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final long getPositionMs() {
            return this.positionMs;
        }

        public final String getTrigger() {
            return this.trigger;
        }

        public int hashCode() {
            return Long.hashCode(this.positionMs) + x5.e(this.episode.hashCode() * 31, this.trigger, 31);
        }

        public String toString() {
            AudioStoryEpisodeParams audioStoryEpisodeParams = this.episode;
            String str = this.trigger;
            long j = this.positionMs;
            StringBuilder sb = new StringBuilder("AudioStoryPaywallRequested(episode=");
            sb.append(audioStoryEpisodeParams);
            sb.append(", trigger=");
            sb.append(str);
            sb.append(", positionMs=");
            return b.k(j, ")", sb);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPlayerScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPlayerScreenViewed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        public static final AudioStoryPlayerScreenViewed INSTANCE = new AudioStoryPlayerScreenViewed();

        private AudioStoryPlayerScreenViewed() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AudioStoryPlayerScreenViewed);
        }

        public int hashCode() {
            return -143952618;
        }

        public String toString() {
            return "AudioStoryPlayerScreenViewed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewCtaTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "storySlug", "", "<init>", "(ILjava/lang/String;)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPreviewCtaTapped extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int storyId;
        private final String storySlug;

        public AudioStoryPreviewCtaTapped(int i, String storySlug) {
            super(null);
            m.e(storySlug, "storySlug");
            this.storyId = i;
            this.storySlug = storySlug;
        }

        public static AudioStoryPreviewCtaTapped copy$default(AudioStoryPreviewCtaTapped audioStoryPreviewCtaTapped, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = audioStoryPreviewCtaTapped.storyId;
            }
            if ((i2 & 2) != 0) {
                str = audioStoryPreviewCtaTapped.storySlug;
            }
            return audioStoryPreviewCtaTapped.copy(i, str);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public final AudioStoryPreviewCtaTapped copy(int storyId, String storySlug) {
            m.e(storySlug, "storySlug");
            return new AudioStoryPreviewCtaTapped(storyId, storySlug);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryPreviewCtaTapped)) {
                return false;
            }
            AudioStoryPreviewCtaTapped audioStoryPreviewCtaTapped = (AudioStoryPreviewCtaTapped) other;
            return this.storyId == audioStoryPreviewCtaTapped.storyId && m.a(this.storySlug, audioStoryPreviewCtaTapped.storySlug);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public int hashCode() {
            return this.storySlug.hashCode() + (Integer.hashCode(this.storyId) * 31);
        }

        public String toString() {
            return "AudioStoryPreviewCtaTapped(storyId=" + this.storyId + ", storySlug=" + this.storySlug + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPreviewScreenViewed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        public static final AudioStoryPreviewScreenViewed INSTANCE = new AudioStoryPreviewScreenViewed();

        private AudioStoryPreviewScreenViewed() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AudioStoryPreviewScreenViewed);
        }

        public int hashCode() {
            return 178321427;
        }

        public String toString() {
            return "AudioStoryPreviewScreenViewed";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingBlocked;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryRecordingBlocked extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;

        public AudioStoryRecordingBlocked(AudioStoryEpisodeParams episode) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
        }

        public static AudioStoryRecordingBlocked copy$default(AudioStoryRecordingBlocked audioStoryRecordingBlocked, AudioStoryEpisodeParams audioStoryEpisodeParams, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryRecordingBlocked.episode;
            }
            return audioStoryRecordingBlocked.copy(audioStoryEpisodeParams);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final AudioStoryRecordingBlocked copy(AudioStoryEpisodeParams episode) {
            m.e(episode, "episode");
            return new AudioStoryRecordingBlocked(episode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioStoryRecordingBlocked) && m.a(this.episode, ((AudioStoryRecordingBlocked) other).episode);
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public int hashCode() {
            return this.episode.hashCode();
        }

        public String toString() {
            return "AudioStoryRecordingBlocked(episode=" + this.episode + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingRestarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryRecordingRestarted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;

        public AudioStoryRecordingRestarted(AudioStoryEpisodeParams episode) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
        }

        public static AudioStoryRecordingRestarted copy$default(AudioStoryRecordingRestarted audioStoryRecordingRestarted, AudioStoryEpisodeParams audioStoryEpisodeParams, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryRecordingRestarted.episode;
            }
            return audioStoryRecordingRestarted.copy(audioStoryEpisodeParams);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final AudioStoryRecordingRestarted copy(AudioStoryEpisodeParams episode) {
            m.e(episode, "episode");
            return new AudioStoryRecordingRestarted(episode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioStoryRecordingRestarted) && m.a(this.episode, ((AudioStoryRecordingRestarted) other).episode);
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public int hashCode() {
            return this.episode.hashCode();
        }

        public String toString() {
            return "AudioStoryRecordingRestarted(episode=" + this.episode + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", "", "storySlug", "", "<init>", "(ILjava/lang/String;)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryScreenViewed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int storyId;
        private final String storySlug;

        public AudioStoryScreenViewed(int i, String storySlug) {
            super(null);
            m.e(storySlug, "storySlug");
            this.storyId = i;
            this.storySlug = storySlug;
        }

        public static AudioStoryScreenViewed copy$default(AudioStoryScreenViewed audioStoryScreenViewed, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = audioStoryScreenViewed.storyId;
            }
            if ((i2 & 2) != 0) {
                str = audioStoryScreenViewed.storySlug;
            }
            return audioStoryScreenViewed.copy(i, str);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public final AudioStoryScreenViewed copy(int storyId, String storySlug) {
            m.e(storySlug, "storySlug");
            return new AudioStoryScreenViewed(storyId, storySlug);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryScreenViewed)) {
                return false;
            }
            AudioStoryScreenViewed audioStoryScreenViewed = (AudioStoryScreenViewed) other;
            return this.storyId == audioStoryScreenViewed.storyId && m.a(this.storySlug, audioStoryScreenViewed.storySlug);
        }

        public final int getStoryId() {
            return this.storyId;
        }

        public final String getStorySlug() {
            return this.storySlug;
        }

        public int hashCode() {
            return this.storySlug.hashCode() + (Integer.hashCode(this.storyId) * 31);
        }

        public String toString() {
            return "AudioStoryScreenViewed(storyId=" + this.storyId + ", storySlug=" + this.storySlug + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySleepTimerSet;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "option", "", "<init>", "(Ljava/lang/String;)V", "getOption", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStorySleepTimerSet extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final String option;

        public AudioStorySleepTimerSet(String option) {
            super(null);
            m.e(option, "option");
            this.option = option;
        }

        public static AudioStorySleepTimerSet copy$default(AudioStorySleepTimerSet audioStorySleepTimerSet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = audioStorySleepTimerSet.option;
            }
            return audioStorySleepTimerSet.copy(str);
        }

        public final String getOption() {
            return this.option;
        }

        public final AudioStorySleepTimerSet copy(String option) {
            m.e(option, "option");
            return new AudioStorySleepTimerSet(option);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioStorySleepTimerSet) && m.a(this.option, ((AudioStorySleepTimerSet) other).option);
        }

        public final String getOption() {
            return this.option;
        }

        public int hashCode() {
            return this.option.hashCode();
        }

        public String toString() {
            return b.p("AudioStorySleepTimerSet(option=", this.option, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySpeedChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "speed", "", "<init>", "(F)V", "getSpeed", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStorySpeedChanged extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final float speed;

        public AudioStorySpeedChanged(float f) {
            super(null);
            this.speed = f;
        }

        public static AudioStorySpeedChanged copy$default(AudioStorySpeedChanged audioStorySpeedChanged, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = audioStorySpeedChanged.speed;
            }
            return audioStorySpeedChanged.copy(f);
        }

        public final float getSpeed() {
            return this.speed;
        }

        public final AudioStorySpeedChanged copy(float speed) {
            return new AudioStorySpeedChanged(speed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioStorySpeedChanged) && Float.compare(this.speed, ((AudioStorySpeedChanged) other).speed) == 0;
        }

        public final float getSpeed() {
            return this.speed;
        }

        public int hashCode() {
            return Float.hashCode(this.speed);
        }

        public String toString() {
            return "AudioStorySpeedChanged(speed=" + this.speed + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryTextToggled;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "isShown", "", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;Z)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryTextToggled extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final boolean isShown;

        public AudioStoryTextToggled(AudioStoryEpisodeParams episode, boolean z) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
            this.isShown = z;
        }

        public static AudioStoryTextToggled copy$default(AudioStoryTextToggled audioStoryTextToggled, AudioStoryEpisodeParams audioStoryEpisodeParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                audioStoryEpisodeParams = audioStoryTextToggled.episode;
            }
            if ((i & 2) != 0) {
                z = audioStoryTextToggled.isShown;
            }
            return audioStoryTextToggled.copy(audioStoryEpisodeParams, z);
        }

        public final AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public final boolean getIsShown() {
            return this.isShown;
        }

        public final AudioStoryTextToggled copy(AudioStoryEpisodeParams episode, boolean isShown) {
            m.e(episode, "episode");
            return new AudioStoryTextToggled(episode, isShown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioStoryTextToggled)) {
                return false;
            }
            AudioStoryTextToggled audioStoryTextToggled = (AudioStoryTextToggled) other;
            return m.a(this.episode, audioStoryTextToggled.episode) && this.isShown == audioStoryTextToggled.isShown;
        }

        @Override
        public AudioStoryEpisodeParams getEpisode() {
            return this.episode;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShown) + (this.episode.hashCode() * 31);
        }

        public final boolean isShown() {
            return this.isShown;
        }

        public String toString() {
            return "AudioStoryTextToggled(episode=" + this.episode + ", isShown=" + this.isShown + ")";
        }
    }

    private AudioStoryAnalyticsEvent() {
    }

    public AudioStoryAnalyticsEvent(f fVar) {
        this();
    }

    public AudioStoryEpisodeParams getEpisode() {
        return null;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = super.getParams();
        m.e(params, "<this>");
        LinkedHashMap linkedHashMapB0 = d0.b0(params);
        linkedHashMapB0.remove("episode");
        Map mapT = d0.T(linkedHashMapB0);
        AudioStoryEpisodeParams episode = getEpisode();
        Map<String, Object> params2 = episode != null ? episode.getParams() : null;
        if (params2 == null) {
            params2 = y.A;
        }
        return d0.U(mapT, params2);
    }

    @Override
    public g00.k transformProperties(t tVar) {
        return super.transformProperties(tVar);
    }
}
