package com.mchutov.quranify.data

data class Reciter(val id: Int, val name: String, val style: String)
data class Surah(val number: Int, val name: String, val arabicName: String)
data class Playlist(val id: Int, val name: String, val count: Int)

object LocalRepository {
    val reciters = listOf(
        Reciter(1, "Mishary Rashid Alafasy", "Murattal"),
        Reciter(2, "Abdul Basit", "Mujawwad"),
        Reciter(3, "Saad Al Ghamdi", "Quran"),
        Reciter(4, "Maher Al Muaiqly", "Tarawih"),
        Reciter(5, "Yasser Al Dosari", "Murattal"),
    )

    val surahs = listOf(
        Surah(1, "Al-Fatihah", "الفاتحة"),
        Surah(2, "Al-Baqarah", "البقرة"),
        Surah(3, "Aal-E-Imran", "آل عمران"),
        Surah(4, "An-Nisa", "النساء"),
        Surah(5, "Al-Ma'idah", "المائدة"),
    )

    val playlists = listOf(
        Playlist(1, "Favorites", 12),
        Playlist(2, "Recently Played", 8),
        Playlist(3, "Night Recitation", 5),
    )

    fun reciter(id: Int): Reciter? = reciters.find { it.id == id }
}
