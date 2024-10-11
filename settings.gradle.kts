pluginManagement {
    includeBuild("build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    id("com.example.simple-settings-plugin")
}

val modules = sortedSetOf<String>()
rootProject.name = "demo-gradle-kts"

includeModule(":app")
includeModule(":list")
includeModule(":utilities")

fun includeModule(name: String) {
    modules.lastOrNull()?.let {
        if (it > name) {
            throw IllegalArgumentException("Modules must be included in alphabetical order, " +
                    "\"$it\" should go after \"$name\"")
        }
    }
    modules.add(name)
    include(name)
    val module = name.substring(name.lastIndexOf(':') + 1)
    with(project(name)) {
        buildFileName = "$module.gradle.kts"
        if (!buildFile.exists()) {
            throw GradleException("Module \"$name\" does not have a build file. Expected file name is $buildFile")
        }
    }
}
