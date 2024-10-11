plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("io.spring.gradle:dependency-management-plugin:1.1.6")
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
