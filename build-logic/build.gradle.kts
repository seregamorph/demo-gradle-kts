plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("io.spring.gradle:dependency-management-plugin:1.1.6")
    implementation("com.autonomousapps:dependency-analysis-gradle-plugin:2.1.4")
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
