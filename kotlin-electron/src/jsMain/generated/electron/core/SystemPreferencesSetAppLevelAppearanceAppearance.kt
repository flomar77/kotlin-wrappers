package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dark: 'dark', light: 'light'}/*union*/)""")
sealed external interface SystemPreferencesSetAppLevelAppearanceAppearance {
    companion object {
        val dark: SystemPreferencesSetAppLevelAppearanceAppearance
        val light: SystemPreferencesSetAppLevelAppearanceAppearance
    }
}
