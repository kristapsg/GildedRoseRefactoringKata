package strategy

import Item
import strategy.items.*

class StrategyContext(name: String) {

    val strategy: ItemUpdateStrategy = when (name) {
        ItemCategories.AGED_BRIE -> AgedBrieItemStrategy()
        ItemCategories.BACKSTAGE_PASSES -> BackstagePassesItemStrategy()
        ItemCategories.SULFURAS -> SulfurasItemStrategy()
        ItemCategories.CONJURED -> ConjuredItemStrategy()
        else -> DefaultItemStrategy()
    }

    fun update(item: Item): Pair<Int, Int> {
        return strategy.update(item)
    }
}