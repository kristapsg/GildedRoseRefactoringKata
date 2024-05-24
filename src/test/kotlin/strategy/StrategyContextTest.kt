package strategy

import org.junit.jupiter.api.Test
import strategy.items.*

class StrategyContextTest {

    @Test
    fun `should use AgedBrieItemStrategy when item name is Aged Brie`() {
        val strategyContext = StrategyContext(ItemCategories.AGED_BRIE)

        assert(strategyContext.strategy is AgedBrieItemStrategy)
    }

    @Test
    fun `should use BackstagePassesItemStrategy when item name is Backstage passes to a TAFKAL80ETC concert`() {
        val strategyContext = StrategyContext(ItemCategories.BACKSTAGE_PASSES)

        assert(strategyContext.strategy is BackstagePassesItemStrategy)
    }

    @Test
    fun `should use SulfurasItemStrategy when item name is Sulfuras, Hand of Ragnaros`() {
        val strategyContext = StrategyContext(ItemCategories.SULFURAS)

        assert(strategyContext.strategy is SulfurasItemStrategy)
    }

    @Test
    fun `should use ConjuredItemStrategy when item name is Conjured`() {
        val strategyContext = StrategyContext(ItemCategories.CONJURED)

        assert(strategyContext.strategy is ConjuredItemStrategy)
    }

    @Test
    fun `should use DefaultItemStrategy when item name is not recognized`() {
        val strategyContext = StrategyContext("Unrecognized Item")

        assert(strategyContext.strategy is DefaultItemStrategy)
    }
}
