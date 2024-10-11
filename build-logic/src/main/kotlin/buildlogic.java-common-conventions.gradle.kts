plugins {
    java
    id("io.spring.dependency-management")
    id("buildlogic.dependency-analysis")
}

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.1.1")
    }
    dependencies {
        dependency("org.apache.commons:commons-text:1.12.0")
    }
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.9.3")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
