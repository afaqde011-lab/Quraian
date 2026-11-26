package uo;

import a10.h0;
import ep.l;

public final class e extends h0 {
    public static l X(vo.g gVar) {
        String resetToken = gVar != null ? gVar.getResetToken() : null;
        String stage = gVar != null ? gVar.getStage() : null;
        if (stage == null) {
            stage = "";
        }
        return new l(resetToken, stage, gVar != null ? gVar.getResetExpiresIn() : null, gVar != null ? gVar.getResendIn() : null);
    }
}
