plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

gradlePlugin {
    plugins {
        create("simple-settings-plugin") {
            id = "com.example.simple-settings-plugin"
            implementationClass = "com.github.seregamorph.gradle.SimpleSettingsPlugin"
        }

        create("simple-project-plugin") {
            id = "com.example.simple-project-plugin"
            implementationClass = "com.github.seregamorph.gradle.SimpleProjectPlugin"
        }
    }
}
