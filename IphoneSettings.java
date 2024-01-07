public class IphoneSettings {
    private static IphoneSettings instance;
    private int brightness;
    private boolean enableWifi;

    private IphoneSettings() {
        brightness = 70;
        enableWifi = false;
    }

    private int getBrightness() {
        return brightness;
    }

    private void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    private void enableWifi() {
        enableWifi = true;

    }

    private void disableWifi() {
        enableWifi = false;

    }

    private boolean wifiStatus() {
        return enableWifi;
    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;

    }

    public static void main(String[] args) {

        IphoneSettings iphoneSet = IphoneSettings.getInstance();
        iphoneSet.setBrightness(30);
        System.out.println("curret Brightness: " + iphoneSet.getBrightness());
        iphoneSet.enableWifi();
        System.out.println("Wifi Enable:" + iphoneSet.wifiStatus());

    }
}
