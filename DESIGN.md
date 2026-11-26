# DESIGN.md — نظام التصميم والموارد البصرية

هذا الملف يشرح أين تقرأ وتعدّل **تصميم** التطبيق في السورس النظيف `clean_source/`.

## 1) الألوان (مطابقة لسكرين شوت Uptodown الأصلية)
- `clean_source/app/src/main/java/com/mchutov/quranify/ui/theme/Theme.kt` — palette Compose الأساسي.
  - Background: `#000000` (أسود)، Primary أزرق: `#2E7CF6`، Gold: `#D4AF37`
  - Surface: `#141416`، تدرّج أزرق خفيف أعلى الشاشة من `#0A1B3D`
- `clean_source/app/src/main/res/values/colors.xml` — نفس القيم للـ XML.

## 2) خلفيات الفيديو ✅
- الأصول: `clean_source/app/src/main/assets/videos/background/` (12 ملف MP4، ~156MB):
  `rain_video.mp4`, `wave_video.mp4`, `bonfire_video.mp4`, `wind_video.mp4`, `morning_birds.mp4`, `playerBackground.mp4` (+ نسخ `_full`).
- المكوّن: `ui/components/VideoBackground.kt` — يشغّل الفيديو بصوت مكتوم وتكرار لوبي من الـ assets.
- القائمة والاختيار: `data/Repository.kt` → `backgroundVideos`، وتظهر كـ FilterChips في `ui/screens/HomeScreen.kt`.

## 3) المؤثرات الصوتية ✅
- الأصول: `clean_source/app/src/main/assets/audio/` (7 ملفات MP3 من التطبيق الأصلي):
  `wave_effect.mp3` (بحر/أمواج)، `calm_river.mp3`، `calm_rain.mp3`، `light_wind.mp3`، `calm_bonfire.mp3`، `morning_birds.mp3`، `cat_puring.mp3`.
- المشغّل: `audio/SoundPlayer.kt` (MediaPlayer، لوبي، من الـ assets).
- الواجهة: أزرار اختيار في `ui/screens/SettingsScreen.kt` + زر Stop.

## 4) الخطوط والصور
- `clean_source/app/src/main/res/values/` — النصوص والثيم.
- `clean_source/app/src/main/assets/flags/` — أعلام القرّاء (SVG).

## 4) الشاشات
Onboarding → Main tabs (Home, Reciters, Playlists, Insights, Search, Settings) → Player overlays → Audio Stories / Widgets / Deep links.

## 5) توحيد الشكل على كل الشاشات ✅
- المكوّن المشترك: `ui/components/ScreenShell.kt` — خلفية فيديو + تراكب أزرق غامق + عنوان موحّد.
- كل الشاشات (`HomeScreen`, `RecitersScreen`, `PlaylistsScreen`, `InsightsScreen`, `SearchScreen`, `SettingsScreen`) تستخدم نفس الـ Shell، فالشكل والتصميم متطابقان.
- شاشة الرئيسية فيها إضافات: اختيار خلفية الفيديو + اختيار المؤثر الصوتي.

## 6) كيف تعدّل التصميم
1. غيّر الألوان في `Theme.kt` و `colors.xml` معاً.
2. غيّر خلفية الفيديو بإضافة ملف MP4 في `assets/videos/background/` ثم أضفه لقائمة `backgroundVideos`.
3. عدّل Compose UI في `ui/screens/*.kt`.
4. حدّث هذا الملف بملخص التغيير.

## 6) قيود
- لا تضف أي مورد أو مكوّن من Google (GMS/Firebase/PairIP).
- حافظ على أسماء الموارد أو حدّث كل مراجعها معاً.
