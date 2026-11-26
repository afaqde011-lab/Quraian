# clean_source — سورس نظيف معاد كتابته (Kotlin + Compose)

مشروع Android حقيقي قابل للقراءة والتعديل، مبني على مميزات وتصميم تطبيق Quranify.
**مش** كود مُفكَّك من APK. مفيش أي خدمات Google.

## البنية
```
app/src/main/java/com/mchutov/quranify/
  MainActivity.kt
  data/Repository.kt          نماذج وبيانات محلية
  ui/theme/Theme.kt           الألوان والثيم
  ui/navigation/AppNavHost.kt التنقل والـ bottom bar
  ui/screens/*.kt             الشاشات (Home, Reciters, Playlists, Insights, Search, Settings)
app/src/main/res/values/      ألوان ونصوص وثيم
```

## التشغيل
افتح المجلد في Android Studio (Arctic Fox+) أو:
```powershell
./gradlew assembleDebug
```
يتطلب Android SDK 35 و JDK 17.

## للمطور / AI Studio
- كل الكود مقروء ومنظّم حسب الميزة.
- أضف مشغّل الصوت والبيانات الحقيقية في `data/Repository.kt`.
- للتعديل السريع غيّر الألوان في `ui/theme/Theme.kt` و `res/values/colors.xml`.
- لا تضف GMS / Firebase / PairIP.
