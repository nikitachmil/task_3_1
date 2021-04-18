fun main() {


    fun goToMinuteText(time: Int): Any {
        var minute = time / 60
        var total = minute % 10

        var textMinute = when (total) {
            1 -> {
                "Был(а) в сети $minute минуту назад"
            }
            in 2..4 -> {
                "Был(а) в сети $minute минуты назад"
            }

            else -> {
                "Был(а) в сети $minute минут назад"
            }
        }
        return textMinute
    }

    fun goToHour(time: Int): Any {
        var hour = time / 3600
        val total = hour % 10
        var textHour = when (total) {
            1 -> {
                "Был(а) в сети $hour час назад"
            }
            in 2..4 -> {
                "Был(а) в сети $hour часа назад"
            }


            else -> {
                "Был(а) в сети $hour часов назад"
            }
        }
        return textHour
    }

    fun goToText(time: Int): Any {
        var text = when (time) {
            in 0..60 -> {
                "Была(а) в сети только что"
            }
            in 61..3600 -> {
                goToMinuteText(time)
            }
            in 3601..86400 -> {
                goToHour(time)
            }
            in 86400..172800 -> {
                "Был(а) в сети сегодня"
            }
            in 172801..259200 -> {
                "Был(а) в сети вчера"
            }
            else -> {
                "Был(а) в сети давно"

            }
        }

        return text
    }


    var time = 86401//время в секундах

    var text = goToText(time)

    println(text)

}

