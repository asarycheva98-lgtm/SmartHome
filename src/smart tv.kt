class SmartTV(
    name: String,
    isOn: Boolean = false
) : SmartDevice(name, isOn) {
    override fun turnOn() {
        if (isOn) {
            println("Устройство \"$name\" уже включено")
            return
        }
        isOn = true
        println("Устройство \"$name\" включен")
    }

    override fun turnOff() {
        if (!isOn) {
            println("Устройство \"$name\" уже выключено")
            return
        }
        isOn = false
        println("Устройство \"$name\" выключено")
    }
}