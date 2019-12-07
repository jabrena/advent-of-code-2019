package day2

enum class ParserStates(val opcode: Int) {
    SUM(1),
    MULTIPLY(2),
    HALT(99),
    UNKNOWN(-1);

    companion object {
        @JvmStatic
        fun fromInt(status: Int): ParserStates =
                values().find { value -> value.opcode == status } ?: UNKNOWN
    }
}