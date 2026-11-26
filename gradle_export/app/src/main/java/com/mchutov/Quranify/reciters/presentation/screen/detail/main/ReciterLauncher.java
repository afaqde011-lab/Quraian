package com.mchutov.quranify.reciters.presentation.screen.detail.main;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import n40.e;
import nx.a0;
import nx.b0;
import o40.b;
import p40.e0;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;", "", "", "reciterType", "sharedSurahNumber", "<init>", "(ILjava/lang/Integer;)V", "seen0", "Lp40/x0;", "serializationConstructorMarker", "(IILjava/lang/Integer;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$app_release", "(Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getReciterType", "Ljava/lang/Integer;", "getSharedSurahNumber", "Companion", "nx/a0", "nx/b0", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReciterLauncher {
    public static final int $stable = 0;
    public static final b0 Companion = new b0();
    private final int reciterType;
    private final Integer sharedSurahNumber;

    public ReciterLauncher(int i, int i2, Integer num, x0 x0Var) {
        if (1 != (i & 1)) {
            o0.g(i, 1, a0.a.getDescriptor());
            throw null;
        }
        this.reciterType = i2;
        if ((i & 2) == 0) {
            this.sharedSurahNumber = null;
        } else {
            this.sharedSurahNumber = num;
        }
    }

    public ReciterLauncher(int i, Integer num) {
        this.reciterType = i;
        this.sharedSurahNumber = num;
    }

    public ReciterLauncher(int i, Integer num, int i2, f fVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }

    public static ReciterLauncher copy$default(ReciterLauncher reciterLauncher, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reciterLauncher.reciterType;
        }
        if ((i2 & 2) != 0) {
            num = reciterLauncher.sharedSurahNumber;
        }
        return reciterLauncher.copy(i, num);
    }

    public static final void write$Self$app_release(ReciterLauncher self, b output, e serialDesc) {
        output.w(0, self.reciterType, serialDesc);
        if (!output.k(serialDesc) && self.sharedSurahNumber == null) {
            return;
        }
        output.x(serialDesc, 1, e0.a, self.sharedSurahNumber);
    }

    public final int getReciterType() {
        return this.reciterType;
    }

    public final Integer getSharedSurahNumber() {
        return this.sharedSurahNumber;
    }

    public final ReciterLauncher copy(int reciterType, Integer sharedSurahNumber) {
        return new ReciterLauncher(reciterType, sharedSurahNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReciterLauncher)) {
            return false;
        }
        ReciterLauncher reciterLauncher = (ReciterLauncher) other;
        return this.reciterType == reciterLauncher.reciterType && m.a(this.sharedSurahNumber, reciterLauncher.sharedSurahNumber);
    }

    public final int getReciterType() {
        return this.reciterType;
    }

    public final Integer getSharedSurahNumber() {
        return this.sharedSurahNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.reciterType) * 31;
        Integer num = this.sharedSurahNumber;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ReciterLauncher(reciterType=" + this.reciterType + ", sharedSurahNumber=" + this.sharedSurahNumber + ")";
    }
}
