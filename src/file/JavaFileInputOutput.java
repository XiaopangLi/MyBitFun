package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java 普通文件输入&输出
 * @author mengwen
 */
public class JavaFileInputOutput {

    /**
     * 按行读取文件
     * @param filename 输入文件名
     */
    public static String fileInput(String filename) throws IOException {

        FileReader fr = new FileReader(filename);
        BufferedReader bf = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = bf.readLine()) != null) {
            sb.append(str).append("\n");
        }
        return sb.toString();
    }

    /**
     * 按行输出文件
     * @param output 输出文件名
     */
    public static void fileOutput(String output){

    }


}
