package com.boway.platemes.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CodeDOM {

    /**
     * 创建repository类
     */
    public void createRepository()  {

        List<String> classNameList=new ArrayList<>();
        try{
            List<String> classNames = PackageUtil.getClassName("com.boway.platemes.entity");
            String m = "\\\\";
            for (String className:classNames) {
                String split = className.split(m)[8];
                System.out.println(split);
                classNameList.add(split);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (String tableName:classNameList) {
            String basePath = System.getProperty("user.dir") + "\\src\\main\\java\\com\\boway\\platemes\\repository\\";

            File file2 = new File(basePath + lowerCase(tableName)+"Repository.java");
            if(file2.exists()){
                return;
            }

            File file = FileUtil.createFile(basePath + lowerCase(tableName)+"Repository.java");

            StringBuffer stringBuffer = new StringBuffer();
            String t = "String";

            stringBuffer.append(
                    "package com.boway.platemes.repository; \n" +
                            "\n" +
                            "import com.boway.platemes.entity.*;\n" +
                            "import org.springframework.data.jpa.repository.JpaRepository;\n" +
                            "import org.springframework.stereotype.Repository; \n"+
                            "\n" +
                            "@Repository\n" +
                            "public interface "+lowerCase(tableName) + "Repository extends JpaRepository<" + tableName + ", " + t + "> {"
            );
            stringBuffer.append("\n");
            stringBuffer.append("}");
            FileUtil.fileWriter(file, stringBuffer);

        }

    }

    public String lowerCase(String str) {
        return str.substring(0, 1).toLowerCase()+ str.substring(1);
    }

}
