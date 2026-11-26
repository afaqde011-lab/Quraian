package com.mchutov.p000quranify.audiostories.presentation.analytics;

import a1.b;
import a10.t;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
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

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0017%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "params", RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, "getParams", "()Ljava/util/Map;", "AudioStoryCardTapped", "AudioStoryPreviewScreenViewed", "AudioStoryPreviewCtaTapped", "AudioStoryScreenViewed", "AudioStoryEpisodeStarted", "AudioStoryEpisodeCompleted", "AudioStoryCompleted", "AudioStoryPaywallRequested", "AudioStoryPaywallClosed", "AudioStorySpeedChanged", "AudioStorySleepTimerSet", "AudioStoryLanguageChanged", "AudioStoryTextToggled", "AudioStoryPlayerScreenViewed", "AudioStoryEpisodesSheetViewed", "AudioStoryInfoSheetViewed", "AudioStoryRecordingBlocked", "AudioStoryRecordingRestarted", "AudioStoryDownloadStarted", "AudioStoryDownloadCompleted", "AudioStoryDownloadFailed", "AudioStoryDownloadCancelled", "AudioStoryDownloadDeleted", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCardTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCancelled;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadDeleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadFailed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodesSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryInfoSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryLanguageChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallClosed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallRequested;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPlayerScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewCtaTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingBlocked;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingRestarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySleepTimerSet;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySpeedChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryTextToggled;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AudioStoryAnalyticsEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCardTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "storySlug", RuntimeVersion.SUFFIX, "button", "opensPreview", RuntimeVersion.SUFFIX, "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "getButton", "getOpensPreview", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryCardTapped extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final String button;
        private final boolean opensPreview;
        private final int storyId;
        private final String storySlug;

        public AudioStoryCardTapped(int i11, String storySlug, String button, boolean z11) {
            super(null);
            m.e(storySlug, "storySlug");
            m.e(button, "button");
            this.storyId = i11;
            this.storySlug = storySlug;
            this.button = button;
            this.opensPreview = z11;
        }

        public static AudioStoryCardTapped copy$default(AudioStoryCardTapped audioStoryCardTapped, int i11, String str, String str2, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = audioStoryCardTapped.storyId;
            }
            if ((i12 & 2) != 0) {
                str = audioStoryCardTapped.storySlug;
            }
            if ((i12 & 4) != 0) {
                str2 = audioStoryCardTapped.button;
            }
            if ((i12 & 8) != 0) {
                z11 = audioStoryCardTapped.opensPreview;
            }
            return audioStoryCardTapped.copy(i11, str, str2, z11);
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
            int i11 = this.storyId;
            String str = this.storySlug;
            String str2 = this.button;
            boolean z11 = this.opensPreview;
            StringBuilder sbM = c.m("AudioStoryCardTapped(storyId=", i11, ", storySlug=", str, ", button=");
            sbM.append(str2);
            sbM.append(", opensPreview=");
            sbM.append(z11);
            sbM.append(")");
            return sbM.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "storySlug", RuntimeVersion.SUFFIX, "episodeCount", "<init>", "(ILjava/lang/String;I)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "getEpisodeCount", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryCompleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeCount;
        private final int storyId;
        private final String storySlug;

        public AudioStoryCompleted(int i11, String storySlug, int i12) {
            super(null);
            m.e(storySlug, "storySlug");
            this.storyId = i11;
            this.storySlug = storySlug;
            this.episodeCount = i12;
        }

        public static AudioStoryCompleted copy$default(AudioStoryCompleted audioStoryCompleted, int i11, String str, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = audioStoryCompleted.storyId;
            }
            if ((i13 & 2) != 0) {
                str = audioStoryCompleted.storySlug;
            }
            if ((i13 & 4) != 0) {
                i12 = audioStoryCompleted.episodeCount;
            }
            return audioStoryCompleted.copy(i11, str, i12);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCancelled;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "episodeId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getStoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeId", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCancelled;", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadCancelled extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final Integer episodeId;
        private final Integer storyId;

        public AudioStoryDownloadCancelled(Integer num, Integer num2) {
            super(null);
            this.storyId = num;
            this.episodeId = num2;
        }

        public static AudioStoryDownloadCancelled copy$default(AudioStoryDownloadCancelled audioStoryDownloadCancelled, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = audioStoryDownloadCancelled.storyId;
            }
            if ((i11 & 2) != 0) {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "episodeId", "<init>", "(II)V", "getStoryId", "()I", "getEpisodeId", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadCompleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeId;
        private final int storyId;

        public AudioStoryDownloadCompleted(int i11, int i12) {
            super(null);
            this.storyId = i11;
            this.episodeId = i12;
        }

        public static AudioStoryDownloadCompleted copy$default(AudioStoryDownloadCompleted audioStoryDownloadCompleted, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = audioStoryDownloadCompleted.storyId;
            }
            if ((i13 & 2) != 0) {
                i12 = audioStoryDownloadCompleted.episodeId;
            }
            return audioStoryDownloadCompleted.copy(i11, i12);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadDeleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "episodeId", "<init>", "(ILjava/lang/Integer;)V", "getStoryId", "()I", "getEpisodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadDeleted;", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadDeleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final Integer episodeId;
        private final int storyId;

        public AudioStoryDownloadDeleted(int i11, Integer num) {
            super(null);
            this.storyId = i11;
            this.episodeId = num;
        }

        public static AudioStoryDownloadDeleted copy$default(AudioStoryDownloadDeleted audioStoryDownloadDeleted, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = audioStoryDownloadDeleted.storyId;
            }
            if ((i12 & 2) != 0) {
                num = audioStoryDownloadDeleted.episodeId;
            }
            return audioStoryDownloadDeleted.copy(i11, num);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadFailed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "episodeId", "error", RuntimeVersion.SUFFIX, "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getStoryId", "()I", "getEpisodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadFailed;", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadFailed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final Integer episodeId;
        private final String error;
        private final int storyId;

        public AudioStoryDownloadFailed(int i11, Integer num, String error) {
            super(null);
            m.e(error, "error");
            this.storyId = i11;
            this.episodeId = num;
            this.error = error;
        }

        public static AudioStoryDownloadFailed copy$default(AudioStoryDownloadFailed audioStoryDownloadFailed, int i11, Integer num, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = audioStoryDownloadFailed.storyId;
            }
            if ((i12 & 2) != 0) {
                num = audioStoryDownloadFailed.episodeId;
            }
            if ((i12 & 4) != 0) {
                str = audioStoryDownloadFailed.error;
            }
            return audioStoryDownloadFailed.copy(i11, num, str);
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
            int i11 = this.storyId;
            Integer num = this.episodeId;
            String str = this.error;
            StringBuilder sb2 = new StringBuilder("AudioStoryDownloadFailed(storyId=");
            sb2.append(i11);
            sb2.append(", episodeId=");
            sb2.append(num);
            sb2.append(", error=");
            return x5.n(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "episodeId", "episodeCount", "<init>", "(ILjava/lang/Integer;I)V", "getStoryId", "()I", "getEpisodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeCount", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;I)Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryDownloadStarted;", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryDownloadStarted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeCount;
        private final Integer episodeId;
        private final int storyId;

        public AudioStoryDownloadStarted(int i11, Integer num, int i12) {
            super(null);
            this.storyId = i11;
            this.episodeId = num;
            this.episodeCount = i12;
        }

        public static AudioStoryDownloadStarted copy$default(AudioStoryDownloadStarted audioStoryDownloadStarted, int i11, Integer num, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = audioStoryDownloadStarted.storyId;
            }
            if ((i13 & 2) != 0) {
                num = audioStoryDownloadStarted.episodeId;
            }
            if ((i13 & 4) != 0) {
                i12 = audioStoryDownloadStarted.episodeCount;
            }
            return audioStoryDownloadStarted.copy(i11, num, i12);
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
            int i11 = this.storyId;
            Integer num = this.episodeId;
            int i12 = this.episodeCount;
            StringBuilder sb2 = new StringBuilder("AudioStoryDownloadStarted(storyId=");
            sb2.append(i11);
            sb2.append(", episodeId=");
            sb2.append(num);
            sb2.append(", episodeCount=");
            return c.g(i12, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeCompleted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryEpisodeCompleted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;

        public AudioStoryEpisodeCompleted(AudioStoryEpisodeParams episode) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
        }

        public static AudioStoryEpisodeCompleted copy$default(AudioStoryEpisodeCompleted audioStoryEpisodeCompleted, AudioStoryEpisodeParams audioStoryEpisodeParams, int i11, Object obj) {
            if ((i11 & 1) != 0) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodeStarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "isOffline", RuntimeVersion.SUFFIX, "isPremium", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;ZZ)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryEpisodeStarted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final boolean isOffline;
        private final boolean isPremium;

        public AudioStoryEpisodeStarted(AudioStoryEpisodeParams episode, boolean z11, boolean z12) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
            this.isOffline = z11;
            this.isPremium = z12;
        }

        public static AudioStoryEpisodeStarted copy$default(AudioStoryEpisodeStarted audioStoryEpisodeStarted, AudioStoryEpisodeParams audioStoryEpisodeParams, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                audioStoryEpisodeParams = audioStoryEpisodeStarted.episode;
            }
            if ((i11 & 2) != 0) {
                z11 = audioStoryEpisodeStarted.isOffline;
            }
            if ((i11 & 4) != 0) {
                z12 = audioStoryEpisodeStarted.isPremium;
            }
            return audioStoryEpisodeStarted.copy(audioStoryEpisodeParams, z11, z12);
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
            boolean z11 = this.isOffline;
            boolean z12 = this.isPremium;
            StringBuilder sb2 = new StringBuilder("AudioStoryEpisodeStarted(episode=");
            sb2.append(audioStoryEpisodeParams);
            sb2.append(", isOffline=");
            sb2.append(z11);
            sb2.append(", isPremium=");
            return c.l(sb2, z12, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryEpisodesSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryInfoSheetViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryLanguageChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "episodeId", "from", RuntimeVersion.SUFFIX, "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getStoryId", "()I", "getEpisodeId", "getFrom", "()Ljava/lang/String;", "getTo", "component1", "component2", "component3", "component4", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryLanguageChanged extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int episodeId;
        private final String from;
        private final int storyId;
        private final String to;

        public AudioStoryLanguageChanged(int i11, int i12, String from, String to2) {
            super(null);
            m.e(from, "from");
            m.e(to2, "to");
            this.storyId = i11;
            this.episodeId = i12;
            this.from = from;
            this.to = to2;
        }

        public static AudioStoryLanguageChanged copy$default(AudioStoryLanguageChanged audioStoryLanguageChanged, int i11, int i12, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = audioStoryLanguageChanged.storyId;
            }
            if ((i13 & 2) != 0) {
                i12 = audioStoryLanguageChanged.episodeId;
            }
            if ((i13 & 4) != 0) {
                str = audioStoryLanguageChanged.from;
            }
            if ((i13 & 8) != 0) {
                str2 = audioStoryLanguageChanged.to;
            }
            return audioStoryLanguageChanged.copy(i11, i12, str, str2);
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
            int i11 = this.storyId;
            int i12 = this.episodeId;
            return k.m(k.p(i11, i12, "AudioStoryLanguageChanged(storyId=", ", episodeId=", ", from="), this.from, ", to=", this.to, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallClosed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "purchased", RuntimeVersion.SUFFIX, "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;Z)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "getPurchased", "()Z", "component1", "component2", "copy", "equals", "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPaywallClosed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final boolean purchased;

        public AudioStoryPaywallClosed(AudioStoryEpisodeParams episode, boolean z11) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
            this.purchased = z11;
        }

        public static AudioStoryPaywallClosed copy$default(AudioStoryPaywallClosed audioStoryPaywallClosed, AudioStoryEpisodeParams audioStoryEpisodeParams, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                audioStoryEpisodeParams = audioStoryPaywallClosed.episode;
            }
            if ((i11 & 2) != 0) {
                z11 = audioStoryPaywallClosed.purchased;
            }
            return audioStoryPaywallClosed.copy(audioStoryEpisodeParams, z11);
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPaywallRequested;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "trigger", RuntimeVersion.SUFFIX, "positionMs", RuntimeVersion.SUFFIX, "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;Ljava/lang/String;J)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "getTrigger", "()Ljava/lang/String;", "getPositionMs", "()J", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPaywallRequested extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final long positionMs;
        private final String trigger;

        public AudioStoryPaywallRequested(AudioStoryEpisodeParams episode, String trigger, long j9) {
            super(null);
            m.e(episode, "episode");
            m.e(trigger, "trigger");
            this.episode = episode;
            this.trigger = trigger;
            this.positionMs = j9;
        }

        public static AudioStoryPaywallRequested copy$default(AudioStoryPaywallRequested audioStoryPaywallRequested, AudioStoryEpisodeParams audioStoryEpisodeParams, String str, long j9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                audioStoryEpisodeParams = audioStoryPaywallRequested.episode;
            }
            if ((i11 & 2) != 0) {
                str = audioStoryPaywallRequested.trigger;
            }
            if ((i11 & 4) != 0) {
                j9 = audioStoryPaywallRequested.positionMs;
            }
            return audioStoryPaywallRequested.copy(audioStoryEpisodeParams, str, j9);
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
            long j9 = this.positionMs;
            StringBuilder sb2 = new StringBuilder("AudioStoryPaywallRequested(episode=");
            sb2.append(audioStoryEpisodeParams);
            sb2.append(", trigger=");
            sb2.append(str);
            sb2.append(", positionMs=");
            return b.k(j9, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPlayerScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewCtaTapped;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "storySlug", RuntimeVersion.SUFFIX, "<init>", "(ILjava/lang/String;)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryPreviewCtaTapped extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int storyId;
        private final String storySlug;

        public AudioStoryPreviewCtaTapped(int i11, String storySlug) {
            super(null);
            m.e(storySlug, "storySlug");
            this.storyId = i11;
            this.storySlug = storySlug;
        }

        public static AudioStoryPreviewCtaTapped copy$default(AudioStoryPreviewCtaTapped audioStoryPreviewCtaTapped, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = audioStoryPreviewCtaTapped.storyId;
            }
            if ((i12 & 2) != 0) {
                str = audioStoryPreviewCtaTapped.storySlug;
            }
            return audioStoryPreviewCtaTapped.copy(i11, str);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryPreviewScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingBlocked;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryRecordingBlocked extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;

        public AudioStoryRecordingBlocked(AudioStoryEpisodeParams episode) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
        }

        public static AudioStoryRecordingBlocked copy$default(AudioStoryRecordingBlocked audioStoryRecordingBlocked, AudioStoryEpisodeParams audioStoryEpisodeParams, int i11, Object obj) {
            if ((i11 & 1) != 0) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryRecordingRestarted;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryRecordingRestarted extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;

        public AudioStoryRecordingRestarted(AudioStoryEpisodeParams episode) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
        }

        public static AudioStoryRecordingRestarted copy$default(AudioStoryRecordingRestarted audioStoryRecordingRestarted, AudioStoryEpisodeParams audioStoryEpisodeParams, int i11, Object obj) {
            if ((i11 & 1) != 0) {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryScreenViewed;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "storyId", RuntimeVersion.SUFFIX, "storySlug", RuntimeVersion.SUFFIX, "<init>", "(ILjava/lang/String;)V", "getStoryId", "()I", "getStorySlug", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryScreenViewed extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final int storyId;
        private final String storySlug;

        public AudioStoryScreenViewed(int i11, String storySlug) {
            super(null);
            m.e(storySlug, "storySlug");
            this.storyId = i11;
            this.storySlug = storySlug;
        }

        public static AudioStoryScreenViewed copy$default(AudioStoryScreenViewed audioStoryScreenViewed, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = audioStoryScreenViewed.storyId;
            }
            if ((i12 & 2) != 0) {
                str = audioStoryScreenViewed.storySlug;
            }
            return audioStoryScreenViewed.copy(i11, str);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySleepTimerSet;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "option", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getOption", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStorySleepTimerSet extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final String option;

        public AudioStorySleepTimerSet(String option) {
            super(null);
            m.e(option, "option");
            this.option = option;
        }

        public static AudioStorySleepTimerSet copy$default(AudioStorySleepTimerSet audioStorySleepTimerSet, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStorySpeedChanged;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "speed", RuntimeVersion.SUFFIX, "<init>", "(F)V", "getSpeed", "()F", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStorySpeedChanged extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final float speed;

        public AudioStorySpeedChanged(float f3) {
            super(null);
            this.speed = f3;
        }

        public static AudioStorySpeedChanged copy$default(AudioStorySpeedChanged audioStorySpeedChanged, float f3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f3 = audioStorySpeedChanged.speed;
            }
            return audioStorySpeedChanged.copy(f3);
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent$AudioStoryTextToggled;", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "episode", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "isShown", RuntimeVersion.SUFFIX, "<init>", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;Z)V", "getEpisode", "()Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryEpisodeParams;", "()Z", "component1", "component2", "copy", "equals", "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioStoryTextToggled extends AudioStoryAnalyticsEvent {
        public static final int $stable = 0;
        private final AudioStoryEpisodeParams episode;
        private final boolean isShown;

        public AudioStoryTextToggled(AudioStoryEpisodeParams episode, boolean z11) {
            super(null);
            m.e(episode, "episode");
            this.episode = episode;
            this.isShown = z11;
        }

        public static AudioStoryTextToggled copy$default(AudioStoryTextToggled audioStoryTextToggled, AudioStoryEpisodeParams audioStoryEpisodeParams, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                audioStoryEpisodeParams = audioStoryTextToggled.episode;
            }
            if ((i11 & 2) != 0) {
                z11 = audioStoryTextToggled.isShown;
            }
            return audioStoryTextToggled.copy(audioStoryEpisodeParams, z11);
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
