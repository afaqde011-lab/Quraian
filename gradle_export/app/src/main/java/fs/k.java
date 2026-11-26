package fs;

import a10.h0;
import hs.a0;
import hs.t;
import hs.z;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ss.o;
import ss.s;
import ss.v;
import ss.w;
import ss.x;

public final class k extends h0 {
    public final v X(t tVar) {
        List list;
        Instant instant;
        String clearedAt;
        Instant instant2;
        ss.b bVar;
        w wVar;
        s sVar;
        ss.i iVar;
        ss.c cVar;
        Long totalListenedMs;
        Integer dailyGoalMinutes;
        Long listenedMs;
        Integer longestStreak;
        Integer currentStreak;
        Integer dailyGoalMinutes2;
        int iIntValue = (tVar == null || (dailyGoalMinutes2 = tVar.getDailyGoalMinutes()) == null) ? 0 : dailyGoalMinutes2.intValue();
        int iIntValue2 = (tVar == null || (currentStreak = tVar.getCurrentStreak()) == null) ? 0 : currentStreak.intValue();
        int iIntValue3 = (tVar == null || (longestStreak = tVar.getLongestStreak()) == null) ? 0 : longestStreak.intValue();
        a0 today = tVar != null ? tVar.getToday() : null;
        long jLongValue = (today == null || (listenedMs = today.getListenedMs()) == null) ? 0L : listenedMs.longValue();
        int iIntValue4 = (today == null || (dailyGoalMinutes = today.getDailyGoalMinutes()) == null) ? 0 : dailyGoalMinutes.intValue();
        String date = today != null ? today.getDate() : null;
        if (date == null) {
            date = "";
        }
        x xVar = new x(date, jLongValue, iIntValue4);
        long jLongValue2 = (tVar == null || (totalListenedMs = tVar.getTotalListenedMs()) == null) ? 0L : totalListenedMs.longValue();
        List<hs.c> days = tVar != null ? tVar.getDays() : null;
        h00.x xVar2 = h00.x.A;
        if (days == null) {
            days = xVar2;
        }
        long jLongValue3 = 0;
        long j = jLongValue2;
        ArrayList arrayList = new ArrayList();
        for (hs.c cVar2 : days) {
            if (cVar2 == null) {
                cVar = null;
            } else {
                String strM = k00.f.M(cVar2.getDate(), cVar2.getDay());
                Long listenedMs2 = cVar2.getListenedMs();
                if (listenedMs2 != null) {
                    jLongValue3 = listenedMs2.longValue();
                }
                Integer dailyGoalMinutes3 = cVar2.getDailyGoalMinutes();
                cVar = new ss.c(strM, jLongValue3, dailyGoalMinutes3 != null ? dailyGoalMinutes3.intValue() : 0);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
            jLongValue3 = 0;
        }
        List hours = tVar != null ? tVar.getHours() : null;
        if (hours == null) {
            hours = xVar2;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hours.iterator();
        while (it.hasNext()) {
            hs.g gVar = (hs.g) it.next();
            if (gVar == null) {
                it = it;
                iVar = null;
            } else {
                String strM2 = k00.f.M(gVar.getDate(), gVar.getDay());
                Integer hour = gVar.getHour();
                int iIntValue5 = hour != null ? hour.intValue() : 0;
                Long quranMs = gVar.getQuranMs();
                iVar = new ss.i(strM2, quranMs != null ? quranMs.longValue() : 0L, iIntValue5);
            }
            if (iVar != null) {
                arrayList2.add(iVar);
            }
            it = it;
        }
        List reciters = tVar != null ? tVar.getReciters() : null;
        if (reciters == null) {
            reciters = xVar2;
            list = reciters;
        } else {
            list = xVar2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = reciters.iterator();
        while (it2.hasNext()) {
            hs.w wVar2 = (hs.w) it2.next();
            if (wVar2 == null) {
                it2 = it2;
                list = list;
                sVar = null;
            } else {
                String date2 = wVar2.getDate();
                if (date2 == null) {
                    date2 = "";
                }
                Integer reciterId = wVar2.getReciterId();
                int iIntValue6 = reciterId != null ? reciterId.intValue() : 0;
                Long ms2 = wVar2.getMs();
                sVar = new s(date2, ms2 != null ? ms2.longValue() : 0L, iIntValue6);
            }
            if (sVar != null) {
                arrayList3.add(sVar);
            }
            list = list;
            it2 = it2;
        }
        List list2 = list;
        List<z> surahs = tVar != null ? tVar.getSurahs() : null;
        if (surahs == null) {
            surahs = list2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (z zVar : surahs) {
            if (zVar == null) {
                wVar = null;
            } else {
                String strM3 = k00.f.M(zVar.getDate(), zVar.getDay());
                Integer reciterId2 = zVar.getReciterId();
                int iIntValue7 = reciterId2 != null ? reciterId2.intValue() : 0;
                Integer surahNumber = zVar.getSurahNumber();
                int iIntValue8 = surahNumber != null ? surahNumber.intValue() : 0;
                Long ms3 = zVar.getMs();
                long jLongValue4 = ms3 != null ? ms3.longValue() : 0L;
                Integer playCount = zVar.getPlayCount();
                wVar = new w(iIntValue7, iIntValue8, playCount != null ? playCount.intValue() : 0, jLongValue4, strM3);
            }
            if (wVar != null) {
                arrayList4.add(wVar);
            }
        }
        List<hs.b> background = tVar != null ? tVar.getBackground() : null;
        if (background == null) {
            background = list2;
        }
        ArrayList arrayList5 = new ArrayList();
        for (hs.b bVar2 : background) {
            if (bVar2 == null) {
                bVar = null;
            } else {
                String strM4 = k00.f.M(bVar2.getDate(), bVar2.getDay());
                Integer hour2 = bVar2.getHour();
                int iIntValue9 = hour2 != null ? hour2.intValue() : 0;
                String soundId = bVar2.getSoundId();
                String str = soundId == null ? "" : soundId;
                Long ms4 = bVar2.getMs();
                long jLongValue5 = ms4 != null ? ms4.longValue() : 0L;
                Integer avgVolumeTimes1000 = bVar2.getAvgVolumeTimes1000();
                bVar = new ss.b(iIntValue9, avgVolumeTimes1000 != null ? avgVolumeTimes1000.intValue() : 0, jLongValue5, strM4, str);
            }
            if (bVar != null) {
                arrayList5.add(bVar);
            }
        }
        o oVarA = j.a(tVar != null ? tVar.getDeviceImport() : null);
        if (tVar == null || (clearedAt = tVar.getClearedAt()) == null) {
            instant = null;
        } else {
            try {
                instant2 = OffsetDateTime.parse(clearedAt).toInstant();
            } catch (Throwable unused) {
                instant2 = null;
            }
            instant = instant2;
        }
        return new v(iIntValue, iIntValue2, iIntValue3, xVar, j, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, oVarA, instant);
    }
}
