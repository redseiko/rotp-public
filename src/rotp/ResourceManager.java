package rotp;

import java.io.File;
import java.net.URISyntaxException;

public class ResourceManager {
  private static String path;

  private ResourceManager() {}

  public static String getJarPath() {
    if (path == null) {
      try {
        File jarFile = new File(
            ResourceManager.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .toURI()
                .getPath());
        path = jarFile.getParentFile().getPath();
      } catch (URISyntaxException ex) {
        System.out.println("Unable to resolve jar path: " + ex.toString());
        path = ".";
      }
    }

    return path;
  }
}
