class factory_uniforms_for_girls(): Factory {
    override fun create_upper_part(): upper_part_for_girl {
        return upper_part_for_girl()
    }

    override fun create_lower_part(): lower_part_for_girl {
        return lower_part_for_girl()
    }
}