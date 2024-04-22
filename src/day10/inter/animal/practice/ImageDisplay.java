package day10.inter.animal.practice;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 일시 중지됩니다.");

    }

    @Override
    public void stop() {
        System.out.println("재생중인 이미지가 중지 됩니다.");

    }
}
