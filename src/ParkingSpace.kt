import java.util.*
import kotlin.math.ceil
import kotlin.math.roundToInt

class ParkingSpace(var vehicle : Vehicle,var parking: Parking){

    var carsQuantity : Int = 0
    var gain : Int = 0

    private val MINUTES_IN_MILISECONDS = 60000
    var parkedTime: Long = 151
        //get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS


    fun checkOutVehicle(plate : String) {

        var equals = vehicle.plate.compareTo(plate)
        if (equals != 0) {
            onError()
        } else{
            parking.vehicles.remove(vehicle)
            var amount = calculateFee(parkedTime, vehicle.type)
            carsQuantity += 1
            gain += amount
            onSuccess(amount)
            parking.vehiclesQuantity = Pair(carsQuantity,gain)
        }
    }

    //Shows that the check-out is complete
    fun onSuccess(amount : Int){
        println("Your fee is $amount. Come back soon.")
    }

    //Calculates the stay time of the vehicle
    fun calculateFee(parkedTime : Long, vehicleType: VehicleType): Int{
        var amount = 0
        var totalAmount = 0
        when(parkedTime) {
            in 0..60L ->amount = vehicleType.rate
            in 60..120L ->amount = vehicleType.rate*2
        }
        if (parkedTime > 120){
            var extraMinutes = parkedTime - 120
            var extraMinutesDouble = extraMinutes.toDouble()
            var blocks = ceil((extraMinutesDouble / 15))
            var extraAmount = blocks * 5L

            totalAmount = (vehicleType.rate*2) + extraAmount.toInt()
        }

        //Verified if discount is null and apply discount if is not null to totalAmount
        vehicle.discountCard?.let{
            totalAmount = (totalAmount - totalAmount*0.15).toInt()} ?:
        run{totalAmount = totalAmount}

        return totalAmount
    }

    // It is executed when the vehicle doesn't exists
    private fun onError() {
        println("Sorry, the check-out failed")
    }

}