package de.crici.kotlin.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register

interface WelcomeExtension {
    /** The greeting message property. */
    val message: Property<String>
}

class WelcomePlugin : Plugin<Project> {
    override fun apply( project: Project ) {

        val welcomeExtension = project.extensions.create<WelcomeExtension>("welcome")
        project.tasks.register<Task>("welcome") {
            group = "Greeting"
            description = "Prints a nice greeting"

            doLast {
                println(welcomeExtension.message.get())
            }
        }
    }
}