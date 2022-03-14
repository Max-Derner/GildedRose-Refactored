import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Regular("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void limitTestForTicketAtSellIn11() {
        Item[] items = new Item[] { new Ticket("foo", 11, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void limitTestForTicketAtSellIn10() {
        Item[] items = new Item[] { new Ticket("foo", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void limitTestForTicketAtSellIn6() {
        Item[] items = new Item[] { new Ticket("foo", 6, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void limitTestForTicketAtSellIn5() {
        Item[] items = new Item[] { new Ticket("foo", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void limitTestForTicketAtSellIn1() {
        Item[] items = new Item[] { new Ticket("foo", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void limitTestForTicketAtSellIn0() {
        Item[] items = new Item[] { new Ticket("foo", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void qualityTestForLegendary(){
        Item[] items = new Item[] { new Legendary("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }

    @Test
    void qualityTestForAged(){
        Item[] items = new Item[] { new Aged("foo", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }
    @Test
    void qualityAndLimitTestForAged(){
        Item[] items = new Item[] { new Aged("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void qualityTestForConjured(){
        Item[] items = new Item[] { new Conjured("foo", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void qualityAndLimitTestForConjured(){
        Item[] items = new Item[] { new Conjured("foo", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void qualityTestForRegular(){
        Item[] items = new Item[] { new Regular("foo", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void qualityAndLimitTestForRegular(){
        Item[] items = new Item[] { new Regular("foo", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

}
