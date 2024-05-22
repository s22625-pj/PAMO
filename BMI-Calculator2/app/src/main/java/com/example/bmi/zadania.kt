package com.example.bmi;

import kotlin.math.PI

object zadania {
    /**
     * 1 Ćwiczenie
     * Masz program, który liczy kawałki pizzy aż do momentu, gdy będzie cała pizza z 8 kawałkami. Przerób ten program na dwa sposoby:
     * Użyj pętli while.
     * Użyj pętli do-while.
     */
     
    fun main1() {
        var pizzaSlices = 0
        while (pizzaSlices < 7) {
            pizzaSlices++
            println("Został tylko $pizzaSlices kawałek/kawałki pizzy :(")
        }
        pizzaSlices++
        println("Mamy $pizzaSlices kawałków pizzy. Hura! Mamy całą pizzę! :D")
    }

    /**
     * 2 Ćwiczenie
     * Używając wyrażenia when, zaktualizuj poniższy program tak, aby po podaniu nazw przycisków GameBoy'a, akcje były drukowane na wyjściu.
     */

    fun main2() {
        val button = "A"
        println(
                when (button) {
                    "A" -> "Tak"
                    "B" -> "Nie"
                    "X" -> "Menu"
                    "Y" -> "Nic"
                    else -> "Nie ma takiego przycisku"
                }
        )
    }

    /**
     * 3 Ćwiczenie
     * Masz listę "zielonych" liczb i listę "czerwonych" liczb. Uzupełnij kod w taki sposób, aby wydrukować, ile jest liczb razem.
     */

    fun main3() {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)
        val totalCount = greenNumbers.size + redNumbers.size
        println("Razem: $totalCount")
    }

    /**
     * 4 Ćwiczenie
     * Napisz program, który symuluje grę Fizz buzz. Twoim zadaniem jest wypisanie liczb od 1 do 100, zastępując każdą liczbę podzielną przez trzy słowem "fizz",
     * a każdą liczbę podzielną przez pięć słowem "buzz". Każda liczba podzielna zarówno przez 3, jak i 5 musi być zastąpiona słowem "fizzbuzz".
     */

    fun main4() {
        for (number in 1..100) {
            println(
                    when {
                        number % 15 == 0 -> "fizzbuzz"
                        number % 3 == 0 -> "fizz"
                        number % 5 == 0 -> "buzz"
                        else -> number.toString()
                    }
            )
        }
    }

    /**
     * 5 Ćwiczenie
     * Masz listę słów. Użyj pętli for i instrukcji if, aby wydrukować tylko te słowa, które zaczynają się na literę "l".
     */

    fun main5() {
        val words = listOf("dinozaur", "limuzyna", "magazyn", "język")
        for (word in words) {
            if (word.startsWith("l")) {
                println(word)
            }
        }
    }

    /**
     * 6 Ćwiczenie
     * Napisz funkcję o nazwie circleArea, która przyjmuje jako parametr promień koła w formacie całkowitoliczbowym i zwraca pole tego koła.
     * @param radius Promień koła.
     * @return Pole koła.
     */

    fun circleArea(radius: Int): Double {
        return PI * radius * radius
    }

    fun main6() {
        println(circleArea(4))
    }

    /**
     * 7 Ćwiczenie
     * Jawnie zadeklaruj poprawny typ dla każdej zmiennej:
     */

    fun main7() {
        val a: Int = 1000
        val b: String = "wiadomość logowania"
        val c: Double = 3.14
        val d: Long = 100_000_000_000_000
        val e: Boolean = false
        val f: Char = '\n'
    }

    /**
     * 8 Ćwiczenie
     * Masz zestaw obsługiwanych protokołów przez swój serwer. Użytkownik prosi o użycie określonego protokołu. Uzupełnij program, aby sprawdzić,
     * czy żądany protokół jest obsługiwany czy nie (isSupported musi być wartością typu Boolean).
     */

    fun main8() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
        println("Wsparcie dla $requested: $isSupported")
    }

    /**
     * 9 Ćwiczenie
     * Zdefiniuj mapę, która przypisuje liczby całkowite od 1 do 3 do ich odpowiednich zapisów słownych. Użyj tej mapy, aby zapisać podaną liczbę słownie.
     */

    fun main9() {
        val number2word = mapOf(1 to "jeden", 2 to "dwa", 3 to "trzy")
        val n = 2
        println("$n jest zapisane jako '${number2word[n]}'")
    }

    /**
     * 10 Ćwiczenie
     * Uzupełnij kod, aby program wypisywał "Mary ma 20 lat" na standardowe wyjście:
     */

    fun main10() {
        val name = "Mary"
        val age = 20
        println("$name ma $age lat")
    }
}
