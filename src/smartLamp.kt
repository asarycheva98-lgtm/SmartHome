open class SmartLamp(
    name: String,
    isOn: Boolean = false,

) : SmartDevice(name, isOn) {

    var brigtness: Int = 0

   open  fun setBrightness1(brigtness: Int) {
        when {
            !isOn -> {
                println("Нельзя менять яркость")
                return
            }

            brigtness < 0 -> {
                println("Яркость не может быть меньше нуля")
                return
            }

            brigtness > 100 -> {
                println("Яркость не может быть больше ста")
                return
            }
        }
        println("Яркость выставленна на $brigtness")
        this@SmartLamp.brigtness = brigtness
    }


    override fun turnOn() {
        if (isOn) {
            println("Устройство: $name уже включен")
            return
        }
        isOn = true
        println("Устройство: $name включился")
    }
    fun turnOn(brigtness: Int) {
        if (!isOn) {
            turnOn()
            return
        }
        setBrightness1(brigtness)
    }

    override fun turnOff() {
        if (!isOn) {
            println("Устройство: $name уже выключен")
            return
        }
        isOn = false
        println("Устройство: $name выключен")
    }
}
