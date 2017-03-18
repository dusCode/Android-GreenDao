package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class Generator {
    public static void main(String[] args) throws Exception {

        int version=1;
        String defaultPackage="test.greenDAO.bean";
        Schema schema=new Schema(version,defaultPackage);
        schema.setDefaultJavaPackageDao("test.greenDAO.dao");
        addEntity(schema);
        String outDir="E:\\android\\android_studio_workspace\\Android-GreenDao\\app\\src\\main\\java-gen";
        new DaoGenerator().generateAll(schema,outDir);
    }

    private static void addEntity(Schema schema) {
        Entity entity = schema.addEntity("Entity");
        entity.setTableName("student");
        entity.addIdProperty().autoincrement();
        entity.addStringProperty("name").notNull();
        entity.addIntProperty("age");
        entity.addDoubleProperty("score");
    }
}
