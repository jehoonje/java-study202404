package day10.inter.animal.practice;

public class VideoPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("비디오가 재생 됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("재생중인 비디오가 일시정지됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("재생중인 비디오를 중지합니다.");

    }
}
