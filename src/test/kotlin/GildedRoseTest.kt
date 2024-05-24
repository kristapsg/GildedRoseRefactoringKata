import org.junit.jupiter.api.Test
import strategy.ItemCategories

class GildedRoseTest {
    private val items = listOf(
        Item(ItemCategories.AGED_BRIE, 10, 20),
        Item(ItemCategories.BACKSTAGE_PASSES, 10, 20),
        Item(ItemCategories.SULFURAS, 10, 80),
        Item(ItemCategories.CONJURED, 10, 20),
        Item("Normal item", 10, 20)
    )

    @Test
    fun `should updateQuality with all kind of items`() {
        val gildedRose = GildedRose(items)

        gildedRose.updateQuality()

        assert(items[0].sellIn == 9)
        assert(items[0].quality == 21)

        assert(items[1].sellIn == 9)
        assert(items[1].quality == 21)

        assert(items[2].sellIn == 10)
        assert(items[2].quality == 80)

        assert(items[3].sellIn == 9)
        assert(items[3].quality == 18)

        assert(items[4].sellIn == 9)
        assert(items[4].quality == 19)
    }
}
