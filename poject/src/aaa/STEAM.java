package aaa;

import java.awt.Desktop;
import java.net.URI;

public class STEAM {
    public static void main(String[] args) {
        try {
            // 열고자 하는 URL
            String url = "https://store.steampowered.com";
            // URI 객체 생성
            URI uri = new URI(url);
            // 기본 브라우저로 URL 열기
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}