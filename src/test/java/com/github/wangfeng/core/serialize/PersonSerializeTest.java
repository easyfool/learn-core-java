package com.github.wangfeng.core.serialize;

import static junit.framework.TestCase.fail;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.github.wangfeng.core.serialize.v1.Person;
import org.junit.Test;

public class PersonSerializeTest {

    @Test
    public void serializeToDisk() {
        Person wangfeng = new Person(
                "wangfeng", 20);
        Person zhaochi = new Person(
                "zhaochi", 20);

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
            wangfeng = (Person) ooi.readObject();
            ooi.close();
            new File("tempdata.ser").delete();
            System.out.println(JSON.toJSONString(wangfeng));
        } catch (Exception e) {

        }


    }


}
