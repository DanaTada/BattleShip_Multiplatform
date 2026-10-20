package lv.juras.kauja

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform