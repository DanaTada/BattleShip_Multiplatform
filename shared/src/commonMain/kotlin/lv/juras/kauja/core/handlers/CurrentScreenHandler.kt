package lv.juras.kauja.core.handlers

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

object CurrentScreenHandler {
    private val _currentScreen = MutableStateFlow(Screen.Menu)
    val currentScreen = _currentScreen.asStateFlow()

    fun changeScreen(target: Screen) {
        _currentScreen.value = target
    }
}
enum class Screen {
    Menu,
    GameScreen,
    Score,
}