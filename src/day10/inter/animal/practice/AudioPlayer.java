package day10.inter.animal.practice;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("재생중인 오디오를 일시정지 합니다");

    }

    @Override
    public void stop() {
        System.out.println("재생중인 오디오를 중지 합니다.");

    }
}
