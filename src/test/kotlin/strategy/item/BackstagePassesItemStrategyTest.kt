package strategy.item

import Item
import org.junit.jupiter.api.Test
import strategy.ItemCategories
import strategy.items.BackstagePassesItemStrategy

class BackstagePassesItemStrategyTest {

    private val strategy = BackstagePassesItemStrategy()

    @Test
    fun `should increase quality by 1 when sell in date is greater than 10`() {
        val item = Item(ItemCategories.BACKSTAGE_PASSES, 11, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(10, 2)

        assert(result == expectedResult)
    }

    @Test
    fun `should increase quality by 2 when sell in date is less than 10 and greater than 5`() {
        val item = Item(ItemCategories.BACKSTAGE_PASSES, 6, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(5, 3)

        assert(result == expectedResult)
    }

    @Test
    fun `should increase quality by 3 when sell in date is less than 5 and greater than 0`() {
        val item = Item(ItemCategories.BACKSTAGE_PASSES, 4, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(3, 4)

        assert(result == expectedResult)
    }

    @Test
    fun `should set quality to 0 when sell in date is less than 0`() {
        val item = Item(ItemCategories.BACKSTAGE_PASSES, -1, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(-2, 0)

        assert(result == expectedResult)
    }

    @Test
    fun `should not increase quality more than 50`() {
        val item = Item(ItemCategories.BACKSTAGE_PASSES, 1, 50)

        val result = strategy.update(item)
        val expectedResult = Pair(0, 50)

        assert(result == expectedResult)
    }
}
