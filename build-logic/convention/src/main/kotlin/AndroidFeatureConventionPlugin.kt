import com.android.build.gradle.LibraryExtension
import dev.example.recipesapp.buildLogic.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("recipes.android.library")
            }

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 34
                resourcePrefix =
                    path.split("""\W""".toRegex()).drop(1).distinct().joinToString(separator = "_")
                        .lowercase() + "_"
            }
        }
    }
}