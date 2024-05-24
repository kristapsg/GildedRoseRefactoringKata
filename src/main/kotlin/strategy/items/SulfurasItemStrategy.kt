package strategy.items

import Item
import strategy.ItemUpdateStrategy

class SulfurasItemStrategy: ItemUpdateStrategy {

        override fun update(item: Item): Pair<Int, Int> {
            return Pair(item.sellIn, item.quality)
        }
}
