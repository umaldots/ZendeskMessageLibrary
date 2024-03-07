pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ( "https://zendesk.jfrog.io/artifactory/repo" )
    }
}

rootProject.name = "RightHandZendeskApplication"
include(":app")
include(":ZendeskMessageLibrary")
