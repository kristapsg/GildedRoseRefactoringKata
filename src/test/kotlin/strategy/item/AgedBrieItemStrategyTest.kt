package strategy.item

import Item
import org.junit.jupiter.api.Test
import strategy.ItemCategories
import strategy.items.AgedBrieItemStrategy

class AgedBrieItemStrategyTest {

    private val strategy = AgedBrieItemStrategy()

    @Test
    fun `should increase quality by 1 when sell in date is greater than 0`() {
        val item = Item(ItemCategories.AGED_BRIE, 1, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(0, 2)

        assert(result == expectedResult)
    }

    @Test
    fun `should increase quality by 2 when sell in date is less than 0`() {
        val item = Item(ItemCategories.AGED_BRIE, -1, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(-2, 3)

        assert(result == expectedResult)
    }

    @Test
    fun `should not increase quality more than 50`() {
        val item = Item(ItemCategories.AGED_BRIE, 1, 50)

        val result = strategy.update(item)
        val expectedResult = Pair(0, 50)

        assert(result == expectedResult)
    }
}