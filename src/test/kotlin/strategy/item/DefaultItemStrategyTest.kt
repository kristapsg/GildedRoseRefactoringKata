package strategy.item

import Item
import org.junit.jupiter.api.Test
import strategy.items.DefaultItemStrategy

class DefaultItemStrategyTest {

    private val strategy = DefaultItemStrategy()

    @Test
    fun `should decrease quality by 1 when sell in date is greater than 0`() {
        val item = Item("Default", 1, 1)

        val result = strategy.update(item)
        val expectedResult = Pair(0, 0)

        assert(result == expectedResult)
    }

    @Test
    fun `should decrease quality by 2 when sell in date is less than 0`() {
        val item = Item("Default", -1, 2)

        val result = strategy.update(item)
        val expectedResult = Pair(-2, 0)

        assert(result == expectedResult)
    }
}