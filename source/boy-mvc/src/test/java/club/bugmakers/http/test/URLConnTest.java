package club.bugmakers.http.test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Description:
 * @Author: Bruce
 * @Datetime: 2018/1/31 13:46
 */
public class URLConnTest {

    public static void main(String args[]) {
        HttpURLConnection conn = null;
        String res = null;
        try {
            URL url = new URL("https://id.exocr.com:8080/verify4");
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(30000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("contentType", "utf-8");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            OutputStream out = new DataOutputStream(conn.getOutputStream());
            StringBuffer strBuf = new StringBuffer()
            .append("appId=").append("97470178052276231")
            .append("&appKey=").append("fe9fa1a9df5049fe85429ba59443aa02")
            .append("&identityCardNo=").append("612324199410150321")
            .append("&personalName=").append("乔丽君");

            out.write(strBuf.toString().getBytes("utf-8"));
            out.flush();
            out.close();

            /* Read Response */
            StringBuffer strBufRes = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                strBufRes.append(line);
            }
            res = strBufRes.toString();
            reader.close();
            reader = null;

            System.out.println(res);

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
        }
    }
}
