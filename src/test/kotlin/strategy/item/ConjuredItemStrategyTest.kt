package strategy.item

import Item
import org.junit.jupiter.api.Test
import strategy.ItemCategories
import strategy.items.ConjuredItemStrategy

class ConjuredItemStrategyTest {

    private val strategy = ConjuredItemStrategy()

    @Test
    fun `should decrease quality by 2 when sell in date is greater than 0`() {
        val item = Item(ItemCategories.CONJURED, 1, 2)

        val result = strategy.update(item)
        val expectedResult = Pair(0, 0)

        assert(result == expectedResult)
    }

    @Test
    fun `should decrease quality by 4 when sell in date is less than 0`() {
        val item = Item(ItemCategories.CONJURED, -1, 4)

        val result = strategy.update(item)
        val expectedResult = Pair(-2, 0)

        assert(result == expectedResult)
    }

    @Test
    fun `should not decrease quality less than 0`() {
        val item = Item(ItemCategories.CONJURED, 1, 0)

        val result = strategy.update(item)
        val expectedResult = Pair(0, 0)

        assert(result == expectedResult)
    }
}