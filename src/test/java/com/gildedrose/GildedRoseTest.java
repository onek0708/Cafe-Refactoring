package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class GildedRoseTest {

    @Test
    public void should_be_nothing_when_no_item() {
        //Given
        Item[] items = new Item[] { };
        GildedRose app = new GildedRose(items);

        //When
        app.updateQuality();

        //Then
        assertEquals(0, app.items.length);
    }

}