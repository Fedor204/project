package app.thecity.data;

public class Constant {

    public static String WEB_URL ="http://a0602650.xsph.ru/";

    // for map zoom
    public static final double city_lat = 54.707390;
    public static final double city_lng = 20.507307;


    // image file url
    public static String getURLimgPlace(String file_name) {
        return WEB_URL + "uploads/place/" + file_name;
    }
    public static String getURLimgNews(String file_name) {
        return WEB_URL + "uploads/news/" + file_name;
    }

    public static final int LIMIT_PLACE_REQUEST = 40;
    public static final int LIMIT_LOADMORE = 40;

    public static final int LIMIT_NEWS_REQUEST = 40;

    // retry load image notification
    public static int LOAD_IMAGE_NOTIF_RETRY = 3;

    // for search logs Tag
    public static final String LOG_TAG = "CITY_LOG";

    // Google analytics event category
    public enum Event {
        FAVORITES,
        THEME,
        NOTIFICATION,
        REFRESH
    }

}
