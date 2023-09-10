class factory_uniforms_for_boys(): Factory {
    override fun create_upper_part(): upper_part_for_boy {
        return upper_part_for_boy()
    }

    override fun create_lower_part(): lower_part_for_boy {
        return lower_part_for_boy()
    }
}