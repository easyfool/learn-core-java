package com.wangfengbabe.core.ser;

import static junit.framework.TestCase.fail;

import com.alibaba.fastjson.JSON;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

public class PersonSerTest {

    @Test
    public void serializeToDisk() {
        com.wangfengbabe.core.entity.Person wangfeng = new com.wangfengbabe.core.entity.Person(
                "wang", "feng", 20);
        com.wangfengbabe.core.entity.Person zhaochi = new com.wangfengbabe.core.entity.Person(
                "zhao", "chi", 20);
        wangfeng.setSpouse(zhaochi);
        zhaochi.setSpouse(wangfeng);
        try {

            FileOutputStream fos = new FileOutputStream("tempdata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(wangfeng);
            oos.close();
        } catch (Exception e) {
            fail("Exception thrown during test");
        }

        try {
            FileInputStream fis = new FileInputStream("tempdata.ser");
            ObjectInputStream ooi = new ObjectInputStream(fis);
            wangfeng = (com.wangfengbabe.core.entity.Person) ooi.readObject();
            ooi.close();
            new File("tempdata.ser").delete();
            System.out.println(JSON.toJSONString(wangfeng));
        } catch (Exception e) {

        }
//        SignedObject signedObject = new SignedObject();
//        SealedObject sealedObject = new SealedObject();

    }


}
