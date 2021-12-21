import java.util.*

data class ParkingSpace(var vehicle : Vehicle) {
    var parking = Parking(vehicles = mutableSetOf(vehicle))
    private val MINUTES_IN_MILISECONDS = 60000
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS

    fun checkOutVehicle(plate : String) {
        parking.vehicles.remove(vehicle)
        var amount = calculateAmount(parkedTime, vehicle)
        onSuccess(amount)
    }

    fun onSuccess(amount : Int){
        println("Amount: $amount")
    }

    fun calculateAmount(parkedTime : Long, vehicle: Vehicle): Int{
        var amount = 0
        when(parkedTime) {
            in 0..60L -> amount = vehicle.type.rate
            in 60..120L -> amount = vehicle.type.rate*2
        }
        if (parkedTime > 120){
            var extraMinutes = (parkedTime - 120) / 15
            var extraAmount = extraMinutes * 5
        }
        return amount
    }

}