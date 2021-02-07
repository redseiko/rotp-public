package rotp;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.net.URISyntaxException;

public class ResourceManager {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static String path;

  private ResourceManager() {}

  public static String getJarPath() {
    if (path == null) {
      try {
        File jarFile =
            new File(
                ResourceManager.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .toURI()
                    .getPath());

        path = jarFile.getParentFile().getPath();
      } catch (URISyntaxException ex) {
        logger.atSevere().withCause(ex).log("Unable to resolve jar path.");
        path = ".";
      }
    }

    return path;
  }
}
