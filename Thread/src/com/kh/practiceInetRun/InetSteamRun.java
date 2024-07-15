package com.kh.practiceInetRun;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;
import java.net.MalformedURLException;


public class InetSteamRun {
    public static void main(String[] args) {
        try {
            // LocalHost 정보 출력
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("로컬 호스트명 : " + inet.getHostName());
            System.out.println("로컬 IP 주소 : " + inet.getHostAddress());

            // 스팀 URL
            String steamUrl = "https://store.steampowered.com/app/1693980/Dead_Space/";

            // URL에서 호스트 이름 추출
            URL url = new URL(steamUrl);
            String host = url.getHost();

            // 호스트 이름으로 InetAddress 객체 생성
            InetAddress iNet2 = InetAddress.getByName(host);
            System.out.println("스팀 URL : " + steamUrl);
            System.out.println("스팀 서버명 : " + iNet2.getHostName());
            System.out.println("스팀 IP 주소 : " + iNet2.getHostAddress());

        } catch (UnknownHostException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}