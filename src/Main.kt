

import org.graalvm.compiler.debug.TTY.println
import java.util.*

fun main(){
    val car = Vehicle("AA111AA",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB",VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC",VehicleType.MINIBUS,Calendar.getInstance())
    val bus = Vehicle("DD444DD",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val parking = Parking(mutableSetOf(car,moto,minibus,bus))
    println(parking.vehicles.add(car))


}