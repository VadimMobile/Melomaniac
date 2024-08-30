fun main() {
    var amount = 15000
    val sale1 = 100
    val sale2 = 0.95
    val sale3 = 0.99
    val buyer1 = true
    val buyer2 = false
        if (amount <= 1000 && buyer1) {
            amount = (amount * sale3).toInt()
        } else if (amount <= 1000 && buyer2) {
            amount = amount
        }
        if (amount in 1001..10000 && buyer2) {
            amount -= sale1
        } else if (amount in 1001..10000 && buyer1) {
            amount = ((amount - sale1) * sale3).toInt()
        }
        if (amount > 10000 && buyer2) {
            amount = (amount * sale2).toInt()
        } else if (amount > 10000 && buyer1) {amount = (amount * sale2 * sale3).toInt()
        }

        println(amount)
}