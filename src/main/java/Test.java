import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int[][] a=new int[7][12];
//        ObjectMapper objectMapper=new ObjectMapper();
//        try {
//            System.out.println(objectMapper.writeValueAsString(a));
//            for (int i=0;i<12;i++){
//                a[0][i]=-1;
//            }
//            System.out.println(objectMapper.writeValueAsString(a));
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;

            File configFile = new File("mybatis/generatorConfig.xml");

            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            // 创建生成器
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }catch (Exception e){

        }
    }
}
