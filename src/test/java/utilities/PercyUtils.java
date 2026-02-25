package utilities;

import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;

/**
 * Utility class for Percy snapshot handling
 */
public class PercyUtils {

    private Percy percy;

    // Constructor
    public PercyUtils(WebDriver driver) {
        this.percy = new Percy(driver);
    }

    /**
     * Take snapshot with custom name
     */
    public void takeSnapshot(String snapshotName) {
        percy.snapshot(snapshotName);
    }
}