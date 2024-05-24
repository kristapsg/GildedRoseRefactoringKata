package strategy.item

import Item
import org.junit.jupiter.api.Test
import strategy.ItemCategories
import strategy.items.SulfurasItemStrategy

class SulfurasItemStrategyTest {

    private val strategy = SulfurasItemStrategy()

    @Test
    fun `should never update quality and sell in date`() {
        val item = Item(ItemCategories.SULFURAS, 1, 80)

        val result = strategy.update(item)
        val expectedResult = Pair(1, 80)

        assert(result == expectedResult)
    }
}