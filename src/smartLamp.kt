

class SmartLamp(
    name: String,
    isOn: Boolean = false
) : SmartDevice(name, isOn) {
    override fun turnOn() {
        if (isOn) {
            println("Устройство: \"$name\" уже включен")
            return
        }
        isOn = true
        println("Устройство: \"$name\" включился")
    }

    override fun turnOff() {
        if (!isOn) {
            println("Устройство: \"$name\" уже выключен")
            return
        }
        isOn = false
        println("Устройство: \"$name\" выключен")
    }
}