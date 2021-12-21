import java.util.*

data class ParkingSpace(var vehicle : Vehicle) {
    private val MINUTES_IN_MILISECONDS = 60000
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS

    fun checkOutVehicle(plate : String) {
        parking.vehicles.remove(vehicle)
        onSuccess()
    }

    fun onSuccess(amount : Int){

    }

    fun calculateAmount(parkedTime : Long, vehicle: Vehicle): Int{
        var amount = 0
        when(parkedTime) {
            is 0..60L, is 22L -> amount = 20
            /*in 0..60L -> {
                when(vehicle.type) {
                    VehicleType.CAR -> amount = 20

                }
            }

            in 60..120 -> amount = 40*/
        }
        return amount
    }

}