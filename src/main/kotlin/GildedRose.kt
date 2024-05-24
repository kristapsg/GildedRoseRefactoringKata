import strategy.StrategyContext

class GildedRose(private var items: List<Item>) {

    fun updateQuality() {
        for (item in items) {
            val strategyContext = StrategyContext(item.name)
            val (sellIn, quality) = strategyContext.update(item)
            item.sellIn = sellIn
            item.quality = quality
        }
    }
}
