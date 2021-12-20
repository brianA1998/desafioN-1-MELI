import java.util.*

data class ParkingSpace(var vehicle : Vehicle, var checkInTime : Calendar, var discountCard : String?) {
    private val MINUTES_IN_MILISECONDS = 60000
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS
}