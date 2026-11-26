package com.mchutov.p000quranify.audiostories.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/mchutov/quranify/audiostories/domain/model/AudioStoryLanguageNotAvailableException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoryLanguageNotAvailableException extends IllegalStateException {
    public AudioStoryLanguageNotAvailableException(String language) {
        super("No audio in ".concat(language));
        m.e(language, "language");
    }
}
