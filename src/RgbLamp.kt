class RgbLamp(
    name: String,
    isOn: Boolean = false
    var color: String
) : SmartLamp (
    name, isOn
) {

    override fun setBrightness1(brigtness: Int) {
        super.setBrightness1(brigtness)
        if (isOn) {
            println("Текущий цвет: $color")
        }
    }
    fun setColorr(color: String) {
        this.color = color
    }

    fun setColorr(color: String, brigtness: Int) {
        setColorr(color)
        setBrightness1(brigtness)
    }
}