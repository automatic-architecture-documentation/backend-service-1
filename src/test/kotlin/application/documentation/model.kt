package application.documentation

data class ApplicationDescription(
    val id: String,
    val type: ComponentType,
    val distanceFromUs: Distance,
)

data class DependentDescription(
    val id: String,
    val type: ComponentType,
    val distanceFromUs: Distance,
)

data class DependencyDescription(
    val id: String,
    val type: ComponentType,
    val distanceFromUs: Distance,
    val credentials: List<Credentials> = emptyList(),
)

enum class ComponentType { BACKEND, FRONTEND, DATABASE }
enum class Distance { OWNED, CLOSE, EXTERNAL }
enum class Credentials { JWT, BASIC_AUTH }

data class HttpEndpoint(val method: String, val path: String)

data class EventDescription(
    val name: String,
    val type: String,
    val description: String,
    val example: String,
    val fields: List<Field>,
) {
    data class Field(
        val property: String,
        val type: String,
        val nullable: Boolean,
        val description: String?,
    )
}
