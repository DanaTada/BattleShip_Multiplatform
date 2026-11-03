package lv.juras.kauja.core.handlers

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

object MenuHandler {
    private val _theme = MutableStateFlow(Theme.Light)
    val theme = _theme.asStateFlow()

    fun switchTheme() {
        val newTheme = if (_theme.value == Theme.Light) Theme.Dark else Theme.Light
        _theme.update { newTheme }
    }
}

enum class Theme {
    Light,
    Dark,
}