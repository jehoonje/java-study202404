package day10.inter.animal.practice;

import java.util.Arrays;

public class MediaPlayer {
    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {

        MediaPlayable[]temp
                = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사
        temp[temp.length - 1] = media;
        this.mediaList = temp;

//        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
//        for (int i = 0; i < mediaList.length; i++) {
//            temp[i] = mediaList[i];
//        }
//        temp[temp.length - 1] = media;
//        mediaList = temp;
    }

    // iter 단축문으로 가능
    // 이터문 왼쪽에는 실행할 클래스이름 왼쪽은 배열 가운데는 가상의 이름
    public void playAll() {
        for (MediaPlayable asdf : mediaList) {
            asdf.play();
        }

    }
}
