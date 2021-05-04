package com.sds.cafe;

import com.cafe.GildedRose;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CafeTest {

    @Test
    public void should_be_nothing_when_no_item() {
        //Given
        Item[] items = new Item[] { };
        Cafe app = new Cafe(items);

        //When
        app.updateQuality();

        //Then
        assertEquals(0, app.items.length);
    }

}