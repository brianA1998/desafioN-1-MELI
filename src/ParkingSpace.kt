import java.util.*

class ParkingSpace(var vehicle : Vehicle,var parking: Parking){

    private val MINUTES_IN_MILISECONDS = 60000
    private val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS


    fun checkOutVehicle(plate : String) {
        parking.vehicles.remove(vehicle)
        var amount = calculateAmount(parkedTime, vehicle)
        onSuccess(amount)
    }

    //Shows that the check-out is complete
    fun onSuccess(amount : Int){
        println("Amount: $amount")
    }

    //Calculates the stay time of the vehicle
    fun calculateAmount(parkedTime : Long, vehicle: Vehicle): Int{
        var amount = 0
        when(parkedTime) {
            in 0..60L ->amount = vehicle.type.rate
            in 60..120L ->amount = vehicle.type.rate*2

        }
        if (parkedTime > 120){
            var extraMinutes = (parkedTime - 120) / 15
            var extraAmount = extraMinutes * 5
        }
        return amount
    }

}