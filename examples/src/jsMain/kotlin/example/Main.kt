package example

import emotion.react.css
import js.core.Object
import js.core.jso
import react.*
import react.dom.html.HTMLAttributes
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.option
import react.dom.html.ReactHTML.select
import react.dom.html.ReactHTML.textarea
import web.cssom.BackgroundColor
import web.cssom.Color
import web.cssom.ColorProperty
import web.cssom.px
import web.html.HTMLDivElement
import web.html.InputType

enum class Theme(
    val backgroundColor: BackgroundColor,
    val color: ColorProperty,
) {
    LIGHT(Color("white"), Color("black")),
    DARK(Color("black"), Color("white")),

    ;
}

val ThemeContext = createContext(Theme.LIGHT)

val MainApp = FC<PropsWithChildren> { props ->
    ThemeContext(Theme.DARK) {
        div {
            ThemeContext.Consumer {
                children = { theme ->
                    div.create {
                        css {
                            color = theme.color
                            backgroundColor = theme.backgroundColor
                        }

                        +"Hello from React"
                    }
                }
            }

            css {
                width = 100.px
                height = 100.px
                backgroundColor = Color("red")
            }

            // Setting an attribute
            title = "My title"

            // Setting a custom attribute
            asDynamic()["my-attribute"] = 100

            // Assigning additional attributes
            Object.assign(this, jso<HTMLAttributes<HTMLDivElement>> { tabIndex = 0 })

            // Appending children from props
            +props.children

            // Form elements https://facebook.github.io/react/docs/forms.html

            input {
                defaultValue = "foo"
            }

            input {
                type = InputType.checkbox
                defaultChecked = true
            }

            textarea {
                defaultValue = "foobar"
            }

            val options = useMemo { listOf("foo", "bar", "baz") }

            select {
                defaultValue = "foo"

                options.forEach {
                    option {
                        key = it
                        value = it

                        +it
                    }
                }
            }

            select {
                multiple = true
                // TODO: Remove `unsafeCast` after declarations improvement
                defaultValue = arrayOf("foo", "bar").unsafeCast<String>()

                options.forEach {
                    option {
                        key = it
                        value = it

                        +it
                    }
                }
            }
        }
    }
}
