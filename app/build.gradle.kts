/*
 * This is the main build file for the project.
 */

// Extra properties to store paths and other values.
ext {
    // Some important paths.
    set("mainJavaSourcePath", "src/main/java")
    set("mainJavaSourcePackagePath", "org/javabujin/rikhoaiomun")
    set("mainJavaSourcePathDownToPackage", "${ext["mainJavaSourcePath"]}/${ext["mainJavaSourcePackagePath"]}")
    set("mainAntlrGeneratedSourcesPath", "${ext["mainJavaSourcePathDownToPackage"]}/antlr/generated")
    set("buildDirectory", layout.buildDirectory.get())
}

// Plugins used in this project.
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application

    // Apply the ANTLR plugin to add support for generating ANTLR code.
    antlr
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

// Dependencies used in this project.
dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)

    // Use ANTLR 4.
    antlr("org.antlr:antlr4:4.13.2")
    compileOnly("org.antlr:antlr4-runtime:4.13.2")

    // Use StringTemplate 4.
    implementation("org.antlr:ST4:4.3.4")
}

// Settings for the Java toolchain.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

// Define the application.
application {
    // Define the main source package for the application.
    val mainJavaSourcePackage = "org.javabujin.rikhoaiomun"

    // Define the main class for the application.
    mainClass = "${mainJavaSourcePackage}.App"
}

// Define the tasks.
//// Test task.
tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

//// Generate ANTLR source code task.
tasks.generateGrammarSource {
    // Set the max heap size.
    maxHeapSize = "256m"

    // Set the arguments for the ANTLR tool.
    //// Reference: https://www.antlr.org/api/maven-plugin/latest/antlr4-mojo.html
    arguments.addAll(listOf(
        "-visitor", // Generate a base for a visitor pattern.
        "-no-listener", // Do not generate a base for a listener pattern.
        "-package", "org.javabujin.rikhoaiomun.antlr.generated" // Set the package for the generated code.
    ))

    // Copy the generated ANTLR source code to the source directory.
    doLast {
        copy {
            from("${ext["buildDirectory"]}/generated-src/antlr/main")
            into("${ext["mainAntlrGeneratedSourcesPath"]}")
        }
        // Clean up the original generated sources.
        file("${ext["buildDirectory"]}/generated-src/antlr").deleteRecursively()
    }

    // Run when source dir has changed or was removed.
    outputs.dir("${ext["mainAntlrGeneratedSourcesPath"]}")
}

//// Clean task.
tasks.clean {
    delete += listOf(
        // Clean up the generated ANTLR source code.
        "${ext["mainAntlrGeneratedSourcesPath"]}"
    )
}