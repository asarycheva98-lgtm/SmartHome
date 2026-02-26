class SmartAirConditioner(
    name: String,
    isOn: Boolean = false,
    val temperature: Int
) : SmartDevice(name, isOn) {
    override fun turnOn() {
        if (isOn) {
            println("Устройство $name уже включен")
            return
        }
        isOn = true
        println("Устройство $name включен, температура: $temperature")

    }

    override fun turnOff() {
        if (!isOn) {
            println("Устройство $name уже выключено")
            return
        }
        isOn = false
        println("Устройство $name выключено")

    }
}