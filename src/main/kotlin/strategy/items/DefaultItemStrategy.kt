package strategy.items

import Item
import strategy.ItemUpdateStrategy

class DefaultItemStrategy: ItemUpdateStrategy {

        override fun update(item: Item): Pair<Int, Int> {
            val quality = when {
                item.sellIn < 0 -> item.quality - 2
                else -> item.quality - 1
            }

            return Pair(item.sellIn - 1, quality.coerceIn(0, 50))
        }
}
