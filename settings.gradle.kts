import java.util.TreeSet

pluginManagement {
    includeBuild("build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    id("com.example.simple-settings-plugin")
}

val modules = TreeSet<String>()
rootProject.name = "demo-gradle-kts"

includeModule(":app")
includeModule(":list")
includeModule(":utilities")

fun includeModule(name: String) {
    modules.lastOrNull()?.let {
        if (it > name) {
            throw IllegalArgumentException("Modules must be included in lexicographical order, " +
                    "$it should go after $name")
        }
    }
    modules.add(name)
    include(name)
}
