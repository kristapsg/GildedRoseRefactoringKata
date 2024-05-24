package strategy

import Item

interface ItemUpdateStrategy {
    fun update(item: Item): Pair<Int, Int>
}
