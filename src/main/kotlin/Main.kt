fun main() {


    fun goToMinuteText(time: Int): Any {
        var minute = time / 60
        var total = minute % 10

        var textMinute = when (total) {
            1 -> {
                "Byl(a) v sety $minute minutu nazad"
            }
            in 2..4 -> {
                "Byl(a) v sety $minute minuty nazad"
            }

            else -> {
                "Byla(a) v sety $minute minut nazad"
            }
        }
        return textMinute
    }

    fun goToHour(time: Int): Any {
        var hour = time / 3600
        val total = hour % 10
        var textHour = when (total) {
            1 -> {
                "Byl(a) v sety $hour chas nazad"
            }
            in 2..4 -> {
                "Byl(a) v sety $hour chasa nazad"
            }


            else -> {
                "Byl(a) v sety $hour chasov nazad"
            }
        }
        return textHour
    }

    fun goToText(time: Int): Any {
        var text = when (time) {
            in 0..60 -> {
                "Byl (a) v sety tolko chto"
            }
            in 61..3600 -> {
                goToMinuteText(time)
            }
            in 3601..86400 -> {
                goToHour(time)
            }
            in 86400..172800 -> {
                "Byl (a) v sety segodnya"
            }
            in 172801..259200 -> {
                "Byl (a) v sety vchera"
            }
            else -> {
                "Byl (a) v sety davno"

            }
        }

        return text
    }


    var time = 86401//время в секундах

    var text = goToText(time)

    println(text)

}

