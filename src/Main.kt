import device.SmartDevice
import device.SmartLamp
import device.SmartTV
import device.SmartAirConditioner

fun main() {
    val device = listOf<SmartDevice>(
        SmartLamp(
            "Ночник Геннадий"),
        SmartTV(
            "Телевизор Антон"),
        SmartAirConditioner(
            "Кондиционер Евгений", temperature = 25)
    )
    device.forEach { controlDevice(it) }
}

fun controlDevice(device: SmartDevice) {
    device.turnOn()
    device.status()
    device.turnOff()
    device.status()

}