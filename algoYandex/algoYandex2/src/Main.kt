import kotlin.math.abs

fun flightTime(dT: String, aT: String, tz: Int): String{

    val flight_time: String

    var dTH = dT.split(":")[0].toInt()
    var dTM = dT.split(":")[1].toInt()

    var aTH = aT.split(":")[0].toInt()
    var aTM = aT.split(":")[1].toInt()

    var dTHWTz = dTH + tz // dTH with timezone

    if(dTHWTz == 0){
        dTHWTz = 24
    }

    var ftH: Int
    var ftM: Int

    if( dTHWTz >  aTH){ ftH = abs(24 - dTHWTz + aTH); ftM = abs(0 - dTM + aTM) }
    else{ ftH = abs(aTH - dTHWTz); ftM = abs(aTM - dTM) }

    if( ftM >= 60){
        ftH += 1
        ftM -= 60
    }

    val ftHStr: String
    val ftMStr: String

    ftHStr = ftH.toString()
    if(ftM < 10 ) { ftMStr = "0$ftM" }
    else{ ftMStr = ftM.toString() }

    flight_time = "$ftHStr:$ftMStr"
    return flight_time
}


fun main(){
    val departureTime = readLine().toString()
    val arrivalTime = readLine().toString()
    val timezone = readLine()!!.toInt()

    println(flightTime(departureTime, arrivalTime, timezone))
}