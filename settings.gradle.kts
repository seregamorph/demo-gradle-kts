pluginManagement {
    includeBuild("build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    id("com.example.simple-settings-plugin")
}

rootProject.name = "demo-gradle-kts"
include("app", "list", "utilities")
