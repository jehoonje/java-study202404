package day12.io.obj;

import day09.poly.casting.Parent;
import day12.io.FileExample;
import day12.io.bytrestream.FileInputExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {


    public static void main(String[] args) {

        // 세이브 파일 로딩하기
        try {FileInputStream fis = new FileInputStream((FileExample.ROOT_PATH + "/hello/snack.sav"));

            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> snackList = (List<Snack>) ois.readObject();

        } catch (Exception e ) {
            e.printStackTrace();
        }

    }
}
