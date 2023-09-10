class Client(factory: Factory) {
    private lateinit var upperPart: upper_part
    private lateinit var lowerPart: lower_part

    init {
        val upperPart = factory.create_upper_part()
        val lowerPart = factory.create_lower_part()
    }
}