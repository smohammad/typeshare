@Serializable
data class OPItemDetailsFieldValue (
	val hello: String
)

@Serializable
sealed class OPAdvancedColors {
	@Serializable
	@SerialName("String")
	data class String(val c: String): AdvancedColors()
	@Serializable
	@SerialName("Number")
	data class Number(val c: Int): AdvancedColors()
	@Serializable
	@SerialName("NumberArray")
	data class NumberArray(val c: List<Int>): AdvancedColors()
	@Serializable
	@SerialName("ReallyCoolType")
	data class ReallyCoolType(val c: ItemDetailsFieldValue): AdvancedColors()
	@Serializable
	@SerialName("ArrayReallyCoolType")
	data class ArrayReallyCoolType(val c: List<ItemDetailsFieldValue>): AdvancedColors()
	@Serializable
	@SerialName("DictionaryReallyCoolType")
	data class DictionaryReallyCoolType(val c: HashMap<String, ItemDetailsFieldValue>): AdvancedColors()
}

