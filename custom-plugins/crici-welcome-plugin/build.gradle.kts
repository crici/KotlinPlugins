plugins {
    `kotlin-dsl`    // applies the java-gradle-plugin automagically
}
group = "de.crici.gradle.plugins"
version = "1.0"

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("crici-welcome") {
            id = "de.crici-welcome"
            implementationClass = "de.crici.kotlin.gradle.plugins.WelcomePlugin"
        }
    }
}
