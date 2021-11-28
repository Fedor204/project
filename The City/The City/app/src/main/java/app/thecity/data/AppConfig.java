package app.thecity.data;

public class AppConfig {


    public static final boolean ENABLE_GDPR = false;

    //  flag if to hide menu news info
    public static final boolean ENABLE_NEWS_INFO = true;

    // flag for save image offline
    public static final boolean IMAGE_CACHE = true;

    public static final boolean LAZY_LOAD = false;

    // flag for tracking analytics
    public static final boolean ENABLE_ANALYTICS = true;

    // clear image cache when receive push notifications
    public static final boolean REFRESH_IMG_NOTIF = true;


    // when user enable gps, places will sort by distance
    public static final boolean SORT_BY_DISTANCE = true;

    // distance metric, fill with KILOMETER or MILE only
    public static final String DISTANCE_METRIC_CODE = "KILOMETER";

    // related to UI display string
    public static final String DISTANCE_METRIC_STR = "Km";

    // flag for enable disable theme color chooser, in Setting
    public static final boolean THEME_COLOR = true;

}
