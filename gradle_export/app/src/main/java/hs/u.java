package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001c\u0010*\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lhs/u;", "Lkh/n;", "", "a", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "eventId", "b", "getSessionId", "sessionId", "", "c", "J", "getTrackId", "()J", "trackId", "d", "getEventType", "eventType", "e", "getPositionMs", "positionMs", "", "f", "I", "getListenedMs", "()I", "listenedMs", "g", "getUtcOffsetMinutes", "utcOffsetMinutes", "h", "getOccurredAt", "occurredAt", "i", "getBackgroundSoundId", "backgroundSoundId", "j", "Ljava/lang/Integer;", "getBackgroundVolumeTimes1000", "()Ljava/lang/Integer;", "backgroundVolumeTimes1000", "k", "Ljava/lang/Long;", "getAgeMs", "()Ljava/lang/Long;", "ageMs", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends kh.n {

    @ck.b("event_id")
    private final String eventId;

    @ck.b("session_id")
    private final String sessionId;

    @ck.b("track_id")
    private final long trackId;

    @ck.b("event_type")
    private final String eventType;

    @ck.b("position_ms")
    private final long positionMs;

    @ck.b("listened_ms")
    private final int listenedMs;

    @ck.b("utc_offset_minutes")
    private final int utcOffsetMinutes;

    @ck.b("occurred_at")
    private final String occurredAt;

    @ck.b("background_sound_id")
    private final String backgroundSoundId;

    @ck.b("background_volume_times_1000")
    private final Integer backgroundVolumeTimes1000;

    @ck.b("age_ms")
    private final Long ageMs;

    public u(String eventId, String sessionId, long j, String str, long j2, int i, int i2, String occurredAt, String str2, Integer num, Long l) {
        kotlin.jvm.internal.m.e(eventId, "eventId");
        kotlin.jvm.internal.m.e(sessionId, "sessionId");
        kotlin.jvm.internal.m.e(occurredAt, "occurredAt");
        this.eventId = eventId;
        this.sessionId = sessionId;
        this.trackId = j;
        this.eventType = str;
        this.positionMs = j2;
        this.listenedMs = i;
        this.utcOffsetMinutes = i2;
        this.occurredAt = occurredAt;
        this.backgroundSoundId = str2;
        this.backgroundVolumeTimes1000 = num;
        this.ageMs = l;
    }
}
