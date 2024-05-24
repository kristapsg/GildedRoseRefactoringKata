package strategy.items

import Item
import strategy.ItemUpdateStrategy

class ConjuredItemStrategy: ItemUpdateStrategy {

        override fun update(item: Item): Pair<Int, Int> {

            val quality = when {
                item.sellIn < 0 -> item.quality - 4
                else -> item.quality - 2
            }

            return Pair(item.sellIn - 1, quality.coerceIn(0, 50))
        }
}