package un;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000fR\u001a\u0010*\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000fR\u001a\u0010.\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b1\u0010\u000fR\u001a\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u001c\u00108\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001eR\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006¨\u0006<"}, d2 = {"Lun/f;", "", "", "a", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "eventId", "b", "getSessionId", "sessionId", "", "c", "I", "getStoryId", "()I", "storyId", "d", "getEpisodeId", "episodeId", "e", "getLanguage", "language", "f", "getEventType", "eventType", "", "g", "Ljava/lang/Long;", "getSeekFromMs", "()Ljava/lang/Long;", "seekFromMs", "h", "J", "getPositionMs", "()J", "positionMs", "i", "getListenedMs", "listenedMs", "j", "getPlaybackRateTimes100", "playbackRateTimes100", "", "k", "Z", "isOffline", "()Z", "l", "getUtcOffsetMinutes", "utcOffsetMinutes", "m", "getOccurredAt", "occurredAt", "n", "getAgeMs", "ageMs", "o", "getSource", "source", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    @ck.b("event_id")
    private final String eventId;

    @ck.b("session_id")
    private final String sessionId;

    @ck.b("story_id")
    private final int storyId;

    @ck.b("episode_id")
    private final int episodeId;

    @ck.b("language")
    private final String language;

    @ck.b("event_type")
    private final String eventType;

    @ck.b("seek_from_ms")
    private final Long seekFromMs;

    @ck.b("position_ms")
    private final long positionMs;

    @ck.b("listened_ms")
    private final int listenedMs;

    @ck.b("playback_rate_times_100")
    private final int playbackRateTimes100;

    @ck.b("is_offline")
    private final boolean isOffline;

    @ck.b("utc_offset_minutes")
    private final int utcOffsetMinutes;

    @ck.b("occurred_at")
    private final String occurredAt;

    @ck.b("age_ms")
    private final Long ageMs;

    @ck.b("source")
    private final String source;

    public f(String eventId, String sessionId, int i, int i2, String language, String eventType, Long l, long j, int i3, int i4, boolean z, int i5, String occurredAt, Long l2, String str) {
        kotlin.jvm.internal.m.e(eventId, "eventId");
        kotlin.jvm.internal.m.e(sessionId, "sessionId");
        kotlin.jvm.internal.m.e(language, "language");
        kotlin.jvm.internal.m.e(eventType, "eventType");
        kotlin.jvm.internal.m.e(occurredAt, "occurredAt");
        this.eventId = eventId;
        this.sessionId = sessionId;
        this.storyId = i;
        this.episodeId = i2;
        this.language = language;
        this.eventType = eventType;
        this.seekFromMs = l;
        this.positionMs = j;
        this.listenedMs = i3;
        this.playbackRateTimes100 = i4;
        this.isOffline = z;
        this.utcOffsetMinutes = i5;
        this.occurredAt = occurredAt;
        this.ageMs = l2;
        this.source = str;
    }
}
