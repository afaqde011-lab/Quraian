package com.mchutov.p000quranify.main.presentation.analytics;

import a1.b;
import a10.t;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import g4.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "DownloadStarted", "DownloadCompleted", "DownloadFailed", "DownloadDeleted", "DownloadsDeletedForReciter", "AllDownloadsDeleted", "OfflinePlayback", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$AllDownloadsDeleted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadCompleted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadDeleted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadFailed;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadStarted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadsDeletedForReciter;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$OfflinePlayback;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class DownloadEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$AllDownloadsDeleted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "count", RuntimeVersion.SUFFIX, "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AllDownloadsDeleted extends DownloadEvent {
        public static final int $stable = 0;
        private final int count;

        public AllDownloadsDeleted(int i11) {
            super(null);
            this.count = i11;
        }

        public static AllDownloadsDeleted copy$default(AllDownloadsDeleted allDownloadsDeleted, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = allDownloadsDeleted.count;
            }
            return allDownloadsDeleted.copy(i11);
        }

        public final int getCount() {
            return this.count;
        }

        public final AllDownloadsDeleted copy(int count) {
            return new AllDownloadsDeleted(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AllDownloadsDeleted) && this.count == ((AllDownloadsDeleted) other).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        public String toString() {
            return c.i("AllDownloadsDeleted(count=", this.count, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadCompleted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "surahId", RuntimeVersion.SUFFIX, "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "fileSize", "<init>", "(JIIJ)V", "getSurahId", "()J", "getSurahNumber", "()I", "getReciterId", "getFileSize", "component1", "component2", "component3", "component4", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DownloadCompleted extends DownloadEvent {
        public static final int $stable = 0;
        private final long fileSize;
        private final int reciterId;
        private final long surahId;
        private final int surahNumber;

        public DownloadCompleted(long j9, int i11, int i12, long j11) {
            super(null);
            this.surahId = j9;
            this.surahNumber = i11;
            this.reciterId = i12;
            this.fileSize = j11;
        }

        public static DownloadCompleted copy$default(DownloadCompleted downloadCompleted, long j9, int i11, int i12, long j11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j9 = downloadCompleted.surahId;
            }
            long j12 = j9;
            if ((i13 & 2) != 0) {
                i11 = downloadCompleted.surahNumber;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                i12 = downloadCompleted.reciterId;
            }
            int i15 = i12;
            if ((i13 & 8) != 0) {
                j11 = downloadCompleted.fileSize;
            }
            return downloadCompleted.copy(j12, i14, i15, j11);
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        public final DownloadCompleted copy(long surahId, int surahNumber, int reciterId, long fileSize) {
            return new DownloadCompleted(surahId, surahNumber, reciterId, fileSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadCompleted)) {
                return false;
            }
            DownloadCompleted downloadCompleted = (DownloadCompleted) other;
            return this.surahId == downloadCompleted.surahId && this.surahNumber == downloadCompleted.surahNumber && this.reciterId == downloadCompleted.reciterId && this.fileSize == downloadCompleted.fileSize;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public int hashCode() {
            return Long.hashCode(this.fileSize) + w.c.d(this.reciterId, w.c.d(this.surahNumber, Long.hashCode(this.surahId) * 31, 31), 31);
        }

        public String toString() {
            long j9 = this.surahId;
            int i11 = this.surahNumber;
            int i12 = this.reciterId;
            long j11 = this.fileSize;
            StringBuilder sb2 = new StringBuilder("DownloadCompleted(surahId=");
            sb2.append(j9);
            sb2.append(", surahNumber=");
            sb2.append(i11);
            sb2.append(", reciterId=");
            sb2.append(i12);
            sb2.append(", fileSize=");
            return b.k(j11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadDeleted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "surahId", RuntimeVersion.SUFFIX, "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "<init>", "(JII)V", "getSurahId", "()J", "getSurahNumber", "()I", "getReciterId", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DownloadDeleted extends DownloadEvent {
        public static final int $stable = 0;
        private final int reciterId;
        private final long surahId;
        private final int surahNumber;

        public DownloadDeleted(long j9, int i11, int i12) {
            super(null);
            this.surahId = j9;
            this.surahNumber = i11;
            this.reciterId = i12;
        }

        public static DownloadDeleted copy$default(DownloadDeleted downloadDeleted, long j9, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j9 = downloadDeleted.surahId;
            }
            if ((i13 & 2) != 0) {
                i11 = downloadDeleted.surahNumber;
            }
            if ((i13 & 4) != 0) {
                i12 = downloadDeleted.reciterId;
            }
            return downloadDeleted.copy(j9, i11, i12);
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final DownloadDeleted copy(long surahId, int surahNumber, int reciterId) {
            return new DownloadDeleted(surahId, surahNumber, reciterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadDeleted)) {
                return false;
            }
            DownloadDeleted downloadDeleted = (DownloadDeleted) other;
            return this.surahId == downloadDeleted.surahId && this.surahNumber == downloadDeleted.surahNumber && this.reciterId == downloadDeleted.reciterId;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.reciterId) + w.c.d(this.surahNumber, Long.hashCode(this.surahId) * 31, 31);
        }

        public String toString() {
            return "DownloadDeleted(surahId=" + this.surahId + ", surahNumber=" + this.surahNumber + ", reciterId=" + this.reciterId + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadFailed;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "surahId", RuntimeVersion.SUFFIX, "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "error", RuntimeVersion.SUFFIX, "<init>", "(JIILjava/lang/String;)V", "getSurahId", "()J", "getSurahNumber", "()I", "getReciterId", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DownloadFailed extends DownloadEvent {
        public static final int $stable = 0;
        private final String error;
        private final int reciterId;
        private final long surahId;
        private final int surahNumber;

        public DownloadFailed(long j9, int i11, int i12, String error) {
            super(null);
            m.e(error, "error");
            this.surahId = j9;
            this.surahNumber = i11;
            this.reciterId = i12;
            this.error = error;
        }

        public static DownloadFailed copy$default(DownloadFailed downloadFailed, long j9, int i11, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j9 = downloadFailed.surahId;
            }
            long j11 = j9;
            if ((i13 & 2) != 0) {
                i11 = downloadFailed.surahNumber;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                i12 = downloadFailed.reciterId;
            }
            int i15 = i12;
            if ((i13 & 8) != 0) {
                str = downloadFailed.error;
            }
            return downloadFailed.copy(j11, i14, i15, str);
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final String getError() {
            return this.error;
        }

        public final DownloadFailed copy(long surahId, int surahNumber, int reciterId, String error) {
            m.e(error, "error");
            return new DownloadFailed(surahId, surahNumber, reciterId, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadFailed)) {
                return false;
            }
            DownloadFailed downloadFailed = (DownloadFailed) other;
            return this.surahId == downloadFailed.surahId && this.surahNumber == downloadFailed.surahNumber && this.reciterId == downloadFailed.reciterId && m.a(this.error, downloadFailed.error);
        }

        public final String getError() {
            return this.error;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public int hashCode() {
            return this.error.hashCode() + w.c.d(this.reciterId, w.c.d(this.surahNumber, Long.hashCode(this.surahId) * 31, 31), 31);
        }

        public String toString() {
            return "DownloadFailed(surahId=" + this.surahId + ", surahNumber=" + this.surahNumber + ", reciterId=" + this.reciterId + ", error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadStarted;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "surahId", RuntimeVersion.SUFFIX, "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "<init>", "(JII)V", "getSurahId", "()J", "getSurahNumber", "()I", "getReciterId", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DownloadStarted extends DownloadEvent {
        public static final int $stable = 0;
        private final int reciterId;
        private final long surahId;
        private final int surahNumber;

        public DownloadStarted(long j9, int i11, int i12) {
            super(null);
            this.surahId = j9;
            this.surahNumber = i11;
            this.reciterId = i12;
        }

        public static DownloadStarted copy$default(DownloadStarted downloadStarted, long j9, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j9 = downloadStarted.surahId;
            }
            if ((i13 & 2) != 0) {
                i11 = downloadStarted.surahNumber;
            }
            if ((i13 & 4) != 0) {
                i12 = downloadStarted.reciterId;
            }
            return downloadStarted.copy(j9, i11, i12);
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final DownloadStarted copy(long surahId, int surahNumber, int reciterId) {
            return new DownloadStarted(surahId, surahNumber, reciterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadStarted)) {
                return false;
            }
            DownloadStarted downloadStarted = (DownloadStarted) other;
            return this.surahId == downloadStarted.surahId && this.surahNumber == downloadStarted.surahNumber && this.reciterId == downloadStarted.reciterId;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.reciterId) + w.c.d(this.surahNumber, Long.hashCode(this.surahId) * 31, 31);
        }

        public String toString() {
            return "DownloadStarted(surahId=" + this.surahId + ", surahNumber=" + this.surahNumber + ", reciterId=" + this.reciterId + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$DownloadsDeletedForReciter;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "reciterId", RuntimeVersion.SUFFIX, "count", "<init>", "(II)V", "getReciterId", "()I", "getCount", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DownloadsDeletedForReciter extends DownloadEvent {
        public static final int $stable = 0;
        private final int count;
        private final int reciterId;

        public DownloadsDeletedForReciter(int i11, int i12) {
            super(null);
            this.reciterId = i11;
            this.count = i12;
        }

        public static DownloadsDeletedForReciter copy$default(DownloadsDeletedForReciter downloadsDeletedForReciter, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = downloadsDeletedForReciter.reciterId;
            }
            if ((i13 & 2) != 0) {
                i12 = downloadsDeletedForReciter.count;
            }
            return downloadsDeletedForReciter.copy(i11, i12);
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final int getCount() {
            return this.count;
        }

        public final DownloadsDeletedForReciter copy(int reciterId, int count) {
            return new DownloadsDeletedForReciter(reciterId, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadsDeletedForReciter)) {
                return false;
            }
            DownloadsDeletedForReciter downloadsDeletedForReciter = (DownloadsDeletedForReciter) other;
            return this.reciterId == downloadsDeletedForReciter.reciterId && this.count == downloadsDeletedForReciter.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public int hashCode() {
            return Integer.hashCode(this.count) + (Integer.hashCode(this.reciterId) * 31);
        }

        public String toString() {
            return c.e(this.reciterId, this.count, "DownloadsDeletedForReciter(reciterId=", ", count=", ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent$OfflinePlayback;", "Lcom/mchutov/quranify/main/presentation/analytics/DownloadEvent;", "surahId", RuntimeVersion.SUFFIX, "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "<init>", "(JII)V", "getSurahId", "()J", "getSurahNumber", "()I", "getReciterId", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OfflinePlayback extends DownloadEvent {
        public static final int $stable = 0;
        private final int reciterId;
        private final long surahId;
        private final int surahNumber;

        public OfflinePlayback(long j9, int i11, int i12) {
            super(null);
            this.surahId = j9;
            this.surahNumber = i11;
            this.reciterId = i12;
        }

        public static OfflinePlayback copy$default(OfflinePlayback offlinePlayback, long j9, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j9 = offlinePlayback.surahId;
            }
            if ((i13 & 2) != 0) {
                i11 = offlinePlayback.surahNumber;
            }
            if ((i13 & 4) != 0) {
                i12 = offlinePlayback.reciterId;
            }
            return offlinePlayback.copy(j9, i11, i12);
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final OfflinePlayback copy(long surahId, int surahNumber, int reciterId) {
            return new OfflinePlayback(surahId, surahNumber, reciterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfflinePlayback)) {
                return false;
            }
            OfflinePlayback offlinePlayback = (OfflinePlayback) other;
            return this.surahId == offlinePlayback.surahId && this.surahNumber == offlinePlayback.surahNumber && this.reciterId == offlinePlayback.reciterId;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final long getSurahId() {
            return this.surahId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.reciterId) + w.c.d(this.surahNumber, Long.hashCode(this.surahId) * 31, 31);
        }

        public String toString() {
            return "OfflinePlayback(surahId=" + this.surahId + ", surahNumber=" + this.surahNumber + ", reciterId=" + this.reciterId + ")";
        }
    }

    private DownloadEvent() {
    }

    public DownloadEvent(f fVar) {
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
