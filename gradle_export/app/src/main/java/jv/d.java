package jv;

import bv.o1;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.m;
import l1.z0;

public final class d implements u00.a {
    public final int A;
    public final o1 B;
    public final z0 C;

    public d(o1 o1Var, z0 z0Var, int i) {
        this.A = i;
        this.B = o1Var;
        this.C = z0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                String string = r30.k.j1((String) this.C.getValue()).toString();
                Locale locale = Locale.getDefault();
                m.d(locale, "getDefault(...)");
                String lowerCase = string.toLowerCase(locale);
                m.d(lowerCase, "toLowerCase(...)");
                boolean zL0 = r30.k.L0(lowerCase);
                o1 o1Var = this.B;
                if (zL0) {
                    return o1Var.o;
                }
                u30.b bVar = o1Var.o;
                ArrayList arrayList = new ArrayList();
                for (Object obj : bVar) {
                    PlayerItem playerItem = (PlayerItem) obj;
                    if (!r30.k.A0(String.valueOf(playerItem.getSurahNumber()), lowerCase, false)) {
                        String surahTranscription = playerItem.getSurahTranscription();
                        Locale locale2 = Locale.getDefault();
                        m.d(locale2, "getDefault(...)");
                        String lowerCase2 = surahTranscription.toLowerCase(locale2);
                        m.d(lowerCase2, "toLowerCase(...)");
                        if (!r30.k.A0(lowerCase2, lowerCase, false)) {
                            String surahOriginalName = playerItem.getSurahOriginalName();
                            Locale locale3 = Locale.getDefault();
                            m.d(locale3, "getDefault(...)");
                            String lowerCase3 = surahOriginalName.toLowerCase(locale3);
                            m.d(lowerCase3, "toLowerCase(...)");
                            if (!r30.k.A0(lowerCase3, lowerCase, false)) {
                                String surahTranslation = playerItem.getSurahTranslation();
                                Locale locale4 = Locale.getDefault();
                                m.d(locale4, "getDefault(...)");
                                String lowerCase4 = surahTranslation.toLowerCase(locale4);
                                m.d(lowerCase4, "toLowerCase(...)");
                                if (r30.k.A0(lowerCase4, lowerCase, false)) {
                                }
                            }
                        }
                    }
                    arrayList.add(obj);
                }
                return arrayList;
            default:
                String string2 = r30.k.j1((String) this.C.getValue()).toString();
                Locale locale5 = Locale.getDefault();
                m.d(locale5, "getDefault(...)");
                String lowerCase5 = string2.toLowerCase(locale5);
                m.d(lowerCase5, "toLowerCase(...)");
                boolean zL1 = r30.k.L0(lowerCase5);
                o1 o1Var2 = this.B;
                if (zL1) {
                    return o1Var2.o;
                }
                u30.b bVar2 = o1Var2.o;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : bVar2) {
                    PlayerItem playerItem2 = (PlayerItem) obj2;
                    if (!r30.k.A0(String.valueOf(playerItem2.getSurahNumber()), lowerCase5, false)) {
                        String surahTranscription2 = playerItem2.getSurahTranscription();
                        Locale locale6 = Locale.getDefault();
                        m.d(locale6, "getDefault(...)");
                        String lowerCase6 = surahTranscription2.toLowerCase(locale6);
                        m.d(lowerCase6, "toLowerCase(...)");
                        if (!r30.k.A0(lowerCase6, lowerCase5, false)) {
                            String surahOriginalName2 = playerItem2.getSurahOriginalName();
                            Locale locale7 = Locale.getDefault();
                            m.d(locale7, "getDefault(...)");
                            String lowerCase7 = surahOriginalName2.toLowerCase(locale7);
                            m.d(lowerCase7, "toLowerCase(...)");
                            if (!r30.k.A0(lowerCase7, lowerCase5, false)) {
                                String surahTranslation2 = playerItem2.getSurahTranslation();
                                Locale locale8 = Locale.getDefault();
                                m.d(locale8, "getDefault(...)");
                                String lowerCase8 = surahTranslation2.toLowerCase(locale8);
                                m.d(lowerCase8, "toLowerCase(...)");
                                if (r30.k.A0(lowerCase8, lowerCase5, false)) {
                                }
                            }
                        }
                    }
                    arrayList2.add(obj2);
                }
                return arrayList2;
        }
    }
}
