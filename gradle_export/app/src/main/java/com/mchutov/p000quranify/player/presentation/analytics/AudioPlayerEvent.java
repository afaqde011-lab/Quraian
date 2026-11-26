package com.mchutov.p000quranify.player.presentation.analytics;

import a1.b;
import a10.t;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "AudioPlay", "AudioPause", "AudioCompleted", "PlayerPlayTapped", "ReciterChanged", "BackgroundSoundChanged", "AudioNext", "AudioPrev", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioCompleted;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioNext;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioPause;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioPlay;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioPrev;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$BackgroundSoundChanged;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$PlayerPlayTapped;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$ReciterChanged;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AudioPlayerEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioCompleted;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "surahId", RuntimeVersion.SUFFIX, "reciterName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSurahId", "()Ljava/lang/String;", "getReciterName", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioCompleted extends AudioPlayerEvent {
        public static final int $stable = 0;
        private final String reciterName;
        private final String surahId;

        public AudioCompleted(String surahId, String reciterName) {
            super(null);
            m.e(surahId, "surahId");
            m.e(reciterName, "reciterName");
            this.surahId = surahId;
            this.reciterName = reciterName;
        }

        public static AudioCompleted copy$default(AudioCompleted audioCompleted, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = audioCompleted.surahId;
            }
            if ((i11 & 2) != 0) {
                str2 = audioCompleted.reciterName;
            }
            return audioCompleted.copy(str, str2);
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public final String getReciterName() {
            return this.reciterName;
        }

        public final AudioCompleted copy(String surahId, String reciterName) {
            m.e(surahId, "surahId");
            m.e(reciterName, "reciterName");
            return new AudioCompleted(surahId, reciterName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioCompleted)) {
                return false;
            }
            AudioCompleted audioCompleted = (AudioCompleted) other;
            return m.a(this.surahId, audioCompleted.surahId) && m.a(this.reciterName, audioCompleted.reciterName);
        }

        public final String getReciterName() {
            return this.reciterName;
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public int hashCode() {
            return this.reciterName.hashCode() + (this.surahId.hashCode() * 31);
        }

        public String toString() {
            return b.q("AudioCompleted(surahId=", this.surahId, ", reciterName=", this.reciterName, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioNext;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioNext extends AudioPlayerEvent {
        public static final int $stable = 0;
        public static final AudioNext INSTANCE = new AudioNext();

        private AudioNext() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AudioNext);
        }

        public int hashCode() {
            return 1417724567;
        }

        public String toString() {
            return "AudioNext";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioPause;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "surahId", RuntimeVersion.SUFFIX, "durationListened", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;J)V", "getSurahId", "()Ljava/lang/String;", "getDurationListened", "()J", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioPause extends AudioPlayerEvent {
        public static final int $stable = 0;
        private final long durationListened;
        private final String surahId;

        public AudioPause(String surahId, long j9) {
            super(null);
            m.e(surahId, "surahId");
            this.surahId = surahId;
            this.durationListened = j9;
        }

        public static AudioPause copy$default(AudioPause audioPause, String str, long j9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = audioPause.surahId;
            }
            if ((i11 & 2) != 0) {
                j9 = audioPause.durationListened;
            }
            return audioPause.copy(str, j9);
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public final long getDurationListened() {
            return this.durationListened;
        }

        public final AudioPause copy(String surahId, long durationListened) {
            m.e(surahId, "surahId");
            return new AudioPause(surahId, durationListened);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioPause)) {
                return false;
            }
            AudioPause audioPause = (AudioPause) other;
            return m.a(this.surahId, audioPause.surahId) && this.durationListened == audioPause.durationListened;
        }

        public final long getDurationListened() {
            return this.durationListened;
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public int hashCode() {
            return Long.hashCode(this.durationListened) + (this.surahId.hashCode() * 31);
        }

        public String toString() {
            return "AudioPause(surahId=" + this.surahId + ", durationListened=" + this.durationListened + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioPlay;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "surahId", RuntimeVersion.SUFFIX, "surahName", "reciterName", "isMix", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getSurahId", "()Ljava/lang/String;", "getSurahName", "getReciterName", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioPlay extends AudioPlayerEvent {
        public static final int $stable = 0;
        private final boolean isMix;
        private final String reciterName;
        private final String surahId;
        private final String surahName;

        public AudioPlay(String surahId, String surahName, String reciterName, boolean z11) {
            super(null);
            m.e(surahId, "surahId");
            m.e(surahName, "surahName");
            m.e(reciterName, "reciterName");
            this.surahId = surahId;
            this.surahName = surahName;
            this.reciterName = reciterName;
            this.isMix = z11;
        }

        public static AudioPlay copy$default(AudioPlay audioPlay, String str, String str2, String str3, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = audioPlay.surahId;
            }
            if ((i11 & 2) != 0) {
                str2 = audioPlay.surahName;
            }
            if ((i11 & 4) != 0) {
                str3 = audioPlay.reciterName;
            }
            if ((i11 & 8) != 0) {
                z11 = audioPlay.isMix;
            }
            return audioPlay.copy(str, str2, str3, z11);
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public final String getSurahName() {
            return this.surahName;
        }

        public final String getReciterName() {
            return this.reciterName;
        }

        public final boolean getIsMix() {
            return this.isMix;
        }

        public final AudioPlay copy(String surahId, String surahName, String reciterName, boolean isMix) {
            m.e(surahId, "surahId");
            m.e(surahName, "surahName");
            m.e(reciterName, "reciterName");
            return new AudioPlay(surahId, surahName, reciterName, isMix);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioPlay)) {
                return false;
            }
            AudioPlay audioPlay = (AudioPlay) other;
            return m.a(this.surahId, audioPlay.surahId) && m.a(this.surahName, audioPlay.surahName) && m.a(this.reciterName, audioPlay.reciterName) && this.isMix == audioPlay.isMix;
        }

        public final String getReciterName() {
            return this.reciterName;
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public final String getSurahName() {
            return this.surahName;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMix) + x5.e(x5.e(this.surahId.hashCode() * 31, this.surahName, 31), this.reciterName, 31);
        }

        public final boolean isMix() {
            return this.isMix;
        }

        public String toString() {
            String str = this.surahId;
            String str2 = this.surahName;
            String str3 = this.reciterName;
            boolean z11 = this.isMix;
            StringBuilder sbS = b.s("AudioPlay(surahId=", str, ", surahName=", str2, ", reciterName=");
            sbS.append(str3);
            sbS.append(", isMix=");
            sbS.append(z11);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$AudioPrev;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AudioPrev extends AudioPlayerEvent {
        public static final int $stable = 0;
        public static final AudioPrev INSTANCE = new AudioPrev();

        private AudioPrev() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AudioPrev);
        }

        public int hashCode() {
            return 1417796055;
        }

        public String toString() {
            return "AudioPrev";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$BackgroundSoundChanged;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "soundName", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getSoundName", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BackgroundSoundChanged extends AudioPlayerEvent {
        public static final int $stable = 0;
        private final String soundName;

        public BackgroundSoundChanged(String soundName) {
            super(null);
            m.e(soundName, "soundName");
            this.soundName = soundName;
        }

        public static BackgroundSoundChanged copy$default(BackgroundSoundChanged backgroundSoundChanged, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = backgroundSoundChanged.soundName;
            }
            return backgroundSoundChanged.copy(str);
        }

        public final String getSoundName() {
            return this.soundName;
        }

        public final BackgroundSoundChanged copy(String soundName) {
            m.e(soundName, "soundName");
            return new BackgroundSoundChanged(soundName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackgroundSoundChanged) && m.a(this.soundName, ((BackgroundSoundChanged) other).soundName);
        }

        public final String getSoundName() {
            return this.soundName;
        }

        public int hashCode() {
            return this.soundName.hashCode();
        }

        public String toString() {
            return b.p("BackgroundSoundChanged(soundName=", this.soundName, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$PlayerPlayTapped;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "surahId", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getSurahId", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PlayerPlayTapped extends AudioPlayerEvent {
        public static final int $stable = 0;
        private final String surahId;

        public PlayerPlayTapped(String str) {
            super(null);
            this.surahId = str;
        }

        public static PlayerPlayTapped copy$default(PlayerPlayTapped playerPlayTapped, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = playerPlayTapped.surahId;
            }
            return playerPlayTapped.copy(str);
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public final PlayerPlayTapped copy(String surahId) {
            return new PlayerPlayTapped(surahId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlayerPlayTapped) && m.a(this.surahId, ((PlayerPlayTapped) other).surahId);
        }

        public final String getSurahId() {
            return this.surahId;
        }

        public int hashCode() {
            String str = this.surahId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return b.p("PlayerPlayTapped(surahId=", this.surahId, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent$ReciterChanged;", "Lcom/mchutov/quranify/player/presentation/analytics/AudioPlayerEvent;", "fromReciter", RuntimeVersion.SUFFIX, "toReciter", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFromReciter", "()Ljava/lang/String;", "getToReciter", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ReciterChanged extends AudioPlayerEvent {
        public static final int $stable = 0;
        private final String fromReciter;
        private final String toReciter;

        public ReciterChanged(String fromReciter, String toReciter) {
            super(null);
            m.e(fromReciter, "fromReciter");
            m.e(toReciter, "toReciter");
            this.fromReciter = fromReciter;
            this.toReciter = toReciter;
        }

        public static ReciterChanged copy$default(ReciterChanged reciterChanged, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reciterChanged.fromReciter;
            }
            if ((i11 & 2) != 0) {
                str2 = reciterChanged.toReciter;
            }
            return reciterChanged.copy(str, str2);
        }

        public final String getFromReciter() {
            return this.fromReciter;
        }

        public final String getToReciter() {
            return this.toReciter;
        }

        public final ReciterChanged copy(String fromReciter, String toReciter) {
            m.e(fromReciter, "fromReciter");
            m.e(toReciter, "toReciter");
            return new ReciterChanged(fromReciter, toReciter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReciterChanged)) {
                return false;
            }
            ReciterChanged reciterChanged = (ReciterChanged) other;
            return m.a(this.fromReciter, reciterChanged.fromReciter) && m.a(this.toReciter, reciterChanged.toReciter);
        }

        public final String getFromReciter() {
            return this.fromReciter;
        }

        public final String getToReciter() {
            return this.toReciter;
        }

        public int hashCode() {
            return this.toReciter.hashCode() + (this.fromReciter.hashCode() * 31);
        }

        public String toString() {
            return b.q("ReciterChanged(fromReciter=", this.fromReciter, ", toReciter=", this.toReciter, ")");
        }
    }

    private AudioPlayerEvent() {
    }

    public AudioPlayerEvent(f fVar) {
        this();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Map<String, Object> getParams() {
        return super.getParams();
    }

    @Override
    public k transformProperties(t tVar) {
        return super.transformProperties(tVar);
    }
}
