package practice1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
    public static void main(String[] args) {
        try{
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println(inet);
            System.out.println("내 pc 정보 : " + inet.getHostName());
            System.out.println("내 ip 정보 : " + inet.getHostAddress());
            System.out.println("----------------------------");
            InetAddress inet2 = InetAddress.getByName("www.inven.co.kr");
            System.out.println("인벤 서버명 : " + inet2.getHostName());
            System.out.println("인벤 ip주소 : " + inet2.getHostAddress());
            System.out.println("----------------------------");
            InetAddress[] inet3 = InetAddress.getAllByName("www.inven.co.kr");
            System.out.println("인벤 호스트 개수 : " +inet3.length);
            for (InetAddress n : inet3){
                System.out.println("인벤 호스트명 : " + n.getHostName());
                System.out.println("인벤 ip주소 : " +n.getHostAddress());
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
