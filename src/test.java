/**
 * Created by zhutianhao on 17-2-23.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import brut.androlib.ApkDecoder;

import java.io.File;

public class test {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
//        File inFile = new File("/home/zhutianhao/下载/apk/xdm.apk");
//        ApkDecoder decoder = new ApkDecoder();
//        decoder.setOutDir(new File("/home/zhutianhao/下载/apk/xdmout"));
//        decoder.setApkFile(inFile);
//        decoder.decode();
/************git clone test**********************/

        try {
            Process p = Runtime.getRuntime().exec("python3 /home/zhutianhao/PycharmProjects/filetest/test.py");
            BufferedReader in = new BufferedReader(new  InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
