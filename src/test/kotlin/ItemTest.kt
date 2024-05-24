import org.junit.jupiter.api.Test

class ItemTest {

    @Test
    fun `should format to string`() {
        val item = Item("Aged Brie", 10, 20)
        val formattedItem = item.toString()
        val expectedFormattedItem = "Aged Brie, 10, 20"

        assert(formattedItem == expectedFormattedItem)
    }
}