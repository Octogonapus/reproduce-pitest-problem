plugins {
    kotlin("kapt")
}

apply {
    from(rootProject.file("gradle/generated-kotlin-sources.gradle"))
}

description = "A DSL for generating scripts."

fun DependencyHandler.arrow(name: String) =
    create(group = "io.arrow-kt", name = name, version = property("arrow.version") as String)

dependencies {
    api(arrow("arrow-core"))
    api(arrow("arrow-core-data"))
    api(arrow("arrow-optics"))
    api(arrow("arrow-fx"))
    api(arrow("arrow-syntax"))
    api(arrow("arrow-free"))
    api(arrow("arrow-free-data"))
    api(arrow("arrow-recursion"))
    api(arrow("arrow-recursion-data"))
    kapt(arrow("arrow-meta"))
    kapt(arrow("arrow-generic"))

    testImplementation(
            group = "io.kotest",
            name = "kotest-runner-junit5",
            version = "4.0.2793-SNAPSHOT"
    )
    testImplementation(
            group = "io.kotest",
            name = "kotest-assertions-arrow",
            version = "4.0.2793-SNAPSHOT"
    )
    testImplementation(
            group = "io.kotest",
            name = "kotest-extensions",
            version = "4.0.2793-SNAPSHOT"
    )

    testImplementation(
            group = "org.junit.jupiter",
            name = "junit-jupiter",
            version = property("junit-jupiter.version") as String
    )
}
