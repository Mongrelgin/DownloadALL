package DownloadAll31v;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteScannerTest {

    @Test
    void removeLastLatter() {
        String testWord = "Sanyaa";
        String checkWord = "Sanya";

        Assertions.assertEquals(WebsiteScanner.removeLastLatter(testWord), checkWord);
    }
}