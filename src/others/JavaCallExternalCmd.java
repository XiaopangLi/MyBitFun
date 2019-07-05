package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java调用外部命令
 * @author mengwen
 */
public class JavaCallExternalCmd {

    /**
     * 使用Runtime去调用外部命令，通过Process对象可以获取外部命令的输出信息
     * 例如：hello.sh
     *#!/bin/sh
     *
     * echo "hello"
     * echo "china"
     *
     * exit 0
     * 输出为：
     *----get info----
     * hellochina
     *
     * @param cmd 外部命令，可以是shell脚本，例如cmd = sh /home/xxx/hello.sh
     * @throws IOException
     * @throws InterruptedException
     */
    public static void run(String cmd) throws IOException, InterruptedException {
        Process ps = Runtime.getRuntime().exec(cmd);
        ps.waitFor();

        BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        System.out.println("----get info----");
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
