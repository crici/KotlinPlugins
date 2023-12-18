pluginManagement {
    includeBuild("custom-plugins")
}

include("hello-kotlin")

for ( project in rootProject.children ) {
    project.projectDir = file("subprojects/${project.name}")
}